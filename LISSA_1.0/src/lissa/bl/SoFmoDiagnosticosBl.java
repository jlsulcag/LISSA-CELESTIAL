
package lissa.bl;

import lissa.be.SoFmoDiagnosticos;
import lissa.dao.SoFmoDiagnosticoDao;

public class SoFmoDiagnosticosBl {
    private SoFmoDiagnosticoDao dao;
    
    public SoFmoDiagnosticos registrar(SoFmoDiagnosticos obj) {
        dao = new SoFmoDiagnosticoDao();
        return dao.registrar(obj);
    }
}
