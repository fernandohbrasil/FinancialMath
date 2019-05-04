package controller;

import Funcoes.Util;
import dao.DaoFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import model.Conta;
import model.Lancamento;
import model.Usuario;
import view.FormLancamento;
import view.consulta.FormConsultaConta;
import view.consulta.FormConsultaLancamento;
import view.model.ContaModel;
import view.model.LancamentoModel;

public class LancamentoController {

    private FormLancamento frmLancamento;
    private FormConsultaLancamento frmConsLancamento;
    private FormConsultaConta frmConsConta;

    private DaoFactory daoFactory;

    private LancamentoModel lancamentoModel;
    private ContaModel contaModel;
    private Lancamento oLancamento;
    private Util funcoes;

    public LancamentoController(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
        frmLancamento = new FormLancamento(null, true);
        frmConsLancamento = new FormConsultaLancamento(null, true);
        frmConsConta = new FormConsultaConta(null, true);
        lancamentoModel = new LancamentoModel();
        contaModel = new ContaModel();
        oLancamento = new Lancamento();
        funcoes = new Util();

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frmLancamento.btnGrava.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    gravar();
                } catch (ParseException ex) {
                    Logger.getLogger(LancamentoController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        frmLancamento.btnCancela.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });

        frmLancamento.btnExclui.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    excluir();
                } catch (ParseException ex) {
                    Logger.getLogger(LancamentoController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        frmLancamento.btnFecha.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });

        frmLancamento.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                fechar();
            }
        });

        // Vincular LancamentoModel com o JTable
        frmConsLancamento.tbLancamento.setModel(lancamentoModel);

        frmLancamento.btnConsulta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                consultarLancamento();
            }
        });

        frmConsLancamento.tbLancamento.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    editarLancamento();
                }
            }
        });

        frmLancamento.cbxConta.addPopupMenuListener(new PopupMenuListener() {

            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {

            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                atualizaIdConta();
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {

            }
        });

        frmConsConta.tbConta.setModel(contaModel);

        frmLancamento.btnConsConta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                consultaConta();
            }
        });

        frmConsConta.tbConta.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    selecionaConta();
                }
            }
        });

        frmLancamento.edtConta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                locateConta();
            }
        });
    }

    private void locateConta() {
        try {
            if (frmLancamento.edtConta.getText() != null) {
                Conta oConta = daoFactory.getContaDao().findConta(Integer.parseInt(frmLancamento.edtConta.getText()));
                if (oConta != null) {
                    frmLancamento.cbxConta.getModel().setSelectedItem(oConta);
                } else {
                    JOptionPane.showMessageDialog(frmLancamento, "Conta não encontrada! Tente a Consulta");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frmLancamento, "Valor Inválido");
        }
    }

    private void consultaConta() {
        // Carregar todos os objetos para o Table Model
        carregaContas();

        //Como a Consulta e o Cadastro são telas modais devemos garantir que 
        //quando uma tiver aparecendo a outra não esta
        frmLancamento.setVisible(false);

        // Mostrando a tela 
        frmConsConta.setVisible(true);
    }

    private void carregaContas() {
        contaModel.limpar();
        // Usar o DAO para buscar os objetos e adicionar no Table Model
        List<Conta> todos = daoFactory.getContaDao().buscarTodos();
        for (Conta oConta : todos) {
            contaModel.addConta(oConta);
        }
    }

    private void selecionaConta() {
        // recuperar a posição do objeto selecionado
        int posicao = frmConsConta.tbConta.getSelectedRow();

        // buscar o objeto 
        frmLancamento.edtConta.setText(String.valueOf(contaModel.getConta(posicao).getContaId()));
        frmLancamento.cbxConta.getModel().setSelectedItem(contaModel.getConta(posicao));

        // fechar o formulário de consulta
        frmConsConta.setVisible(false);
        // abrir o formulário de cadastro
        frmLancamento.setVisible(true);

        // chamar o carrega objeto, para atualizar
        // o model e atualizar a jTable        
    }

    public void executar() {
        limparCampos();
        frmLancamento.setVisible(true);
    }

    private boolean validaValor() {
        try {
            if (Double.parseDouble(frmLancamento.edtValor.getText()) >= 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    private void gravar() throws ParseException {
        if (validaValor()) {
            //Busco a Conta que vou gravar do form 
            oLancamento = informacoesForm();

            if (frmLancamento.edtLancamentoId.getText().isEmpty()) {
                //Se código vazio, objeto novo
                if (daoFactory.getLancamentoDao().insert(oLancamento) == false) {
                    JOptionPane.showMessageDialog(null, "Erro ao inserir Lancamento");
                } else {
                    limparCampos();
                }
            } else {
                //Se código diferente de vazio objeto existente
                if (daoFactory.getLancamentoDao().update(oLancamento) == false) {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar lançamento");
                } else {
                    limparCampos();
                }
            }

            //Seto o foco no  campo Nome
            frmLancamento.edtConta.grabFocus();
        }else {
            JOptionPane.showMessageDialog(frmConsConta, "Valor incorreto");
        }
    }

    private void cancelar() {
        limparCampos();
    }

    private void excluir() throws ParseException {
        //Busco dados do Form
        oLancamento = informacoesForm();

        //Deleção Objeto
        if (daoFactory.getLancamentoDao().delete(oLancamento) == false) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Animal");
        } else {
            limparCampos();
            //Seto o foco no no campo Código Conta
            frmLancamento.edtConta.grabFocus();
        }
    }

    private Lancamento informacoesForm() throws ParseException {
        Lancamento oLancamentoLoc = new Lancamento();

        //Verifico se é uma edição ou é um lancamento Novo
        if (frmLancamento.edtLancamentoId.getText().isEmpty()) {
            oLancamentoLoc.setLancamentoId(daoFactory.getLancamentoDao().getNextId());
        } else {
            oLancamentoLoc.setLancamentoId(Integer.parseInt(frmLancamento.edtLancamentoId.getText()));
        }

        oLancamentoLoc.setDataLancamento(funcoes.stringToDate(frmLancamento.edtData.getText()));
        oLancamentoLoc.setValor(Double.parseDouble(frmLancamento.edtValor.getText()));
        oLancamentoLoc.setoConta((Conta) frmLancamento.cbxConta.getModel().getSelectedItem());
        oLancamentoLoc.setoUsuario(Usuario.getInstance());

        return oLancamentoLoc;
    }

    private void carregarContas() {
        frmLancamento.cbxConta.removeAllItems();
        // buscar todas as categorias
        List<Conta> contas = daoFactory.getContaDao().buscarTodos();
        // adicionar cada uma no combo box
        for (Conta umaConta : contas) {
            frmLancamento.cbxConta.addItem(umaConta);
        }
    }

    private void limparCampos() {
        carregarContas();
        //Limpando todos os campos da tela
        frmLancamento.edtLancamentoId.setText(null);
        frmLancamento.edtConta.setText(null);
        frmLancamento.cbxConta.setSelectedIndex(-1);
        frmLancamento.edtData.setText(funcoes.getFormt().format(Date.from(Instant.now())));
        frmLancamento.edtValor.setText(null);
    }

    private void fechar() {
        frmLancamento.setVisible(false);
    }

    public void consultarLancamento() {
        // Carregar todos os objetos para o Table Model
        carregarLancamentos();

        //Como a Consulta e o Cadastro são telas modais devemos garantir que 
        //quando uma tiver aparecendo a outra não esta
        frmLancamento.setVisible(false);

        // Mostrando a tela 
        frmConsLancamento.setVisible(true);
    }

    private void carregarLancamentos() {
        lancamentoModel.limpar();
        // Usar o DAO para buscar os objetos e adicionar no Table Model
        List<Lancamento> todos = daoFactory.getLancamentoDao().buscarTodos();
        for (Lancamento oLanc : todos) {
            lancamentoModel.addLancamento(oLanc);
        }
    }

    private void editarLancamento() {
        // recuperar a posição do objeto selecionado
        int posicao = frmConsLancamento.tbLancamento.getSelectedRow();

        // buscar o objeto 
        oLancamento = lancamentoModel.getLancamento(posicao);

        // preencher os campos do form com os dados do objeto
        frmLancamento.edtLancamentoId.setText(String.valueOf(oLancamento.getLancamentoId()));
        frmLancamento.edtConta.setText(String.valueOf(oLancamento.getoConta().getContaId()));
        frmLancamento.cbxConta.getModel().setSelectedItem(oLancamento.getoConta());
        frmLancamento.edtValor.setText(String.valueOf(oLancamento.getValor()));
        frmLancamento.edtData.setText(funcoes.dateToString(oLancamento.getDataLancamento()));

        // fechar o formulário de consulta
        frmConsLancamento.setVisible(false);
        // abrir o formulário de cadastro
        frmLancamento.setVisible(true);

        // chamar o carrega objeto, para atualizar
        // o model e atualizar a jTable
        carregarLancamentos();
    }

    private void atualizaIdConta() {
        if (frmLancamento.cbxConta.getSelectedItem() != null) {
            //Guardo o Objeto do Meu Combobox
            Conta oConta = (Conta) frmLancamento.cbxConta.getSelectedItem();
            //Passo o Código do meu Objeto para o Campo
            frmLancamento.edtConta.setText(String.valueOf(oConta.getContaId()));
        }
    }
}
