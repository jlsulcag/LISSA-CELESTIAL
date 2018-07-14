
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Restriccion;
import lissa.dao.ExamenOcupacionalDao;
import lissa.dao.RestriccionDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class RestriccionBl extends AbstractBL<Restriccion>{
    private RestriccionDao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new RestriccionDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (RestriccionDao) dao;
    }

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
        return list();
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
        return search(id);
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
        dao = new RestriccionDao();
        return dao.listarXExamen(idpadre);
    }
    
}
