
package lissa.bl;

import lissa.be.AtencionOcupacional;
import lissa.be.FichaPsicologicaPsicotecnico;
import lissa.dao.FichaPsicologicaPsicotecnicoDao;

public class FichaPsicologicaPsicotecnicoBl {
    private FichaPsicologicaPsicotecnicoDao dao;
    
    public FichaPsicologicaPsicotecnico registrar(FichaPsicologicaPsicotecnico obj) {
        dao = new FichaPsicologicaPsicotecnicoDao();
        return dao.registrar(obj);
    }

    public FichaPsicologicaPsicotecnico getConclusion(AtencionOcupacional oAtencionOcupacional) {
        dao = new FichaPsicologicaPsicotecnicoDao();
        return dao.getConclusion(oAtencionOcupacional);
    }
}
