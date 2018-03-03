
package lissa.bl;

import lissa.be.AtencionOcupacional;
import lissa.be.FichaOftalmologica;
import lissa.dao.FichaOftalmologicaDao;

/**
 *
 * @author JSULCAG
 */
public class FichaOftalmologicaBl {
    private FichaOftalmologicaDao dao;
    
    public FichaOftalmologica registrar(FichaOftalmologica obj) {
        dao = new FichaOftalmologicaDao();
        return dao.registrar(obj);
    }

    public String getConclusion(AtencionOcupacional oAtencionOcupacional) {
        dao = new FichaOftalmologicaDao();
        return dao.getConclusion(oAtencionOcupacional);
    }
}
