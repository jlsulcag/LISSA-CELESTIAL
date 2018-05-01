
package lissa.table;

import lissa.be.SoFmoAbsentismo;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloSoFmoAbsentismo extends AbstractTableModel<SoFmoAbsentismo>{
    
    public ModeloSoFmoAbsentismo() {
        super.setTitles(new String[]{"ID", "Enfermedad/Accidente", "Asociado al Trabajo", "Año", "Días de descanso"});
    }
    
    @Override
    public Object getObjectCell(int fil, int col)  {
        SoFmoAbsentismo bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdsofmoabsentismo(),"######"); 
            case 1: return bean.getEnfermedadAccidente();
            case 2: if(bean.isAsociadoAlTrabajo()){
                        return "SI";
                    }else{
                        return "NO";
                    }            
            case 3: return bean.getAnio();
            case 4: return bean.getDiasDescanso();
            default: return null;
        }
    }
}
