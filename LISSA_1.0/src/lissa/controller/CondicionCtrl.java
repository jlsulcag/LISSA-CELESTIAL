
package lissa.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import lissa.be.Condicion;
import lissa.bl.CondicionBl;
import lissa.gui.JF_Principal;

public class CondicionCtrl {
    private JF_Principal root;
    private CondicionBl bl;
    

    public CondicionCtrl(JF_Principal root) {
        this.root = root;
    }

    public void rellenaCbx(JComboBox cbxi) {
        bl = new CondicionBl();
        cbxi.removeAllItems();
        List<Condicion> list = bl.listar();
        cbxi.addItem(new Condicion());
        for (Condicion obj : list) {
           obj.setOp(Condicion.DATO);
           cbxi.addItem(obj);
        }
        cbxi.setSelectedIndex(0);

    }

    public void recuperaDatosEvaluacionOcu(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }

    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            Condicion object = (Condicion) cbxr.getItemAt(i);
            if (i > 0 && object.getIdcondicion()== id) {
                //cbxr.setSelectedIndex(i);
                cbxr.setSelectedItem(object);

            }
        }
    }
}
