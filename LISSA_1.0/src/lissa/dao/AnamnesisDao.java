
package lissa.dao;

import lissa.be.Anamnesis;
import lissa.be.Atencion;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AnamnesisDao {
    private Session sesion;
    private Transaction tx;
    private Anamnesis obj = null;
    public static final int SUCCESS = 1, ERROR = 2;

    public Anamnesis registrar(Anamnesis obj) throws HibernateException {
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

    public int actualizar(Anamnesis obj) throws HibernateException {
        int res = 0;
        try {
            iniciarOperacion();
            sesion.update(obj);
            tx.commit();
            res = SUCCESS;
        } catch (HibernateException he) {
            manejaExcepcion(he);
            res = ERROR;
        } finally {
            sesion.close();
        }
        return res;
    }

    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public Anamnesis buscar(Atencion oAtencion) {
        obj = new Anamnesis();
        try {
            iniciarOperacion();
            String hql = "select anam from Anamnesis as anam inner join anam.atencion aten where aten.idAtencion =" + oAtencion.getIdAtencion();
            Query query = sesion.createQuery(hql);
            obj = (Anamnesis) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }       
        return obj;
    }
}
