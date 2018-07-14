
package lissa.controller;

import java.util.List;
import javax.swing.JComboBox;
import lissa.be.MotivoObservacion;
import lissa.bl.MotivoObservacionBl;
import lissa.gui.JF_Principal;

public class MotivoObservacionCtrl {
    private JF_Principal root;
    private MotivoObservacionBl bl;

    public MotivoObservacionCtrl(JF_Principal root) {
        this.root = root;
    }
    
    public void rellenaCbx(JComboBox cbxi, long idpadre) {
        bl = new MotivoObservacionBl();
        cbxi.removeAllItems();
        List<MotivoObservacion> list = bl.listarxExamen(idpadre);
        cbxi.addItem(new MotivoObservacion());
        for (MotivoObservacion obj : list) {
           obj.setOp(MotivoObservacion.DATO);
           cbxi.addItem(obj);
        }
        cbxi.setSelectedIndex(0);

    }

    public void recuperaDatosEvaluacionOcu(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }

    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            MotivoObservacion object = (MotivoObservacion) cbxr.getItemAt(i);
            if (i > 0 && object.getIdmotivoobservacion()== id) {
                //cbxr.setSelectedIndex(i);
                cbxr.setSelectedItem(object);

            }
        }
    }
    
}
