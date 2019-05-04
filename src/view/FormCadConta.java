package view;


public class FormCadConta extends javax.swing.JDialog {

    public FormCadConta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgTipo = new javax.swing.ButtonGroup();
        pnPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edtContaId = new javax.swing.JTextField();
        edtDescricao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbDebito = new javax.swing.JRadioButton();
        rbCredito = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnGrava = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnExclui = new javax.swing.JButton();
        btnFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(593, 221));
        setPreferredSize(new java.awt.Dimension(600, 245));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Descrição :");
        pnPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tipo :");
        pnPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Usuário :");
        pnPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Código :");
        pnPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        edtContaId.setEditable(false);
        pnPrincipal.add(edtContaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 18, 70, -1));
        pnPrincipal.add(edtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 48, 330, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rgTipo.add(rbDebito);
        rbDebito.setSelected(true);
        rbDebito.setText("Débito");
        rbDebito.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rbDebito.setPreferredSize(new java.awt.Dimension(60, 18));
        rbDebito.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        rbDebito.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(rbDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, 60, 15));

        rgTipo.add(rbCredito);
        rbCredito.setText("Crédito");
        rbCredito.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rbCredito.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        rbCredito.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(rbCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 3, 70, 15));

        pnPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 78, 150, 21));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeUsuario.setText("Fernando Henrique Brasil");
        jPanel2.add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, 320, -1));

        pnPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 108, 330, 22));

        getContentPane().add(pnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 440, 151));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Conta");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 11, 540, -1));

        btnGrava.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnGrava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/confirmar.png"))); // NOI18N
        btnGrava.setText("Gravar");
        btnGrava.setAlignmentY(0.7F);
        btnGrava.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGrava.setHideActionText(true);
        btnGrava.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnGrava.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGrava.setIconTextGap(10);
        btnGrava.setMaximumSize(new java.awt.Dimension(80, 30));
        btnGrava.setMinimumSize(new java.awt.Dimension(80, 30));
        btnGrava.setPreferredSize(new java.awt.Dimension(105, 30));
        getContentPane().add(btnGrava, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 43, -1, -1));

        btnCancela.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelar.png"))); // NOI18N
        btnCancela.setText("Cancelar");
        btnCancela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancela.setHideActionText(true);
        btnCancela.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCancela.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCancela.setIconTextGap(10);
        btnCancela.setMaximumSize(new java.awt.Dimension(50, 30));
        btnCancela.setMinimumSize(new java.awt.Dimension(50, 30));
        btnCancela.setPreferredSize(new java.awt.Dimension(105, 30));
        getContentPane().add(btnCancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 73, -1, -1));

        btnConsulta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisar.png"))); // NOI18N
        btnConsulta.setText("Consultar");
        btnConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsulta.setHideActionText(true);
        btnConsulta.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConsulta.setIconTextGap(10);
        btnConsulta.setMaximumSize(new java.awt.Dimension(50, 30));
        btnConsulta.setMinimumSize(new java.awt.Dimension(50, 30));
        btnConsulta.setPreferredSize(new java.awt.Dimension(105, 30));
        getContentPane().add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 103, -1, -1));

        btnExclui.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnExclui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excluir.png"))); // NOI18N
        btnExclui.setText("Excluir");
        btnExclui.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnExclui.setHideActionText(true);
        btnExclui.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnExclui.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExclui.setIconTextGap(10);
        btnExclui.setMaximumSize(new java.awt.Dimension(50, 30));
        btnExclui.setMinimumSize(new java.awt.Dimension(50, 30));
        btnExclui.setPreferredSize(new java.awt.Dimension(105, 30));
        getContentPane().add(btnExclui, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 133, -1, -1));

        btnFecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btnFecha.setText("Sair");
        btnFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFecha.setHideActionText(true);
        btnFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnFecha.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFecha.setIconTextGap(10);
        btnFecha.setMaximumSize(new java.awt.Dimension(50, 30));
        btnFecha.setMinimumSize(new java.awt.Dimension(50, 30));
        btnFecha.setPreferredSize(new java.awt.Dimension(105, 30));
        getContentPane().add(btnFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 163, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancela;
    public javax.swing.JButton btnConsulta;
    public javax.swing.JButton btnExclui;
    public javax.swing.JButton btnFecha;
    public javax.swing.JButton btnGrava;
    public javax.swing.JTextField edtContaId;
    public javax.swing.JTextField edtDescricao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JPanel pnPrincipal;
    public javax.swing.JRadioButton rbCredito;
    public javax.swing.JRadioButton rbDebito;
    private javax.swing.ButtonGroup rgTipo;
    // End of variables declaration//GEN-END:variables
}
