
package lissa.table;

import lissa.be.Especialidad;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloEspecialidad  extends AbstractTableModel<Especialidad>{

    public ModeloEspecialidad() {
        super.setTitles(new String[]{"ID","Especialidad"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        Especialidad bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdEspecialidad(),"######"); 
            case 1: return bean.getDenominacion();            
            default: return null;
        }
    }
    
}
