
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.FmoRestricciones2;
import lissa.util.AbstractDA;

public class FmoRestricciones2Dao extends AbstractDA<FmoRestricciones2>{

    @Override
    public FmoRestricciones2 registrar(FmoRestricciones2 bean) {
        return save(bean);
    }

    @Override
    public int actualizar(FmoRestricciones2 bean) {
        return update(bean);
    }

    @Override
    public int eliminar(FmoRestricciones2 bean) {
        return delete(bean);
    }

    @Override
    public List<FmoRestricciones2> listar() {
        return list(FmoRestricciones2.class);
    }

    @Override
    public ArrayList<FmoRestricciones2> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<FmoRestricciones2> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FmoRestricciones2 buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FmoRestricciones2 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
