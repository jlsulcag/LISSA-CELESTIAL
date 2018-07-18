
package lissa.table;

import lissa.be.CmoRecomendaciones;
import lissa.be.CmoRecomendaciones2;
import lissa.be.Recomendacion;
import lissa.bl.RecomendacionBl;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloRecomendacion2 extends AbstractTableModel<CmoRecomendaciones2>{
    private RecomendacionBl bl;
    private Recomendacion obj;
    public ModeloRecomendacion2() {
        super.setTitles(new String[]{"ID","Recomendaciones"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        CmoRecomendaciones2 bean = get(fil);        
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
