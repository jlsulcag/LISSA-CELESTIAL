
package lissa.table;
import lissa.be.ItemsComprobante;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloConsulta extends AbstractTableModel<ItemsComprobante>{

    public ModeloConsulta() {
        super.setTitles(new String[]{"ID", "Fecha", "N° Comprobante", "Consulta"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        ItemsComprobante bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIditemcomprobante(),"######"); 
            case 1: return bean.getComprobante().getFechaBoleta();                    
            case 2: return Utilitarios.numberFormat(bean.getComprobante().getNumeroBoleta(), "############");
            //case 3: return bean.getServicio().getDenominacion();
            default: return null;
        }
    }
    
}
