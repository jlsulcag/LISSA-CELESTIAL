
package lissa.controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import lissa.be.HabitoNocivo;
import lissa.bl.HabitoNocivoBl;
import lissa.gui.JF_Principal;

public class HabitoNocivoCtrl {
    private JF_Principal root;
    private HabitoNocivoBl bl;

    public HabitoNocivoCtrl(JF_Principal root) {
        this.root = root;
    }
    
    public void rellenaHabitoNocivo(JComboBox cbxi) {
        bl = new HabitoNocivoBl();
        cbxi.removeAllItems();
        ArrayList list = bl.listar();
        cbxi.addItem(new HabitoNocivo());
        for (int i = 0; i < list.size(); i++) {
            HabitoNocivo objt = (HabitoNocivo) list.get(i);
            objt.setOp(HabitoNocivo.DATO);
            cbxi.addItem(objt);
        }
        cbxi.setSelectedIndex(0);

    }

    public void recuperaDatosHabitoNocivo(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }

    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            HabitoNocivo object = (HabitoNocivo) cbxr.getItemAt(i);
            if (i > 0 && object.getIdhabitonocivo() == id) {
                //cbxr.setSelectedIndex(i);
                cbxr.setSelectedItem(object);

            }
        }
    }
    
}
