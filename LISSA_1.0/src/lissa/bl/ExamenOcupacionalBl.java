
package lissa.bl;

import java.util.ArrayList;
import lissa.be.ExamenOcupacional;
import lissa.dao.ExamenOcupacionalDao;
import org.hibernate.HibernateException;

public class ExamenOcupacionalBl {
    private ExamenOcupacionalDao dao;
    
    public ArrayList<ExamenOcupacional> listar() throws HibernateException {
        dao = new ExamenOcupacionalDao();
        return dao.listar();
    }
}
