
package lissa.table;

import lissa.be.Comprobante;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloAdminComprobante extends AbstractTableModel<Comprobante>{
    public ModeloAdminComprobante() {
        super.setTitles(new String[]{"ID", "Fecha", "Comprobante", "N°", "Importe", "Estado"});
    }

    
    @Override
    public Object getObjectCell(int fil, int col)  {
        Comprobante bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdComprobante(), "######"); 
            case 1: return Utilitarios.formatFecha(bean.getFechaBoleta()); 
            case 2: if(bean.getTipoComprobante().getIdtipocomprobante() == 1){
                return "FACTURA";
            }else if(bean.getTipoComprobante().getIdtipocomprobante() == 2){
                return "BOLETA";
            }else if(bean.getTipoComprobante().getIdtipocomprobante() == 3){
                return "RECIBO";
            }else if(bean.getTipoComprobante().getIdtipocomprobante() == 4){
                return "ORDEN DE ATENCIÓN";
            }else if(bean.getTipoComprobante().getIdtipocomprobante() == 5){
                return "PROFORMA";
            }; 
            case 3: return bean.getNumeroBoleta(); 
            case 4: return bean.getMontoTotal();
            case 5: if(bean.getEstado()){
                return "ACTIVO";
            }else{
                return "ANULADO";
            }
            default: return null;
        }
    }
}
