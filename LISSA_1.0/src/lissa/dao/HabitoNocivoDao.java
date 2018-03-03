
package lissa.dao;

import java.util.ArrayList;
import lissa.be.HabitoNocivo;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HabitoNocivoDao {
    private Session sesion;
    private Transaction tx;
    private FichaAudiometriaDao obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    private ArrayList<HabitoNocivo> list;
    
    public HabitoNocivo registrar(HabitoNocivo obj) throws HibernateException {
        try {
            iniciarOperacion();
            sesion.save(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
        return obj;
    }

    private void iniciarOperacion() {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public ArrayList listar() {
        try {
            iniciarOperacion();
            String hql = "from HabitoNocivo";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<HabitoNocivo>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
        return list;
    }
}
