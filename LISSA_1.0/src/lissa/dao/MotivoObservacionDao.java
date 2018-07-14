
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.MotivoObservacion;
import lissa.util.AbstractDA;

public class MotivoObservacionDao extends AbstractDA<MotivoObservacion>{

    @Override
    public MotivoObservacion registrar(MotivoObservacion bean) {
        return save(bean);
    }

    @Override
    public int actualizar(MotivoObservacion bean) {
        return update(bean);
    }

    @Override
    public int eliminar(MotivoObservacion bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MotivoObservacion> listar() {
        return list(MotivoObservacion.class);
    }

    @Override
    public ArrayList<MotivoObservacion> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<MotivoObservacion> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MotivoObservacion buscar(long id) {
        return search(MotivoObservacion.class, id);
    }

    @Override
    public MotivoObservacion buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<MotivoObservacion> listarxExamen(long idpadre) {
        String hql = "from MotivoObservacion a where a.examenOcupacional.idexamenocupacional = "+idpadre;
        return listar(hql);
    }
    
}
