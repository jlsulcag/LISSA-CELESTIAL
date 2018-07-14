
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Condicion;
import lissa.dao.CondicionDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class CondicionBl extends AbstractBL<Condicion>{

    private CondicionDao dao;
    
    @Override
    public AbstractDA getDAO() {
        dao = new CondicionDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (CondicionDao) dao;
    }

    @Override
    public Condicion registrar(Condicion bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Condicion bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Condicion bean) {
        return delete(bean);
    }

    @Override
    public List<Condicion> listar() {
        return list();
    }

    @Override
    public ArrayList<Condicion> listar(String hql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Condicion> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condicion buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condicion buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
