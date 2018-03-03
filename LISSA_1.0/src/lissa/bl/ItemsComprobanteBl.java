package lissa.bl;

import java.util.ArrayList;
import lissa.be.ItemsComprobante;
import lissa.be.Paciente;
import lissa.dao.ItemsComprobanteDao;

/**
 *
 * @author Jorge Luis Sulca González
 */
public class ItemsComprobanteBl {
    private ItemsComprobanteDao dao;
    
    public ItemsComprobante registrar(ItemsComprobante oItemBoleta) {
        dao = new ItemsComprobanteDao();
        return dao.registrar(oItemBoleta);
    }
    
    public ArrayList<ItemsComprobante> buscarXPaciente(String numeroDocumento) {
        dao = new ItemsComprobanteDao();
        return dao.buscarXPaciente(numeroDocumento);
    }

    public ArrayList<ItemsComprobante> listarServicios(Paciente oPaciente) {
        dao = new ItemsComprobanteDao();
        return dao.listarServicios(oPaciente);
    }
   
}
