
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.CertMedicoOcupacional;
import lissa.dao.CertMedicoOcupacionalDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class CertMedicoOcupacionalBl extends AbstractBL<CertMedicoOcupacional>{
    private CertMedicoOcupacionalDao dao;
    
    @Override
    public AbstractDA getDAO() {
        dao = new CertMedicoOcupacionalDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (CertMedicoOcupacionalDao) dao;
    }

    @Override
    public CertMedicoOcupacional registrar(CertMedicoOcupacional bean) {
        return save(bean);
    }

    @Override
    public int actualizar(CertMedicoOcupacional bean) {
        return update(bean);
    }

    @Override
    public int eliminar(CertMedicoOcupacional bean) {
        return delete(bean);
    }

    @Override
    public List<CertMedicoOcupacional> listar() {
        return list();
    }

    @Override
    public ArrayList<CertMedicoOcupacional> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<CertMedicoOcupacional> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CertMedicoOcupacional buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CertMedicoOcupacional buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
