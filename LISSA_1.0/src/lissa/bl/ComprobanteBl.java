package lissa.bl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import lissa.be.Caja;
import lissa.be.Comprobante;
import lissa.be.Paciente;
import lissa.be.Persona;
import lissa.be.TipoComprobante;
import lissa.dao.ComprobanteDao;

/**
 *
 * @author Jorge Luis Sulca González
 */
public class ComprobanteBl {

    private ComprobanteDao dao;
    private ArrayList<Comprobante> list;

    public Comprobante registrar(Comprobante oBoleta) {
        dao = new ComprobanteDao();
        return dao.registrar(oBoleta);
    }

    public Comprobante buscarXnumDoc(int ref) {
        dao = new ComprobanteDao();
        return dao.buscarXnumDoc(ref);
    }

    public ArrayList<Comprobante> buscarXtipoDoc(String ref) {
        dao = new ComprobanteDao();
        list = dao.buscarXtipoDoc(ref);
        return list;
    }

    public ArrayList<Comprobante> buscarXfecha(Date ref) {
        dao = new ComprobanteDao();
        list = dao.buscarXfecha(ref);
        return list;
    }

    public void actualizar(Comprobante obj) {
        dao = new ComprobanteDao();
        dao.actualizar(obj);
    }

    public Comprobante buscarXPaciente(String numeroDocumento) {
        dao = new ComprobanteDao();
        return dao.buscarXPaciente(numeroDocumento);
    }

    public ArrayList<Comprobante> buscarXNombre(String nombres) {
        dao = new ComprobanteDao();
        return dao.buscarXNombre(nombres);
    }

    public BigDecimal calcuatTotalRecibo(Caja oCaja) {
        dao = new ComprobanteDao();
        return dao.calcuatTotalRecibo(oCaja);
    }

    public BigDecimal calcularTotalBoleta(Caja oCaja) {
        dao = new ComprobanteDao();
        return dao.calcularTotalBoleta(oCaja);
    }

    public BigDecimal calcularTotalFactura(Caja oCaja) {
        dao = new ComprobanteDao();
        return dao.calcularTotalFactura(oCaja);
    }

    public ArrayList<Comprobante> listarAtencionFondo(Caja oCaja) {
        dao = new ComprobanteDao();
        return dao.listarAtencionFondo(oCaja);
    }

    public void cerrarSesion() {
        dao = new ComprobanteDao();
        dao.cerrarSesion();
    }

    public Comprobante buscarXnumDoc(Integer numeroBoleta, TipoComprobante tipoComprobante) {
        dao = new ComprobanteDao();
        return dao.buscarXnumDoc(numeroBoleta, tipoComprobante);
    }

    public ArrayList<Comprobante> listar(Persona per) {
        dao = new ComprobanteDao();
        return dao.listar(per);
    }
}
