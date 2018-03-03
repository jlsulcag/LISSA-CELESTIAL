package lissa.bl;

import java.util.ArrayList;
import lissa.be.TipoComprobante;
import lissa.dao.TipoComprobanteDao;

/**
 *
 * @author Jorge Luis Sulca González
 */
public class TipoComprobanteBl {
    private TipoComprobanteDao dao;

    public ArrayList<TipoComprobante> listar() {
        dao = new TipoComprobanteDao();
        return dao.listar();
    }
    
}
