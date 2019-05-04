package view.model;

import Funcoes.Util;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Lancamento;

public class LancamentoModel extends AbstractTableModel {

    private ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>();

    @Override
    public int getRowCount() {
        return lancamentos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Primeiro, recuperar o objeto a ser mostrado naquela linha
        Lancamento oLancamento = lancamentos.get(rowIndex);
        Util funcoes = new Util();

        // Segundo, recuperar o atributo do objeto a ser 
        // mostrado naquela coluna
        if (columnIndex == 0) {
            return oLancamento.getLancamentoId();
        } else if (columnIndex == 1) {
            return funcoes.dateToString(oLancamento.getDataLancamento());
        } else if (columnIndex == 2) {
            return oLancamento.getoConta();
        } else if (columnIndex == 3) {
            if (oLancamento.getoConta().getTipo().equals("d")) {
                return "Débito";
            } else {
                return "Crédito";
            }
        } else {
            return oLancamento.getValor();
        }
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        } else if (column == 1) {
            return "Data";
        } else if (column == 2) {
            return "Conta";
        } else if (column == 3) {
            return "Tipo";
        } else {
            return "Valor";
        }
    }

    public void addLancamento(Lancamento oLancamento) {
        // adicionar na lista
        lancamentos.add(oLancamento);
        // notificar a Jtable que o objeto foi adicionado
        fireTableDataChanged();
    }

    public Lancamento getLancamento(int posicao) {
        return lancamentos.get(posicao);
    }

    public void limpar() {
        lancamentos.clear();
    }
}
