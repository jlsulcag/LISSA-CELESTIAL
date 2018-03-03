package lissa.bl;

import java.util.ArrayList;
import lissa.be.ServicioFondoSolidaridad;
import lissa.dao.ServicioFondoSolidaridadDao;

public class ServicioFondoSolidaridadBl {
    private ServicioFondoSolidaridadDao dao;
    private ArrayList<ServicioFondoSolidaridad> list;
    
    public int registrar(ServicioFondoSolidaridad obj) {
        dao = new ServicioFondoSolidaridadDao();
        return dao.registrar(obj);
    }
}
