package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.FondoPrevisionTemp;
import lissa.be.FondoSolidaridad;
import lissa.be.Persona;
import lissa.util.AbstractDA;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FondoPrevisionDao extends AbstractDA<FondoSolidaridad>{

    private Session sesion;
    private Transaction tx;
    FondoSolidaridad obj = null;
    ArrayList<FondoSolidaridad> list;

//    public int registrar(FondoSolidaridad obj) {
//        int id = 0;
//        try {
//            iniciarOperacion();
//            id = (int) sesion.save(obj);
//            tx.commit();
//        } catch (HibernateException he) {
//            manejaExcepcion(he);
//        }
//        return id;
//    }

    public ArrayList<FondoSolidaridad> listar(int id) {
        try {
            iniciarOperacion();
            String hql = "select fs from FondoSolidaridad fs inner join fs.persona per where per.idPersona=" + id;
            Query query = sesion.createQuery(hql);
            list = (ArrayList<FondoSolidaridad>) query.list();
        } catch (Exception e) {
            manejaExcepcion(null);
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

    public FondoSolidaridad buscarXIdSocio(int idSocio) {
        try {
            iniciarOperacion();
            String hql = "from FondoSolidaridad fs where fs.socio.idSocio = :id_Socio";
            Query query = sesion.createQuery(hql);
            query.setParameter("id_Socio", idSocio);
            obj = (FondoSolidaridad) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return obj;
    }

    public FondoSolidaridad obtenerUltimo(String numeroDocumento) {
        try {
            iniciarOperacion();
            String hql = "SELECT fs \n"
                    + "FROM FondoSolidaridad fs inner join fs.persona per \n"
                    + "WHERE per.numeroDocumento =:dni and (fs.fechaReg = (SELECT max(fs2.fechaReg) from FondoSolidaridad fs2 inner join fs2.persona per2 \n"
                    + "where per2.numeroDocumento =:dni))";
            Query query = sesion.createQuery(hql);
            query.setParameter("dni", numeroDocumento);
            obj = (FondoSolidaridad) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            obj = null;
        }
        return obj;
    }

    @Override
    public FondoSolidaridad registrar(FondoSolidaridad bean) {
        return save(bean);
    }

    @Override
    public int actualizar(FondoSolidaridad bean) {
        return update(bean);
    }

    @Override
    public int eliminar(FondoSolidaridad bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FondoSolidaridad> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<FondoSolidaridad> listar(String hql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FondoSolidaridad> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FondoSolidaridad buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FondoSolidaridad buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public FondoSolidaridad buscarxFecha(FondoPrevisionTemp oFondoPrevisionTemp, Persona oPersona) {
        try {
            iniciarOperacion();
            String hql = "Select a from FondoSolidaridad a where a.persona.idPersona = "+oPersona.getIdPersona()+ " and a.fechaReg = '"+oFondoPrevisionTemp.getFechaUltimoPago()+"'";
            Query query = sesion.createQuery(hql);
            obj = (FondoSolidaridad) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return obj;
    }
}
