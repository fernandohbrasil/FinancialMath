package dao.lancamento;

import dao.DaoDefault;
import java.util.List;
import model.Lancamento;

public interface LancamentoDao extends DaoDefault {

    public abstract List<Lancamento> buscarTodos();
    
    public abstract List<Lancamento> buscarPorData(String mes, String ano);
}
