
package lissa.table;

import lissa.be.CmoObservaciones;
import lissa.be.MotivoObservacion;
import lissa.bl.MotivoObservacionBl;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloObservacion extends AbstractTableModel<CmoObservaciones>{
    private MotivoObservacionBl bl;
    private MotivoObservacion obj;
    public ModeloObservacion() {
        super.setTitles(new String[]{"ID","Observaciones"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        CmoObservaciones bean = get(fil);        
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
