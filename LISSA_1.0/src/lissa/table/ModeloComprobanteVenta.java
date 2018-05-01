
package lissa.table;

import lissa.be.Persona;
import lissa.be.Venta;
import lissa.bl.PersonaBl;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

/**
 *
 * @author JSULCAG
 */
public class ModeloComprobanteVenta extends AbstractTableModel<Venta>{
    private PersonaBl oPersonaBl;
    private Persona oPersona;

    public ModeloComprobanteVenta() {
        super.setTitles(new String[]{"Fecha", "Comprobante", "N°", "Cliente", "Importe", "Estado"});
    }

    
    @Override
    public Object getObjectCell(int fil, int col)  {
        Venta bean = get(fil);
        oPersona = new Persona();
        oPersonaBl = new PersonaBl();
        switch(col){
            case 0: return Utilitarios.formatFecha(bean.getFechaVenta());                              
            case 1: return bean.getFarComprobante().getComprobante();
            case 2: return bean.getNumComprobante(); 
            case 3: if(bean.getIdCliente() > 0){
                oPersona = oPersonaBl.buscarPersonaXid(bean.getIdCliente());
                return oPersona.getApellidoPaterno() + " " + 
                    oPersona.getApellidoMaterno() + " " + 
                    oPersona.getNombre(); 
            }else{
                return "";
            }
                
            case 4: return bean.getTotal();
            case 5: return bean.getEstado();
            default: return null;
        }
    }
    
}
