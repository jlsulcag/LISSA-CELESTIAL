
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Condicion;
import lissa.util.AbstractDA;

public class CondicionDao extends AbstractDA<Condicion>{

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Condicion> listar() {
        return list(Condicion.class);
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
