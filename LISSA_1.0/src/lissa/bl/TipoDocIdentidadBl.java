
package lissa.bl;

import java.util.ArrayList;
import lissa.be.TipoDocIdentidad;
import lissa.dao.TipoDocIdentidadDao;
import org.hibernate.HibernateException;

public class TipoDocIdentidadBl {
    private TipoDocIdentidadDao dao;
    
    public ArrayList<TipoDocIdentidad> listar() throws HibernateException {
        dao = new TipoDocIdentidadDao();
        return dao.listar();
    }
}
