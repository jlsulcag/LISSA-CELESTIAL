
package lissa.table;
import lissa.be.Persona;
import lissa.be.Servicio;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloAdminServicio extends AbstractTableModel<Servicio>{

    public ModeloAdminServicio() {
        super.setTitles(new String[]{"ID", "Categoria", "Sub Categoria", "Servicio", "Importe", "Tarifario"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        Servicio bean = get(fil);        
        switch(col){
//            case 0: return Utilitarios.numberFormat(bean.getIdServicio(),"######");
//            case 1: return bean.getCategoria();
//            case 2: return bean.getSubCategoria();
//            case 3: return bean.getDenominacion();
//            case 4: return bean.getCosto();
            case 5: return bean.getTarifario().getNombre();
            default: return null;
        }
    }
    
}
