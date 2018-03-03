
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.InformeMedicoOcupacional;
import lissa.dao.InformeMedicoOcupacionalDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class InformeMedicoOcupacionalBl extends AbstractBL<InformeMedicoOcupacional>{
    private InformeMedicoOcupacionalDao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new InformeMedicoOcupacionalDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (InformeMedicoOcupacionalDao) dao;
    }

    @Override
    public InformeMedicoOcupacional registrar(InformeMedicoOcupacional bean) {
        return save(bean);
    }

    @Override
    public int actualizar(InformeMedicoOcupacional bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(InformeMedicoOcupacional bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InformeMedicoOcupacional> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<InformeMedicoOcupacional> listar(String hql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InformeMedicoOcupacional> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InformeMedicoOcupacional buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InformeMedicoOcupacional buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
