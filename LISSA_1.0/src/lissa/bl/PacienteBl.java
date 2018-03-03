
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Paciente;
import lissa.dao.PacienteDao;

public class PacienteBl {
    private PacienteDao dao;
    private ArrayList<Paciente> list;
    private List<Paciente> list2;
    
    public int registrar(Paciente obj) {
        dao = new PacienteDao();
        return dao.registrar(obj);
    }
    
    public void actualizar(Paciente obj) {
        dao = new PacienteDao();
        dao.actualizar(obj);
    }
    
    public Paciente buscarPacienteXid(Integer id) {
        dao = new PacienteDao();
        return dao.buscar(id);
    }
    
    public ArrayList<Paciente> buscarPersonaJuridica(String ref) {
        dao = new PacienteDao();
        list = dao.buscarPersonaJuridica(ref);
        return list;
    }
    
    public List<Paciente> buscarXIdPersona(Integer id) {
        dao = new PacienteDao();
        list2 = dao.buscarXIdPersona(id);
        return list2;
    }

    public Integer ultimoNumAtencion() {
        dao = new PacienteDao();
        return dao.ultimoNumAtencion();
    }

    public ArrayList<Paciente> listarIngresosPaciente(int idPersona) {
        dao = new PacienteDao();
        return dao.listarIngresosPaciente(idPersona);
    }
}
