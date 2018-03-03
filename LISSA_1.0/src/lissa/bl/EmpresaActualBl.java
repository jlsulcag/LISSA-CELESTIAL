
package lissa.bl;

import java.util.ArrayList;
import lissa.be.EmpresaActual;
import lissa.dao.EmpresaActualDao;

public class EmpresaActualBl {
    private EmpresaActualDao dao;
    private ArrayList<EmpresaActual> list;
    
    public EmpresaActual registrar(EmpresaActual bean) {
        dao = new EmpresaActualDao();
        return dao.registrar(bean);
    }
}
