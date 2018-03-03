
package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Compra;
import lissa.be.Venta;
import lissa.util.AbstractDA;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JSULCAG
 */
public class CompraDao extends AbstractDA<Compra>{

    private Session sesion;
    private Transaction tx;
    private List<Compra> list;
    
    @Override
    public Compra registrar(Compra bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Compra bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Compra bean) {
        return delete(bean);
    }

    @Override
    public List<Compra> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Compra> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<Compra> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Compra> listarxIdProveedor(long idproveedor) {
//        String hql = "from Compra c where c.idProveedor = "+idproveedor;
//        return listar(hql);
        try {
            iniciarOperacion();
            String hql = "from Compra a where a.idProveedor = "+ idproveedor;
            list = sesion.createQuery(hql).list();
            tx.commit();
            //sesion.close();
            return list;
        } catch (HibernateException e) {
            manejaExcepcion(e);
            return null;
        }
    }
    
    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }
    
    private void manejaExcepcion(HibernateException he) {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public List<Compra> listarXNumComprobante(String num) {
        try {
            iniciarOperacion();
            String hql = "from Compra a where a.numeroComprobante like '%"+ num+"%'";
            list = sesion.createQuery(hql).list();
            tx.commit();
            sesion.close();
            return list;
        } catch (HibernateException e) {
            manejaExcepcion(e);
            return null;
        }
    }
    
}
