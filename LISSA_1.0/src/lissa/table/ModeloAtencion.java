
package lissa.table;

import lissa.be.Atencion;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloAtencion extends AbstractTableModel<Atencion>{
    public ModeloAtencion() {
        super.setTitles(new String[]{"ID","Fecha", "Hora"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        Atencion bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdAtencion(),"######"); 
            case 1: return Utilitarios.formatFecha(bean.getFechaAtencion());
            case 2: return bean.getHoraAtencion();
            default: return null;
        }
    }
}
