
package lissa.controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import lissa.be.ExamenOcupacional;
import lissa.bl.ExamenOcupacionalBl;
import lissa.gui.JF_Principal;

public class ExamenOcupCtrl {
    private JF_Principal root;
    private ExamenOcupacionalBl bl;

    public ExamenOcupCtrl(JF_Principal root) {
        this.root = root;
    }
    
    public void rellenaExamenOcu(JComboBox cbxi) {
        bl = new ExamenOcupacionalBl();
        cbxi.removeAllItems();
        ArrayList list = bl.listar();
        cbxi.addItem(new ExamenOcupacional());
        for (int i = 0; i < list.size(); i++) {
            ExamenOcupacional objt = (ExamenOcupacional) list.get(i);
            objt.setOp(ExamenOcupacional.DATO);
            cbxi.addItem(objt);
        }
        cbxi.setSelectedIndex(0);

    }
    public void recuperaExamenOcu(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }
    
    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            ExamenOcupacional object = (ExamenOcupacional) cbxr.getItemAt(i);
            if (i > 0 && object.getIdexamenocupacional()== id) {
                //cbxr.setSelectedIndex(i); o
                cbxr.setSelectedItem(object);

            }
        }
    }
    
}
