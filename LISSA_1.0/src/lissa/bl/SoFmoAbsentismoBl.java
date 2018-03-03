
package lissa.bl;

import lissa.be.SoFmoAbsentismo;
import lissa.dao.SoFmoAbsentismoDao;

public class SoFmoAbsentismoBl {
    private SoFmoAbsentismoDao dao;
    
    public SoFmoAbsentismo registrar(SoFmoAbsentismo obj) {
        dao = new SoFmoAbsentismoDao();
        return dao.registrar(obj);
    }
}
