
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.Compra;
import lissa.dao.CompraDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

/**
 *
 * @author JSULCAG
 */
public class CompraBl extends AbstractBL<Compra>{
    private CompraDao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new CompraDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (CompraDao) dao;
    }

    @Override
    public Compra registrar(Compra bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Compra bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Compra bean) {
        return delete(bean);
    }

    @Override
    public List<Compra> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Compra> listar(String hql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Compra> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Compra> listarxIdProveedor(long idproveedor) {
        dao = new CompraDao();
        return dao.listarxIdProveedor(idproveedor);
    }

    public List<Compra> listarXNumComprobante(String num) {
        dao = new CompraDao();
        return dao.listarXNumComprobante(num);
    }
    
}
