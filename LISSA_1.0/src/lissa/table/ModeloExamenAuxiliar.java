
package lissa.table;

import lissa.be.ExamenAuxiliar;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloExamenAuxiliar extends AbstractTableModel<ExamenAuxiliar>{
    public ModeloExamenAuxiliar() {
        super.setTitles(new String[]{"ID","Examen Auxiliar"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        ExamenAuxiliar bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdexamenauxiliar(),"######"); 
            case 1: return bean.getExamen();            
            default: return null;
        }
    }
}
