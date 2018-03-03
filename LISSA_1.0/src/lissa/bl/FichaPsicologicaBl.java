
package lissa.bl;

import lissa.be.AtencionOcupacional;
import lissa.be.FichaPsicologica;
import lissa.dao.FichaPsicologicaDao;

public class FichaPsicologicaBl {
    private FichaPsicologicaDao dao;
    
    public FichaPsicologica registrar(FichaPsicologica obj) {
        dao = new FichaPsicologicaDao();
        return dao.registrar(obj);
    }

    public FichaPsicologica getConclusion(AtencionOcupacional oAtencionOcupacional) {
        dao = new FichaPsicologicaDao();
        return dao.getConclusion(oAtencionOcupacional);
    }
}
