package view;


public class FormLancamento extends javax.swing.JDialog {

    public FormLancamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edtLancamentoId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtConta = new javax.swing.JTextField();
        cbxConta = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        edtValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtData = new javax.swing.JFormattedTextField();
        btnConsConta = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnGrava = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnExclui = new javax.swing.JButton();
        btnFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(587, 215));
        setPreferredSize(new java.awt.Dimension(597, 235));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Código :");
        pnPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        edtLancamentoId.setEditable(false);
        pnPrincipal.add(edtLancamentoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Conta : ");
        pnPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, -1));
        pnPrincipal.add(edtConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        cbxConta.setMaximumRowCount(50);
        cbxConta.setMaximumSize(new java.awt.Dimension(29, 22));
        pnPrincipal.add(cbxConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 250, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Valor :  ");
        pnPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, -1));
        pnPrincipal.add(edtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Data :");
        pnPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 50, -1));

        edtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        pnPrincipal.add(edtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 90, -1));

        btnConsConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisar.png"))); // NOI18N
        pnPrincipal.add(btnConsConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 61, 20, 20));

        getContentPane().add(pnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 440, 151));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Lançamento Financeiro");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, 550, -1));

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
    public javax.swing.JButton btnConsConta;
    public javax.swing.JButton btnConsulta;
    public javax.swing.JButton btnExclui;
    public javax.swing.JButton btnFecha;
    public javax.swing.JButton btnGrava;
    public javax.swing.JComboBox cbxConta;
    public javax.swing.JTextField edtConta;
    public javax.swing.JFormattedTextField edtData;
    public javax.swing.JTextField edtLancamentoId;
    public javax.swing.JTextField edtValor;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
