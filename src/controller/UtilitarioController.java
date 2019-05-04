package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import view.FormUtil;

public class UtilitarioController {

    private FormUtil frmUtil;

    private void inicializarComponentes() {
        frmUtil.btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });

        frmUtil.btnCalcSimples.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executaJurosSimples();
            }
        });

        frmUtil.btnCalcComposto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executaJurosComposto();
            }
        });

        frmUtil.btnCalcEquivalente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executaTaxaEquivalente();
            }
        });

        frmUtil.btnCalcNominal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executaTaxaNominal();
            }
        });
    }

    //Taxa Nominal
    private void executaTaxaNominal() {
        try {
            DecimalFormat formato = new DecimalFormat("#.########");

            Double origem = 0.0;
            Double destino = 0.0;
            Double taxa = 0.0;
            Double resultado = 0.0;

            if (!frmUtil.edTxNominal.getText().isEmpty()) {
                taxa = Double.parseDouble(frmUtil.edTxNominal.getText()) / 100;
            }

            int selecaoOri = frmUtil.cbOrigemNominal.getSelectedIndex();
            switch (selecaoOri) {
                case 0:
                    origem = 1.0;
                    break;
                case 1:
                    origem = 7.0;
                    break;
                case 2:
                    origem = 30.0;
                    break;
                case 3:
                    origem = 60.0;
                    break;
                case 4:
                    origem = 90.0;
                    break;
                case 5:
                    origem = 180.0;
                    break;
                case 6:
                    origem = 360.0;
                    break;
                default:
                    origem = 0.0;
            }

            int selecaoDest = frmUtil.cbdestinoNominal.getSelectedIndex();
            switch (selecaoDest) {
                case 0:
                    destino = 1.0;
                    break;
                case 1:
                    destino = 7.0;
                    break;
                case 2:
                    destino = 30.0;
                    break;
                case 3:
                    destino = 60.0;
                    break;
                case 4:
                    destino = 90.0;
                    break;
                case 5:
                    destino = 180.0;
                    break;
                case 6:
                    destino = 360.0;
                    break;
                default:
                    destino = 0.0;
            }

            resultado = taxa * (destino / origem) * 100;

            if (resultado > 0) {
                frmUtil.taResultNominal.setText("Sua taxa convertida é:  " + formato.format(resultado) + "%");
            } else {
                frmUtil.taResultNominal.setText("erro ao converter taxa, verifique os valores");
            }
        } catch (Exception e) {
            frmUtil.taResultNominal.setText("erro ao converter taxa, verifique os valores");
        }
    }

    //Taxa Equivalente 
    private void executaTaxaEquivalente() {
        try {
            DecimalFormat formato = new DecimalFormat("#.########");

            Double origem = 0.0;
            Double destino = 0.0;
            Double taxa = 0.0;
            Double resultado = 0.0;

            if (!frmUtil.edTxEquivalente.getText().isEmpty()) {
                taxa = Double.parseDouble(frmUtil.edTxEquivalente.getText()) / 100;
            }

            int selecaoOri = frmUtil.cbOrigemEquivalente.getSelectedIndex();
            switch (selecaoOri) {
                case 0:
                    origem = 1.0;
                    break;
                case 1:
                    origem = 7.0;
                    break;
                case 2:
                    origem = 30.0;
                    break;
                case 3:
                    origem = 60.0;
                    break;
                case 4:
                    origem = 90.0;
                    break;
                case 5:
                    origem = 180.0;
                    break;
                case 6:
                    origem = 360.0;
                    break;
                default:
                    origem = 0.0;
            }

            int selecaoDest = frmUtil.cbDestinoEquivalente.getSelectedIndex();
            switch (selecaoDest) {
                case 0:
                    destino = 1.0;
                    break;
                case 1:
                    destino = 7.0;
                    break;
                case 2:
                    destino = 30.0;
                    break;
                case 3:
                    destino = 60.0;
                    break;
                case 4:
                    destino = 90.0;
                    break;
                case 5:
                    destino = 180.0;
                    break;
                case 6:
                    destino = 360.0;
                    break;
                default:
                    destino = 0.0;
            }

            resultado = (Math.pow(1 + taxa, destino / origem) - 1) * 100;

            if (resultado > 0) {
                frmUtil.taResultEquivalente.setText("Sua taxa convertida é:  " + formato.format(resultado) + "%");
            } else {
                frmUtil.taResultEquivalente.setText("erro ao converter taxa, verifique os valores");
            }
        } catch (Exception e) {
            frmUtil.taResultEquivalente.setText("erro ao converter taxa, verifique os valores");
        }

    }

    //Juros Composto
    private void executaJurosComposto() {
        if (frmUtil.rbJurosComposto.isSelected()) {
            calculaJurosComposto();
        } else if ((frmUtil.rbNComposto.isSelected())) {
            calculaPeriodoComposto();
        } else if ((frmUtil.rbTaxaComposto.isSelected())) {
            calculaTaxaComposto();
        } else if ((frmUtil.rbVpComposto.isSelected())) {
            calculaVpComposto();
        } else if ((frmUtil.rbVfComposto.isSelected())) {
            calculaVfComposto();
        }
    }

    private void calculaJurosComposto() {
        double resultado = 0.0;
        //resultado = Math.pow(5, 2);

        if (!frmUtil.edTaxaComposto.getText().isEmpty() && !frmUtil.edVpComposto.getText().isEmpty() && !frmUtil.edPeriodoComposto.getText().isEmpty()) {
            resultado = Double.parseDouble(frmUtil.edVpComposto.getText()) * (Math.pow(((Double.parseDouble(frmUtil.edTaxaComposto.getText()) / 100) + 1), Double.parseDouble(frmUtil.edPeriodoComposto.getText())) - 1);
            frmUtil.taResultComposto.setText("O Valor de júros é: " + resultado);
        } else {
            frmUtil.taResultComposto.setText("Parâmetros insuficientes para esse cálculo");
        }
    }

    private void calculaPeriodoComposto() {
        double resultado = 0.0;

        if (!frmUtil.edVpComposto.getText().isEmpty() && !frmUtil.edVfComposto.getText().isEmpty() && !frmUtil.edTaxaComposto.getText().isEmpty()) {
            resultado = Math.log(Double.parseDouble(frmUtil.edVfComposto.getText())/Double.parseDouble(frmUtil.edVpComposto.getText())) / Math.log(1 + (Double.parseDouble(frmUtil.edTaxaComposto.getText()) / 100));                     
            frmUtil.taResultComposto.setText("O Periodo é:" + resultado);
        } else {
            frmUtil.taResultComposto.setText("Parâmetros insuficientes para esse cálculo");
        }        
    }

    private void calculaTaxaComposto() {
        double resultado = 0.0;       

        if (!frmUtil.edVpComposto.getText().isEmpty() && !frmUtil.edVfComposto.getText().isEmpty() && !frmUtil.edPeriodoComposto.getText().isEmpty()) {
            resultado = (Math.pow(Double.parseDouble(frmUtil.edVfComposto.getText()) / Double.parseDouble(frmUtil.edVpComposto.getText()), 1 / Double.parseDouble(frmUtil.edPeriodoComposto.getText()))) - 1;
            frmUtil.taResultComposto.setText("A taxa é: " + resultado * 100 + "%");
        } else {
            frmUtil.taResultComposto.setText("Parâmetros insuficientes para esse cálculo");
        }
    }

    private void calculaVpComposto() {
        double resultado = 0.0;
        //resultado = Math.pow(5, 2);

        if (!frmUtil.edVfComposto.getText().isEmpty() && !frmUtil.edTaxaComposto.getText().isEmpty() && !frmUtil.edPeriodoComposto.getText().isEmpty()) {
            resultado = Double.parseDouble(frmUtil.edVpComposto.getText()) / (1 / Math.pow(1 + (Double.parseDouble(frmUtil.edTaxaComposto.getText()) / 100), Double.parseDouble(frmUtil.edPeriodoComposto.getText())));
            frmUtil.taResultComposto.setText("o Valor Principal é: " + resultado);
        } else {
            frmUtil.taResultComposto.setText("Parâmetros insuficientes para esse cálculo");
        }
    }

    private void calculaVfComposto() {
        double resultado = 0.0;
        //resultado = Math.pow(5, 2);

        if (!frmUtil.edVpComposto.getText().isEmpty() && !frmUtil.edTaxaComposto.getText().isEmpty() && !frmUtil.edPeriodoComposto.getText().isEmpty()) {
            resultado = Double.parseDouble(frmUtil.edVpComposto.getText()) * (Math.pow((1 + (Double.parseDouble(frmUtil.edTaxaComposto.getText()) / 100)), Double.parseDouble(frmUtil.edPeriodoComposto.getText())));
            frmUtil.taResultComposto.setText("O Valor final é: " + resultado);
        } else {
            frmUtil.taResultComposto.setText("Parâmetros insuficientes para esse cálculo");
        }
    }

    //Juros Simples
    private void executaJurosSimples() {
        if (frmUtil.rbJurosSimples.isSelected()) {
            calculaJurosSimples();
        } else if ((frmUtil.rbNSimples.isSelected())) {
            calculaPeriodoSimples();
        } else if ((frmUtil.rbTaxaSimples.isSelected())) {
            calculaTaxaSimples();
        } else if ((frmUtil.rbVpSimples.isSelected())) {
            calculaVpSimples();
        } else if ((frmUtil.rbVfSimples.isSelected())) {
            calculaVfSimples();
        }
    }

    private void calculaJurosSimples() {
        double resultado = 0.0;

        if (!frmUtil.edVfSimples.getText().isEmpty() && !frmUtil.edVpSimples.getText().isEmpty()) {
            resultado = Double.parseDouble(frmUtil.edVfSimples.getText()) - Double.parseDouble(frmUtil.edVpSimples.getText());
            frmUtil.taResultSimples.setText("O Valor de júros é: " + resultado);
        } else if (!frmUtil.edTxSimples.getText().isEmpty() && !frmUtil.edVpSimples.getText().isEmpty() && !frmUtil.edPeriodoSimples.getText().isEmpty()) {
            resultado = Double.parseDouble(frmUtil.edVpSimples.getText()) * (Double.parseDouble(frmUtil.edTxSimples.getText()) / 100) * Double.parseDouble(frmUtil.edPeriodoSimples.getText());
            frmUtil.taResultSimples.setText("O Valor de júros é: " + resultado);
        } else {
            frmUtil.taResultSimples.setText("Parâmetros insuficientes para esse cálculo");
        }
    }

    private void calculaPeriodoSimples() {
        double resultado = 0.0;

        if (!frmUtil.edJuroSimples.getText().isEmpty() && !frmUtil.edVpSimples.getText().isEmpty() && !frmUtil.edTxSimples.getText().isEmpty()) {
            resultado = (Double.parseDouble(frmUtil.edJuroSimples.getText())) / (Double.parseDouble(frmUtil.edVpSimples.getText()) * (Double.parseDouble(frmUtil.edTxSimples.getText()) / 100));
            frmUtil.taResultSimples.setText("O Valor de júros é: " + resultado);
        } else {
            frmUtil.taResultSimples.setText("Parâmetros insuficientes para esse cálculo");
        }
    }

    private void calculaTaxaSimples() {
        double resultado = 0.0;

        if (!frmUtil.edVpSimples.getText().isEmpty() && !frmUtil.edJuroSimples.getText().isEmpty() && !frmUtil.edTxSimples.getText().isEmpty()) {
            resultado = Double.parseDouble(frmUtil.edJuroSimples.getText()) / (Double.parseDouble(frmUtil.edVpSimples.getText()) * (Double.parseDouble(frmUtil.edPeriodoSimples.getText())));
            frmUtil.taResultSimples.setText("A taxa é: " + resultado * 100 + "%");
        } else if (!frmUtil.edVpSimples.getText().isEmpty() && !frmUtil.edVfSimples.getText().isEmpty() && !frmUtil.edPeriodoSimples.getText().isEmpty()) {
            resultado = (Double.parseDouble(frmUtil.edVfSimples.getText()) - Double.parseDouble(frmUtil.edVpSimples.getText())) - (Double.parseDouble(frmUtil.edVpSimples.getText()) * (Double.parseDouble(frmUtil.edTxSimples.getText()) / 100));
            frmUtil.taResultSimples.setText("A taxa é: " + resultado * 100 + "%");
        } else {
            frmUtil.taResultSimples.setText("Parâmetros insuficientes para esse cálculo");
        }
    }

    private void calculaVfSimples() {
        double resultado = 0.0;

        if (!frmUtil.edJuroSimples.getText().isEmpty() && !frmUtil.edVpSimples.getText().isEmpty()) {
            resultado = Double.parseDouble(frmUtil.edJuroSimples.getText()) + Double.parseDouble(frmUtil.edVpSimples.getText());
            frmUtil.taResultSimples.setText("O Valor Final é: " + resultado);
        } else if (!frmUtil.edVpSimples.getText().isEmpty() && !frmUtil.edTxSimples.getText().isEmpty() && !frmUtil.edPeriodoSimples.getText().isEmpty()) {
            resultado = Double.parseDouble(frmUtil.edVpSimples.getText()) * (1 + ((Double.parseDouble(frmUtil.edTxSimples.getText()) / 100) * Double.parseDouble(frmUtil.edPeriodoSimples.getText())));
            frmUtil.taResultSimples.setText("O Valor Final é: " + resultado);
        } else {
            frmUtil.taResultSimples.setText("Parâmetros insuficientes para esse cálculo");
        }
    }

    private void calculaVpSimples() {
        double resultado = 0.0;

        if (!frmUtil.edVfSimples.getText().isEmpty() && !frmUtil.edTxSimples.getText().isEmpty() && !frmUtil.edPeriodoSimples.getText().isEmpty()) {
            resultado = Double.parseDouble(frmUtil.edVpSimples.getText()) / (1 + ((Double.parseDouble(frmUtil.edTxSimples.getText()) / 100) * Double.parseDouble(frmUtil.edPeriodoSimples.getText())));
            frmUtil.taResultSimples.setText("O Valor Principal é: " + resultado);
        } else {
            frmUtil.taResultSimples.setText("Parâmetros insuficientes para esse cálculo, preencher Valor Final, Taxa, Periodo");
        }
    }

    //Controle
    public void executar() {
        limparCampos();
        frmUtil.setVisible(true);
    }

    private void fechar() {
        frmUtil.setVisible(false);
    }

    public UtilitarioController() {
        frmUtil = new FormUtil(null, true);
        inicializarComponentes();
    }

    private void limparCampos() {
        //Limpando todos os campos da tela       
    }
}
