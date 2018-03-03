
package lissa.bl;

import lissa.be.PacientePrueba;
import lissa.dao.PacientePruebaDao;

public class PacientePruebaBl {
    private PacientePruebaDao dao;
    
    public PacientePrueba registrar(PacientePrueba obj) {
        dao = new PacientePruebaDao();
        return dao.registrar(obj);
    }
}
