
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Caja;
import lissa.be.Usuario;
import lissa.dao.UsuarioDao;

public class UsuarioBl {
    private UsuarioDao dao;
    private ArrayList<Usuario> list;

    public UsuarioBl() {
    }
    
    public Usuario registrar(Usuario obj){
        dao = new UsuarioDao();
        return dao.registrar(obj);
    }

    public Usuario buscarUsuario(String usuario, String clave) {
        dao = new UsuarioDao();
        return dao.buscarUsuario(usuario, clave);
    }

    public int actualizar(Usuario obj) {
        dao = new UsuarioDao();
        return dao.actualizar(obj);
    }
    
    public ArrayList<Usuario> buscar(String ref) {
        dao = new UsuarioDao();
        list = dao.buscar(ref);
        return list;
    }

    public Usuario buscarXIdCaja(Caja oCaja) {
        dao = new  UsuarioDao();
        return dao.buscarXIdCaja(oCaja);
    }

    public Usuario buscarXid(int idUser) {
        dao = new  UsuarioDao();
        return dao.buscarXid(idUser);
    }
}
