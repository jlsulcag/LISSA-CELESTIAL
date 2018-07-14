
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.CertMedicoOcupacional;
import lissa.util.AbstractDA;

public class CertMedicoOcupacionalDao extends AbstractDA<CertMedicoOcupacional>{

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
        return list(CertMedicoOcupacional.class);
    }

    @Override
    public ArrayList<CertMedicoOcupacional> listar(String hql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
