package dao.lancamento;

import controller.ContaController;
import dao.OracleDaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conta;
import model.Lancamento;
import model.Usuario;

public class OracleLancamento implements LancamentoDao {

    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet resultSet;

    @Override
    public boolean insert(Object oObjeto) {
        Lancamento oLancamento = (Lancamento) oObjeto;
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(""
                    + "insert into lancamento                                       \n"
                    + "  (lancamentoid, valor, contaid, datalancamento, usuarioid)  \n"
                    + "values                                                       \n"
                    + "  (?           , ?    , ?      , ?             , ?        )    ");

            stmt.setInt(1, oLancamento.getLancamentoId());
            stmt.setDouble(2, oLancamento.getValor());
            stmt.setInt(3, oLancamento.getoConta().getContaId());
            stmt.setDate(4, new java.sql.Date(oLancamento.getDataLancamento().getTime()));
            stmt.setInt(5, Usuario.getInstance().getUsuarioid());
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
        Lancamento oLancamento = (Lancamento) oObjeto;
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(""
                    + "update                   \n"
                    + "  lancamento             \n"
                    + "set                      \n"
                    + "  valor          = ?,    \n"
                    + "  contaid        = ?,    \n"
                    + "  datalancamento = ?,    \n"
                    + "  usuarioid      = ?     \n"
                    + "where                    \n"
                    + "  lancamentoid = ?         ");

            stmt.setDouble(1, oLancamento.getValor());
            stmt.setInt(2, oLancamento.getoConta().getContaId());
            stmt.setDate(3, new java.sql.Date(oLancamento.getDataLancamento().getTime()));
            stmt.setInt(4, Usuario.getInstance().getUsuarioid());
            //where 
            stmt.setInt(5, oLancamento.getLancamentoId());
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
            stmt = conexao.prepareStatement("select sq_lancamento.nextval as codigo from dual");
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
        Lancamento oLancamento = new Lancamento();
        oLancamento = (Lancamento) oObjeto;
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(""
                    + " delete            "
                    + " from              "
                    + " lancamento        "
                    + "   where           "
                    + " lancamentoid = ?  ");

            stmt.setInt(1, oLancamento.getLancamentoId());

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
    public List<Lancamento> buscarTodos() {
        try {
            conexao = OracleDaoFactory.abreConexao();
            ContaController contaCtrl = new ContaController(null);
            stmt = conexao.prepareStatement(""
                    + "select                                      \n"
                    + "  lancamentoid,                             \n"
                    + "  valor,                                    \n"
                    + "  contaid,                                  \n"
                    + "  datalancamento                            \n"
                    + "from                                        \n"
                    + "  lancamento                                \n"
                    + "order by                                    \n"
                    + "  1 desc                                      ");

            ResultSet rs = stmt.executeQuery();

            ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>();

            while (rs.next()) {
                Lancamento oLancamento = new Lancamento();
                oLancamento.setLancamentoId(rs.getInt("lancamentoid"));
                oLancamento.setValor(Double.parseDouble(rs.getString("valor")));
                oLancamento.setoConta(getConta((rs.getInt("contaId"))));
                oLancamento.setDataLancamento(rs.getDate("datalancamento"));
                oLancamento.setoUsuario(Usuario.getInstance());
                lancamentos.add(oLancamento);
            }
            return lancamentos;
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

    public Conta getConta(int contaId) {
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

    @Override
    public List<Lancamento> buscarPorData(String mes, String ano) {
        try {
            conexao = OracleDaoFactory.abreConexao();
            stmt = conexao.prepareStatement(""
                    + "select                                      \n"
                    + "  lancamentoid,                             \n"
                    + "  valor,                                    \n"
                    + "  contaid,                                  \n"
                    + "  datalancamento                            \n"
                    + "from                                        \n"
                    + "  lancamento                                \n"
                    + "where                                       \n"
                    + "  extract(month from datalancamento) = ?    \n"
                    + "  and                                       \n"
                    + "  extract(year from datalancamento) = ?     \n"
                    + "order by                                    \n"
                    + "  datalancamento                              ");
            stmt.setString(1, mes);
            stmt.setString(2, ano);
            ResultSet rs = stmt.executeQuery();

            ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>();

            while (rs.next()) {
                Lancamento oLancamento = new Lancamento();
                oLancamento.setLancamentoId(rs.getInt("lancamentoid"));
                oLancamento.setValor(Double.parseDouble(rs.getString("valor")));
                oLancamento.setoConta(getConta((rs.getInt("contaId"))));
                oLancamento.setDataLancamento(rs.getDate("datalancamento"));
                oLancamento.setoUsuario(Usuario.getInstance());
                lancamentos.add(oLancamento);
            }
            return lancamentos;
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

}
