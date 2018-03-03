
package lissa.dao;

import java.util.ArrayList;
import java.util.Date;
import lissa.be.Cita;
import lissa.be.Medico;
import lissa.util.Utilitarios;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CitaDao {
    private Session sesion;
    private Transaction tx;
    private Cita obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    ArrayList<Cita> list = null;

    public Cita registrar(Cita obj) throws HibernateException {
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
    
    public int actualizar(Cita obj) throws HibernateException {
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
    
    public ArrayList<Cita> listar() {
        try {
            iniciarOperacion();
            String hql = "from Cita c order by c.fecha desc";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Cita>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
//        finally{
//            sesion.close();
//        }
        return list;
    }
    
    public ArrayList<Cita> listarPorMedico(Medico medico) {
        try {
            iniciarOperacion();
            String hql = "select cit from Cita cit inner join cit.medico med where med.idMedico = " + medico.getIdMedico() + "order by cit.fecha desc";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Cita>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
//        finally{
//            sesion.close();
//        }
        return list;
    }
    
    public ArrayList<Cita> listarPorPacienteFecha(String pac, Date fecha) {
        try {
            iniciarOperacion();
            String hql = "select cit from Cita cit inner join cit.persona p where (p.apellidoPaterno || ' ' || "
                    + "p.apellidoMaterno || ' ' || p.nombre) like '%" + pac + "%' and cit.fecha = '" + Utilitarios.castDate_UTIL_SQL(fecha) + "' order by cit.fecha desc";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Cita>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }

    private void iniciarOperacion() {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    
}
