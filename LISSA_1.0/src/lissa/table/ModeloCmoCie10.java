
package lissa.table;

import lissa.be.Cie10;
import lissa.be.CmoCie10;
import lissa.bl.Cie10Bl;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloCmoCie10 extends AbstractTableModel<CmoCie10>{
    private Cie10 oCie10;
    private Cie10Bl oCie10Bl;
    public ModeloCmoCie10() {
        super.setTitles(new String[]{"ID","Código", "Descripción"});
    }

    
    @Override
    public Object getObjectCell(int fil, int col)  {
        CmoCie10 bean = get(fil);        
        switch(col){
            case 0: return bean.getIdcmocie10();
            case 1: oCie10 = new Cie10();
            oCie10Bl = new Cie10Bl();
            oCie10 = oCie10Bl.buscar(bean.getIdCie10());
            if(oCie10 != null){
                return oCie10.getCodigo();
            }else{
                return "";
            }
            case 2: oCie10 = new Cie10();
            oCie10Bl = new Cie10Bl();
            oCie10 = oCie10Bl.buscar(bean.getIdCie10());
            if(oCie10 != null){
                return oCie10.getDescripcion();
            }else{
                return "";
            }
            default: return null;
        }
    }
}
