
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Medico;
import lissa.dao.MedicoDao;

public class MedicoBl {
    private MedicoDao dao;
    private ArrayList<Medico> list;
    
    public int registrar(Medico obj){
        dao = new MedicoDao();
        return dao.registrar(obj);
    }
    
    public void actualizar(Medico obj){
        dao = new MedicoDao();
        dao.actualizar(obj);
    }
    
    public ArrayList<Medico> buscar(String ref) {
        dao = new MedicoDao();
        list = dao.buscar(ref);
        return list;
    }
    
    public Medico buscarId(int id) {
        dao = new MedicoDao();
        return dao.buscarId(id);
    }

    public Medico buscarMedicoXDni(String dni) {
        dao = new MedicoDao();
        return dao.buscarMedicoXDni(dni);
    }
    
    public ArrayList<Medico> buscarMedicoXNombres(String nombres) {
        dao = new MedicoDao();
        return dao.buscarxNombres(nombres);
    }

    public ArrayList<Medico> listar() {
        dao = new MedicoDao();
        return dao.listar();
    }
}
