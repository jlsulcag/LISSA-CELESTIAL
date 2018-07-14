
package lissa.controller;

import java.util.List;
import javax.swing.JComboBox;
import lissa.be.Recomendacion;
import lissa.bl.RecomendacionBl;
import lissa.gui.JF_Principal;

public class RecomendacionCtrl {
    private JF_Principal root;
    private RecomendacionBl bl;

    public RecomendacionCtrl(JF_Principal root) {
        this.root = root;
    }
    
    public void rellenaCbx(JComboBox cbxi, long idpadre) {
        bl = new RecomendacionBl();
        cbxi.removeAllItems();
        List<Recomendacion> list = bl.listarxExamen(idpadre);
        cbxi.addItem(new Recomendacion());
        for (Recomendacion obj : list) {
           obj.setOp(Recomendacion.DATO);
           cbxi.addItem(obj);
        }
        cbxi.setSelectedIndex(0);

    }

    public void recuperaDatosEvaluacionOcu(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }

    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            Recomendacion object = (Recomendacion) cbxr.getItemAt(i);
            if (i > 0 && object.getIdrecomendacion()== id) {
                //cbxr.setSelectedIndex(i);
                cbxr.setSelectedItem(object);

            }
        }
    }
    
}
