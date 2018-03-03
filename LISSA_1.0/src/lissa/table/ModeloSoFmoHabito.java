
package lissa.table;

import lissa.be.SoFmoHabitos;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloSoFmoHabito extends AbstractTableModel<SoFmoHabitos>{
    
    public ModeloSoFmoHabito() {
        super.setTitles(new String[]{"ID", "Habito", "Tipo", "Cantidad", "Frecuencia"});
    }
    
    @Override
    public Object getObjectCell(int fil, int col)  {
        SoFmoHabitos bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdsofmohabitos(),"######"); 
            case 1: return bean.getHabitoNocivo().getHabito();
            case 2: return bean.getTipo();            
            case 3: return bean.getCantidad();
            case 4: return bean.getFrecuencia();
            default: return null;
        }
    }
}
