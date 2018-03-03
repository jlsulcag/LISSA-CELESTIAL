
package lissa.bl;

import lissa.be.AtencionOcupacional;
import lissa.be.SoFmoAntecedentesPatPer;
import lissa.dao.SoFmoAntecedentesdPatPerDao;

public class SoFmoAntecedentesPatPerBl {
    private SoFmoAntecedentesdPatPerDao dao;
    
    public SoFmoAntecedentesPatPer registrar(SoFmoAntecedentesPatPer obj) {
        dao = new SoFmoAntecedentesdPatPerDao();
        return dao.registrar(obj);
    }

    public SoFmoAntecedentesPatPer buscarAntPatPer(AtencionOcupacional oAtencionOcupacional) {
        dao = new SoFmoAntecedentesdPatPerDao();
        return dao.buscarAntPatPer(oAtencionOcupacional);
    }
}
