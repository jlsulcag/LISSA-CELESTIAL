
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Compra;
import lissa.be.DetalleCompra;
import lissa.be.DetalleVenta;
import lissa.util.AbstractDA;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JSULCAG
 */
public class DetalleCompraDao extends AbstractDA<DetalleCompra>{
    private Session s;
    private Transaction t;
    private List<DetalleCompra> l;

    private void iniciarOperacion() {
        s = HibernateUtil.getSessionFactory().openSession();
        t = s.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) {
        t.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }
    
    @Override
    public DetalleCompra registrar(DetalleCompra bean) {
        return save(bean);
    }

    @Override
    public int actualizar(DetalleCompra bean) {
        return update(bean);
    }

    @Override
    public int eliminar(DetalleCompra bean) {
        return delete(bean);
    }

    @Override
    public List<DetalleCompra> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DetalleCompra> listar(String hql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetalleCompra> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleCompra buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleCompra buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<DetalleCompra> listarXCompra(Compra oCompra) {
        try {
            iniciarOperacion();
            String hql = "select dc from DetalleCompra dc inner join dc.compra c where c.idcompra= "+oCompra.getIdcompra();
            Query query = s.createQuery(hql);
            l = query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return l;
    }
    
}
