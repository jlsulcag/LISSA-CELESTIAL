
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Anamnesis;
import lissa.be.Atencion;
import lissa.dao.AnamnesisDao;

public class AnamnesisBl {
    private AnamnesisDao dao;
    private ArrayList<Anamnesis> list;
    
    public Anamnesis registrar(Anamnesis obj) {
        dao = new AnamnesisDao();
        return dao.registrar(obj);
    }
    
    public int actualizar(Anamnesis obj) {
        dao = new AnamnesisDao();
        return dao.actualizar(obj);
    }  

    public Anamnesis buscar(Atencion oAtencion) {
        dao = new AnamnesisDao();
        return dao.buscar(oAtencion);
    }
}
