
package lissa.bl;

import lissa.be.SoFmoEvaluacionMedica;
import lissa.dao.SoFmoEvaluacionMedicaDao;

public class SoFmoEvaluacionMedicaBl {
    private SoFmoEvaluacionMedicaDao dao;
    
    public SoFmoEvaluacionMedica registrar(SoFmoEvaluacionMedica obj) {
        dao = new SoFmoEvaluacionMedicaDao();
        return dao.registrar(obj);
    }
}
