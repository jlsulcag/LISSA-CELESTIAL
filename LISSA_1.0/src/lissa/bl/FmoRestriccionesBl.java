
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.FmoRestricciones;
import lissa.dao.FmoRestriccionesDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class FmoRestriccionesBl extends AbstractBL<FmoRestricciones>{
    private FmoRestriccionesDao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new FmoRestriccionesDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (FmoRestriccionesDao) dao;
    }

    @Override
    public FmoRestricciones registrar(FmoRestricciones bean) {
        return save(bean);
    }

    @Override
    public int actualizar(FmoRestricciones bean) {
        return update(bean);
    }

    @Override
    public int eliminar(FmoRestricciones bean) {
        return delete(bean);
    }

    @Override
    public List<FmoRestricciones> listar() {
        return list();
    }

    @Override
    public ArrayList<FmoRestricciones> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<FmoRestricciones> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FmoRestricciones buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FmoRestricciones buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
