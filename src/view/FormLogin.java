package view;

public class FormLogin extends javax.swing.JFrame {

    public FormLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        edtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        edtSenha = new javax.swing.JPasswordField();
        btnAcessar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCifrao = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 325));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pnlLogin.add(edtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 85, 131, -1));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblUsuario.setText("Usuário");
        pnlLogin.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, -1, -1));

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSenha.setText("Senha");
        pnlLogin.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 122, -1, -1));

        edtSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pnlLogin.add(edtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 131, -1));

        btnAcessar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/confirmar.png"))); // NOI18N
        btnAcessar.setText("Acessar");
        pnlLogin.add(btnAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, 103, 30));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        pnlLogin.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 167, 103, 30));

        lblCifrao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Money.png"))); // NOI18N
        pnlLogin.add(lblCifrao, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 197, 179));

        lblTitulo1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Credenciais:");
        pnlLogin.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, -1));

        getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 450, 220));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Engenharia Econômica");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAcessar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JPasswordField edtSenha;
    public javax.swing.JTextField edtUsuario;
    private javax.swing.JLabel lblCifrao;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlLogin;
    // End of variables declaration//GEN-END:variables
}
