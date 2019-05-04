package controller;

import config.Arquivo;
import dao.DaoFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FormLogin;

public class LoginController {
    
    private FormLogin formLogin;
    private MenuPrincipalController principal;
    private Arquivo oArqFonteDados;
    private DaoFactory daoFactory;
    private Usuario oUsuario;
    
    public LoginController() {
        formLogin = new FormLogin();
        principal = new MenuPrincipalController();
        oArqFonteDados = new Arquivo();
        oUsuario = Usuario.getInstance();
        
        inicializarComponentes();
    }
    
    private void inicializarComponentes() {
        formLogin.btnAcessar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if (logar()) {
                    executarPrincipal();
                }
            }
        });
        
        formLogin.btnCancelar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                sair();
            }
        });
    }
    
    public void executar() {
        formLogin.setVisible(true);
        daoFactory = DaoFactory.getDaoFactory(oArqFonteDados.leArquivo("ArqText1.ini", 1).getFonteDados());
        if (daoFactory == null) {
            JOptionPane.showMessageDialog(null, "Problema no Arquivo de Fonte de Dados");
        }
    }
    
    private void executarPrincipal() {
        principal.executar();
        formLogin.setVisible(false);
    }
    
    private boolean logar() {
        oUsuario.setLogin(Integer.parseInt(formLogin.edtUsuario.getText()));
        oUsuario.setSenha(Integer.parseInt(formLogin.edtSenha.getText()));
        
//        if (!daoFactory.getUsuarioDao().logar(oUsuario)) {
//            JOptionPane.showMessageDialog(null,
//                    "Falha na autenticação"
//                    + "\n Tente novamente");
//            return false;
//        } else {
            return true;
//        }
        
    }
    
    private void sair() {
        System.exit(0);
    }
}
