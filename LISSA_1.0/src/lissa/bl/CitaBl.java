
package lissa.bl;

import java.util.ArrayList;
import java.util.Date;
import lissa.be.Cita;
import lissa.be.Medico;
import lissa.dao.CitaDao;

public class CitaBl {
    private CitaDao dao;
    private ArrayList<Cita> list;
    
    public Cita registrar(Cita obj) {
        dao = new CitaDao();
        return dao.registrar(obj);
    }
    
    public int actualizar(Cita obj) {
        dao = new CitaDao();
        return dao.actualizar(obj);
    }  

    public ArrayList<Cita> listar() {
        dao = new CitaDao();
        return dao.listar();
    }
    
    public ArrayList<Cita> listarPorMedico(Medico medico) {
        dao = new CitaDao();
        return dao.listarPorMedico(medico);
    }

    public ArrayList<Cita> listarPorPacienteFecha(String pac, Date fecha) {
        dao = new CitaDao();
        return dao.listarPorPacienteFecha(pac, fecha);
    }
}
