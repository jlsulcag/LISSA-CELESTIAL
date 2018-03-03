package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Almacen;
import lissa.be.DetalleKardex;
import lissa.util.AbstractDA;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DetalleKardexDao extends AbstractDA<DetalleKardex> {

    private Session sesion;
    private Transaction tx;
    private ArrayList<DetalleKardex> list;

    @Override
    public DetalleKardex registrar(DetalleKardex bean) {
        return save(bean);
    }

    @Override
    public int actualizar(DetalleKardex bean) {
        return update(bean);
    }

    @Override
    public int eliminar(DetalleKardex bean) {
        return delete(bean);
    }

    @Override
    public List<DetalleKardex> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DetalleKardex> listar(String hql) {
        String hql2 = "select A from DetalleKardex A inner join A.producto B where B.nombre = '" + hql + "' order by A.kardex.fechaMov desc";
        return list(hql2);
    }

    @Override
    public List<DetalleKardex> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleKardex buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleKardex buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<DetalleKardex> kardexXalmacen(String almacen, String producto) {
        try {
            iniciarOperacion();
            String hql = "select A from DetalleKardex A inner join A.producto B inner join A.kardex C inner join C.almacenByIdAlmacenAfectado D where B.nombre = '" + producto + "' and D.nombre = '" + almacen + "' order by A.kardex.fechaMov desc, A.numeroMovimiento desc";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<DetalleKardex>) query.list();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
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

    public int maxNumMov() {
        int num = 0;
        try {
            iniciarOperacion();
            String hql = "select max(A.numeroMovimiento) from DetalleKardex A";
            Query query = sesion.createQuery(hql);
            if (query.uniqueResult() == null) {
                num = 0;
            } else {
                num = (Integer) query.uniqueResult();
            }
            tx.commit();

        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return num;
    }
}
