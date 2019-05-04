package controller;

import Funcoes.Util;
import dao.DaoFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Lancamento;
import model.Resultado;
import org.joda.time.DateTime;
import org.joda.time.Days;
import view.FormResultado;

public class ResultadoController {

    private FormResultado frmResultado;
    private DaoFactory daoFactory;

    public ResultadoController(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
        frmResultado = new FormResultado(null, true);

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frmResultado.btnFecha.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                sair();
            }
        });

        frmResultado.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                sair();
            }
        });

        frmResultado.btnRelatorio.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    relatorio();
                } catch (IOException ex) {
                    Logger.getLogger(ResultadoController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    public void executar() {
        iniciarTela();
        frmResultado.setVisible(true);
    }

    private void imprimeResultado(List<Resultado> lancamentos) throws IOException {
        File arquivo = new File("Relatório.html");
        Util funcoes = new Util();

        String html = "<html>\n"
                + "<body>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n"
                + "<h1 style=\"text-align:center\">Método Hamburguês</h1>\n"
                + "\n"
                + "</body>\n"
                + "</html> \n"
                + "<table border=\"1\" style=\"width:1355px\"> \n"
                + "<th>Data</th>\n"
                + "<th>Historico</th>\n"
                + "<th>Valor</th>\n"
                + "<th>Saldo</th>\n"
                + "<th>D/C</th>\n"
                + "<th>Nº dias Saldo Devedor</th>\n"
                + "<th>Nº Dias x Saldo Devedor</th>\n";

        Lancamento oLancamento = new Lancamento();
        String data = "";
        String historico = "";
        double valor = 0.0;
        double saldo = 0.0;
        String tipo = "";
        int numDias = 0;
        double numDiasSaldoDev = 0.0;
        double numDiasSaldoDevAcum = 0.0;

        for (int i = 0; i < lancamentos.size(); i++) {

            //usado apenas após terminar o laço
            oLancamento = lancamentos.get(i).getoLancamento();

            data = funcoes.dateToString(oLancamento.getDataLancamento());
            historico = lancamentos.get(i).getoLancamento().getoConta().getDescricao();
            valor = lancamentos.get(i).getoLancamento().getValor();
            saldo = lancamentos.get(i).getSaldo();
            tipo = lancamentos.get(i).getoLancamento().getoConta().getTipo().toUpperCase();
            numDias = lancamentos.get(i).getNumDias();
            numDiasSaldoDev = lancamentos.get(i).getJuroXDias();
            numDiasSaldoDevAcum = numDiasSaldoDevAcum + numDiasSaldoDev;

            html = html + "<tr>\n"
                    + " <td style=\"text-align:center\">" + data + "</td>\n"
                    + " <td style=\"text-align:center\">" + historico + "</td>\n"
                    + " <td style=\"text-align:center\">" + valor + "</td>\n"
                    + " <td style=\"text-align:center\">" + saldo + "</td>\n"
                    + " <td style=\"text-align:center\">" + tipo + "</td>\n"
                    + "	<td style=\"text-align:center\">" + numDias + "</td>\n"
                    + "	<td style=\"text-align:center\">" + numDiasSaldoDev + "</td>\n"
                    + "</tr> \n";
        }

        //Verificar se o ultimo lançamento do mês é no dia
        //Caso não seja, é necessário fazer um lançamento de fechamento do mês        
        if (!lancamentoFinalUltimodia(oLancamento.getDataLancamento())) {
            
            Date dtFinal = getUltimoDiaUtilDoMes(oLancamento.getDataLancamento());    
            data = funcoes.getFormt().format(dtFinal);
            numDias = diferencaDatas(oLancamento.getDataLancamento(), dtFinal);
            numDiasSaldoDev = numDias * saldo;
            numDiasSaldoDevAcum = numDiasSaldoDevAcum + numDiasSaldoDev;
            
            html = html + "<tr>\n"
                    + " <td style=\"text-align:center\">" + data + "</td>\n"
                    + " <td style=\"text-align:center\"> ------- </td>\n"
                    + " <td style=\"text-align:center\"> ------- </td>\n"
                    + " <td style=\"text-align:center\">" + saldo + "</td>\n"
                    + " <td style=\"text-align:center\"> - </td>\n"
                    + "	<td style=\"text-align:center\">" + numDias + "</td>\n"
                    + "	<td style=\"text-align:center\">" + numDiasSaldoDev + "</td>\n"
                    + "</tr> \n";
        }

        double jurosTotal = calculoFinal(numDiasSaldoDevAcum);

        html = html + "<tr>\n"
                + "  <td style=\"text-align:center\"> - </td>\n"
                + "  <td style=\"text-align:center\"> - </td>\n"
                + "  <td style=\"text-align:center\"> - </td>\n"
                + "  <td style=\"text-align:center\"> - </td>\n"
                + "  <td style=\"text-align:center\"> - </td>\n"
                + "  <th style=\"text-align:center\"> Total </th>\n"
                + " <th style=\"text-align:center\">" + numDiasSaldoDevAcum + "</th>\n"
                + " </tr> \n"
                + " </table>\n"
                + "<br><br><br>\n"
                + "<h2 style=\"text-align:center\">Juros Total: " + jurosTotal + "</h2>";

        arquivo.createNewFile();
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(html);
        bw.close();
        fw.close();
    }

    private double calculoFinal(double numDiasSaldoDevAcum) {
        try {
            double tx = Double.parseDouble(frmResultado.edtTaxa.getText());
                      
            if (tx > 0) {
                tx = tx / 30;
                return ((tx / 100) * numDiasSaldoDevAcum) * (-1);
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    private boolean validaTaxa() {
        try {
            if (Double.parseDouble(frmResultado.edtTaxa.getText()) >= 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    private void relatorio() throws IOException {
        if (validaTaxa()) {
            //Recebo uma lista de Lançamento ja Agrupados por Data
            List<Resultado> lancamentos = lancamentosComNumDias(lancamentosComSaldo(lancamentosAgrupados()));

            imprimeResultado(lancamentos);
        } else {
            JOptionPane.showMessageDialog(frmResultado, "Taxa Incorreta");
        }
    }

    private void sair() {
        frmResultado.setVisible(false);
    }

    private void iniciarTela() {
        Util funcoes = new Util();
        frmResultado.edtAno.setText(funcoes.getYearFormat().format(Date.from(Instant.now())));
    }

    private int diferencaDatas(Date dataAnt, Date dataAtual) {
        Util funcoes = new Util();
        int diaAnt = Integer.parseInt(funcoes.getDayFormat().format(dataAnt));
        int mesAnt = Integer.parseInt(funcoes.getMonthFormat().format(dataAnt));
        int anoAnt = Integer.parseInt(funcoes.getYearFormat().format(dataAnt));
        int dia = Integer.parseInt(funcoes.getDayFormat().format(dataAtual));
        int mes = Integer.parseInt(funcoes.getMonthFormat().format(dataAtual));
        int ano = Integer.parseInt(funcoes.getYearFormat().format(dataAtual));

        DateTime dataInicial = new DateTime(anoAnt, mesAnt, diaAnt, 0, 0);
        DateTime dataFinal = new DateTime(ano, mes, dia, 0, 0);
        int dias = Days.daysBetween(dataInicial, dataFinal).getDays();

        return dias;
    }

    private List<Resultado> lancamentosComNumDias(List<Resultado> lancamentos) {
        Date aData = null;
        Double saldo = 0.0;
        for (int i = 0; i < lancamentos.size(); i++) {
            if (aData != null) {
                if (saldo < 0) {
                    int newIndex = indexAgrup(lancamentos, lancamentos.get(i).getoLancamento().getDataLancamento(), i);
                    if (newIndex > 0) {
                        i = newIndex;
                    }

                    int dias = diferencaDatas(aData, lancamentos.get(i).getoLancamento().getDataLancamento());
                    lancamentos.get(i).setNumDias(dias);
                    lancamentos.get(i).setJuroXDias(dias * saldo);

                    if (lancamentos.get(i).getSaldo() < 0) {
                        saldo = lancamentos.get(i).getSaldo();
                        aData = lancamentos.get(i).getoLancamento().getDataLancamento();
                    } else {
                        aData = null;
                        saldo = 0.00;
                    }
                }
            } else {
                if (lancamentos.get(i).getSaldo() < 0) {
                    aData = lancamentos.get(i).getoLancamento().getDataLancamento();
                    saldo = lancamentos.get(i).getSaldo();
                }
            }
        }
        return lancamentos;
    }

    private List<Resultado> lancamentosComSaldo(List<Resultado> lancamentos) {
        Double saldo = 0.0;
        for (int i = 0; i < lancamentos.size(); i++) {
            int posicaoValorDiario = indexAgrup(lancamentos, lancamentos.get(i).getoLancamento().getDataLancamento(), i);
            if (posicaoValorDiario < 0) {
                if ("d".equals(lancamentos.get(i).getoLancamento().getoConta().getTipo())) {
                    saldo = saldo - lancamentos.get(i).getoLancamento().getValor();
                } else {
                    saldo = saldo + lancamentos.get(i).getoLancamento().getValor();
                }
            } else {
                i = posicaoValorDiario;
                saldo = saldo + lancamentos.get(i).getValorDiario();
            }

            lancamentos.get(i).setSaldo(saldo);
        }
        return lancamentos;
    }

    private int indexAgrup(List<Resultado> lancamentos, Date aData, int index) {
        int posicao = -1;
        for (int i = index; i < lancamentos.size(); i++) {
            if (aData.compareTo(lancamentos.get(i).getoLancamento().getDataLancamento()) == 0) {
                if (lancamentos.get(i).getValorDiario() > 0) {
                    posicao = i;
                    index = lancamentos.size();
                }
            }
        }
        return posicao;
    }

    private int lastDayOfMonth(Date date) {
        Util funcoes = new Util();
        int mes = Integer.parseInt(funcoes.getMonthFormat().format(date));

        switch (mes) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 15;
            case 12:
                return 31;
            default:
                return 0;

        }
    }

    private boolean lancamentoFinalUltimodia(Date data) {
        Util funcoes = new Util();

        if (Integer.parseInt(funcoes.getDayFormat().format(data)) == lastDayOfMonth(data)) {
            return true;
        } else {
            return false;
        }
    }

    private List<Resultado> lancamentosAgrupados() {
        //Gambiarra Master!!!         
        String mes = frmResultado.cbMes.getSelectedItem().toString();
        String ano = frmResultado.edtAno.getText();
        Date aData = new Date();
        double valor = 0.0;

        List<Lancamento> todos = daoFactory.getLancamentoDao().buscarPorData(mes, ano);
        aData = null;
        ArrayList<Resultado> agrupados = new ArrayList<Resultado>();

        for (int i = 0; i < todos.size(); i++) {
            Lancamento oLancamento = todos.get(i);
            if (aData != null) {
                if (oLancamento.getDataLancamento().compareTo(aData) == 0) {
                    double valorAcum = valor;
                    boolean lancaUltimo = true;
                    while (oLancamento.getDataLancamento().compareTo(aData) == 0) {
                        if ("d".equals(oLancamento.getoConta().getTipo())) {
                            valorAcum = valorAcum - oLancamento.getValor();
                        } else {
                            valorAcum = valorAcum + oLancamento.getValor();
                        }

                        Resultado oResultado = new Resultado();
                        oResultado.setoLancamento(oLancamento);
                        agrupados.add(oResultado);

                        i++;
                        if (i < todos.size()) {
                            oLancamento = todos.get(i);
                        } else {
                            lancaUltimo = false;
                            break;
                        }
                    }
                    //ajustando o Ultimo do While 
                    agrupados.get(i - 1).setValorDiario(valorAcum);

                    //Lançando o Proximo após o While 
                    if (lancaUltimo) {
                        Resultado oResultado = new Resultado();
                        oResultado.setoLancamento(oLancamento);
                        agrupados.add(oResultado);
                    }
                } else {
                    Resultado oResultado = new Resultado();
                    oResultado.setoLancamento(oLancamento);
                    agrupados.add(oResultado);

                    aData = oLancamento.getDataLancamento();
                    if ("d".equals(oLancamento.getoConta().getTipo())) {
                        valor = -oLancamento.getValor();
                    } else {
                        valor = oLancamento.getValor();
                    }
                }
            } else {
                Resultado oResultado = new Resultado();
                oResultado.setoLancamento(oLancamento);
                agrupados.add(oResultado);

                aData = oLancamento.getDataLancamento();
                if ("d".equals(oLancamento.getoConta().getTipo())) {
                    valor = -oLancamento.getValor();
                } else {
                    valor = oLancamento.getValor();
                }
            }
        }
        return agrupados;
    }

    private Date getUltimoDiaUtilDoMes(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.DATE, -1);

        return calendar.getTime();
    }

}
