
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Atencion;
import lissa.be.ExamenAuxiliar;
import lissa.dao.ExamenAuxiliarDao;

public class ExamenAuxiliarBl {
    private ExamenAuxiliarDao dao;
    private ArrayList<ExamenAuxiliar> list;
    
    public ExamenAuxiliar registrar(ExamenAuxiliar obj) {
        dao = new ExamenAuxiliarDao();
        return dao.registrar(obj);
    }
    
    public int actualizar(ExamenAuxiliar obj) {
        dao = new ExamenAuxiliarDao();
        return dao.actualizar(obj);
    }  

    public ArrayList<ExamenAuxiliar> listar(Atencion oAtencion) {
        dao = new ExamenAuxiliarDao();
        return dao.listar(oAtencion);
    }
}
