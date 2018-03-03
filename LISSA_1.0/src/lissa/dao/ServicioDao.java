package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Servicio;
import lissa.be.TipoMedico;
import lissa.util.AbstractDA;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ServicioDao extends AbstractDA<Servicio>{
    private Session sesion;
    private Transaction tx;
    private TipoMedico obj;
    private List<Servicio> listServicio;
    
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
    
        
    public ArrayList<Servicio> buscarRef(String ref) {
        String hql = "from Servicio s where s.denominacion like '%" + ref + "%' or s.subCategoria like '%"+ref+"%' or s.categoria like '%"+ref+"%'";
        return listar(hql);
    }

    @Override
    public List<Servicio> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Servicio> listAll(){
        String hql = "from Servicio s left joijn fetch s.tarifario t";
        return listar(hql);
    }
    
    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public ArrayList listarxIdPadre(int idpadre) {
        String hql = "from Servicio a where a.tarifario.idTarifario = "+idpadre;
        return listar(hql);
    }

}
