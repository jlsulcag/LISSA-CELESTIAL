
package lissa.dao;

import lissa.be.SoFmoEvaluacionMedica;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SoFmoEvaluacionMedicaDao {
    private Session sesion;
    private Transaction tx;
    private FichaAudiometriaDao obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    
    public SoFmoEvaluacionMedica registrar(SoFmoEvaluacionMedica obj) throws HibernateException {
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
}
