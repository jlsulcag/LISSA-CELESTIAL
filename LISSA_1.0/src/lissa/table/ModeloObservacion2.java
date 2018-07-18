
package lissa.table;

import lissa.be.CmoObservaciones;
import lissa.be.CmoObservaciones2;
import lissa.be.MotivoObservacion;
import lissa.bl.MotivoObservacionBl;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloObservacion2 extends AbstractTableModel<CmoObservaciones2>{
    private MotivoObservacionBl bl;
    private MotivoObservacion obj;
    public ModeloObservacion2() {
        super.setTitles(new String[]{"ID","Observaciones"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        CmoObservaciones2 bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdcmoobservaciones(),"######"); 
            case 1: obj = new MotivoObservacion();
            bl = new MotivoObservacionBl();
            obj = bl.buscar(bean.getIdObservacion());
            if(obj!= null){
                return obj.getDescripcion().trim();
            }else{
                return "";
            }
            default: return null;
        }
    }
}
