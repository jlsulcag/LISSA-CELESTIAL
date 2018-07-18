
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.CmoObservaciones2;
import lissa.util.AbstractDA;

public class CmoObservaciones2Dao extends AbstractDA<CmoObservaciones2>{

    @Override
    public CmoObservaciones2 registrar(CmoObservaciones2 bean) {
        return save(bean);
    }

    @Override
    public int actualizar(CmoObservaciones2 bean) {
        return update(bean);
    }

    @Override
    public int eliminar(CmoObservaciones2 bean) {
        return delete(bean);
    }

    @Override
    public List<CmoObservaciones2> listar() {
        return list(CmoObservaciones2.class);
    }

    @Override
    public ArrayList<CmoObservaciones2> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<CmoObservaciones2> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoObservaciones2 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoObservaciones2 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
