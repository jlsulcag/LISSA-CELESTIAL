
package lissa.table;


import lissa.be.MedicoDerivaAtiende;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloMedicoDerivaAtiende extends AbstractTableModel<MedicoDerivaAtiende>{
   public ModeloMedicoDerivaAtiende(){
        super.setTitles(new String[]{"N°","Fecha","N° Doc","Medico","Servicio","Monto","Estado"});  
   }

   @Override
   public Object getObjectCell(int fil, int col) {
        MedicoDerivaAtiende bean = get(fil);
        switch(col){
            case 0:return Utilitarios.numberFormat(bean.getIdmedicoderivaatiende(), "####");
            case 1:return Utilitarios.formatFecha(bean.getItemsComprobante().getComprobante().getFechaBoleta());
            case 2:return bean.getItemsComprobante().getComprobante().getNumeroBoleta();
            case 3:return bean.getMedico().getPersona().getNombre().trim()+" "+bean.getMedico().getPersona().getApellidoPaterno().trim()+" "+bean.getMedico().getPersona().getApellidoMaterno().trim();
            case 4:return bean.getItemsComprobante().getConcepto();
            case 5:return bean.getMonto();
            case 6:return bean.getEstadoPago();
            default:return null;
        }
   }
}
