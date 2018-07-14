
package lissa.bl;

import java.util.ArrayList;
import lissa.be.EvaluacionOcupacional;
import lissa.dao.EvaluacionOcupacionalDao;
import lissa.dao.PuestoLaboralDao;
import org.hibernate.HibernateException;

/**
 *
 * @author JSULCAG
 */
public class PuestoLaboralBl {
    private PuestoLaboralDao dao;
    
    public ArrayList<EvaluacionOcupacional> listar() throws HibernateException {
        dao = new PuestoLaboralDao();
        return dao.listar();
    }
}
