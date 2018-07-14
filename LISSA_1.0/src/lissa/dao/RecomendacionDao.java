
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Recomendacion;
import lissa.util.AbstractDA;

public class RecomendacionDao extends AbstractDA<Recomendacion>{

    @Override
    public Recomendacion registrar(Recomendacion bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Recomendacion bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Recomendacion bean) {
        return delete(bean);
    }

    @Override
    public List<Recomendacion> listar() {
        return list(Recomendacion.class);
    }

    @Override
    public ArrayList<Recomendacion> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<Recomendacion> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Recomendacion buscar(long id) {
        return search(Recomendacion.class, id);
    }

    @Override
    public Recomendacion buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Recomendacion> listarxExamen(long idpadre) {
        String hql = "from Recomendacion a where a.examenOcupacional.idexamenocupacional = "+idpadre;
        return listar(hql);        
    }
    
}
