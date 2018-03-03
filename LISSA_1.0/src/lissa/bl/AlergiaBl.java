
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Alergia;
import lissa.be.Atencion;
import lissa.dao.AlergiaDao;

public class AlergiaBl {
    private AlergiaDao dao;
    private ArrayList<Alergia> list;
    
    public Alergia registrar(Alergia obj) {
        dao = new AlergiaDao();
        return dao.registrar(obj);
    }
    
    public int actualizar(Alergia obj) {
        dao = new AlergiaDao();
        return dao.actualizar(obj);
    }  

    public Alergia buscar(Atencion oAtencion) {
        dao = new AlergiaDao();
        return dao.buscar(oAtencion);
    }
}
