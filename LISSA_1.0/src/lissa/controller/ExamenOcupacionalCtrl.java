
package lissa.controller;

import java.util.List;
import javax.swing.JComboBox;
import lissa.be.ExamenOcupacional;
import lissa.bl.ExamenOcupacionalBl;
import lissa.gui.JF_Principal;

public class ExamenOcupacionalCtrl {
    private JF_Principal root;
    private ExamenOcupacionalBl bl;

    public ExamenOcupacionalCtrl(JF_Principal root) {
        this.root = root;
    }
    
    public void rellenaCbx(JComboBox cbxi) {
        bl = new ExamenOcupacionalBl();
        cbxi.removeAllItems();
        List<ExamenOcupacional> list = bl.listar();
        cbxi.addItem(new ExamenOcupacional());
        for (ExamenOcupacional obj : list) {
           obj.setOp(ExamenOcupacional.DATO);
           cbxi.addItem(obj);
        }
        cbxi.setSelectedIndex(0);

    }

    public void recuperaDatosEvaluacionOcu(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }

    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            ExamenOcupacional object = (ExamenOcupacional) cbxr.getItemAt(i);
            if (i > 0 && object.getIdexamenocupacional()== id) {
                //cbxr.setSelectedIndex(i);
                cbxr.setSelectedItem(object);

            }
        }
    }
    
    
}
