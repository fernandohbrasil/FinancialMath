package view;


public class FormBase extends javax.swing.JDialog {

    public FormBase(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnGrava = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnExclui = new javax.swing.JButton();
        btnFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 440, 420));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitulo.setText("Cadastro de Entidade");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 11, -1, -1));

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
        getContentPane().add(btnGrava, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

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
        getContentPane().add(btnCancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

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
        getContentPane().add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

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
        getContentPane().add(btnExclui, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

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
        getContentPane().add(btnFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancela;
    public javax.swing.JButton btnConsulta;
    public javax.swing.JButton btnExclui;
    public javax.swing.JButton btnFecha;
    public javax.swing.JButton btnGrava;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
