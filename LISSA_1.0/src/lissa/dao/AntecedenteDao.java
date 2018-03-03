package lissa.dao;

import lissa.be.Antecedente;
import lissa.be.Atencion;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AntecedenteDao {

    private Session sesion;
    private Transaction tx;
    private Antecedente obj = null;
    public static final int SUCCESS = 1, ERROR = 2;

    public Antecedente registrar(Antecedente obj) throws HibernateException {
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

    public int actualizar(Antecedente obj) throws HibernateException {
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

    public Antecedente buscar(Atencion oAtencion) {
        obj = new Antecedente();
        try {
            iniciarOperacion();
            String hql = "select ant from Antecedente as ant inner join ant.atencion aten where aten.idAtencion =" + oAtencion.getIdAtencion();
            Query query = sesion.createQuery(hql);
            obj = (Antecedente) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }       
        return obj;
    }
}
