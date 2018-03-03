
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Atencion;
import lissa.be.FuncionVital;
import lissa.dao.FuncionVitalDao;

public class FuncionVitalBl {
    private FuncionVitalDao dao;
    private ArrayList<FuncionVital> list;
    
    public FuncionVital registrar(FuncionVital obj) {
        dao = new FuncionVitalDao();
        return dao.registrar(obj);
    }
    
    public int actualizar(FuncionVital obj) {
        dao = new FuncionVitalDao();
        return dao.actualizar(obj);
    }  

    public FuncionVital buscar(Atencion oAtencion) {
        dao = new FuncionVitalDao();
        return dao.buscar(oAtencion);
    }
}
