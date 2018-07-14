
package lissa.table;

import lissa.be.CmoRecomendaciones;
import lissa.be.Recomendacion;
import lissa.bl.RecomendacionBl;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloRecomendacion extends AbstractTableModel<CmoRecomendaciones>{
    private RecomendacionBl bl;
    private Recomendacion obj;
    public ModeloRecomendacion() {
        super.setTitles(new String[]{"ID","Recomendaciones"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        CmoRecomendaciones bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdcmorecomendacion(),"######"); 
            case 1: obj = new Recomendacion();
            bl = new RecomendacionBl();
            obj = bl.buscar(bean.getIdRecomendacion());
            if(obj!= null){
                return obj.getDescipcion().trim();
            }else{
                return "";
            }
            default: return null;
        }
    }
}
