
package lissa.dao;

import java.util.ArrayList;
import lissa.be.Atencion;
import lissa.be.Diagnostico;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DiagnosticoDao {
    private Session sesion;
    private Transaction tx;
    Diagnostico obj = null;
    private ArrayList<Diagnostico> list;

    public Diagnostico registrar(Diagnostico bean) throws HibernateException {
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

    public void actualizar(Diagnostico bean) throws HibernateException {
        try {
            iniciarOperacion();
            sesion.update(bean);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
    }
    
    public ArrayList<Diagnostico> buscar(String ref) {
        ArrayList<Diagnostico> list = null;
        try {
            iniciarOperacion();
            list = (ArrayList<Diagnostico>) sesion.createQuery("from Cie10 c where c.codigo like '%" + ref + "%'").list();

            if (list.isEmpty()) {
                list = (ArrayList<Diagnostico>) sesion.createQuery("from Cie10 c where c.descripcion like '%" + ref + "%'").list();
            }
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

    public Diagnostico buscar(Integer id) {
        try {
            iniciarOperacion();
            //String hql = "from Paciente pac inner join fetch pac.persona p where p.idPersona=" + id;
            //Query query = sesion.createQuery(hql);
            //obj = (Atencion) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return obj;
    }

    public Diagnostico buscarXid(int idCie10) {
        try {
            iniciarOperacion();
            String hql = "from Cie10 cie where cie.idCie10=" + idCie10;
            Query query = sesion.createQuery(hql);
            obj = (Diagnostico) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return obj;
    }

    public ArrayList<Diagnostico> buscarDiagnosticos(Atencion oAtencion) {        
        try {
            iniciarOperacion();
            String hql = "select dx from Diagnostico dx inner join dx.atencion aten where aten.idAtencion =" + oAtencion.getIdAtencion();
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Diagnostico>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }       
        return list;
    }
}
