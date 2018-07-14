
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Recomendacion;
import lissa.dao.RecomendacionDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class RecomendacionBl extends AbstractBL<Recomendacion>{
    private RecomendacionDao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new RecomendacionDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (RecomendacionDao) dao;
    }

    @Override
    public Recomendacion registrar(Recomendacion bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Recomendacion bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Recomendacion bean) {
        return delete(bean);
    }

    @Override
    public List<Recomendacion> listar() {
        return list();
    }

    @Override
    public ArrayList<Recomendacion> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<Recomendacion> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recomendacion buscar(long id) {
        return search(id);
    }

    @Override
    public Recomendacion buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Recomendacion> listarxExamen(long idpadre) {
        dao = new RecomendacionDao();
        return dao.listarxExamen(idpadre);
    }
    
}
