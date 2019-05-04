package dao.usuario;

import dao.DaoDefault;
import model.Usuario;

public interface UsuarioDao extends DaoDefault {

    public boolean logar(Usuario usuario);

}
