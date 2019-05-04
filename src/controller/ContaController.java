package controller;

import dao.DaoFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.util.List;
import model.Conta;
import model.Usuario;
import view.FormCadConta;
import view.consulta.FormConsultaConta;
import view.model.ContaModel;

public class ContaController {

    private FormCadConta frmCadConta;
    private Conta oConta;
    private DaoFactory daoFactory;
    private ContaModel contaModel;
    private FormConsultaConta frmConsConta;

    public ContaController(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
        frmCadConta = new FormCadConta(null, true);
        frmConsConta = new FormConsultaConta(null, true);
        oConta = new Conta();
        contaModel = new ContaModel();

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frmCadConta.btnGrava.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                gravar();
            }
        });

        frmCadConta.btnCancela.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });

        frmCadConta.btnExclui.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                excluir();
            }
        });

        frmCadConta.btnFecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });

        frmCadConta.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                fechar();
            }
        });

        // Vincular Categeria Model com o JTable
        frmConsConta.tbConta.setModel(contaModel);

        frmCadConta.btnConsulta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                consultarConta();
            }
        });

        frmConsConta.tbConta.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    editarConta();
                }
            }
        });

    }

    public void executar() {
        limparCampos();
        frmCadConta.setVisible(true);
    }

    private void excluir() {
        //Busco dados do Form
        oConta = informacoesForm();

        //Deleção Objeto
        if (daoFactory.getContaDao().delete(oConta) == false) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Animal");
        } else {
            limparCampos();
            //Seto o foco no no campo Nome
            frmCadConta.edtDescricao.grabFocus();
        }
    }

    private void editarConta() {
        // recuperar a posição do objeto selecionado
        int posicao = frmConsConta.tbConta.getSelectedRow();

        // buscar o objeto 
        oConta = contaModel.getConta(posicao);

        // preencher os campos do form com os dados do objeto
        frmCadConta.edtContaId.setText(Integer.toString(oConta.getContaId()));
        frmCadConta.edtDescricao.setText(oConta.getDescricao());
        frmCadConta.lblNomeUsuario.setText(Usuario.getInstance().getNome());

        //Verifico se a conta é Crédito ou Débito
        if (("d".equals(oConta.getTipo()))) {
            frmCadConta.rbDebito.setSelected(true);
        } else {
            frmCadConta.rbCredito.setSelected(true);
        }

        // fechar o formulário de consulta
        frmConsConta.setVisible(false);
        // abrir o formulário de cadastro
        frmCadConta.setVisible(true);

        // chamar o carrega objeto, para atualizar
        // o model e atualizar a jTable
        carregarContas();
    }

    private void fechar() {
        frmCadConta.setVisible(false);
    }

    private void cancelar() {
        limparCampos();
    }

    private void gravar() {
        //Busco a Conta que vou gravar do form 
        oConta = informacoesForm();

        if (frmCadConta.edtContaId.getText().isEmpty()) {
            //Se código vazio, objeto novo
            if (daoFactory.getContaDao().insert(oConta) == false) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir Conta");
            } else {
                limparCampos();
            }
        } else {
            //Se código diferente de vazio objeto existente
            if (daoFactory.getContaDao().update(oConta) == false) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar Conta");
            } else {
                limparCampos();
            }
        }

        //Seto o foco no  campo Nome
        frmCadConta.edtDescricao.grabFocus();

    }

    public void consultarConta() {
        // Carregar todos os objetos para o Table Model
        carregarContas();

        //Como a Consulta e o Cadastro são telas modais devemos garantir que 
        //quando uma tiver aparecendo a outra não esta
        frmCadConta.setVisible(false);

        // Mostrando a tela 
        frmConsConta.setVisible(true);
    }

    private void carregarContas() {
        contaModel.limpar();
        // Usar o DAO para buscar os objetos e adicionar no Table Model
        List<Conta> todos = daoFactory.getContaDao().buscarTodos();
        for (Conta oConta : todos) {
            contaModel.addConta(oConta);
        }
    }

    private Conta informacoesForm() {
        Conta aConta = new Conta();

        //Verifico se é uma edição ou é uma conta Nova
        if (frmCadConta.edtContaId.getText().isEmpty()) {
            aConta.setContaId(daoFactory.getContaDao().getNextId());
        } else {
            aConta.setContaId(Integer.parseInt(frmCadConta.edtContaId.getText()));
        }

        aConta.setDescricao(frmCadConta.edtDescricao.getText());

        //Verifico se a conta é Crédito ou Débito
        if (frmCadConta.rbDebito.isSelected()) {
            aConta.setTipo("d");
        } else {
            aConta.setTipo("c");
        }
        aConta.setoUsuario(Usuario.getInstance());

        return aConta;
    }

    private void limparCampos() {
        //Limpando todos os campos da tela
        frmCadConta.lblNomeUsuario.setText(null);
        frmCadConta.edtContaId.setText(null);
        frmCadConta.edtDescricao.setText(null);
        frmCadConta.rbDebito.setSelected(true);
    }

}
