
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Cie10;
import lissa.util.AbstractDA;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Cie10Dao extends AbstractDA<Cie10>{
    private Session sesion;
    private Transaction tx;
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
        return search(Cie10.class, id);
    }

    @Override
    public Cie10 buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Cie10> buscarxRef(String ref) {
        ArrayList<Cie10> list = null;
        try {
            iniciarOperacion();
            list = (ArrayList<Cie10>) sesion.createQuery("from Cie10 c where c.codigo like '%" + ref + "%'").list();

            if (list.isEmpty()) {
                list = (ArrayList<Cie10>) sesion.createQuery("from Cie10 c where c.descripcion like '%" + ref + "%'").list();
            }
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        tx.commit();
        return list;
    }
    
     private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }
    
}
