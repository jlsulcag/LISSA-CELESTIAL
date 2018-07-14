
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.CmoRecomendaciones;
import lissa.dao.CmoRecomendacionesDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class CmoRecomendacionesBl extends AbstractBL<CmoRecomendaciones>{
    private CmoRecomendacionesDao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new CmoRecomendacionesDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (CmoRecomendacionesDao) dao;
    }

    @Override
    public CmoRecomendaciones registrar(CmoRecomendaciones bean) {
        return save(bean);
    }

    @Override
    public int actualizar(CmoRecomendaciones bean) {
        return update(bean);
    }

    @Override
    public int eliminar(CmoRecomendaciones bean) {
        return delete(bean);
    }

    @Override
    public List<CmoRecomendaciones> listar() {
        return list();
    }

    @Override
    public ArrayList<CmoRecomendaciones> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<CmoRecomendaciones> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoRecomendaciones buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoRecomendaciones buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
