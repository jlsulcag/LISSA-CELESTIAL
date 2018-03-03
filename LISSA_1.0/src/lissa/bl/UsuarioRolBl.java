
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Rol;
import lissa.be.UsuarioRol;
import lissa.dao.UsuarioRolDao;

public class UsuarioRolBl {
    private UsuarioRolDao dao;

    public UsuarioRolBl() {
    }
    
    public int registrar(UsuarioRol obj){
        dao = new UsuarioRolDao();
        return dao.registrar(obj);
    }

    public ArrayList<UsuarioRol> listar_modulos_usuario(int idUsuario) throws Exception {
        dao = new UsuarioRolDao();
        return dao.listar_modulos_usuario(idUsuario);
    }

    public UsuarioRol buscar(int idUsuario, int idrol) {
        dao = new UsuarioRolDao();
        return dao.buscar(idUsuario, idrol);
    }

    public void eliminar(UsuarioRol oUsuarioRol) {
        dao = new UsuarioRolDao();
        dao.eliminar(oUsuarioRol);
    }
}
