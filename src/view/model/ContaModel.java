package view.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Conta;

public class ContaModel extends AbstractTableModel {

    private ArrayList<Conta> contas = new ArrayList<Conta>();

    @Override
    public int getRowCount() {
        return contas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Primeiro, recuperar o objeto a ser mostrado naquela linha
        Conta oConta = contas.get(rowIndex);

        // Segundo, recuperar o atributo do objeto a ser 
        // mostrado naquela coluna
        if (columnIndex == 0) {
            return oConta.getContaId();
        } else if (columnIndex == 1) {
            return oConta.getDescricao();
        } else {
            if ("d".equals(oConta.getTipo())) {
                return "Débito";
            } else {
                return "Crédito";
            }
        }
    }

    @Override
    public String getColumnName(int column
    ) {
        if (column == 0) {
            return "Código";
        } else if (column == 1) {
            return "Descrição";
        } else {
            return "Tipo";
        }
    }

    public void addConta(Conta oConta) {
        // adicionar na lista
        contas.add(oConta);
        // notificar a Jtable que o objeto foi adicionado
        fireTableDataChanged();
    }

    public Conta getConta(int posicao) {
        return contas.get(posicao);
    }

    public void limpar() {
        contas.clear();
    }

}
