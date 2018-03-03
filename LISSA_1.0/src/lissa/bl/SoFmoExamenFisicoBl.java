
package lissa.bl;

import lissa.be.SoFmoExamenFisico;
import lissa.dao.SoFmoExamenFisicoDao;

public class SoFmoExamenFisicoBl {
    private SoFmoExamenFisicoDao dao;
    
    public SoFmoExamenFisico registrar(SoFmoExamenFisico obj) {
        dao = new SoFmoExamenFisicoDao();
        return dao.registrar(obj);
    }
}
