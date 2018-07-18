
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.CmoRecomendaciones2;
import lissa.dao.CmoRecomendaciones2Dao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class CmoRecomendaciones2Bl extends AbstractBL<CmoRecomendaciones2>{
    private CmoRecomendaciones2Dao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new CmoRecomendaciones2Dao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (CmoRecomendaciones2Dao) dao;
    }

    @Override
    public CmoRecomendaciones2 registrar(CmoRecomendaciones2 bean) {
        return save(bean);
    }

    @Override
    public int actualizar(CmoRecomendaciones2 bean) {
        return update(bean);
    }

    @Override
    public int eliminar(CmoRecomendaciones2 bean) {
        return delete(bean);
    }

    @Override
    public List<CmoRecomendaciones2> listar() {
        return list();
    }

    @Override
    public ArrayList<CmoRecomendaciones2> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<CmoRecomendaciones2> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoRecomendaciones2 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoRecomendaciones2 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
