package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Servicio;
import lissa.dao.ServicioDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class ServicioBl extends AbstractBL<Servicio> {

    private ServicioDao dao;

    @Override
    public AbstractDA getDAO() {
        dao = new ServicioDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (ServicioDao) dao;
    }

    @Override
    public Servicio registrar(Servicio bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Servicio bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Servicio bean) {
        return delete(bean);
    }

    @Override
    public List<Servicio> listar() {
        return list();
    }

    @Override
    public ArrayList<Servicio> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<Servicio> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Servicio buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Servicio buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList listarxIdPadre(int idpadre) {
        dao = new ServicioDao();
        return dao.listarxIdPadre(idpadre);
    }

}
