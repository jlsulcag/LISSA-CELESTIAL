
package lissa.bl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lissa.be.Almacen;
import lissa.be.AlmacenProducto;
import lissa.be.Producto;
import lissa.dao.AlmacenProductoDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class AlmacenProductoBl extends AbstractBL<AlmacenProducto>{
    private AlmacenProductoDao dao;
    @Override
    public AbstractDA getDAO() {
        dao = new AlmacenProductoDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (AlmacenProductoDao) dao;
    }

    @Override
    public AlmacenProducto registrar(AlmacenProducto bean) {
        return save(bean);
    }

    @Override
    public int actualizar(AlmacenProducto bean) {
        return update(bean);
    }

    @Override
    public int eliminar(AlmacenProducto bean) {
        return delete(bean);
    }
    
    public long buscar(int idproducto, int idalmacen){
        dao = new AlmacenProductoDao();
        return dao.buscar(idproducto, idalmacen);
    }

    @Override
    public List<AlmacenProducto> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AlmacenProducto> listar(String hql) {
        dao = new AlmacenProductoDao();
        return dao.listar(hql);
    }

    @Override
    public List<AlmacenProducto> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
    }

    @Override
    public AlmacenProducto buscar(long id) {
        return search(id);
    }

    @Override
    public AlmacenProducto buscar(String ref) {
        return search(ref);
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<AlmacenProducto> listRef(String ref, String almacen) {
        dao = new AlmacenProductoDao();
        return dao.listRef(ref,almacen);
    }
    
    public ArrayList<AlmacenProducto> listXAlmacen(String almacen) {
        dao = new AlmacenProductoDao();
        return dao.listXAlmacen(almacen);
    }

    public AlmacenProducto buscarProductoxAlmacenyLote(String lote, Almacen almacen, Producto oProducto) {
        dao = new AlmacenProductoDao();
        return dao.buscarProductoxAlmacenyLote(lote, almacen, oProducto);
    }
    
    public ArrayList<AlmacenProducto> listStockxAlmacenProducto(String almacen, String producto) {
        dao = new AlmacenProductoDao();
        return dao.listStockxAlmacenProducto(almacen, producto);
    }

    public ArrayList<AlmacenProducto> listarProductosPorVencer(int dias) {
        dao = new AlmacenProductoDao();
        return dao.listarProductosPorVencer(dias);
    }
    public ArrayList<AlmacenProducto> listarProductosPorFechaVencimiento(Date fecha) {
        dao = new AlmacenProductoDao();
        return dao.listarProductosPorFechaVencimiento(fecha);
    }
    
    public List<AlmacenProducto> listarProductosVencidos() {
        dao = new AlmacenProductoDao();
        return dao.listarProductosVencidos();
    }

    
}
