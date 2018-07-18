
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.CmoCie10;
import lissa.dao.CmoCie10Dao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class CmoCie10Bl extends AbstractBL<CmoCie10>{
    private CmoCie10Dao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new CmoCie10Dao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (CmoCie10Dao) dao;
    }

    @Override
    public CmoCie10 registrar(CmoCie10 bean) {
        return save(bean);
    }

    @Override
    public int actualizar(CmoCie10 bean) {
        return update(bean);
    }

    @Override
    public int eliminar(CmoCie10 bean) {
        return delete(bean);
    }

    @Override
    public List<CmoCie10> listar() {
        return list();
    }

    @Override
    public ArrayList<CmoCie10> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<CmoCie10> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoCie10 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoCie10 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
