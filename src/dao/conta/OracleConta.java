package dao.conta;

import dao.OracleDaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conta;
import model.Usuario;

public class OracleConta implements ContaDao {

    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet resultSet;

    @Override
    public boolean insert(Object oObjeto) {
        Conta oConta = (Conta) oObjeto;
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement("insert into conta  \n"
                    + "  (contaid, descricao, tipo, usuarioid)  \n"
                    + "  values                                 \n"
                    + "  (?      , ?        , ?   , ?        )    ");

            stmt.setInt(1, oConta.getContaId());
            stmt.setString(2, oConta.getDescricao());
            stmt.setString(3, oConta.getTipo());
            stmt.setInt(4, oConta.getoUsuario().getUsuarioid());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                stmt.close();
                conexao = OracleDaoFactory.fechaConexao();
            } catch (SQLException ex) {

            }
        }
    }

    @Override
    public boolean update(Object oObjeto) {
        Conta oConta = (Conta) oObjeto;
        try {
            conexao = dao.OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(""
                    + "update               \n"
                    + "  conta              \n"
                    + "set                  \n"
                    + "  descricao = ?,     \n"
                    + "  tipo      = ?,     \n"
                    + "  usuarioid = ?      \n"
                    + "where                \n"
                    + "  contaid = ?          ");

            stmt.setString(1, oConta.getDescricao());
            stmt.setString(2, oConta.getTipo());
            stmt.setInt(3, oConta.getoUsuario().getUsuarioid());
            //where 
            stmt.setInt(4, oConta.getContaId());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                stmt.close();
                conexao = OracleDaoFactory.fechaConexao();
            } catch (SQLException ex) {
                return false;
            }

        }

    }

    @Override
    public int getNextId() {
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement("select sq_conta.nextval as codigo from dual");
            ResultSet rs = stmt.executeQuery();
            rs.next();
            return rs.getInt("codigo");
        } catch (Exception e) {
            return 0;
        } finally {
            try {
                stmt.close();
                conexao = OracleDaoFactory.fechaConexao();
            } catch (SQLException ex) {
                return 0;
            }
        }
    }

    @Override
    public List<Conta> buscarTodos() {
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(""
                    + "Select      \n"
                    + "  contaid,  \n"
                    + "  descricao,\n"
                    + "  tipo      \n"
                    + "from        \n"
                    + "  conta     \n"
                    + "order by    \n"
                    + "  contaId     ");

            ResultSet rs = stmt.executeQuery();

            ArrayList<Conta> contas = new ArrayList<Conta>();

            while (rs.next()) {
                Conta oConta = new Conta();
                oConta.setContaId(rs.getInt("contaId"));
                oConta.setDescricao(rs.getString("descricao"));
                oConta.setTipo(rs.getString("tipo"));
                oConta.setoUsuario(Usuario.getInstance());

                contas.add(oConta);
            }
            return contas;
        } catch (Exception e) {
            return null;
        } finally {
            try {
                stmt.close();
                conexao = OracleDaoFactory.fechaConexao();
            } catch (SQLException ex) {

            }
        }

    }

    @Override
    public boolean delete(Object oObjeto) {
        Conta oConta = new Conta();
        oConta = (Conta) oObjeto;
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(""
                    + " delete                  "
                    + " from                    "
                    + " conta                   "
                    + "   where                 "
                    + " contaid = ?             ");

            stmt.setInt(1, oConta.getContaId());

            stmt.execute();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                stmt.close();
                conexao = OracleDaoFactory.fechaConexao();
            } catch (SQLException ex) {

            }
        }

    }

    @Override
    public Conta findConta(int contaId) {
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(""
                    + "Select       \n"
                    + "  contaid,   \n"
                    + "  descricao, \n"
                    + "  tipo       \n"
                    + "from         \n"
                    + "  conta      \n "
                    + "Where        \n"
                    + "  contaId = ?");

            stmt.setInt(1, contaId);

            ResultSet rs = stmt.executeQuery();
            rs.next();

            Conta oConta = new Conta();
            oConta.setContaId(rs.getInt("contaId"));
            oConta.setDescricao(rs.getString("descricao"));
            oConta.setTipo(rs.getString("tipo"));
            oConta.setoUsuario(Usuario.getInstance());
            return oConta;
        } catch (Exception e) {
            return null;
        } finally {
            try {
                stmt.close();
                conexao = OracleDaoFactory.fechaConexao();
            } catch (SQLException ex) {
                return null;
            }
        }
    }
}
