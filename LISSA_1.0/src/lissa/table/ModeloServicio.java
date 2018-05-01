
package lissa.table;
import lissa.be.Persona;
import lissa.be.Servicio;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloServicio extends AbstractTableModel<Servicio>{

    public ModeloServicio() {
        super.setTitles(new String[]{"ID", "SubCategoria", "Servicio", "Importe", "Tarifario"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        Servicio bean = get(fil);        
        switch(col){
//            case 0: return Utilitarios.numberFormat(bean.getIdServicio(),"######"); 
//            case 1: return bean.getSubCategoria();            
//            case 2: return bean.getDenominacion();            
//            case 3: return bean.getCosto();
            case 4: return bean.getTarifario().getNombre();
            default: return null;
        }
    }
    
}
