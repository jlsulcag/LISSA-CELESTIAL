
package lissa.dao;

import java.util.ArrayList;
import lissa.be.Medico;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MedicoDao {
    private Session sesion;
    private Transaction tx;
    private ArrayList<Medico> list;
    private Medico obj;
    
    public int registrar(Medico obj) {
        int id = 0;
        try {
            iniciarOperacion();
            id = (int) sesion.save(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
        return id;
    }
    
    public void actualizar(Medico obj) {
        try {
            iniciarOperacion();
            sesion.update(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
    }
    //Optimo para obtener objetos basado en una clave foranea
    public Medico buscarId(int id) {
        Medico bean = new Medico();
        iniciarOperacion();
        String hql = "from Medico as m where m.idPersona = :id_Medico";
        Query query = sesion.createQuery(hql);
        query.setParameter("id_Medico", id);
        bean = (Medico) query.uniqueResult();
        return bean;
    }
    
    public ArrayList<Medico> buscar(String ref) {
        ArrayList<Medico> list = null;
        try {
            iniciarOperacion();
            list = (ArrayList<Medico>) sesion.createQuery("Select m from Medico m inner join m.persona p where (p.apellidoPaterno || ' ' || p.apellidoMaterno || ' ' || p.nombre) like '%" + ref + "%'").list();

            if (list.isEmpty()) {
                list = (ArrayList<Medico>) sesion.createQuery("Select m from Medico m inner join m.persona p where p.numeroDocumento like '%" + ref + "%'").list();
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
        throw new HibernateException("ERROR : Capa de acceso  a datos", he);
    }

    public Medico buscarMedicoXDni(String dni) {
        try {
            iniciarOperacion();
            String hql = "Select m from Medico m inner join m.persona p where p.numeroDocumento='" + dni + "'";
            Query query = sesion.createQuery(hql);
            obj = (Medico) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return obj;
    }
    
    public ArrayList<Medico> buscarxNombres(String ref) {
        try {
            iniciarOperacion();
            String hql = "Select m from Medico m inner join m.persona p where (p.apellidoPaterno || ' ' || p.apellidoMaterno || ' ' || p.nombre) like '%" + ref + "%'";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Medico>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }

    public ArrayList<Medico> listar() {
        try {
            iniciarOperacion();
            String hql = "from Medico m";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Medico>) query.list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return list;
    }

    
}
