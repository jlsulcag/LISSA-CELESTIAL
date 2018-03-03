package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Laboratorio;
import lissa.util.AbstractDA;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaboratorioDao extends AbstractDA<Laboratorio> {

    private Session sesion;
    private Transaction tx;
    private ArrayList<Laboratorio> list;
    public static final int SUCCESS = 1;
    public static final int ERROR = 0;

    @Override
    public Laboratorio registrar(Laboratorio bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Laboratorio bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Laboratorio bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Laboratorio> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Laboratorio> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Laboratorio buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Laboratorio buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Laboratorio> listar(String hql) {
        hql = "from Laboratorio c order by c.denominacion asc";
        return list(hql);
    }

    ///---

    public ArrayList<Laboratorio> buscarF(String ref) {
        ArrayList<Laboratorio> list = null;
        try {
            iniciarOperacion();
            list = (ArrayList<Laboratorio>) sesion.createQuery("from Laboratorio p where (p.denominacion) like '%" + ref + "%'").list();
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
