
package lissa.dao;

import lissa.be.FichaMedicoOcupacional;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FichaMedicoOcupDao {
    private Session sesion;
    private Transaction tx;
    private FichaAudiometriaDao obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    
    public FichaMedicoOcupacional registrar(FichaMedicoOcupacional obj) throws HibernateException {
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

    public int generarNumeroFicha() {
        iniciarOperacion();
        int num = 0;
        String hql = "select max(fmo.numeroFicha) from FichaMedicoOcupacional fmo";
        Query query = sesion.createQuery(hql);
        if (query.uniqueResult() == null) {
            num = 0;
        } else {
            num = (Integer) query.uniqueResult();
        }
        tx.commit();
        return num;
    }
}
