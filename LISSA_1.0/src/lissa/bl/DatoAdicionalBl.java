
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Atencion;
import lissa.be.DatoAdicional;
import lissa.dao.DatoAdicionalDao;

public class DatoAdicionalBl {
    private DatoAdicionalDao dao;
    private ArrayList<DatoAdicional> list;
    
    public DatoAdicional registrar(DatoAdicional obj) {
        dao = new DatoAdicionalDao();
        return dao.registrar(obj);
    }
    
    public int actualizar(DatoAdicional obj) {
        dao = new DatoAdicionalDao();
        return dao.actualizar(obj);
    }  

    public DatoAdicional buscar(Atencion oAtencion) {
        dao = new DatoAdicionalDao();
        return dao.buscar(oAtencion);
    }
}
