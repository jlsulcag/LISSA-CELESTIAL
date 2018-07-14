
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.MotivoObservacion;
import lissa.dao.MotivoObservacionDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class MotivoObservacionBl extends AbstractBL<MotivoObservacion>{
    private MotivoObservacionDao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new MotivoObservacionDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (MotivoObservacionDao) dao;
    }

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
        return delete(bean);
    }

    @Override
    public List<MotivoObservacion> listar() {
        return list();
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
        return search(id);
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
        dao = new MotivoObservacionDao();
        return dao.listarxExamen(idpadre);
    }
    
}
