
package lissa.dao;

import java.util.ArrayList;
import lissa.be.Atencion;
import lissa.be.Tratamiento;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TratamientoDao {
    private Session sesion;
    private Transaction tx;
    private Tratamiento obj = null;
    private ArrayList<Tratamiento> list;
    public static final int SUCCESS = 1, ERROR = 2;

    public Tratamiento registrar(Tratamiento bean) throws HibernateException {
        try {
            iniciarOperacion();
            sesion.save(bean);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
        return bean;
    }

    public int actualizar(Tratamiento bean) throws HibernateException {        
        int res = 0;
        try {
            iniciarOperacion();
            sesion.update(bean);
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
    
    public ArrayList<Tratamiento> listar(Atencion oAtencion) {        
        try {
            iniciarOperacion();
            String hql = "select trat from Tratamiento trat inner join trat.atencion aten where aten.idAtencion =" + oAtencion.getIdAtencion();
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Tratamiento>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }       
        return list;
    }
}
