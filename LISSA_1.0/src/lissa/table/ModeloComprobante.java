
package lissa.table;

import lissa.be.Comprobante;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloComprobante extends AbstractTableModel<Comprobante>{

    public ModeloComprobante() {
        super.setTitles(new String[]{"Fecha", "Comprobante", "N°", "Paciente", "Importe"});
    }

    
    @Override
    public Object getObjectCell(int fil, int col)  {
        Comprobante bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.formatFecha(bean.getFechaBoleta());                              
            case 1: return bean.getTipoComprobante().getDenominacion();
            case 2: return bean.getNumeroBoleta(); 
            case 3: return bean.getPaciente().getPersona().getApellidoPaterno() + " " + 
                    bean.getPaciente().getPersona().getApellidoMaterno() + " " + 
                    bean.getPaciente().getPersona().getNombre(); 
            case 4: return bean.getMontoTotal();
            default: return null;
        }
    }
    
}
