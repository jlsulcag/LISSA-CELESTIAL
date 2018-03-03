
package lissa.bl;

import lissa.be.Articulacion;
import lissa.dao.ArticulacionDao;

/**
 *
 * @author JSULCAG
 */
public class ArticulacionBl {
    private ArticulacionDao dao;
    
    public Articulacion registrar(Articulacion obj) {
        dao = new ArticulacionDao();
        return dao.registrar(obj);
    }
}
