package lissa.dao;

import java.util.ArrayList;
import lissa.be.Caja;
import lissa.be.Usuario;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioDao {

    private Session sesion;
    private Transaction tx;
    private Usuario oUsuario;
    private Usuario obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    private int res = 0;

    public Usuario registrar(Usuario obj) {
        try {
            iniciarOperacion();
            sesion.save(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
//        finally {
//            sesion.close();
//        }
        return obj;
    }

    public ArrayList<Usuario> listar(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        ArrayList<Usuario> list = null;
        list = (ArrayList<Usuario>) session.createQuery("from FondoSolidaridad fs where fs.idSocio=" + id).list();
        session.getTransaction().commit();
        return list;
    }

    public Usuario buscarUsuario(String usuario, String clave) {
        try {
            oUsuario = new Usuario();
            iniciarOperacion();
            //query hql para la consulta
            String hql = "from Usuario as u where u.nombre='" + usuario + "' and u.contrasenia='" + clave + "'";
            Query query = sesion.createQuery(hql);
            query.setMaxResults(1);
            oUsuario = (Usuario) query.uniqueResult();
            //sesion.getTransaction().commit(); 
        } catch (Exception e) {
            oUsuario = null;
        }finally{
            sesion.close();
        }      
              
        return oUsuario;
    }

    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public int actualizar(Usuario obj) {
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

    public ArrayList<Usuario> buscar(String ref) {
        ArrayList<Usuario> list = null;
        try {
            iniciarOperacion();
            list = (ArrayList<Usuario>) sesion.createQuery("from Usuario u where (u.persona.apellidoPaterno || ' ' || "
                    + "u.persona.apellidoMaterno || ' ' || u.persona.nombre) like '%" + ref + "%'").list();

            if (list.isEmpty()) {
                list = (ArrayList<Usuario>) sesion.createQuery("from Usuario u where u.nombre like '%" + ref + "%'").list();
            }
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        tx.commit();
        return list;
    }

    public Usuario buscarXIdCaja(Caja oCaja) {
        try {
            iniciarOperacion();
            String hql = "Select user from Caja caj inner join caj.usuario user where caj.idcaja =" + oCaja.getIdcaja();
            Query query = sesion.createQuery(hql);
            obj = (Usuario) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return obj;
    }

    public Usuario buscarXid(int idUser) {
        try {
            iniciarOperacion();
            String hql = "from Usuario usu where usu.idUsuario = " + idUser;
            Query query = sesion.createQuery(hql);
            obj = (Usuario) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return obj;
    }

}
