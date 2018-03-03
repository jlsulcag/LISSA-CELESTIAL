
package lissa.table;

import lissa.be.SoFmoAntecedentesOcupacionales;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloSoFmoAntOcup extends AbstractTableModel<SoFmoAntecedentesOcupacionales>{

    public ModeloSoFmoAntOcup() {
        super.setTitles(new String[]{"ID", "Empresa", "Area de Trabajo", "Ocupación", "Ingreso", "Salida", "Tiempo", "EPP"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        SoFmoAntecedentesOcupacionales bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdsofmoantecedentesocupacionales(),"######"); 
            case 1: return bean.getEmpresa();
            case 2: return bean.getAreaTrabajo();            
            case 3: return bean.getOcupacion();
            case 4: return Utilitarios.formatFecha(bean.getFechaIngreso());
            case 5: return Utilitarios.formatFecha(bean.getFechaSalida());
            case 6: return bean.getTiempo();
            case 7: return bean.getExposicionOcupacional();
            case 8: return bean.getEpp();
            default: return null;
        }
    }
    
}
