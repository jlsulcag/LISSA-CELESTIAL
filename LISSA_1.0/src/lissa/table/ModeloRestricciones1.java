
package lissa.table;

import lissa.be.FmoRestricciones;
import lissa.be.Restriccion;
import lissa.bl.RestriccionBl;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloRestricciones1 extends AbstractTableModel<FmoRestricciones>{
    private RestriccionBl bl;
    private Restriccion obj;
    public ModeloRestricciones1() {
        super.setTitles(new String[]{"ID","Restricciones"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        FmoRestricciones bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdfmorestricciones(),"######"); 
            case 1: obj = new Restriccion();
            bl = new RestriccionBl();
            obj = bl.buscar(bean.getIdRestriccion());
            if(obj!= null){
                return obj.getDescripcion().trim();
            }else{
                return "";
            }
            default: return null;
        }
    }
    
}
