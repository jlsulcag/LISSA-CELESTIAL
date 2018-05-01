package lissa.table;

import lissa.be.AlmacenProducto;
import lissa.util.Utilitarios;
import org.rx.cr.gui.table.AbstractTableModel;

public class ModeloBusqProducto extends AbstractTableModel<AlmacenProducto> {

    public ModeloBusqProducto() {
        super.setTitles(new String[]{"ID", "Producto y/o descripción", "Laboratorio", "Presentación", "Stock", "Lote", "Vencimiento", "Precio Venta", "Ubicacion"});
    }

    @Override
    public Object getObjectCell(int fil, int col) {
        AlmacenProducto bean = get(fil);
        switch (col) {
            case 0:
                return Utilitarios.numberFormat(bean.getIdalmacenproducto(), "######");
            case 1:
                return bean.getProducto().getNombre();
            case 2:
                if (bean.getProducto().getLaboratorio() != null) {
                    return bean.getProducto().getLaboratorio().getDenominacion();
                } else {
                    return "";
                }
            case 3:
                if (bean.getProducto().getPresentacion() != null) {
                    return bean.getProducto().getPresentacion().getDenominacion();
                } else {
                    return "";
                }
            case 4:
                return bean.getStockActual();
            case 5:
                return bean.getLote();
            case 6:
                if (bean.getFechaVencimiento() != null) {
                    return Utilitarios.formatFecha(bean.getFechaVencimiento());
                } else {
                    return "";
                }
            case 7:
                return bean.getPrecioVenta();
            case 8:
                return bean.getAlmacen().getNombre();
            default:
                return null;
        }
    }
}
