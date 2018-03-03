
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Persona;
import lissa.dao.PersonaDao;
public class PersonaBl {

    private PersonaDao daoPersona;
    private ArrayList<Persona> list;
    private PersonaDao dao;
   
    public Persona registrarPersona(Persona oPersona) {
        PersonaDao oDAOPersona = new PersonaDao();
        return oDAOPersona.registrarPersona(oPersona);
    }    
    
    public ArrayList<Persona> buscar(String ref) {
        daoPersona = new PersonaDao();
        list = daoPersona.buscar(ref);
        return list;
    }

    public Persona buscarPersonaXDni(String numeroDocumento) {
        daoPersona = new PersonaDao();
        return daoPersona.buscarPersonaXDni(numeroDocumento);
    }

    public int actualizar(Persona oPersona) {
        daoPersona = new PersonaDao();
        return daoPersona.actualizar(oPersona);
    }

    public Persona buscarPersonaXid(Integer id) {
        dao = new PersonaDao();
        return dao.buscar(id);
    }

    public ArrayList<Persona> listar() {
        dao = new PersonaDao();
        return dao.listar();
    }

    public ArrayList<Persona> buscarxNombres(String nombres) {
        dao = new PersonaDao();
        return dao.buscarxNombres(nombres);
    }

}
