
package lissa.controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import lissa.be.PuestoLaboral;
import lissa.bl.PuestoLaboralBl;
import lissa.gui.JF_Principal;

/**
 *
 * @author JSULCAG
 */
public class PuestoLaboralCtrl {
    private JF_Principal root;
    private PuestoLaboralBl bl;
    

    public PuestoLaboralCtrl(JF_Principal root) {
        this.root = root;
    }

    public void rellenaEvaluacionOcu(JComboBox cbxi) {
        bl = new PuestoLaboralBl();
        cbxi.removeAllItems();
        ArrayList list = bl.listar();
        cbxi.addItem(new PuestoLaboral());
        for (int i = 0; i < list.size(); i++) {
            PuestoLaboral objt = (PuestoLaboral) list.get(i);
            objt.setOp(PuestoLaboral.DATO);
            cbxi.addItem(objt);
        }
        cbxi.setSelectedIndex(0);

    }

    public void recuperaDatosEvaluacionOcu(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }

    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            PuestoLaboral object = (PuestoLaboral) cbxr.getItemAt(i);
            if (i > 0 && object.getIdpuestolaboral() == id) {
                //cbxr.setSelectedIndex(i);
                cbxr.setSelectedItem(object);

            }
        }
    }
}
