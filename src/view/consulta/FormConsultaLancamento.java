package view.consulta;

public class FormConsultaLancamento extends javax.swing.JDialog {

    public FormConsultaLancamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbLancamento = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(395, 195));
        setPreferredSize(new java.awt.Dimension(513, 199));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbLancamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbLancamento);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 480, 117));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitulo.setText("Consulta de Lançamento");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 18, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTable tbLancamento;
    // End of variables declaration//GEN-END:variables

}
