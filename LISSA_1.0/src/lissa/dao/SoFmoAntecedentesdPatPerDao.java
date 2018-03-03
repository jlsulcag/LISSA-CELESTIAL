
package lissa.dao;

import lissa.be.AtencionOcupacional;
import lissa.be.SoFmoAntecedentesPatPer;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SoFmoAntecedentesdPatPerDao {
    private Session sesion;
    private Transaction tx;
    private SoFmoAntecedentesPatPer obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    
    public SoFmoAntecedentesPatPer registrar(SoFmoAntecedentesPatPer obj) throws HibernateException {
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

    public SoFmoAntecedentesPatPer buscarAntPatPer(AtencionOcupacional oAtencionOcupacional) {
        obj = new SoFmoAntecedentesPatPer();
        try {
            iniciarOperacion();
            String hql = "select ant from SoFmoAntecedentesPatPer ant inner join ant.fichaMedicoOcupacional fmo inner join fmo.atencionOcupacional ao where ao.idatencionocupacional=" + oAtencionOcupacional.getIdatencionocupacional();
            Query query = sesion.createQuery(hql);
            obj = (SoFmoAntecedentesPatPer) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }       
        return obj;
    }
}
