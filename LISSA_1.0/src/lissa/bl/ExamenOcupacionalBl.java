
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.ExamenOcupacional;
import lissa.dao.ExamenOcupacionalDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class ExamenOcupacionalBl extends AbstractBL<ExamenOcupacional>{
    private ExamenOcupacionalDao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new ExamenOcupacionalDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (ExamenOcupacionalDao) dao;
    }

    @Override
    public ExamenOcupacional registrar(ExamenOcupacional bean) {
        return save(bean);
    }

    @Override
    public int actualizar(ExamenOcupacional bean) {
        return update(bean);
    }

    @Override
    public int eliminar(ExamenOcupacional bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ExamenOcupacional> listar() {
        return list();
    }

    @Override
    public ArrayList<ExamenOcupacional> listar(String hql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ExamenOcupacional> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExamenOcupacional buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExamenOcupacional buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
