
package lissa.bl;

import java.sql.SQLException;
import java.util.ArrayList;
import lissa.be.Ubigeo;
import lissa.dao.UbigeoDao;

public class UbigeoBl {
    private UbigeoDao dao;
    
    public ArrayList<Ubigeo> listarDepartamentos() throws SQLException{
        dao = new UbigeoDao();
        return dao.listarDepartamentos();
    }

    public ArrayList<Ubigeo> listarProvincias(Ubigeo ubigeo) {
        dao = new UbigeoDao();
        return dao.listarProvincias(ubigeo);
    }

    public ArrayList<Ubigeo> listarDistritos(Ubigeo ubigeo) {
        dao = new UbigeoDao();
        return dao.listarDistritos(ubigeo);
    }

    public Ubigeo obtenerIdUbigeoSelect(Ubigeo ubigeo, Ubigeo ubigeo0, Ubigeo ubigeo1) {
        dao = new UbigeoDao();
        return dao.obtenerIdUbigeoSelect(ubigeo, ubigeo0, ubigeo1);
    }

    public Ubigeo buscarXId(int idubigeo) {
        dao = new UbigeoDao();
        return dao.buscarXId(idubigeo);
    }
}
