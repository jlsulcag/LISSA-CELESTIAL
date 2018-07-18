
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.CmoRecomendaciones2;
import lissa.util.AbstractDA;

public class CmoRecomendaciones2Dao extends AbstractDA<CmoRecomendaciones2>{

    @Override
    public CmoRecomendaciones2 registrar(CmoRecomendaciones2 bean) {
        return save(bean);
    }

    @Override
    public int actualizar(CmoRecomendaciones2 bean) {
        return update(bean);
    }

    @Override
    public int eliminar(CmoRecomendaciones2 bean) {
        return delete(bean);
    }

    @Override
    public List<CmoRecomendaciones2> listar() {
        return list(CmoRecomendaciones2.class);
    }

    @Override
    public ArrayList<CmoRecomendaciones2> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<CmoRecomendaciones2> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoRecomendaciones2 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmoRecomendaciones2 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
