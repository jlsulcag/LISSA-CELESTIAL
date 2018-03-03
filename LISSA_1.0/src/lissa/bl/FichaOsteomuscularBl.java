
package lissa.bl;

import lissa.be.AtencionOcupacional;
import lissa.be.FichaOsteomuscular;
import lissa.dao.FichaOsteomuscularDao;

/**
 *
 * @author JSULCAG
 */
public class FichaOsteomuscularBl {
    private FichaOsteomuscularDao dao;
    
    public FichaOsteomuscular registrar(FichaOsteomuscular obj) {
        dao = new FichaOsteomuscularDao();
        return dao.registrar(obj);
    }

    public String getConclusion(AtencionOcupacional oAtencionOcupacional) {
        dao = new FichaOsteomuscularDao();
        return dao.getConclusion(oAtencionOcupacional);
    }
}
