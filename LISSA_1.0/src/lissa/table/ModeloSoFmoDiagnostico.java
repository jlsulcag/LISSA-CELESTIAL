
package lissa.table;

import lissa.be.SoFmoDiagnosticos;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloSoFmoDiagnostico extends  AbstractTableModel<SoFmoDiagnosticos>{
    public ModeloSoFmoDiagnostico() {
        super.setTitles(new String[]{"ID", "Diagnostico", "CIE-10", "P", "D", "R"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        SoFmoDiagnosticos bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdsofmodiagnosticos(),"######"); 
            case 1: return bean.getDescripcion();
            case 2: return bean.getIdCie10();
            case 3: return bean.isP();
            case 4: return bean.isD();
            case 5: return bean.isR();
            default: return null;
        }
    }
}
