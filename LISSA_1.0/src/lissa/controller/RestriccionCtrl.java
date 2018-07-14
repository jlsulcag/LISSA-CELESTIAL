
package lissa.controller;

import java.util.List;
import javax.swing.JComboBox;
import lissa.be.Restriccion;
import lissa.bl.RestriccionBl;
import lissa.gui.JF_Principal;

public class RestriccionCtrl {
    private JF_Principal root;
    private RestriccionBl bl;

    public RestriccionCtrl(JF_Principal root) {
        this.root = root;
    }
    
     public void rellenaCbx(JComboBox cbxi, long idpadre) {
        bl = new RestriccionBl();
        cbxi.removeAllItems();
        List<Restriccion> list = bl.listarXExamen(idpadre);
        cbxi.addItem(new Restriccion());
        for (Restriccion obj : list) {
           obj.setOp(Restriccion.DATO);
           cbxi.addItem(obj);
        }
        cbxi.setSelectedIndex(0);

    }

    public void recuperaDatosEvaluacionOcu(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }

    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            Restriccion object = (Restriccion) cbxr.getItemAt(i);
            if (i > 0 && object.getIdrestriccion()== id) {
                //cbxr.setSelectedIndex(i);
                cbxr.setSelectedItem(object);

            }
        }
    }
    
    
}
