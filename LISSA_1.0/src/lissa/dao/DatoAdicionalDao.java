
package lissa.dao;

import lissa.be.Atencion;
import lissa.be.DatoAdicional;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DatoAdicionalDao {
    private Session sesion;
    private Transaction tx;
    private DatoAdicional obj = null;
    public static final int SUCCESS = 1, ERROR = 2;

    public DatoAdicional registrar(DatoAdicional obj) throws HibernateException {
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

    public int actualizar(DatoAdicional obj) throws HibernateException {
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

    public DatoAdicional buscar(Atencion oAtencion) {
        obj = new DatoAdicional();
        try {
            iniciarOperacion();
            String hql = "select da from DatoAdicional da inner join da.atencion aten where aten.idAtencion =" + oAtencion.getIdAtencion();
            Query query = sesion.createQuery(hql);
            obj = (DatoAdicional) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }       
        return obj;
    }
}
