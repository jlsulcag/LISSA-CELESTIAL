
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Restriccion;
import lissa.util.AbstractDA;

public class RestriccionDao extends AbstractDA<Restriccion>{

    @Override
    public Restriccion registrar(Restriccion bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Restriccion bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Restriccion bean) {
        return delete(bean);
    }

    @Override
    public List<Restriccion> listar() {
        return list(Restriccion.class);
    }

    @Override
    public ArrayList<Restriccion> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<Restriccion> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Restriccion buscar(long id) {
        return search(Restriccion.class, id);
    }

    @Override
    public Restriccion buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Restriccion> listarXExamen(long idpadre) {
        String hql = "from Restriccion a where a.examenOcupacional.idexamenocupacional = "+idpadre;
        return listar(hql);
    }
    
}
