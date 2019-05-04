package dao.usuario;

import dao.OracleDaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

public class OracleUsuario implements UsuarioDao {

    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet resultSet;

    private Usuario buscaUsuario(Usuario oUsuario) {
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(
                    "select         \n"
                    + "  usuarioId, \n"
                    + "  nome,      \n"
                    + "  email,     \n"
                    + "  login,     \n"
                    + "  senha      \n"
                    + "from         \n"
                    + "  usuario    \n"
                    + "where        \n"
                    + "  login = ?  \n"
                    + "  and        \n"
                    + "  senha = ?    ");

            stmt.setInt(1, oUsuario.getLogin());
            stmt.setInt(2, oUsuario.getSenha());

            resultSet = stmt.executeQuery();
            resultSet.next();

            oUsuario.setUsuarioid(resultSet.getInt("usuarioId"));
            oUsuario.setNome(resultSet.getString("nome"));
            oUsuario.setEmail(resultSet.getString("email"));
            oUsuario.setLogin(resultSet.getInt("login"));

            oUsuario.setSenha(Integer.parseInt(resultSet.getString("senha")));
            return oUsuario;
        } catch (SQLException e) {
            return null;
        } finally {
            try {
                conexao = OracleDaoFactory.fechaConexao();
            } catch (SQLException ex) {
                return null;
            }
        }

    }

    @Override
    public boolean logar(Usuario usuario) {
        if (buscaUsuario(usuario) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean insert(Object oObjeto) {
        Usuario oUsuario = (Usuario) oObjeto;
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement("insert into usuario    \n"
                    + "  (usuarioid, nome, email, login, senha  )   \n"
                    + "  values                                     \n"
                    + "  (?        , ?   , ?    , ?    , ?      )   ");

            stmt.setInt(1, oUsuario.getUsuarioid());
            stmt.setString(2, oUsuario.getNome());
            stmt.setString(3, oUsuario.getEmail());
            stmt.setInt(4, oUsuario.getLogin());
            stmt.setInt(5, oUsuario.getSenha());
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
    public boolean update(Object oObjeto) {
        Usuario oUsuario = (Usuario) oObjeto;
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(""
                    + "update       \n"
                    + "  usuario    \n"
                    + "set          \n"
                    + " nome = ?,   \n"
                    + " email = ?,  \n"
                    + " login = ?,  \n"
                    + " senha = ?   \n"
                    + "where        \n"
                    + "  usuarioid = ?");

            stmt.setString(1, oUsuario.getNome());
            stmt.setString(2, oUsuario.getEmail());
            stmt.setInt(3, oUsuario.getLogin());
            stmt.setInt(4, oUsuario.getSenha());
            //where
            stmt.setInt(5, oUsuario.getUsuarioid());
            stmt.execute();

            return true;
        } catch (Exception e) {
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
            stmt = conexao.prepareStatement("select sq_usuario.nextval as codigo from dual");
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
    public boolean delete(Object oObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
