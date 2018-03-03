
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Antecedente;
import lissa.be.Atencion;
import lissa.dao.AntecedenteDao;

public class AntecedenteBl {
    private AntecedenteDao dao;
    private ArrayList<Antecedente> list;
    
    public Antecedente registrar(Antecedente obj) {
        dao = new AntecedenteDao();
        return dao.registrar(obj);
    }
    
    public void actualizar(Antecedente obj) {
        dao = new AntecedenteDao();
        dao.actualizar(obj);
    }  

    public Antecedente buscar(Atencion oAtencion) {
        dao = new AntecedenteDao();
        return dao.buscar(oAtencion);
    }
}
