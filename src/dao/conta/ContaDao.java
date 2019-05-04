package dao.conta;

import dao.DaoDefault;
import java.util.List;
import model.Conta;

public interface ContaDao extends DaoDefault {

    public abstract List<Conta> buscarTodos();

    public abstract Conta findConta(int contaId);

}
