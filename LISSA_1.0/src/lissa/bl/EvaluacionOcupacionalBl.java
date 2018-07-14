
package lissa.bl;

import java.util.ArrayList;
import lissa.be.EvaluacionOcupacional;
import lissa.dao.EvaluacionOcupacionalDao;
import org.hibernate.HibernateException;

public class EvaluacionOcupacionalBl {
    private EvaluacionOcupacionalDao dao;
    
    public ArrayList<EvaluacionOcupacional> listar() throws HibernateException {
        dao = new EvaluacionOcupacionalDao();
        return dao.listar();
    }
}
