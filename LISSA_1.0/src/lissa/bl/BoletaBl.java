
package lissa.bl;

import lissa.dao.BoletaDao;

public class BoletaBl {
    BoletaDao dao;
    
    public Integer obtenerUltNumero(int id) {
        dao = new BoletaDao();
        return dao.obtenerUltNumero(id);
    }

    public int obtenerNumeroOperacion() {
        dao = new BoletaDao();
        return dao.obtenerNumeroOperacion();
    }

}
