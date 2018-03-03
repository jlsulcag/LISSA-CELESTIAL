package lissa.table;

import lissa.be.ItemsComprobante;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloProcedimientoMedico extends AbstractTableModel<ItemsComprobante> {

    public ModeloProcedimientoMedico() {
        super.setTitles(new String[]{"ID", "Procedimiento", "Médico", "Importe"});
    }

    @Override
    public Object getObjectCell(int fil, int col) {
        ItemsComprobante bean = get(fil);
        switch (col) {
            case 0:
                return Utilitarios.numberFormat(bean.getIditemcomprobante(), "######");
            case 1:
                return bean.getConcepto();
            case 2:
                if (bean.getMedicoByIdMedicoAtiende() != null) {
                    return bean.getMedicoByIdMedicoAtiende().getPersona().getApellidoPaterno().trim() + " "
                            + bean.getMedicoByIdMedicoAtiende().getPersona().getApellidoMaterno().trim() + " "
                            + bean.getMedicoByIdMedicoAtiende().getPersona().getNombre().trim();
                } else {
                    return "";
                }

            case 3:
                return bean.getMontoPagado();
            default:
                return null;
        }
    }

}
