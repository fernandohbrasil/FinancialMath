package dao;

import dao.conta.ContaDao;
import dao.lancamento.LancamentoDao;
import dao.usuario.UsuarioDao;

public abstract class DaoFactory {

    public static final int oracle = 1;
   
    public abstract UsuarioDao getUsuarioDao();
    public abstract ContaDao getContaDao(); 
    public abstract LancamentoDao getLancamentoDao();

    public static DaoFactory getDaoFactory(int tipo) {
        switch (tipo) {
            case oracle:
               return new OracleDaoFactory();
            default:
                return null;

        }

    }

}
