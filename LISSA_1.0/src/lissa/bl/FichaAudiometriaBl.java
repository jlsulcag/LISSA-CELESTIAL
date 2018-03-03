
package lissa.bl;

import lissa.be.AtencionOcupacional;
import lissa.be.FichaAudiometria;
import lissa.dao.FichaAudiometriaDao;

public class FichaAudiometriaBl {
    private FichaAudiometriaDao dao;
    
    public FichaAudiometria registrar(FichaAudiometria obj) {
        dao = new FichaAudiometriaDao();
        return dao.registrar(obj);
    }

    public String getConclusion(AtencionOcupacional oAtencionOcupacional) {
        dao = new FichaAudiometriaDao();
        return dao.getConclusion(oAtencionOcupacional);
    }
}
