
package lissa.table;

import lissa.be.DetalleKardex;
import lissa.util.Utilitarios;
import org.rx.cr.table.AbstractTableModel;

public class ModeloKardexAlmacen extends AbstractTableModel<DetalleKardex>{
    public ModeloKardexAlmacen() {
        super.setTitles(new String[]{"Fecha","Documento", "Tipo Operación", "Movimiento", "Origen", "Destino", "Stock Anterior", "Cantidad", "Stock Actual"});
    }    
    
    @Override
    public Object getObjectCell(int fil, int col)  {
        DetalleKardex bean = get(fil);
        switch(col){
            case 0: return Utilitarios.formatFecha(bean.getKardex().getFechaMov()); 
            case 1: return bean.getKardex().getComprobante();
            case 2: return bean.getKardex().getTipoOperacion();
            case 3: return bean.getKardex().getOperacion();
            case 4:if(bean.getKardex().getAlmacenByIdOrigen() != null){
                return bean.getKardex().getAlmacenByIdOrigen().getNombre();
            } else{
                return "-";
            }              
            
            case 5: if(bean.getKardex().getAlmacenByIdDestino()!= null){
                return bean.getKardex().getAlmacenByIdDestino().getNombre();
            }else{
                return "-";
            } 
            case 6: if(bean.getKardex().getAlmacenByIdOrigen() != null && bean.getKardex().getAlmacenByIdDestino() == null){
                return bean.getStockAntOrig();
            }else if(bean.getKardex().getAlmacenByIdDestino() != null && bean.getKardex().getAlmacenByIdOrigen() == null){
                return bean.getStockAnt();
            }else if(bean.getKardex().getAlmacenByIdOrigen() != null && bean.getKardex().getAlmacenByIdDestino() != null){
                if(bean.getKardex().getAlmacenByIdAlmacenAfectado().getNombre().equals("ALMACEN")){
                    return bean.getStockAntOrig();
                }else{
                    return bean.getStockAnt();
                }
                
            }else if(bean.getKardex().getAlmacenByIdOrigen() == null && bean.getKardex().getAlmacenByIdDestino() == null){
                if(bean.getKardex().getAlmacenByIdAlmacenAfectado().getNombre().equals("ALMACEN")){
                    return bean.getStockAntOrig();
                }else{
                    return bean.getStockAnt();
                }
            }
            case 7: return bean.getCantidad();            
            case 8: if(bean.getKardex().getAlmacenByIdOrigen() != null && bean.getKardex().getAlmacenByIdDestino() == null){
                return bean.getStockActOrig();
            }else if(bean.getKardex().getAlmacenByIdDestino() != null && bean.getKardex().getAlmacenByIdOrigen() == null){
                return bean.getStockActual();
            }else if(bean.getKardex().getAlmacenByIdOrigen() != null && bean.getKardex().getAlmacenByIdDestino() != null){
                if(bean.getKardex().getAlmacenByIdAlmacenAfectado().getNombre().equals("ALMACEN")){
                    return bean.getStockActOrig();
                }else{
                    return bean.getStockActual();
                }
                
            }else if(bean.getKardex().getAlmacenByIdOrigen() == null && bean.getKardex().getAlmacenByIdDestino() == null){
                if(bean.getKardex().getAlmacenByIdAlmacenAfectado().getNombre().equals("ALMACEN")){
                    return bean.getStockActOrig();
                }else{
                    return bean.getStockActual();
                }
            }
            default: return null;
        }
    }
}
