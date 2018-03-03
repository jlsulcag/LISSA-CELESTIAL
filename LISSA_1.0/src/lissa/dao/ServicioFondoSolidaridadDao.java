package lissa.dao;

import lissa.be.ServicioFondoSolidaridad;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ServicioFondoSolidaridadDao {
    private Session sesion;
    private Transaction tx;

    public int registrar(ServicioFondoSolidaridad obj) throws HibernateException {
        int id = 0;
        try {
            iniciarOperacion();
            id = (int) sesion.save(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
        return id;
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
