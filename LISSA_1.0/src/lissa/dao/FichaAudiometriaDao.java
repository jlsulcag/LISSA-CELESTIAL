
package lissa.dao;

import lissa.be.AtencionOcupacional;
import lissa.be.FichaAudiometria;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FichaAudiometriaDao {
    private Session sesion;
    private Transaction tx;
    private FichaAudiometriaDao obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    
    public FichaAudiometria registrar(FichaAudiometria obj) throws HibernateException {
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

    public String getConclusion(AtencionOcupacional oAtencionOcupacional) {
        String con = "";
        try {
            iniciarOperacion();
            String hql = "select ficha.conclusion from FichaAudiometria as ficha where ficha.atencionOcupacional.idatencionocupacional =" + oAtencionOcupacional.getIdatencionocupacional();
            Query query = sesion.createQuery(hql);
            con = (String) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }       
        return con;
    }
}
