
package lissa.table;

import lissa.be.Paciente;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloPaciente extends AbstractTableModel<Paciente>{
    public ModeloPaciente() {
        super.setTitles(new String[]{"ID","N° Ingreso", "Fecha", "Tipo Atencion"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        Paciente bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdpaciente(),"######"); 
            case 1: return Utilitarios.numberFormat(bean.getNumeroAtencion(), "######");
            case 2: return Utilitarios.formatFecha(bean.getFechaIngreso());
            case 3: return bean.getTipoIngreso();
            default: return null;
        }
    }
}
