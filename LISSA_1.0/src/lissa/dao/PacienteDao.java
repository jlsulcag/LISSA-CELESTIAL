package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Paciente;
import lissa.utiles.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PacienteDao {

    private Session sesion;
    private Transaction tx;
    Paciente obj = null;

    public int registrar(Paciente obj) throws HibernateException {
        int id = 0;
        try {
            iniciarOperacion();
            id = (int) sesion.save(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
        return id;
    }

    public void actualizar(Paciente obj) throws HibernateException {
        try {
            iniciarOperacion();
            sesion.update(obj);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        } finally {
            sesion.close();
        }
    }

    public ArrayList<Paciente> buscarPersonaJuridica(String ref) {
        ArrayList<Paciente> list = null;
        try {
            iniciarOperacion();
            list = (ArrayList<Paciente>) sesion.createQuery("from PersonaJuridica p where p.razonSocial like '%" + ref + "%'").list();
            if (list.isEmpty()) {
                list = (ArrayList<Paciente>) sesion.createQuery("from PersonaJuridica p where p.numeroRuc like '%" + ref + "%'").list();
            }
            tx.commit();
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
    //Busqueda optima para encontrar la ultima atencion de un paciente baso en el id de la persona
    public Paciente buscar(Integer id) {
        try {
            iniciarOperacion();
            String hql = "from Paciente pac inner join fetch pac.persona p where p.idPersona=" + id 
                    +" and pac.fechaIngreso=(select max(pac2.fechaIngreso) from Paciente pac2 inner "
                    +"join pac2.persona per2 where per2.idPersona="+id
                    +") and pac.numeroAtencion=(select max(pac3.numeroAtencion) from "
                    +"Paciente pac3 inner join pac3.persona per3 where per3.idPersona="+id+")";
            Query query = sesion.createQuery(hql);
            obj = (Paciente) query.uniqueResult();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return obj;
    }
    
    public List<Paciente> buscarXIdPersona(Integer id) {
        List<Paciente> list = null;
        try {
            iniciarOperacion();
            String hql = "from Paciente pac inner join fetch pac.persona p where p.idPersona=" + id + " order by pac.fechaIngreso desc";
            Query query = sesion.createQuery(hql);
            query.setMaxResults(1);
            list = query.list();
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return list;
    }

    public Integer ultimoNumAtencion() {
        iniciarOperacion();
        Integer num = 0;
        String hql = "select max(pac.numeroAtencion) from Paciente pac";
        Query query = sesion.createQuery(hql);
        if(query.uniqueResult() == null){
            num = 0;
        }else{
            num = (Integer) query.uniqueResult();
        }        
        tx.commit();
        return num;
    }

    public ArrayList<Paciente> listarIngresosPaciente(int idPersona) {
        ArrayList<Paciente> list = null;
        try {
            iniciarOperacion();
            String hql = "from Paciente pac inner join fetch pac.persona p where p.idPersona=" + idPersona + " order by pac.fechaIngreso desc";
            Query query = sesion.createQuery(hql);
            list = (ArrayList<Paciente>) query.list();
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
        }
        return list;
    }
}
