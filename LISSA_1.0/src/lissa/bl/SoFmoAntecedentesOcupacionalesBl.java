
package lissa.bl;

import java.util.ArrayList;
import lissa.be.AtencionOcupacional;
import lissa.be.HistoriaClinica;
import lissa.be.SoFmoAntecedentesOcupacionales;
import lissa.dao.SoFmoAntecedentesOcupacionalesDao;

public class SoFmoAntecedentesOcupacionalesBl {
    private SoFmoAntecedentesOcupacionalesDao dao;
    
    public SoFmoAntecedentesOcupacionales registrar(SoFmoAntecedentesOcupacionales obj) {
        dao = new SoFmoAntecedentesOcupacionalesDao();
        return dao.registrar(obj);
    }
    
    public ArrayList<SoFmoAntecedentesOcupacionales> listar(HistoriaClinica obj) {
        dao = new SoFmoAntecedentesOcupacionalesDao();
        return dao.listar(obj);
    }
}
