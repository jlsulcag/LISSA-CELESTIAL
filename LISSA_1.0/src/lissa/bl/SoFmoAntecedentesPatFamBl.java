
package lissa.bl;

import lissa.be.AtencionOcupacional;
import lissa.be.SoFmoAntecedentesPatFam;
import lissa.dao.SoFmoAntecedentesPatFamDao;

public class SoFmoAntecedentesPatFamBl {
    private SoFmoAntecedentesPatFamDao dao;
    
    public SoFmoAntecedentesPatFam registrar(SoFmoAntecedentesPatFam obj) {
        dao = new SoFmoAntecedentesPatFamDao();
        return dao.registrar(obj);
    }

    public SoFmoAntecedentesPatFam buscarAntPatPer(AtencionOcupacional oAtencionOcupacional) {
        dao = new SoFmoAntecedentesPatFamDao();
        return dao.buscarAntPatPer(oAtencionOcupacional);
    }
}
