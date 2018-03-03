package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Persona;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonaDao {

    private Persona oPersona;
    private List<Persona> listPersona;
    private ArrayList<Persona> list;
    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Session sesion;
    private Transaction tx;
    Persona obj = null;
    private static final int SUCCESS = 1, ERROR = 2;

    public Persona registrarPersona(Persona obj) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
        return obj;

    }

    public ArrayList<Persona> buscar(String ref) {
        ArrayList<Persona> list = null;
        try {
            iniciarOperacion();
            list = (ArrayList<Persona>) sesion.createQuery("from Persona p where (p.apellidoPaterno || ' ' || "
                    + "p.apellidoMaterno || ' ' || p.nombre) like '%" + ref + "%'").list();

            if (list.isEmpty()) {
                list = (ArrayList<Persona>) sesion.createQuery("from Persona p where p.numeroDocumento like '%" + ref + "%'").list();
            }
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        tx.commit();
        return list;
    }

    public Persona buscarPersonaXDni(String numeroDocumento) {
        oPersona = new Persona();
        try {
            iniciarOperacion();
            String hql = "from Persona as p where p.numeroDocumento='" + numeroDocumento + "'";
            Query query = sesion.createQuery(hql);
            oPersona = (Persona) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return oPersona;
    }

//    public int ObtenerUltimaHistoriaClinica() {
//        session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        int newHc = 0;
//        String hql = "select max(p.historiaClinica) from Persona as p";
//        Query query = session.createQuery(hql);       
//        newHc = (int) query.uniqueResult();
//        session.getTransaction().commit();
//        return newHc;
//    }     
    public int actualizar(Persona obj) throws HibernateException {
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

    public Persona buscar(Integer id) throws HibernateException {
        try {
            iniciarOperacion();
            obj = (Persona) sesion.get(Persona.class, id);
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return obj;
    }

    public ArrayList<Persona> listar() {
        try {
            iniciarOperacion();
            String hql = "from Persona per";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Persona>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
//        finally{
//            sesion.close();
//        }
        return list;
    }

    public ArrayList<Persona> buscarxNombres(String nombres) {
        try {
            iniciarOperacion();
            String hql = "from Persona p where (p.apellidoPaterno || ' ' || "
                    + "p.apellidoMaterno || ' ' || p.nombre) like '%" + nombres + "%'";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Persona>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }

}
