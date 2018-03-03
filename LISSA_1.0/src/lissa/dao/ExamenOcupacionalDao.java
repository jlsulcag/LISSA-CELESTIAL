package lissa.dao;

import java.util.ArrayList;
import lissa.be.ExamenOcupacional;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ExamenOcupacionalDao {

    private Session sesion;
    private Transaction tx;
    private ExamenOcupacional obj = null;
    private ArrayList<ExamenOcupacional> list;

    public ArrayList<ExamenOcupacional> listar() throws HibernateException {
        try {
            iniciarOperacion();
            String hql = "from ExamenOcupacional";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<ExamenOcupacional>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
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
