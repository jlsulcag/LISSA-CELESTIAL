/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lissa.dao;

import lissa.be.AtencionOcupacional;
import lissa.be.HistoriaClinica;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JSULCAG
 */
public class AtencionOcupacionalDao {
    private Session sesion;
    private Transaction tx;
    private AtencionOcupacional obj = null;
    public static final int SUCCESS = 1, ERROR = 2;
    
    public AtencionOcupacional registrar(AtencionOcupacional obj) throws HibernateException {
        try {
            iniciarOperacion();
            sesion.save(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
        return obj;
    }

    private void iniciarOperacion() {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public AtencionOcupacional buscar(HistoriaClinica oHistoriaClinica) {
        obj = new AtencionOcupacional();
        try {
            iniciarOperacion();
            String hql = "select aten from AtencionOcupacional aten inner join aten.historiaClinica hc "
                    + "where hc.idhistoriaclinica = "+ oHistoriaClinica.getIdhistoriaclinica() + 
                    " and aten.fechaCertificacion = (select max(aten2.fechaCertificacion) from AtencionOcupacional aten2) "
                    + "and aten.idatencionocupacional = (select max(aten3.idatencionocupacional) from AtencionOcupacional aten3 "
                    + "inner join aten3.historiaClinica hc2 where hc2.idhistoriaclinica = " + oHistoriaClinica.getIdhistoriaclinica() + ")";
            Query query = sesion.createQuery(hql);
            obj = (AtencionOcupacional) query.uniqueResult();
        } catch (HibernateException e) {
            manejaExcepcion(e);
        }
        return obj;
    }
}
