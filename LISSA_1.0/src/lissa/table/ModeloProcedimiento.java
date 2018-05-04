package lissa.table;

import lissa.be.Procedimiento;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloProcedimiento extends AbstractTableModel<Procedimiento> {

    public ModeloProcedimiento() {
        super.setTitles(new String[]{"ID", "Tarifario", "Servicio", "Procedimiento", "Costo"});
    }

    @Override
    public Object getObjectCell(int fil, int col) {
        Procedimiento bean = get(fil);
        switch (col) {
            case 0:
                return Utilitarios.numberFormat(bean.getIdprocedimiento(), "######");
            case 1:
                return bean.getServicio().getTarifario().getNombre();
            case 2:
                return bean.getServicio().getDenominacion();
            case 3:
                return bean.getDenominacion();
            case 4:
                return bean.getCosto();
            default:
                return null;
        }
    }
}
