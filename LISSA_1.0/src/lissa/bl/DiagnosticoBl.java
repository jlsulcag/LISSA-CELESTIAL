package lissa.bl;

import java.util.ArrayList;
import lissa.be.Atencion;
import lissa.be.Diagnostico;
import lissa.dao.DiagnosticoDao;

public class DiagnosticoBl {
    private DiagnosticoDao dao;
    private ArrayList<Diagnostico> list;
    
    public Diagnostico registrar(Diagnostico bean) {
        dao = new DiagnosticoDao();
        return dao.registrar(bean);
    }
    
    public void actualizar(Diagnostico bean) {
        dao = new DiagnosticoDao();
        dao.actualizar(bean);
    }  
    
    public ArrayList<Diagnostico> buscar(String ref) {
        dao = new DiagnosticoDao();
        list = dao.buscar(ref);
        return list;
    }

    public Diagnostico buscarXid(int id) {
        dao = new DiagnosticoDao();
        return dao.buscarXid(id);
    }

    public ArrayList<Diagnostico> buscar(Atencion oAtencion) {
        dao = new DiagnosticoDao();
        return dao.buscarDiagnosticos(oAtencion);
    }
}
