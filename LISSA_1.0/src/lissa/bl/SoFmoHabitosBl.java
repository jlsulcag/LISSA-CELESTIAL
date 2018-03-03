
package lissa.bl;

import lissa.be.SoFmoHabitos;
import lissa.dao.SoFmoHabitosDao;

public class SoFmoHabitosBl {
    private SoFmoHabitosDao dao;
    
    public SoFmoHabitos registrar(SoFmoHabitos obj) {
        dao = new SoFmoHabitosDao();
        return dao.registrar(obj);
    }
}
