package lissa.dao;

import java.util.ArrayList;
import lissa.be.AtencionOcupacional;
import lissa.be.HistoriaClinica;
import lissa.be.SoFmoAntecedentesOcupacionales;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SoFmoAntecedentesOcupacionalesDao {

    private Session sesion;
    private Transaction tx;
    private SoFmoAntecedentesOcupacionalesDao obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    ArrayList<SoFmoAntecedentesOcupacionales> list = null;

    public SoFmoAntecedentesOcupacionales registrar(SoFmoAntecedentesOcupacionales obj) throws HibernateException {
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

    public ArrayList<SoFmoAntecedentesOcupacionales> listar(HistoriaClinica obj) {
        try {
            iniciarOperacion();
            String hql = "from SoFmoAntecedentesOcupacionales ao where ao.historiaClinica.idhistoriaclinica = " + obj.getIdhistoriaclinica();
            Query query = sesion.createQuery(hql);
            list = (ArrayList<SoFmoAntecedentesOcupacionales>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
        return list;
    }
}
