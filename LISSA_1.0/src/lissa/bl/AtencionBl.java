
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Atencion;
import lissa.be.HistoriaClinica;
import lissa.dao.AtencionDao;

public class AtencionBl {
    private AtencionDao dao;
    private ArrayList<Atencion> list;
    
    public Atencion registrar(Atencion obj) {
        dao = new AtencionDao();
        return dao.registrar(obj);
    }
    
    public void actualizar(Atencion obj) {
        dao = new AtencionDao();
        dao.actualizar(obj);
    }  

//    public Atencion buscarUltimaAtencion(int idhistoriaclinica) {
//        dao = new AtencionDao();
//        return dao.buscarUltimaAtencion(idhistoriaclinica);
//    }

    public ArrayList<Atencion> listar(HistoriaClinica hc) {
        dao = new AtencionDao();
        return dao.listar(hc);
    }
}
