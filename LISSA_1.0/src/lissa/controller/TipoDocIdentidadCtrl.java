
package lissa.controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import lissa.be.TipoDocIdentidad;
import lissa.bl.TipoDocIdentidadBl;
import lissa.gui.JF_Principal;

public class TipoDocIdentidadCtrl {
    private JF_Principal root;
    private TipoDocIdentidadBl bl;
    
    public TipoDocIdentidadCtrl(JF_Principal root) {
        this.root = root;
    }
    
    public void rellenaTipoDocumento(JComboBox cbxi) {
        bl = new TipoDocIdentidadBl();
        cbxi.removeAllItems();
        ArrayList list = bl.listar();
        cbxi.addItem(new TipoDocIdentidad());
        for (int i = 0; i < list.size(); i++) {
            TipoDocIdentidad objt = (TipoDocIdentidad) list.get(i);
            objt.setOp(TipoDocIdentidad.DATO);
            cbxi.addItem(objt);
        }
        cbxi.setSelectedIndex(0);

    }
    public void recuperaDatosTipoDocumento(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }
    
    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            TipoDocIdentidad object = (TipoDocIdentidad) cbxr.getItemAt(i);
            if (i > 0 && object.getIdtipodocidentidad() == id) {
                //cbxr.setSelectedIndex(i); o
                cbxr.setSelectedItem(object);

            }
        }
    }
    
    
}
