
package lissa.dao;

import java.util.ArrayList;
import lissa.be.AtencionOcupacional;
import lissa.be.ExamenClinico;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ExamenClinicoDao {
    private Session sesion;
    private Transaction tx;
    private ExamenClinico obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    ArrayList<ExamenClinico> list = null;

    public ExamenClinico registrar(ExamenClinico obj) throws HibernateException {
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

    public ExamenClinico getExamenClinico(AtencionOcupacional oAtencionOcupacional) {
        try {
            iniciarOperacion();
            String hql = "select ec from ExamenClinico ec where ec.atencionOcupacional.idatencionocupacional = " + oAtencionOcupacional.getIdatencionocupacional();
            Query query = sesion.createQuery(hql);
            obj = (ExamenClinico) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
        return obj;
    }
}
