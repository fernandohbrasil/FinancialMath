
package view;

public class FormMenuPrincipal extends javax.swing.JFrame {

    public FormMenuPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbMenuPrincipal = new javax.swing.JMenuBar();
        mCadastros = new javax.swing.JMenu();
        miCadConta = new javax.swing.JMenuItem();
        mLancamento = new javax.swing.JMenu();
        miCadLancamento = new javax.swing.JMenuItem();
        mRelatorio = new javax.swing.JMenu();
        miRelatorioFechamento = new javax.swing.JMenuItem();
        mUtil = new javax.swing.JMenu();
        miUtils = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(800, 600));

        mCadastros.setText("Cadastros");

        miCadConta.setText("Conta");
        mCadastros.add(miCadConta);

        mbMenuPrincipal.add(mCadastros);

        mLancamento.setText("Lançamentos");

        miCadLancamento.setText("Lançamento");
        mLancamento.add(miCadLancamento);

        mbMenuPrincipal.add(mLancamento);

        mRelatorio.setText("Relatórios");

        miRelatorioFechamento.setText("Relatório de Fechamento");
        mRelatorio.add(miRelatorioFechamento);

        mbMenuPrincipal.add(mRelatorio);

        mUtil.setText("Utilitários");

        miUtils.setText("Taxas, Juros Simples e Composto");
        miUtils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUtilsActionPerformed(evt);
            }
        });
        mUtil.add(miUtils);

        mbMenuPrincipal.add(mUtil);
        mUtil.getAccessibleContext().setAccessibleName("Conversão de Taxas");

        setJMenuBar(mbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miUtilsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUtilsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miUtilsActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu mCadastros;
    private javax.swing.JMenu mLancamento;
    private javax.swing.JMenu mRelatorio;
    private javax.swing.JMenu mUtil;
    private javax.swing.JMenuBar mbMenuPrincipal;
    public javax.swing.JMenuItem miCadConta;
    public javax.swing.JMenuItem miCadLancamento;
    public javax.swing.JMenuItem miRelatorioFechamento;
    public javax.swing.JMenuItem miUtils;
    // End of variables declaration//GEN-END:variables
}
