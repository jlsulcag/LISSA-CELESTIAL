
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.CmoObservaciones;
import lissa.util.AbstractDA;

public class CmoObservacionesDao extends AbstractDA<CmoObservaciones>{

    @Override
    public CmoObservaciones registrar(CmoObservaciones bean) {
        return save(bean);
    }

    @Override
    public int actualizar(CmoObservaciones bean) {
        return update(bean);
    }

    @Override
    public int eliminar(CmoObservaciones bean) {
        return delete(bean);
    }

    @Override
    public List<CmoObservaciones> listar() {
        return list(CmoObservaciones.class);
    }

    @Override
    public ArrayList<CmoObservaciones> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<CmoObservaciones> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoObservaciones buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoObservaciones buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
