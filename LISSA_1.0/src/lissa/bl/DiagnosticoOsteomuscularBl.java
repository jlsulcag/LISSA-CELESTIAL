
package lissa.bl;

import lissa.be.DiagnosticoOsteomuscular;
import lissa.dao.DiagnosticoOsteomuscularDao;

/**
 *
 * @author JSULCAG
 */
public class DiagnosticoOsteomuscularBl {
    private DiagnosticoOsteomuscularDao dao;
    
    public DiagnosticoOsteomuscular registrar(DiagnosticoOsteomuscular obj) {
        dao = new DiagnosticoOsteomuscularDao();
        return dao.registrar(obj);
    }
}
