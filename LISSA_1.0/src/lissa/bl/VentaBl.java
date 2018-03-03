
package lissa.bl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lissa.be.Caja;
import lissa.be.Venta;
import lissa.dao.VentaDao;
import lissa.util.AbstractBL;
import lissa.util.AbstractDA;

public class VentaBl extends AbstractBL<Venta>{
    private VentaDao dao;
    
    @Override
    public AbstractDA getDAO() {
        dao = new VentaDao();
        return dao;
    }

    @Override
    public void setDA(AbstractDA dao) {
        this.dao = (VentaDao) dao;
    }

    @Override
    public Venta registrar(Venta bean) {
        return save(bean);
    }

    @Override
    public int actualizar(Venta bean) {
        return update(bean);
    }

    @Override
    public int eliminar(Venta bean) {
        return delete(bean);
    }

    @Override
    public List<Venta> listar() {
        return list();
    }

    @Override
    public ArrayList<Venta> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<Venta> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venta buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venta buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public long obtenerUltNumero(int id) {
        dao = new VentaDao();
        return dao.obtenerUltNumero(id);
    }
    public int obtenerNumOperacion() {
        dao = new VentaDao();
        return dao.obtenerNumOperacion();
    }

//    public int obtenerNumeroOperacion() {
//        dao = new VentaDao();
//        return dao.obtenerNumeroOperacion();
//    }
    public BigDecimal calcularTotalBoleta(Caja oCaja) {
        dao = new VentaDao();
        return dao.calcularTotalBoleta(oCaja);
    }
    public BigDecimal calcularTotalFactura(Caja oCaja) {
        dao = new VentaDao();
        return dao.calcularTotalFactura(oCaja);
    }

    public List<Venta> listarxIdCliente(int idPersona) {
        dao = new VentaDao();
        return dao.listarxIdCliente(idPersona);
    }
    public List<Venta> listarAll() {
        dao = new VentaDao();
        return dao.listarAll();
    }

    public List<Venta> listarXNumComprobante(String num) {
        dao = new VentaDao();
        return dao.listarXNumComprobante(num);
    }
}
