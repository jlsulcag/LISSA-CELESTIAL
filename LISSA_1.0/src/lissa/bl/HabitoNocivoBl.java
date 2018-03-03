
package lissa.bl;

import java.util.ArrayList;
import lissa.be.HabitoNocivo;
import lissa.dao.HabitoNocivoDao;

public class HabitoNocivoBl {
    private HabitoNocivoDao dao;
    
    public HabitoNocivo registrar(HabitoNocivo obj) {
        dao = new HabitoNocivoDao();
        return dao.registrar(obj);
    }

    public ArrayList listar() {
        dao = new HabitoNocivoDao();
        return dao.listar();
    }
}
