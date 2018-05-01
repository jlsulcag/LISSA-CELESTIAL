
package lissa.table;

import lissa.be.DiagnosticoOsteomuscular;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloDxOsteomuscular extends AbstractTableModel<DiagnosticoOsteomuscular>{
    public ModeloDxOsteomuscular() {
        super.setTitles(new String[]{"ID","Diagnóstico"});
    }

    @Override
    public Object getObjectCell(int fil, int col)  {
        DiagnosticoOsteomuscular bean = get(fil);
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIddiagnosticoosteomuscular(),"######"); 
            case 1: return bean.getDiagnostico();
            default: return null;
        }
    }
}
