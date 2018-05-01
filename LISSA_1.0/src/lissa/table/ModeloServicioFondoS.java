package lissa.table;

import lissa.be.ServicioFondoSolidaridad;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloServicioFondoS extends AbstractTableModel<ServicioFondoSolidaridad>{

    public ModeloServicioFondoS() {
        super.setTitles(new String[]{"ID", "Servicio", "Atención"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        ServicioFondoSolidaridad bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdServicioFs(),"######"); 
            //case 1: return bean.getItemsComprobante().getServicio().getDenominacion();
            case 2: return Utilitarios.formatFecha(bean.getFechaAtencion());
            default: return null;
        }
    }
    
}
