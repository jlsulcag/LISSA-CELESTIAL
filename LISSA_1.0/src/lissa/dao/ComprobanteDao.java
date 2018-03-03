package lissa.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import lissa.be.Caja;
import lissa.be.Comprobante;
import lissa.be.Paciente;
import lissa.be.Persona;
import lissa.be.TipoComprobante;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ComprobanteDao {

    private Session sesion;
    private Transaction tx;
    Comprobante obj = null;
    private ArrayList<Comprobante> list;

    public Comprobante registrar(Comprobante obj) {
        try {
            iniciarOperacion();
            sesion.save(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return obj;
    }

    private void iniciarOperacion() throws HibernateException {
        if (sesion != null) {
            sesion.close();
        } else {
            sesion = HibernateUtil.getSessionFactory().openSession();
            tx = sesion.beginTransaction();
        }
    }

    public void cerrarSesion() {

        System.out.println("aqui  .....");
        System.out.println("sesion " + sesion);
        sesion.close();

    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public Comprobante buscarXnumDoc(int ref) {
        try {
            iniciarOperacion();
            String hql = "from Comprobante c where c.numeroBoleta=" + ref;
            Query query = sesion.createQuery(hql);
            obj = (Comprobante) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return obj;
    }

    public ArrayList<Comprobante> buscarXtipoDoc(String ref) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ArrayList<Comprobante> list = null;
        list = (ArrayList<Comprobante>) session.createQuery("from Comprobante b where b.numeroBoleta =" + ref).list();
        session.getTransaction().commit();
        return list;
    }

    public ArrayList<Comprobante> buscarXfecha(Date ref) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ArrayList<Comprobante> list = null;
        list = (ArrayList<Comprobante>) session.createQuery("from Comprobante b where b.numeroBoleta =" + ref).list();
        session.getTransaction().commit();
        return list;
    }

    public void actualizar(Comprobante obj) {
        try {
            iniciarOperacion();
            sesion.update(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
    }

    public Comprobante buscarXPaciente(String numeroDocumento) {
        try {
            iniciarOperacion();
            String hql = "select ic from ItemsComprobante ic inner join ic.comprobante c inner join c.paciente pac inner join pac.persona per where per.numeroDocumento=" + numeroDocumento;
            Query query = sesion.createQuery(hql);
            obj = (Comprobante) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return obj;
    }

    public ArrayList<Comprobante> buscarXNombre(String nombre) {
        //ArrayList<Comprobante> list;
        try {
            iniciarOperacion();
            String hql = "select com from Comprobante com inner join com.paciente pac inner join pac.persona per "
                    + "where (per.apellidoPaterno || ' ' || per.apellidoMaterno || ' ' || per.nombre) like '%" + nombre + "%' "
                    + "order by com.fechaBoleta desc";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Comprobante>) query.list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return list;
    }

    public BigDecimal calcuatTotalRecibo(Caja oCaja) {
        BigDecimal total = null;
        try {
            iniciarOperacion();
            String hql = "select sum(com.montoTotal) from Comprobante com inner join com.caja caj inner join com.tipoComprobante tc where caj.idcaja=" + oCaja.getIdcaja() + " and tc.denominacion = 'RECIBO' and com.estado = true";
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

    public BigDecimal calcularTotalBoleta(Caja oCaja) {
        BigDecimal total = null;
        try {
            iniciarOperacion();
            String hql = "select sum(com.montoTotal) from Comprobante com inner join com.caja caj inner join com.tipoComprobante tc where caj.idcaja=" + oCaja.getIdcaja() + " and tc.denominacion = 'BOLETA'and com.estado = true";
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
            String hql = "select sum(com.montoTotal) from Comprobante com inner join com.caja caj inner join com.tipoComprobante tc where caj.idcaja=" + oCaja.getIdcaja() + " and tc.denominacion = 'FACTURA' and com.estado = true";
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

    public ArrayList<Comprobante> listarAtencionFondo(Caja oCaja) {
        try {
            iniciarOperacion();
            list = (ArrayList<Comprobante>) sesion.createQuery("Select com from Comprobante com inner join com.caja caj inner join caj.usuario usu inner join usu.persona per inner join com.beneficio ben where caj.idcaja = " + oCaja.getIdcaja() + " and ben.nombreBeneficio = 'FONDO PREVISION'").list();
            tx.commit();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return list;
    }

    public Comprobante buscarXnumDoc(Integer numeroBoleta, TipoComprobante tipoComprobante) {
        try {
            iniciarOperacion();
            String hql = "from Comprobante c where c.numeroBoleta=" + numeroBoleta + " and c.tipoComprobante = " + tipoComprobante.getIdtipocomprobante();
            Query query = sesion.createQuery(hql);
            obj = (Comprobante) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return obj;
    }

    public ArrayList<Comprobante> listar(Persona per) {
        try {
            iniciarOperacion();
            String hql = "select com from Comprobante com inner join com.paciente pac inner join pac.persona per where per.idPersona = " + per.getIdPersona() + " order by com.numeroBoleta asc";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Comprobante>) query.list();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
        return list;
    }
}
