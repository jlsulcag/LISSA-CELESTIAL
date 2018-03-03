
package lissa.table;

import lissa.be.Tratamiento;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloTratamiento extends AbstractTableModel<Tratamiento>{
    public ModeloTratamiento() {
        super.setTitles(new String[]{"ID","Tratamiento "});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        Tratamiento bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdtratamiento(),"######"); 
            case 1: return bean.getTratamiento();            
            default: return null;
        }
    }
}
