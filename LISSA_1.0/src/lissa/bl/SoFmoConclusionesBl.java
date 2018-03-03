
package lissa.bl;

import lissa.be.SoFmoConclusiones;
import lissa.dao.SoFmoConclusionesDao;

public class SoFmoConclusionesBl {
    private SoFmoConclusionesDao dao;
    
    public SoFmoConclusiones registrar(SoFmoConclusiones obj) {
        dao = new SoFmoConclusionesDao();
        return dao.registrar(obj);
    }
}
