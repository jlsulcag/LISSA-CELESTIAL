
package lissa.table;

import lissa.be.Cita;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloCita extends AbstractTableModel<Cita>{
    public ModeloCita() {
        super.setTitles(new String[]{"ID","Fecha", "Inicio", "Finaliza", "Paciente", "Medico", "Servicio", "Estado"});
    }
    @Override
    public Object getObjectCell(int fil, int col)  {
        Cita bean = get(fil);        
        switch(col){
            case 0: return Utilitarios.numberFormat(bean.getIdcita(),"######"); 
            case 1: return Utilitarios.formatFecha(bean.getFecha());
            case 2: return bean.getHoraInicio();
            case 3: return bean.getHoraFin();
            case 4: return bean.getPersona().getNombre().trim() + " " + bean.getPersona().getApellidoPaterno().trim() + " " + bean.getPersona().getApellidoMaterno().trim();
            case 5: return bean.getMedico().getPersona().getNombre().trim() + " " + bean.getMedico().getPersona().getApellidoPaterno().trim() + " " + bean.getMedico().getPersona().getApellidoMaterno().trim();
            case 6: return bean.getServicio();
            case 7: return bean.getEstado();
            default: return null;
        }
    }
}
