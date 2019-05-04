package controller;

import config.Arquivo;
import dao.DaoFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FormMenuPrincipal;

public class MenuPrincipalController {

    private FormMenuPrincipal frmPrincipal;
    private ContaController ctrlConta;
    private LancamentoController ctrlLancamento;
    private ResultadoController ctrlResultado;
    private UtilitarioController ctrlUtil;

    private Arquivo oArqFonteDados;
    private DaoFactory daoFactory;

    private void inicializarComponentes() {
        frmPrincipal.miCadConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executarCadastroConta();
            }
        });

        frmPrincipal.miCadLancamento.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                executarCadastroLancamento();
            }
        });

        frmPrincipal.miRelatorioFechamento.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                executarResultado();
            }
        });
        
        frmPrincipal.miUtils.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                executarUtil();
            }
        });

    }

    public MenuPrincipalController() {
        oArqFonteDados = new Arquivo();
        daoFactory = DaoFactory.getDaoFactory(oArqFonteDados.leArquivo("ArqText1.ini", 1).getFonteDados());

        frmPrincipal = new FormMenuPrincipal();
        ctrlConta = new ContaController(daoFactory);
        ctrlLancamento = new LancamentoController(daoFactory);
        ctrlResultado = new ResultadoController(daoFactory);
        ctrlUtil = new UtilitarioController();

        inicializarComponentes();
    }

    public void executar() {
        frmPrincipal.setVisible(true);
    }

    private void executarCadastroConta() {
        ctrlConta.executar();
    }

    private void executarCadastroLancamento() {
        ctrlLancamento.executar();
    }

    private void executarResultado() {
        ctrlResultado.executar();
    }
    
    private void executarUtil() {
        ctrlUtil.executar();
    }

}
