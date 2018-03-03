package lissa.dao;

import static java.lang.Math.log;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lissa.be.Ubigeo;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UbigeoDao {

    private Session sesion;
    private Transaction tx;
    private Ubigeo obj = null;
    private ArrayList<Ubigeo> list;
    private ResultSet rs;

    public ArrayList<Ubigeo> listarDepartamentos() throws HibernateException, SQLException {
        List lista;
        try {
            iniciarOperacion();
            String sql = "select ub.nombre_region, ub.codigo_region from ubigeo ub "
                    + "group by ub.nombre_region, ub.codigo_region order by ub.nombre_region asc";
            Query query = sesion.createSQLQuery(sql);
            lista = query.list();
            list = new ArrayList<>();
            for (Iterator iter = lista.iterator(); iter.hasNext();) {
                Object[] objects = (Object[]) iter.next();
                String name = (String) objects[0];
                Integer cod = (Integer) objects[1];
                obj = new Ubigeo();
                obj.setNombreRegion(name);
                obj.setCodigoRegion(cod);
                list.add(obj);
            }

        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
        return list;
    }

    public ArrayList<Ubigeo> listarProvincias(Ubigeo ubigeo) {
        List lista;
        try {
            iniciarOperacion();
            String sql = "select ub.nombre_provincia, ub.codigo_provincia from ubigeo ub "
                    + "where ub.codigo_region = "+ubigeo.getCodigoRegion() + "group by ub.nombre_provincia, ub.codigo_provincia order by ub.nombre_provincia asc";
            Query query = sesion.createSQLQuery(sql);
            lista = query.list();
            list = new ArrayList<>();
            for (Iterator iter = lista.iterator(); iter.hasNext();) {
                Object[] objects = (Object[]) iter.next();
                String name = (String) objects[0];
                Integer cod = (Integer) objects[1];
                obj = new Ubigeo();
                obj.setNombreProvincia(name);
                obj.setCodigoProvincia(cod);
                list.add(obj);
            }

        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
        return list;
    }

    public ArrayList<Ubigeo> listarDistritos(Ubigeo ubigeo) {
        List lista;
        try {
            iniciarOperacion();
            String sql = "select ub.nombre_distrito, ub.codigo_distrito from ubigeo ub "
                    + "where ub.nombre_provincia = '"+ubigeo.getNombreProvincia() + "' group by ub.nombre_distrito, ub.codigo_distrito order by ub.nombre_distrito asc";
            Query query = sesion.createSQLQuery(sql);
            lista = query.list();
            list = new ArrayList<>();
            for (Iterator iter = lista.iterator(); iter.hasNext();) {
                Object[] objects = (Object[]) iter.next();
                String name = (String) objects[0];
                Integer cod = (Integer) objects[1];
                obj = new Ubigeo();
                obj.setNombreDistrito(name);
                obj.setCodigoDistrito(cod);
                list.add(obj);
            }

        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
        return list;
    }
    
    public Ubigeo obtenerIdUbigeoSelect(Ubigeo ubigeo, Ubigeo ubigeo0, Ubigeo ubigeo1) {
        try {
            iniciarOperacion();
            String hql = "select ub from Ubigeo ub where ub.nombreRegion = '"+ubigeo.getNombreRegion()+"' and "
                    + "ub.nombreProvincia = '"+ubigeo0.getNombreProvincia()+"' and "
                    + "ub.nombreDistrito = '"+ubigeo1.getNombreDistrito()+"' ";
            Query query = sesion.createQuery(hql);
            obj = (Ubigeo) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
        return obj;
    }
    
    public Ubigeo buscarXId(int idubigeo) {
        try {
            iniciarOperacion();
            String hql = "select ub from Ubigeo ub where ub.idubigeo = "+idubigeo;
            Query query = sesion.createQuery(hql);
            obj = (Ubigeo) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        } finally {
            sesion.close();
        }
        return obj;
    }
    
    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }    

}
