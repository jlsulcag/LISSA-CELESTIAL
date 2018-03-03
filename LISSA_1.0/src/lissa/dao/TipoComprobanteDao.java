package lissa.dao;

import java.util.ArrayList;
import lissa.be.SeguroVidaUsaPersona;
import lissa.be.TipoComprobante;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Jorge Luis Sulca González
 */
public class TipoComprobanteDao {
    private Session sesion;
    private Transaction tx;
    private ArrayList<TipoComprobante> list = null;
    
    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public ArrayList<TipoComprobante> listar() {
        try {
            iniciarOperacion();
            String hql = "from TipoComprobante";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<TipoComprobante>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
        return list;
    }
}


