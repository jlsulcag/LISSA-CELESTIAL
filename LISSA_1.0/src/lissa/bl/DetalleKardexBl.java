
package lissa.bl;

import java.util.ArrayList;
import java.util.List;
import lissa.be.DetalleKardex;
import lissa.dao.DetalleKardexDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class DetalleKardexBl extends AbstractBL<DetalleKardex>{
    private DetalleKardexDao dao;
   
    @Override
    public AbstractDA getDAO() {
        dao = new DetalleKardexDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (DetalleKardexDao) dao;
    }

    @Override
    public DetalleKardex registrar(DetalleKardex bean) {
        return save(bean);
    }

    @Override
    public int actualizar(DetalleKardex bean) {
        return update(bean);
    }

    @Override
    public int eliminar(DetalleKardex bean) {
        return delete(bean);
    }

    @Override
    public List<DetalleKardex> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DetalleKardex> listar(String hql) {
        dao = new DetalleKardexDao();
        return dao.listar(hql);
    }

    @Override
    public List<DetalleKardex> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleKardex buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleKardex buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        return maxId();
    }
    
    public ArrayList<DetalleKardex> kardexXalmacen(String almacen, String producto){
        dao = new DetalleKardexDao();
        return dao.kardexXalmacen(almacen, producto);
    }

    public int maxNumMov() {
        dao = new DetalleKardexDao();
        return dao.maxNumMov();
    }
    
}
