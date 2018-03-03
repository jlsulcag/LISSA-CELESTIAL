package lissa.controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import lissa.be.EvaluacionOcupacional;
import lissa.bl.EvaluacionOcupacionalBl;
import lissa.gui.JF_Principal;

public class EvaluacionOcuCtrl {

    private JF_Principal root;
    private EvaluacionOcupacionalBl bl;

    public EvaluacionOcuCtrl(JF_Principal root) {
        this.root = root;
    }

    public void rellenaEvaluacionOcu(JComboBox cbxi) {
        bl = new EvaluacionOcupacionalBl();
        cbxi.removeAllItems();
        ArrayList list = bl.listar();
        cbxi.addItem(new EvaluacionOcupacional());
        for (int i = 0; i < list.size(); i++) {
            EvaluacionOcupacional objt = (EvaluacionOcupacional) list.get(i);
            objt.setOp(EvaluacionOcupacional.DATO);
            cbxi.addItem(objt);
        }
        cbxi.setSelectedIndex(0);

    }

    public void recuperaDatosEvaluacionOcu(int id, JComboBox jcbx) {
        selectComboGenerico(id, jcbx);
    }

    private void selectComboGenerico(int id, JComboBox cbxr) {
        for (int i = 0; i < cbxr.getItemCount(); i++) {
            EvaluacionOcupacional object = (EvaluacionOcupacional) cbxr.getItemAt(i);
            if (i > 0 && object.getIdevaluacionocupacional() == id) {
                //cbxr.setSelectedIndex(i);
                cbxr.setSelectedItem(object);

            }
        }
    }
}
