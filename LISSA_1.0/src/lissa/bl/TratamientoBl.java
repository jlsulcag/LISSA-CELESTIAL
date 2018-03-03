
package lissa.bl;

import java.util.ArrayList;
import lissa.be.Atencion;
import lissa.be.Tratamiento;
import lissa.dao.TratamientoDao;

public class TratamientoBl {
    private TratamientoDao dao;
    private ArrayList<Tratamiento> list;
    
    public Tratamiento registrar(Tratamiento obj) {
        dao = new TratamientoDao();
        return dao.registrar(obj);
    }
    
    public int actualizar(Tratamiento obj) {
        dao = new TratamientoDao();
        return dao.actualizar(obj);
    }  

    public ArrayList<Tratamiento> listar(Atencion oAtencion) {
        dao = new TratamientoDao();
        return dao.listar(oAtencion);
    }
}
