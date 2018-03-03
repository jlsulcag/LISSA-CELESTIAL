package lissa.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import lissa.be.Almacen;
import lissa.be.AlmacenProducto;
import lissa.be.Producto;
import lissa.util.AbstractDA;
import lissa.util.Utilitarios;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlmacenProductoDao extends AbstractDA<AlmacenProducto> {

    private Session sesion;
    private Transaction tx;
    private ArrayList<AlmacenProducto> list;
    private AlmacenProducto obj;

    @Override
    public AlmacenProducto registrar(AlmacenProducto bean) {
        return save(bean);
    }

    @Override
    public int actualizar(AlmacenProducto bean) {
        return update(bean);
    }

    @Override
    public int eliminar(AlmacenProducto bean) {
        return delete(bean);
    }

    public long buscar(int idproducto, int idalmacen) {
        long res = 0;
        try {
            iniciarOperacion();
            String hql = "select sum(ap.stockActual) from AlmacenProducto ap inner join ap.producto p inner join ap.almacen a where a.idalmacen = "+idalmacen + " and p.idproducto = "+idproducto + " group by p";
            Query query = sesion.createQuery(hql);
            if(query.uniqueResult() == null){
                res = 0;
            }else{
                res = (long) query.uniqueResult();
            }
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
        return res;
    }

    @Override
    public List<AlmacenProducto> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AlmacenProducto> listar(String hql) {
        hql = "from AlmacenProducto ap order by ap.producto.nombre asc, ap.fechaVencimiento asc";
        return list(hql);
    }

    @Override
    public List<AlmacenProducto> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AlmacenProducto buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AlmacenProducto buscar(String ref) {
        String query = "from AlmacenProducto ap where ap.lote = '"+ref+"'";
        return search(query);
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public ArrayList<AlmacenProducto> listRef(String ref, String almacen) {
        try {
            iniciarOperacion();
            String hql = "select ap from AlmacenProducto ap inner join ap.producto p inner join ap.almacen al where p.nombre like '%"+ref+"%' and al.nombre = '"+almacen+"' and ap.stockActual>0";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<AlmacenProducto>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }
    
    public ArrayList<AlmacenProducto> listStockxAlmacenProducto(String almacen, String producto) {
        try {
            iniciarOperacion();
            String hql = "select A from AlmacenProducto A inner join A.almacen B inner join A.producto C where B.nombre like '%"+almacen+"%' and C.nombre like '%"+producto+"%'";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<AlmacenProducto>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }
    
    public ArrayList<AlmacenProducto> listXAlmacen(String almacen) {
        try {
            iniciarOperacion();
            String hql = "from AlmacenProducto ap where ap.almacen.nombre = '"+almacen+"' and ap.stockActual>0";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<AlmacenProducto>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }

    public AlmacenProducto buscarProductoxAlmacenyLote(String lote, Almacen almacen, Producto oProducto) {
        obj = new AlmacenProducto();
        try {
            iniciarOperacion();
            String hql = "from AlmacenProducto ap where ap.almacen.nombre = '"+almacen.getNombre()+"' and lote = '"+lote+"' and ap.producto.idproducto = "+oProducto.getIdproducto();
            Query query = sesion.createQuery(hql).setMaxResults(1);
            obj = (AlmacenProducto) query.uniqueResult();
            tx.commit();
            sesion.close();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Error en busqueda de producto en almacen ... Consulte al Administrador del Sistema \n ID PRODUCTO = "+oProducto.getIdproducto(), "Error Fatal", JOptionPane.ERROR_MESSAGE);
            manejaExcepcion(e);            
            //obj = null;
        }
        return obj;
    }

    public ArrayList<AlmacenProducto> listarProductosPorVencer(int dias) {
        try {
            iniciarOperacion();
            String hql = "select ap from AlmacenProducto ap inner join ap.producto p inner join ap.almacen a "
                    + "where (current_date < ap.fechaVencimiento and ap.fechaVencimiento-current_date < "+dias+") and ap.stockActual>0 "
                    + "order by ap.fechaVencimiento asc, a.nombre desc";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<AlmacenProducto>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }
    public ArrayList<AlmacenProducto> listarProductosPorFechaVencimiento(Date fecha) {
        try {
            iniciarOperacion();
            String hql = "select ap from AlmacenProducto ap inner join ap.producto p inner join ap.almacen a where ap.fechaVencimiento <= '"+ Utilitarios.castDate_UTIL_SQL(fecha) +"' and ap.stockActual>0 order by ap.fechaVencimiento asc, a.nombre desc";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<AlmacenProducto>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }

    public List<AlmacenProducto> listarProductosVencidos() {
        List<AlmacenProducto> temp = new ArrayList<>();
        try {
            iniciarOperacion();
            String hql = "select ap from AlmacenProducto ap inner join ap.producto p inner join ap.almacen a "
                    + "where (current_date > ap.fechaVencimiento) and ap.stockActual>0 "
                    + "order by ap.fechaVencimiento asc, a.nombre desc";
            Query query = sesion.createQuery(hql);
            temp = query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return temp;
    }

}
