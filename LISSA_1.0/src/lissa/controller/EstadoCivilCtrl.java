
package lissa.controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import lissa.be.PeEstadoCivil;
import lissa.bl.EstadoCivilBl;
import lissa.gui.JF_Principal;

public class EstadoCivilCtrl {
    private JF_Principal root;
    private EstadoCivilBl bl;
    
    public EstadoCivilCtrl(JF_Principal root) {
        this.root = root;
    }
    
    public void rellenaEstadoCivil(JComboBox cbxi) {
        bl = new EstadoCivilBl();
        cbxi.removeAllItems();
        ArrayList list = bl.listar();
        cbxi.addItem(new PeEstadoCivil());
        for (int i = 0; i < list.size(); i++) {
            PeEstadoCivil objt = (PeEstadoCivil) list.get(i);
            objt.setOp(PeEstadoCivil.DATO);
            cbxi.addItem(objt);
        }
        cbxi.setSelectedIndex(0);

    }
    public void recuperaDatosEstadoCivil(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }
    
    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            PeEstadoCivil object = (PeEstadoCivil) cbxr.getItemAt(i);
            if (i > 0 && object.getIdpeestadocivil()== id) {
                //cbxr.setSelectedIndex(i); o
                cbxr.setSelectedItem(object);

            }
        }
    }
}
