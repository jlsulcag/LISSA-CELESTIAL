
package lissa.dao;

import lissa.be.AtencionOcupacional;
import lissa.be.FichaPsicologica;
import lissa.be.FichaPsicologicaPsicotecnico;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class FichaPsicologicaPsicotecnicoDao {
    private Session sesion;
    private Transaction tx;
    private FichaPsicologicaPsicotecnico obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    
    public FichaPsicologicaPsicotecnico registrar(FichaPsicologicaPsicotecnico obj) throws HibernateException {
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

    public FichaPsicologicaPsicotecnico getConclusion(AtencionOcupacional oAtencionOcupacional) {
        obj = new FichaPsicologicaPsicotecnico();
        try {
            iniciarOperacion();
            String hql = "select ficha from FichaPsicologicaPsicotecnico as ficha where ficha.atencionOcupacional.idatencionocupacional =" + oAtencionOcupacional.getIdatencionocupacional();
            Query query = sesion.createQuery(hql);
            obj = (FichaPsicologicaPsicotecnico) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }       
        return obj;
    }
}
