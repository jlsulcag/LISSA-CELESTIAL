package lissa.dao;

import java.util.ArrayList;
import lissa.be.ItemsComprobante;
import lissa.be.Paciente;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Jorge Luis Sulca González
 */
public class ItemsComprobanteDao {

    private Session sesion;
    private Transaction tx;
    private ArrayList<ItemsComprobante> list;

    public ItemsComprobante registrar(ItemsComprobante obj) {
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

    public ArrayList<ItemsComprobante> buscarXPaciente(String numeroDocumento) {
        try {
            iniciarOperacion();
            list = (ArrayList<ItemsComprobante>) sesion.createQuery("select ic from ItemsComprobante ic inner join ic.comprobante c inner join c.paciente pac inner join pac.persona per where per.numeroDocumento='" + numeroDocumento + "'").list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        tx.commit();
        return list;
    }

    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public ArrayList<ItemsComprobante> listarServicios(Paciente oPaciente) {

        try {
            iniciarOperacion();
            String hql = "select ic from ItemsComprobante ic inner join ic.comprobante c inner join c.paciente pac where pac.idpaciente=" + oPaciente.getIdpaciente();
            Query query = sesion.createQuery(hql);
            list = (ArrayList<ItemsComprobante>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }

}
