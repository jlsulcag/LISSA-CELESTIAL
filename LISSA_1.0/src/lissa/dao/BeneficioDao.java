
package lissa.dao;

import java.util.List;
import lissa.be.Beneficio;
import lissa.be.Paciente;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BeneficioDao {
    private Session sesion;
    private Transaction tx;
    private Beneficio obj = null;
    List<Beneficio> list = null;
    
    public List<Beneficio> buscarXIdSeguro(Integer id) {
        
        try {
            iniciarOperacion();
            String hql = "from Beneficio ben inner join fetch ben.seguroVida sv where sv.idSeguroVida=" + id;
            Query query = sesion.createQuery(hql);
            list = query.list();
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
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
}
