
package lissa.bl;

import lissa.be.FichaMedicoOcupacional;
import lissa.dao.FichaMedicoOcupDao;

public class FichaMedicoOcupBl {
    private FichaMedicoOcupDao dao;
    
    public FichaMedicoOcupacional registrar(FichaMedicoOcupacional obj) {
        dao = new FichaMedicoOcupDao();
        return dao.registrar(obj);
    }

    public int generarNumeroFicha() {
        dao = new FichaMedicoOcupDao();
        return dao.generarNumeroFicha();
    }
}
