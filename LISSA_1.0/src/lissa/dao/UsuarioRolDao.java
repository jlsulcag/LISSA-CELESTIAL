
package lissa.dao;

import java.util.ArrayList;
import lissa.be.Rol;
import lissa.be.UsuarioRol;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioRolDao {
     private Session sesion;
    private Transaction tx;

    UsuarioRol obj = null;

    public int registrar(UsuarioRol obj) {
        int id = 0;
        try {
            iniciarOperacion();
            //retorna  el id registrado del objeto
            id = (int)sesion.save(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return id;
    }
    
    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public ArrayList<UsuarioRol> listar_modulos_usuario(int idUsuario) throws Exception{
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        ArrayList<UsuarioRol> list = null;
        list = (ArrayList<UsuarioRol>) session.createQuery("from UsuarioRol ur where ur.idUsuario=" + idUsuario).list();
        session.getTransaction().commit();
        return list;
    }

    public UsuarioRol buscar(int idUsuario, int idrol) {
        try {
            iniciarOperacion();
            String hql = "select ur from UsuarioRol ur inner join ur.usuario u inner join ur.rol r where u.idUsuario = " + idUsuario +" and r.idrol = "+idrol;
            Query query = sesion.createQuery(hql);
            obj = (UsuarioRol) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        finally{
            sesion.close();
        }
        return obj;
    }

    public void eliminar(UsuarioRol oUsuarioRol) {
        try {
            iniciarOperacion();
            sesion.delete(oUsuarioRol);
            tx.commit();
            sesion.close();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
    }
}
