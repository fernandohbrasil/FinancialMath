package dao;

import config.Arquivo;
import config.DadosArquivo;
import dao.conta.ContaDao;
import dao.conta.OracleConta;
import dao.lancamento.LancamentoDao;
import dao.lancamento.OracleLancamento;
import dao.usuario.OracleUsuario;
import dao.usuario.UsuarioDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDaoFactory extends DaoFactory {

    private static Arquivo oArquivo = new Arquivo();
    private static DadosArquivo dadosArquivo = new DadosArquivo();
    private static Connection conexao;

    public static Connection createConexao() {
        try {
            dadosArquivo = oArquivo.leArquivo("ArqText2.ini", 2);
            Class.forName(dadosArquivo.getDriver());
            Connection conexao = DriverManager.getConnection(dadosArquivo.getUrl(), dadosArquivo.getUsuario(), dadosArquivo.getSenha());
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }

    public static Connection fechaConexao() throws SQLException {
        if (conexao != null) {
            conexao.close();
        }
        return conexao;
    }

    public static Connection abreConexao() throws SQLException {
        return conexao = createConexao();
    }

    @Override
    public UsuarioDao getUsuarioDao() {
        return new OracleUsuario();
    }

    @Override
    public ContaDao getContaDao() {
        return new OracleConta();
    }

    @Override
    public LancamentoDao getLancamentoDao() {
        return new OracleLancamento();
    }

}
