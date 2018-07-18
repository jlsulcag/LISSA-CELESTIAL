
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.CertMedicoOcupacional2;
import lissa.dao.CertMedicoOcupacional2Dao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class CertMedicoOcupacional2Bl extends AbstractBL<CertMedicoOcupacional2>{
    private CertMedicoOcupacional2Dao dao;
    
    @Override
    public AbstractDA getDAO() {
        dao = new CertMedicoOcupacional2Dao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (CertMedicoOcupacional2Dao) dao;
    }

    @Override
    public CertMedicoOcupacional2 registrar(CertMedicoOcupacional2 bean) {
        return save(bean);
    }

    @Override
    public int actualizar(CertMedicoOcupacional2 bean) {
        return update(bean);
    }

    @Override
    public int eliminar(CertMedicoOcupacional2 bean) {
        return delete(bean);
    }

    @Override
    public List<CertMedicoOcupacional2> listar() {
        return list();
    }

    @Override
    public ArrayList<CertMedicoOcupacional2> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<CertMedicoOcupacional2> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CertMedicoOcupacional2 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CertMedicoOcupacional2 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
