package view;


public class FormUtil extends javax.swing.JDialog {

    public FormUtil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSimples = new javax.swing.ButtonGroup();
        groupComposto = new javax.swing.ButtonGroup();
        pnTaxas = new javax.swing.JPanel();
        pnEquivalente = new javax.swing.JPanel();
        edTxEquivalente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbOrigemEquivalente = new javax.swing.JComboBox<>();
        cbDestinoEquivalente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResultEquivalente = new javax.swing.JTextArea();
        btnCalcEquivalente = new javax.swing.JButton();
        pnTaxas2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edTxNominal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbdestinoNominal = new javax.swing.JComboBox<>();
        cbOrigemNominal = new javax.swing.JComboBox<>();
        btnCalcNominal = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taResultNominal = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        pnJurosSimples1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        edJuroComposto = new javax.swing.JTextField();
        edVpComposto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edVfComposto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edTaxaComposto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        edPeriodoComposto = new javax.swing.JTextField();
        rbNComposto = new javax.swing.JRadioButton();
        rbJurosComposto = new javax.swing.JRadioButton();
        rbVpComposto = new javax.swing.JRadioButton();
        rbVfComposto = new javax.swing.JRadioButton();
        rbTaxaComposto = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        taResultComposto = new javax.swing.JTextArea();
        btnCalcComposto = new javax.swing.JButton();
        pnJurosComposto = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        edJuroSimples = new javax.swing.JTextField();
        edVpSimples = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edVfSimples = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edTxSimples = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edPeriodoSimples = new javax.swing.JTextField();
        rbNSimples = new javax.swing.JRadioButton();
        rbJurosSimples = new javax.swing.JRadioButton();
        rbVpSimples = new javax.swing.JRadioButton();
        rbVfSimples = new javax.swing.JRadioButton();
        rbTaxaSimples = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taResultSimples = new javax.swing.JTextArea();
        btnCalcSimples = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnTaxas.setBorder(javax.swing.BorderFactory.createTitledBorder("Taxas"));
        pnTaxas.setToolTipText("");
        pnTaxas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnEquivalente.setBorder(javax.swing.BorderFactory.createTitledBorder("Equivalente"));
        pnEquivalente.setToolTipText("");
        pnEquivalente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnEquivalente.add(edTxEquivalente, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 20, 40, -1));

        jLabel1.setText("Com capitalização");
        pnEquivalente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 55, -1, -1));

        jLabel2.setText("Taxa de Juros");
        pnEquivalente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 25, -1, -1));

        cbOrigemEquivalente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ao dia", "à semana", "ao mês", "ao bimestre", "ao trimestre", "ao semestre", "ao ano" }));
        pnEquivalente.add(cbOrigemEquivalente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        cbDestinoEquivalente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ao dia", "à semana", "ao mês", "ao bimestre", "ao trimestre", "ao semestre", "ao ano" }));
        pnEquivalente.add(cbDestinoEquivalente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        taResultEquivalente.setColumns(20);
        taResultEquivalente.setRows(5);
        jScrollPane1.setViewportView(taResultEquivalente);

        pnEquivalente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 70));

        btnCalcEquivalente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCalcEquivalente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/confirmar.png"))); // NOI18N
        btnCalcEquivalente.setText("Calcula");
        btnCalcEquivalente.setAlignmentY(0.7F);
        btnCalcEquivalente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCalcEquivalente.setHideActionText(true);
        btnCalcEquivalente.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCalcEquivalente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCalcEquivalente.setIconTextGap(10);
        btnCalcEquivalente.setMaximumSize(new java.awt.Dimension(80, 30));
        btnCalcEquivalente.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCalcEquivalente.setPreferredSize(new java.awt.Dimension(105, 30));
        pnEquivalente.add(btnCalcEquivalente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 20));

        pnTaxas.add(pnEquivalente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 190));

        pnTaxas2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nominal"));
        pnTaxas2.setToolTipText("");
        pnTaxas2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Taxa de Juros");
        pnTaxas2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 25, -1, -1));
        pnTaxas2.add(edTxNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 20, 40, -1));

        jLabel4.setText("Com capitalização");
        pnTaxas2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 55, -1, -1));

        cbdestinoNominal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ao dia", "à semana", "ao mês", "ao bimestre", "ao trimestre", "ao semestre", "ao ano" }));
        pnTaxas2.add(cbdestinoNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        cbOrigemNominal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ao dia", "à semana", "ao mês", "ao bimestre", "ao trimestre", "ao semestre", "ao ano" }));
        pnTaxas2.add(cbOrigemNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        btnCalcNominal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCalcNominal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/confirmar.png"))); // NOI18N
        btnCalcNominal.setText("Calcula");
        btnCalcNominal.setAlignmentY(0.7F);
        btnCalcNominal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCalcNominal.setHideActionText(true);
        btnCalcNominal.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCalcNominal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCalcNominal.setIconTextGap(10);
        btnCalcNominal.setMaximumSize(new java.awt.Dimension(80, 30));
        btnCalcNominal.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCalcNominal.setPreferredSize(new java.awt.Dimension(105, 30));
        pnTaxas2.add(btnCalcNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 20));

        taResultNominal.setColumns(20);
        taResultNominal.setRows(5);
        jScrollPane3.setViewportView(taResultNominal);

        pnTaxas2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 70));

        pnTaxas.add(pnTaxas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 260, 190));

        getContentPane().add(pnTaxas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 580, 220));
        pnTaxas.getAccessibleContext().setAccessibleName("");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Utilitários Matemática Financeira");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, 570, -1));

        btnSair.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSair.setHideActionText(true);
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair.setIconTextGap(10);
        btnSair.setMaximumSize(new java.awt.Dimension(50, 30));
        btnSair.setMinimumSize(new java.awt.Dimension(50, 30));
        btnSair.setPreferredSize(new java.awt.Dimension(105, 30));
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, -1, -1));

        pnJurosSimples1.setBorder(javax.swing.BorderFactory.createTitledBorder("Juros Composto"));
        pnJurosSimples1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Juros");
        pnJurosSimples1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));
        pnJurosSimples1.add(edJuroComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 70, -1));

        edVpComposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edVpCompostoActionPerformed(evt);
            }
        });
        pnJurosSimples1.add(edVpComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, -1));

        jLabel11.setText("Valor Principal");
        pnJurosSimples1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel12.setText("Valor Valor Final");
        pnJurosSimples1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        edVfComposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edVfCompostoActionPerformed(evt);
            }
        });
        pnJurosSimples1.add(edVfComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 70, -1));

        jLabel13.setText("Taxa");
        pnJurosSimples1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        edTaxaComposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edTaxaCompostoActionPerformed(evt);
            }
        });
        pnJurosSimples1.add(edTaxaComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 70, -1));

        jLabel14.setText("Período");
        pnJurosSimples1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        edPeriodoComposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPeriodoCompostoActionPerformed(evt);
            }
        });
        pnJurosSimples1.add(edPeriodoComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 70, -1));

        groupComposto.add(rbNComposto);
        rbNComposto.setText("Período");
        rbNComposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNCompostoActionPerformed(evt);
            }
        });
        pnJurosSimples1.add(rbNComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 140, -1, -1));

        groupComposto.add(rbJurosComposto);
        rbJurosComposto.setSelected(true);
        rbJurosComposto.setText("Juros");
        pnJurosSimples1.add(rbJurosComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 20, -1, -1));

        groupComposto.add(rbVpComposto);
        rbVpComposto.setText("Valor Principal");
        pnJurosSimples1.add(rbVpComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 50, -1, -1));

        groupComposto.add(rbVfComposto);
        rbVfComposto.setText("Valor Final");
        pnJurosSimples1.add(rbVfComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 80, -1, -1));

        groupComposto.add(rbTaxaComposto);
        rbTaxaComposto.setText("Taxa");
        pnJurosSimples1.add(rbTaxaComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 110, -1, -1));

        taResultComposto.setColumns(20);
        taResultComposto.setRows(5);
        jScrollPane4.setViewportView(taResultComposto);

        pnJurosSimples1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 270, 120));

        btnCalcComposto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCalcComposto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/confirmar.png"))); // NOI18N
        btnCalcComposto.setText("Calcula");
        btnCalcComposto.setAlignmentY(0.7F);
        btnCalcComposto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCalcComposto.setHideActionText(true);
        btnCalcComposto.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCalcComposto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCalcComposto.setIconTextGap(10);
        btnCalcComposto.setMaximumSize(new java.awt.Dimension(80, 30));
        btnCalcComposto.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCalcComposto.setPreferredSize(new java.awt.Dimension(105, 30));
        pnJurosSimples1.add(btnCalcComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 20));

        getContentPane().add(pnJurosSimples1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 580, 180));

        pnJurosComposto.setBorder(javax.swing.BorderFactory.createTitledBorder("Juros Simples"));
        pnJurosComposto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Juros ");
        pnJurosComposto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));
        pnJurosComposto.add(edJuroSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 70, -1));

        edVpSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edVpSimplesActionPerformed(evt);
            }
        });
        pnJurosComposto.add(edVpSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, -1));

        jLabel6.setText("Valor Principal");
        pnJurosComposto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel7.setText("Valor Valor Final");
        pnJurosComposto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        edVfSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edVfSimplesActionPerformed(evt);
            }
        });
        pnJurosComposto.add(edVfSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 70, -1));

        jLabel8.setText("Taxa");
        pnJurosComposto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        edTxSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edTxSimplesActionPerformed(evt);
            }
        });
        pnJurosComposto.add(edTxSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 70, -1));

        jLabel9.setText("Período");
        pnJurosComposto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        edPeriodoSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPeriodoSimplesActionPerformed(evt);
            }
        });
        pnJurosComposto.add(edPeriodoSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 70, -1));

        groupSimples.add(rbNSimples);
        rbNSimples.setText("Período");
        rbNSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNSimplesActionPerformed(evt);
            }
        });
        pnJurosComposto.add(rbNSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 140, -1, -1));

        groupSimples.add(rbJurosSimples);
        rbJurosSimples.setSelected(true);
        rbJurosSimples.setText("Juros");
        pnJurosComposto.add(rbJurosSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 20, -1, -1));

        groupSimples.add(rbVpSimples);
        rbVpSimples.setText("Valor Principal");
        pnJurosComposto.add(rbVpSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 50, -1, -1));

        groupSimples.add(rbVfSimples);
        rbVfSimples.setText("Valor Final");
        pnJurosComposto.add(rbVfSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 80, -1, -1));

        groupSimples.add(rbTaxaSimples);
        rbTaxaSimples.setText("Taxa");
        pnJurosComposto.add(rbTaxaSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 110, -1, -1));

        taResultSimples.setColumns(20);
        taResultSimples.setRows(5);
        jScrollPane2.setViewportView(taResultSimples);

        pnJurosComposto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 270, 120));

        btnCalcSimples.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCalcSimples.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/confirmar.png"))); // NOI18N
        btnCalcSimples.setText("Calcula");
        btnCalcSimples.setAlignmentY(0.7F);
        btnCalcSimples.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCalcSimples.setHideActionText(true);
        btnCalcSimples.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCalcSimples.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCalcSimples.setIconTextGap(10);
        btnCalcSimples.setMaximumSize(new java.awt.Dimension(80, 30));
        btnCalcSimples.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCalcSimples.setPreferredSize(new java.awt.Dimension(105, 30));
        pnJurosComposto.add(btnCalcSimples, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 20));

        getContentPane().add(pnJurosComposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 580, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edVpSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edVpSimplesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edVpSimplesActionPerformed

    private void edVfSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edVfSimplesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edVfSimplesActionPerformed

    private void edTxSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edTxSimplesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edTxSimplesActionPerformed

    private void edPeriodoSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPeriodoSimplesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edPeriodoSimplesActionPerformed

    private void rbNSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNSimplesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNSimplesActionPerformed

    private void edVpCompostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edVpCompostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edVpCompostoActionPerformed

    private void edVfCompostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edVfCompostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edVfCompostoActionPerformed

    private void edTaxaCompostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edTaxaCompostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edTaxaCompostoActionPerformed

    private void edPeriodoCompostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPeriodoCompostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edPeriodoCompostoActionPerformed

    private void rbNCompostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNCompostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNCompostoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalcComposto;
    public javax.swing.JButton btnCalcEquivalente;
    public javax.swing.JButton btnCalcNominal;
    public javax.swing.JButton btnCalcSimples;
    public javax.swing.JButton btnSair;
    public javax.swing.JComboBox<String> cbDestinoEquivalente;
    public javax.swing.JComboBox<String> cbOrigemEquivalente;
    public javax.swing.JComboBox<String> cbOrigemNominal;
    public javax.swing.JComboBox<String> cbdestinoNominal;
    public javax.swing.JTextField edJuroComposto;
    public javax.swing.JTextField edJuroSimples;
    public javax.swing.JTextField edPeriodoComposto;
    public javax.swing.JTextField edPeriodoSimples;
    public javax.swing.JTextField edTaxaComposto;
    public javax.swing.JTextField edTxEquivalente;
    public javax.swing.JTextField edTxNominal;
    public javax.swing.JTextField edTxSimples;
    public javax.swing.JTextField edVfComposto;
    public javax.swing.JTextField edVfSimples;
    public javax.swing.JTextField edVpComposto;
    public javax.swing.JTextField edVpSimples;
    public javax.swing.ButtonGroup groupComposto;
    public javax.swing.ButtonGroup groupSimples;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JPanel pnEquivalente;
    public javax.swing.JPanel pnJurosComposto;
    public javax.swing.JPanel pnJurosSimples1;
    public javax.swing.JPanel pnTaxas;
    public javax.swing.JPanel pnTaxas2;
    public javax.swing.JRadioButton rbJurosComposto;
    public javax.swing.JRadioButton rbJurosSimples;
    public javax.swing.JRadioButton rbNComposto;
    public javax.swing.JRadioButton rbNSimples;
    public javax.swing.JRadioButton rbTaxaComposto;
    public javax.swing.JRadioButton rbTaxaSimples;
    public javax.swing.JRadioButton rbVfComposto;
    public javax.swing.JRadioButton rbVfSimples;
    public javax.swing.JRadioButton rbVpComposto;
    public javax.swing.JRadioButton rbVpSimples;
    public javax.swing.JTextArea taResultComposto;
    public javax.swing.JTextArea taResultEquivalente;
    public javax.swing.JTextArea taResultNominal;
    public javax.swing.JTextArea taResultSimples;
    // End of variables declaration//GEN-END:variables
}
