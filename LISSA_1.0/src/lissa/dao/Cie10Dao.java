
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Cie10;
import lissa.util.AbstractDA;

public class Cie10Dao extends AbstractDA<Cie10>{

    @Override
    public Cie10 registrar(Cie10 bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Cie10 bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Cie10 bean) {
        return delete(bean);
    }

    @Override
    public List<Cie10> listar() {
        return list(Cie10.class);
    }

    @Override
    public ArrayList<Cie10> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<Cie10> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cie10 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cie10 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}