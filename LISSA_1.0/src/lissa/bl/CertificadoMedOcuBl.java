
package lissa.bl;

import lissa.be.CertificadoMedicoOcupacional;
import lissa.dao.CertificadoMedOcupDao;

public class CertificadoMedOcuBl {
    private CertificadoMedOcupDao dao;
    
    public CertificadoMedicoOcupacional registrar(CertificadoMedicoOcupacional obj) {
        dao = new CertificadoMedOcupDao();
        return dao.registrar(obj);
    }
}
