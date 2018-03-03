
package lissa.dao;

import java.util.ArrayList;
import lissa.be.Atencion;
import lissa.be.ExamenAuxiliar;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ExamenAuxiliarDao {
    private Session sesion;
    private Transaction tx;
    private ExamenAuxiliar obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    private ArrayList<ExamenAuxiliar> list;

    public ExamenAuxiliar registrar(ExamenAuxiliar obj) throws HibernateException {
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

    public int actualizar(ExamenAuxiliar obj) throws HibernateException {
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

    public ArrayList<ExamenAuxiliar> listar(Atencion oAtencion) {
        try {
            iniciarOperacion();
            String hql = "select ea from ExamenAuxiliar ea inner join ea.atencion aten where aten.idAtencion =" + oAtencion.getIdAtencion();
            Query query = sesion.createQuery(hql);
            list = (ArrayList<ExamenAuxiliar>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }       
        return list;
    }
}
