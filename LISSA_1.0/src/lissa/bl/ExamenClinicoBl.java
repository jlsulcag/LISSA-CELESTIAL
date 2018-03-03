
package lissa.bl;

import java.util.ArrayList;
import lissa.be.AtencionOcupacional;
import lissa.be.ExamenClinico;
import lissa.dao.ExamenClinicoDao;

public class ExamenClinicoBl {
    private ExamenClinicoDao dao;
    private ArrayList<ExamenClinico> list;
    
    public ExamenClinico registrar(ExamenClinico obj) {
        dao = new ExamenClinicoDao();
        return dao.registrar(obj);
    }

    public ExamenClinico getExamenClinico(AtencionOcupacional oAtencionOcupacional) {
        dao = new ExamenClinicoDao();
        return dao.getExamenClinico(oAtencionOcupacional);
    }
}
