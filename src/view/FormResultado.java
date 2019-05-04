package view;

public class FormResultado extends javax.swing.JDialog {

    public FormResultado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edtTaxa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        edtAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();
        btnFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1, 1));
        setPreferredSize(new java.awt.Dimension(520, 150));
        setSize(new java.awt.Dimension(500, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Taxa Mensal");
        pnPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 25, -1, -1));
        pnPrincipal.add(edtTaxa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mês");
        pnPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbMes.setName("cbMes"); // NOI18N
        pnPrincipal.add(cbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, -1, -1));
        pnPrincipal.add(edtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 20, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ano");
        pnPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 25, -1, -1));

        getContentPane().add(pnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 370, 60));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Extrato Completo");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 11, 380, -1));

        btnRelatorio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Relatorio.png"))); // NOI18N
        btnRelatorio.setText("Relatório");
        btnRelatorio.setAlignmentY(0.7F);
        btnRelatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRelatorio.setHideActionText(true);
        btnRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRelatorio.setIconTextGap(10);
        btnRelatorio.setMaximumSize(new java.awt.Dimension(80, 30));
        btnRelatorio.setMinimumSize(new java.awt.Dimension(80, 30));
        btnRelatorio.setPreferredSize(new java.awt.Dimension(105, 30));
        getContentPane().add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 105, 30));

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
        getContentPane().add(btnFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 105, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnFecha;
    public javax.swing.JButton btnRelatorio;
    public javax.swing.JComboBox<String> cbMes;
    public javax.swing.JTextField edtAno;
    public javax.swing.JTextField edtTaxa;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
