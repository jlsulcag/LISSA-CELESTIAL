
package lissa.controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import lissa.be.Especialidad;
import lissa.bl.EspecialidadBl;
import lissa.gui.JF_Principal;

public class EspecialidadCtrl {
    private JF_Principal root;
    private EspecialidadBl bl;

    public EspecialidadCtrl(JF_Principal root) {
        this.root = root;
    }
    
    public void rellenaCbx(JComboBox cbxi) {
        bl = new EspecialidadBl();
        cbxi.removeAllItems();
        ArrayList list = bl.listar();
        cbxi.addItem(new Especialidad());
        for (int i = 0; i < list.size(); i++) {
            Especialidad objt = (Especialidad) list.get(i);
            objt.setOp(Especialidad.DATO);
            cbxi.addItem(objt);
        }
        cbxi.setSelectedIndex(0);

    }
    public void recuperaDatos(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }
    
    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            Especialidad object = (Especialidad) cbxr.getItemAt(i);
            if (i > 0 && object.getIdEspecialidad()== id) {
                //cbxr.setSelectedIndex(i); o
                cbxr.setSelectedItem(object);

            }
        }
    }
    
}
