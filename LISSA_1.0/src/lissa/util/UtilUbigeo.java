package lissa.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import lissa.be.Ubigeo;
import lissa.bl.UbigeoBl;
import lissa.gui.JF_Principal;

public class UtilUbigeo {

    private JF_Principal root = null;
    private String defaultRegion;
    private String defaultProvincia;
    private String defaultDistrito;
    private Ubigeo oUbigeo = null;
    private UbigeoBl oUbigeoBl = null;

    public UtilUbigeo(JF_Principal root) {
        this.root = root;
    }

    public void recuperarDatosUbigeo(int idubigeo, JComboBox cbxDepartamento, JComboBox cbxProvincia, JComboBox cbxDistrito) {
        oUbigeo = new Ubigeo();
        oUbigeoBl = new UbigeoBl();
        oUbigeo = oUbigeoBl.buscarXId(idubigeo);
        if (oUbigeo != null) {
            defaultSelectUbigeo(oUbigeo.getNombreRegion(), oUbigeo.getNombreProvincia(), oUbigeo.getNombreDistrito(), cbxDepartamento, cbxProvincia, cbxDistrito);
        }
    }

    public void defaultSelectUbigeo(String nombreRegion, String nombreProvincia, String nombreDistrito, JComboBox cbxDepartamento, JComboBox cbxProvincia, JComboBox cbxDistrito) {
        setDefaultRegion(nombreRegion);
        setDefaultProvincia(nombreProvincia);
        setDefaultDistrito(nombreDistrito);
        rellenaUbigeo(cbxDepartamento, cbxProvincia, cbxDistrito, getDefaultRegion(), getDefaultProvincia(), getDefaultDistrito());
    }

    public void eventoComboRegion(JComboBox cbxr, JComboBox cbxp, JComboBox cbxd, String reg, String prob, String dist) {
        if (!cbxp.isPopupVisible()) {
            if (cbxr.getItemCount() > 1) {
                if (cbxr.getSelectedIndex() > 0) {
                    Ubigeo obj = (Ubigeo) cbxr.getSelectedItem();
                    rellenaProvincias(cbxr, cbxp, cbxd, reg, prob, dist);
                } else if (cbxr.getSelectedIndex() == 0) {
                    cbxp.removeAllItems();
                    cbxd.removeAllItems();
                    cbxp.addItem(new Ubigeo());
                    cbxd.addItem(new Ubigeo());
                }

            }
        }
    }

    public void eventoComboProvincia(JComboBox cbxr, JComboBox cbxp, JComboBox cbxd, String reg, String prob, String dist) {
        if (!cbxd.isPopupVisible()) {
            if (cbxp.getItemCount() > 1) {
                if (cbxp.getSelectedIndex() > 0 && cbxr.getSelectedIndex() > 0) {
                    Ubigeo obj = (Ubigeo) cbxp.getSelectedItem();
                    rellenaDistritos(cbxr, cbxp, cbxd, reg, prob, dist);
                } else if (cbxp.getSelectedIndex() == 0) {
                    cbxd.removeAllItems();
                    cbxd.addItem(new Ubigeo());
                }

            }
        }
    }

    public void eventoComboDistrito(JComboBox cbxr, JComboBox cbxp, JComboBox cbxd, String reg, String prob, String dist) {
        if (!cbxp.isPopupVisible()) {
            if (cbxd.getItemCount() > 1) {
                if (cbxr.getSelectedIndex() > 0 && cbxp.getSelectedIndex() > 0 && cbxd.getSelectedIndex() > 0) {
                    Ubigeo obj = (Ubigeo) cbxd.getSelectedItem();
                } else if (cbxd.getSelectedIndex() == 0) {

                }
            }
        }
    }

    public void rellenaDepartamentos(JComboBox cbxr, JComboBox cbxp, JComboBox cbxd, String reg, String prob, String dist) {

        try {
            oUbigeoBl = new UbigeoBl();
            oUbigeo = new Ubigeo();

            oUbigeoBl.listarDepartamentos();
            cbxr.removeAllItems();
            cbxp.removeAllItems();
            cbxp.addItem(new Ubigeo());
            cbxd.removeAllItems();
            cbxd.addItem(new Ubigeo());
            cbxr.addItem(new Ubigeo());
            ArrayList list = oUbigeoBl.listarDepartamentos();
            for (int i = 0; i < list.size(); i++) {
                oUbigeo = (Ubigeo) list.get(i);
                oUbigeo.setOp(Ubigeo.DTO);
                cbxr.addItem(oUbigeo);
            }
            cbxr.setSelectedIndex(0);
            selectDefaultRegion(cbxr, cbxp, cbxd, reg, prob, dist);
        } catch (SQLException ex) {
            Logger.getLogger(UtilUbigeo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void rellenaProvincias(JComboBox cbxr, JComboBox cbxp, JComboBox cbxd, String reg, String prob, String dist) {
        oUbigeoBl = new UbigeoBl();
        oUbigeo = new Ubigeo();
        cbxp.removeAllItems();
        oUbigeo = (Ubigeo) cbxr.getSelectedItem();
        oUbigeoBl.listarProvincias(oUbigeo);
        cbxp.removeAllItems();
        cbxp.addItem(new Ubigeo());
        ArrayList list = oUbigeoBl.listarProvincias(oUbigeo);
        for (int i = 0; i < list.size(); i++) {
            oUbigeo = (Ubigeo) list.get(i);
            oUbigeo.setOp(Ubigeo.PROV);
            cbxp.addItem(oUbigeo);
        }
        cbxd.removeAllItems();
        cbxd.addItem(new Ubigeo());
        cbxp.setSelectedIndex(0);
        selectDefaultProvincia(cbxr, cbxp, cbxd, reg, prob, dist);

    }

    public void rellenaDistritos(JComboBox cbxr, JComboBox cbxp, JComboBox cbxd, String reg, String prob, String dist) {
        oUbigeoBl = new UbigeoBl();
        oUbigeo = new Ubigeo();
        Ubigeo bean2 = null;

        cbxd.removeAllItems();
        oUbigeo = (Ubigeo) cbxr.getSelectedItem();
        bean2 = (Ubigeo) cbxp.getSelectedItem();
        oUbigeoBl.listarDistritos(bean2);
        cbxd.removeAllItems();
        cbxd.addItem(new Ubigeo());
        ArrayList list = oUbigeoBl.listarDistritos(bean2);
        for (int i = 0; i < list.size(); i++) {
            oUbigeo = (Ubigeo) list.get(i);
            oUbigeo.setOp(Ubigeo.DIST);
            cbxd.addItem(list.get(i));
        }
        cbxd.setSelectedIndex(0);
        selectDefaultDistrito(cbxr, cbxp, cbxd, reg, prob, dist);

    }

    private void rellenaUbigeo(JComboBox cbxDepartamento, JComboBox cbxProvincia, JComboBox cbxDistrito, String defaultRegion, String defaultProvincia, String defaultDistrito) {
        try {
            oUbigeoBl = new UbigeoBl();
            oUbigeo = new Ubigeo();
            oUbigeoBl.listarDepartamentos();
            cbxDepartamento.removeAllItems();
            cbxProvincia.removeAllItems();
            cbxProvincia.addItem(new Ubigeo());
            cbxDistrito.removeAllItems();
            cbxDistrito.addItem(new Ubigeo());
            cbxDepartamento.addItem(new Ubigeo());
            ArrayList list = oUbigeoBl.listarDepartamentos();
            for (int i = 0; i < list.size(); i++) {
                Ubigeo bean = (Ubigeo) list.get(i);
                bean.setOp(Ubigeo.DTO);
                cbxDepartamento.addItem(bean);
            }
            cbxDepartamento.setSelectedIndex(0);
            selectDefaultRegion(cbxDepartamento, cbxProvincia, cbxDistrito, defaultRegion, defaultProvincia, defaultDistrito);
        } catch (SQLException ex) {
            Logger.getLogger(UtilUbigeo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDefaultRegion() {
        return defaultRegion;
    }

    public void setDefaultRegion(String defaultRegion) {
        this.defaultRegion = defaultRegion;
    }

    public String getDefaultProvincia() {
        return defaultProvincia;
    }

    public void setDefaultProvincia(String defaultProvincia) {
        this.defaultProvincia = defaultProvincia;
    }

    public String getDefaultDistrito() {
        return defaultDistrito;
    }

    public void setDefaultDistrito(String defaultDistrito) {
        this.defaultDistrito = defaultDistrito;
    }

    private void selectDefaultRegion(JComboBox cbxDepartamento, JComboBox cbxProvincia, JComboBox cbxDistrito, String defaultRegion, String defaultProvincia, String defaultDistrito) {
        for (int i = 0; i < cbxDepartamento.getItemCount(); i++) {
            Ubigeo object = (Ubigeo) cbxDepartamento.getItemAt(i);
            if (i > 0 && object.toString().toLowerCase().trim().equals(getDefaultRegion().toLowerCase().trim())) {
                //cbxr.setSelectedIndex(i); o
                cbxDepartamento.setSelectedItem(object);

            }
        }
    }

    public void selectDefaultProvincia(JComboBox cbxr, JComboBox cbxp, JComboBox cbxd, String reg, String prob, String dist) {
        for (int i = 0; i < cbxp.getItemCount(); i++) {
            Ubigeo object = (Ubigeo) cbxp.getItemAt(i);
            if (i > 0 && object.toString().toLowerCase().trim().equals(prob.toLowerCase().trim())) {
                //cbxp.setSelectedIndex(i); o
                cbxp.setSelectedItem(object);
            }
        }
    }

    public void selectDefaultDistrito(JComboBox cbxr, JComboBox cbxp, JComboBox cbxd, String reg, String prob, String dist) {
        for (int i = 0; i < cbxd.getItemCount(); i++) {
            Ubigeo object = (Ubigeo) cbxd.getItemAt(i);
            if (object.toString().toLowerCase().trim().equals(dist.toLowerCase().trim())) {
                //cbxd.setSelectedIndex(i); o
                cbxd.setSelectedItem(object);

            }
        }

    }

}
