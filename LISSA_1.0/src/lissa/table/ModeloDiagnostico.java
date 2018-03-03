
package lissa.table;

import lissa.be.Diagnostico;
import org.rx.cr.table.AbstractTableModel;

public class ModeloDiagnostico extends AbstractTableModel<Diagnostico>{
    public ModeloDiagnostico() {
        super.setTitles(new String[]{"N°","Diagnóstico", "Código CIE-10", "Descripción CIE-10"});
    }
    
    @Override
    public Object getObjectCell(int fil, int col)  {
        Diagnostico bean = get(fil);        
        switch(col){
            case 0: return bean.getIddiagnostico();
            case 1: return bean.getDiagnostico();
            case 2: return bean.getCie10().getCodigo();
            case 3: return bean.getCie10().getDescripcion();
            default: return null;
        }
    }
}
