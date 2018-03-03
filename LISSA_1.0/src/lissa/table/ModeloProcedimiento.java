
package lissa.table;

import lissa.be.Procedimiento;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloProcedimiento extends AbstractTableModel<Procedimiento>{
    
    public ModeloProcedimiento() {
        super.setTitles(new String[]{"ID", "Servicio", "Procedimiento", "Costo"});
    }

    @Override
    public Object getObjectCell(int fil, int col) {
        Procedimiento bean = get(fil);
        switch (col) {
            case 0:
                return Utilitarios.numberFormat(bean.getIdprocedimiento(), "######");
            case 1:
                return bean.getServicio().getDenominacion();
            case 2:
                return bean.getDenominacion();
            case 3:
                return bean.getCosto();
            default:
                return null;
        }
    }
}
