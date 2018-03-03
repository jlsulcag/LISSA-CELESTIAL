package lissa.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lissa.be.Caja;
import lissa.be.Venta;
import lissa.util.AbstractDA;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VentaDao extends AbstractDA<Venta> {

    private Session sesion;
    private Transaction tx;
    private List<Venta> list;

    @Override
    public Venta registrar(Venta bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Venta bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Venta bean) {
        return delete(bean);
    }

    @Override
    public List<Venta> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Venta> listar(String hql) {
        hql = "from Venta A where A.order by A.fechaVenta desc";
        return list(hql);
    }

    @Override
    public List<Venta> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venta buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venta buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long obtenerUltNumero(int id) {
        iniciarOperacion();
        long num = 0;
        String hql = "select max(v.numComprobante) from Venta v where v.grupoNumeracion = " + id;
        Query query = sesion.createQuery(hql);
        if (query.uniqueResult() == null) {
            num = 0;
        } else {
            num = (Long) query.uniqueResult();
        }
        tx.commit();
        return num;
    }

    public int obtenerNumOperacion() {
        iniciarOperacion();
        int num = 0;
        String hql = "select max(v.numOperacion) from Venta as v";
        Query query = sesion.createQuery(hql);
        if (query.uniqueResult() == null) {
            num = 0;
        } else {
            num = (Integer) query.uniqueResult();
        }
        tx.commit();
        return num;
    }

    private void iniciarOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    public BigDecimal calcularTotalBoleta(Caja oCaja) {
        BigDecimal total = null;
        try {
            iniciarOperacion();
            String hql = "select sum(vt.total) from Venta vt inner join vt.farComprobante fc where vt.idCaja = " + oCaja.getIdcaja() + "and fc.comprobante = 'BOLETA' and vt.estado='ACT'";
            Query query = sesion.createQuery(hql);
            total = (BigDecimal) query.uniqueResult();
            if (total == null || total == new BigDecimal("0.00")) {
                total = new BigDecimal("0.00");
            }
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return total;
    }

    public BigDecimal calcularTotalFactura(Caja oCaja) {
        BigDecimal total = null;
        try {
            iniciarOperacion();
            String hql = "select sum(vt.total) from Venta vt inner join vt.farComprobante fc where vt.idCaja = " + oCaja.getIdcaja() + "and fc.comprobante = 'FACTURA' and vt.estado='ACT'";
            Query query = sesion.createQuery(hql);
            total = (BigDecimal) query.uniqueResult();
            if (total == null || total == new BigDecimal("0.00")) {
                total = new BigDecimal("0.00");
            }
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return total;
    }

    private void manejaExcepcion(HibernateException he) {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public List<Venta> listarxIdCliente(int idPersona) {
        try {
            iniciarOperacion();
            String hql = "from Venta v where v.idCliente = " + idPersona;
            list = sesion.createQuery(hql).list();
            tx.commit();
            //sesion.close();
            return list;
        } catch (HibernateException e) {
            manejaExcepcion(e);
            return null;
        }
    }
    
    public List<Venta> listarAll() {
        try {
            iniciarOperacion();
            String hql = "from Venta";
            list = sesion.createQuery(hql).list();
            tx.commit();
            //sesion.close();
            return list;
        } catch (HibernateException e) {
            manejaExcepcion(e);
            return null;
        }
    }

    public List<Venta> listarXNumComprobante(String num) {
        try {
            iniciarOperacion();
            String hql = "from Venta v where v.numComprobante = "+ num + " order by v.numComprobante desc";
            list = sesion.createQuery(hql).list();
            tx.commit();
            //sesion.close();
            return list;
        } catch (HibernateException e) {
            manejaExcepcion(e);
            return null;
        }
    }
}
