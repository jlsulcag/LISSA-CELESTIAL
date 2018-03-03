package lissa.gui.saludocupacional;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lissa.be.Articulacion;
import lissa.be.AtencionOcupacional;
import lissa.be.DiagnosticoOsteomuscular;
import lissa.be.FichaOsteomuscular;
import lissa.be.Persona;
import lissa.be.Rol;
import lissa.be.Usuario;
import lissa.bl.ArticulacionBl;
import lissa.bl.DiagnosticoOsteomuscularBl;
import lissa.bl.FichaOsteomuscularBl;
import lissa.ds.DSConeccion;
import lissa.gui.JF_Principal;
import lissa.reportes.ReportGeneric;
import lissa.table.ModeloDxOsteomuscular;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

public class JPanel_EvaluacionOsteomuscular extends javax.swing.JPanel {

    private JF_Principal root;

    private FichaOsteomuscular oFichaOsteomuscular;
    private FichaOsteomuscularBl oFichaOsteomuscularBl;
    private Articulacion oArticulacion;
    private ArticulacionBl oArticulacionBl;
    private DiagnosticoOsteomuscular oDiagnosticoOsteomuscular;
    private DiagnosticoOsteomuscularBl oDiagnosticoOsteomuscularBl;
    private ModeloDxOsteomuscular oModeloDxOsteomuscular;

    private AtencionOcupacional oAtencionOcupacional;
    private Usuario userTemp;
    private Persona perTemp;
    private Rol rolTemp;

    private ReportGeneric reportGenric = null;
    private JPanel reportPanel = null;
    private DSConeccion ds = null;
    private JInternalFrame reportVisor = null;

    public JPanel_EvaluacionOsteomuscular(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloDxOsteomuscular = new ModeloDxOsteomuscular();
        tblDx.setModel(oModeloDxOsteomuscular);
        personalizarVistaTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel18 = new javax.swing.JPanel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jPanel19 = new javax.swing.JPanel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel21 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jPanel16 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jPanel24 = new javax.swing.JPanel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jPanel25 = new javax.swing.JPanel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jCheckBox15 = new javax.swing.JCheckBox();
        jPanel29 = new javax.swing.JPanel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jPanel39 = new javax.swing.JPanel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jPanel40 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jCheckBox19 = new javax.swing.JCheckBox();
        jPanel47 = new javax.swing.JPanel();
        jCheckBox20 = new javax.swing.JCheckBox();
        jPanel41 = new javax.swing.JPanel();
        jCheckBox21 = new javax.swing.JCheckBox();
        jPanel35 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jCheckBox22 = new javax.swing.JCheckBox();
        jPanel43 = new javax.swing.JPanel();
        jCheckBox23 = new javax.swing.JCheckBox();
        jPanel44 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jCheckBox24 = new javax.swing.JCheckBox();
        jPanel49 = new javax.swing.JPanel();
        jCheckBox25 = new javax.swing.JCheckBox();
        jPanel45 = new javax.swing.JPanel();
        jCheckBox26 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel53 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel54 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel70 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel65 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel73 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel87 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel89 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel92 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPanel93 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel96 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel97 = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        jPanel100 = new javax.swing.JPanel();
        jPanel109 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel101 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel102 = new javax.swing.JPanel();
        jPanel103 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jPanel110 = new javax.swing.JPanel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jPanel111 = new javax.swing.JPanel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jPanel104 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jPanel80 = new javax.swing.JPanel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel105 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        jPanel107 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jPanel83 = new javax.swing.JPanel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jPanel108 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jPanel86 = new javax.swing.JPanel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jPanel112 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel114 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jPanel124 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel116 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jPanel117 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jPanel119 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jPanel120 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel121 = new javax.swing.JPanel();
        jPanel122 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel123 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jPanel125 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel127 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel144 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel142 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jPanel143 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jPanel130 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jPanel131 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jCheckBox76 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        jPanel149 = new javax.swing.JPanel();
        jCheckBox89 = new javax.swing.JCheckBox();
        jCheckBox90 = new javax.swing.JCheckBox();
        jPanel150 = new javax.swing.JPanel();
        jCheckBox91 = new javax.swing.JCheckBox();
        jCheckBox92 = new javax.swing.JCheckBox();
        jPanel151 = new javax.swing.JPanel();
        jCheckBox93 = new javax.swing.JCheckBox();
        jCheckBox94 = new javax.swing.JCheckBox();
        jPanel152 = new javax.swing.JPanel();
        jCheckBox95 = new javax.swing.JCheckBox();
        jCheckBox96 = new javax.swing.JCheckBox();
        jPanel153 = new javax.swing.JPanel();
        jCheckBox97 = new javax.swing.JCheckBox();
        jCheckBox98 = new javax.swing.JCheckBox();
        jPanel154 = new javax.swing.JPanel();
        jCheckBox99 = new javax.swing.JCheckBox();
        jCheckBox100 = new javax.swing.JCheckBox();
        jPanel155 = new javax.swing.JPanel();
        jCheckBox101 = new javax.swing.JCheckBox();
        jCheckBox102 = new javax.swing.JCheckBox();
        jPanel132 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jPanel133 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel156 = new javax.swing.JPanel();
        jCheckBox103 = new javax.swing.JCheckBox();
        jCheckBox104 = new javax.swing.JCheckBox();
        jPanel157 = new javax.swing.JPanel();
        jCheckBox105 = new javax.swing.JCheckBox();
        jCheckBox106 = new javax.swing.JCheckBox();
        jPanel158 = new javax.swing.JPanel();
        jCheckBox107 = new javax.swing.JCheckBox();
        jCheckBox108 = new javax.swing.JCheckBox();
        jPanel159 = new javax.swing.JPanel();
        jCheckBox109 = new javax.swing.JCheckBox();
        jCheckBox110 = new javax.swing.JCheckBox();
        jPanel160 = new javax.swing.JPanel();
        jCheckBox111 = new javax.swing.JCheckBox();
        jCheckBox112 = new javax.swing.JCheckBox();
        jPanel161 = new javax.swing.JPanel();
        jCheckBox113 = new javax.swing.JCheckBox();
        jCheckBox114 = new javax.swing.JCheckBox();
        jPanel162 = new javax.swing.JPanel();
        jCheckBox115 = new javax.swing.JCheckBox();
        jCheckBox116 = new javax.swing.JCheckBox();
        jPanel163 = new javax.swing.JPanel();
        jCheckBox117 = new javax.swing.JCheckBox();
        jCheckBox118 = new javax.swing.JCheckBox();
        jPanel134 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jPanel135 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel164 = new javax.swing.JPanel();
        jCheckBox119 = new javax.swing.JCheckBox();
        jCheckBox120 = new javax.swing.JCheckBox();
        jPanel165 = new javax.swing.JPanel();
        jCheckBox121 = new javax.swing.JCheckBox();
        jCheckBox122 = new javax.swing.JCheckBox();
        jPanel166 = new javax.swing.JPanel();
        jCheckBox123 = new javax.swing.JCheckBox();
        jCheckBox124 = new javax.swing.JCheckBox();
        jPanel167 = new javax.swing.JPanel();
        jCheckBox125 = new javax.swing.JCheckBox();
        jCheckBox126 = new javax.swing.JCheckBox();
        jPanel168 = new javax.swing.JPanel();
        jCheckBox127 = new javax.swing.JCheckBox();
        jCheckBox128 = new javax.swing.JCheckBox();
        jPanel169 = new javax.swing.JPanel();
        jCheckBox129 = new javax.swing.JCheckBox();
        jCheckBox130 = new javax.swing.JCheckBox();
        jPanel170 = new javax.swing.JPanel();
        jCheckBox131 = new javax.swing.JCheckBox();
        jCheckBox132 = new javax.swing.JCheckBox();
        jPanel171 = new javax.swing.JPanel();
        jCheckBox133 = new javax.swing.JCheckBox();
        jCheckBox134 = new javax.swing.JCheckBox();
        jPanel136 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jPanel137 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jPanel172 = new javax.swing.JPanel();
        jCheckBox135 = new javax.swing.JCheckBox();
        jCheckBox136 = new javax.swing.JCheckBox();
        jPanel173 = new javax.swing.JPanel();
        jCheckBox137 = new javax.swing.JCheckBox();
        jCheckBox138 = new javax.swing.JCheckBox();
        jPanel174 = new javax.swing.JPanel();
        jCheckBox139 = new javax.swing.JCheckBox();
        jCheckBox140 = new javax.swing.JCheckBox();
        jPanel175 = new javax.swing.JPanel();
        jCheckBox141 = new javax.swing.JCheckBox();
        jCheckBox142 = new javax.swing.JCheckBox();
        jPanel176 = new javax.swing.JPanel();
        jCheckBox143 = new javax.swing.JCheckBox();
        jCheckBox144 = new javax.swing.JCheckBox();
        jPanel177 = new javax.swing.JPanel();
        jCheckBox145 = new javax.swing.JCheckBox();
        jCheckBox146 = new javax.swing.JCheckBox();
        jPanel178 = new javax.swing.JPanel();
        jCheckBox147 = new javax.swing.JCheckBox();
        jCheckBox148 = new javax.swing.JCheckBox();
        jPanel179 = new javax.swing.JPanel();
        jCheckBox149 = new javax.swing.JCheckBox();
        jCheckBox150 = new javax.swing.JCheckBox();
        jPanel138 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jPanel139 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel180 = new javax.swing.JPanel();
        jCheckBox151 = new javax.swing.JCheckBox();
        jCheckBox152 = new javax.swing.JCheckBox();
        jPanel181 = new javax.swing.JPanel();
        jCheckBox153 = new javax.swing.JCheckBox();
        jCheckBox154 = new javax.swing.JCheckBox();
        jPanel182 = new javax.swing.JPanel();
        jCheckBox155 = new javax.swing.JCheckBox();
        jCheckBox156 = new javax.swing.JCheckBox();
        jPanel183 = new javax.swing.JPanel();
        jCheckBox157 = new javax.swing.JCheckBox();
        jCheckBox158 = new javax.swing.JCheckBox();
        jPanel184 = new javax.swing.JPanel();
        jCheckBox159 = new javax.swing.JCheckBox();
        jCheckBox160 = new javax.swing.JCheckBox();
        jPanel185 = new javax.swing.JPanel();
        jCheckBox161 = new javax.swing.JCheckBox();
        jCheckBox162 = new javax.swing.JCheckBox();
        jPanel186 = new javax.swing.JPanel();
        jCheckBox163 = new javax.swing.JCheckBox();
        jCheckBox164 = new javax.swing.JCheckBox();
        jPanel187 = new javax.swing.JPanel();
        jCheckBox165 = new javax.swing.JCheckBox();
        jCheckBox166 = new javax.swing.JCheckBox();
        jPanel140 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jPanel141 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jPanel188 = new javax.swing.JPanel();
        jCheckBox167 = new javax.swing.JCheckBox();
        jCheckBox168 = new javax.swing.JCheckBox();
        jPanel189 = new javax.swing.JPanel();
        jCheckBox169 = new javax.swing.JCheckBox();
        jCheckBox170 = new javax.swing.JCheckBox();
        jPanel190 = new javax.swing.JPanel();
        jCheckBox171 = new javax.swing.JCheckBox();
        jCheckBox172 = new javax.swing.JCheckBox();
        jPanel191 = new javax.swing.JPanel();
        jCheckBox173 = new javax.swing.JCheckBox();
        jCheckBox174 = new javax.swing.JCheckBox();
        jPanel192 = new javax.swing.JPanel();
        jCheckBox175 = new javax.swing.JCheckBox();
        jCheckBox176 = new javax.swing.JCheckBox();
        jPanel193 = new javax.swing.JPanel();
        jCheckBox177 = new javax.swing.JCheckBox();
        jCheckBox178 = new javax.swing.JCheckBox();
        jPanel194 = new javax.swing.JPanel();
        jCheckBox179 = new javax.swing.JCheckBox();
        jCheckBox180 = new javax.swing.JCheckBox();
        jPanel195 = new javax.swing.JPanel();
        jCheckBox181 = new javax.swing.JCheckBox();
        jCheckBox182 = new javax.swing.JCheckBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jCheckBox27 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jTextField62 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblDx = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel126 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txaConclusiones = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(202, 237, 228));

        jPanel1.setBackground(new java.awt.Color(202, 237, 228));

        jPanel2.setBackground(new java.awt.Color(202, 237, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "I. ANAMNESIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(202, 237, 228));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel15.setText("Postura :");

        jLabel7.setText("Sedente");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 1.0d));

        jLabel4.setText("%");

        jLabel8.setText("Bipodestación");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 1.0d));

        jLabel9.setText("%");

        jLabel3.setText("¿Postura forzada?");

        jRadioButton1.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Si");
        jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jRadioButton4.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("No");
        jRadioButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel5.setText("¿Movimientos repetitivos?");

        jRadioButton2.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Si");
        jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jRadioButton5.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("No");
        jRadioButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel7))
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(202, 237, 228));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setText("¿Movimiento manual de cargas?");

        jRadioButton3.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup3.add(jRadioButton3);
        jRadioButton3.setText("Si");
        jRadioButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("No");
        jRadioButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel16.setText("Peso :");

        jLabel2.setText("Entre:");

        jLabel10.setText("Kg.");

        jLabel11.setText("y");

        jLabel12.setText("Kg.");

        jLabel17.setText("Método :");

        jCheckBox1.setBackground(new java.awt.Color(202, 237, 228));
        jCheckBox1.setText("Levanta");
        jCheckBox1.setEnabled(false);

        jCheckBox2.setBackground(new java.awt.Color(202, 237, 228));
        jCheckBox2.setText("Empuja");
        jCheckBox2.setEnabled(false);

        jCheckBox3.setBackground(new java.awt.Color(202, 237, 228));
        jCheckBox3.setText("Arrastra");
        jCheckBox3.setEnabled(false);

        jLabel13.setText("¿Usuario de pantalla de visualización de datos (PVD)?");

        jRadioButton7.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup4.add(jRadioButton7);
        jRadioButton7.setText("Si");
        jRadioButton7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jRadioButton8.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setText("No");
        jRadioButton8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel14.setText("N° de Horas/Dia");

        jLabel18.setText("Dominancia :");

        jCheckBox4.setBackground(new java.awt.Color(202, 237, 228));
        jCheckBox4.setText("Diestro");

        jCheckBox5.setBackground(new java.awt.Color(202, 237, 228));
        jCheckBox5.setText("Zurdo");

        jTextField6.setEnabled(false);

        jTextField7.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jCheckBox1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jCheckBox2)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel12))
                                        .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)
                                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(60, 60, 60)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton6))
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel2)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(5, 5, 5)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(202, 237, 228));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "II. EXAMEN FÍSICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(202, 237, 228));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(202, 237, 228));

        jPanel30.setBackground(new java.awt.Color(202, 237, 228));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("Bipedestación"));

        jPanel11.setBackground(new java.awt.Color(202, 237, 228));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new java.awt.GridLayout(4, 1));

        jPanel12.setLayout(new java.awt.GridLayout(1, 4));

        jLabel19.setText("Curvaturas");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(jLabel19);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Normal");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(jLabel20);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Incrementada");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(jLabel21);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Disminuida");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(jLabel22);

        jPanel11.add(jPanel12);

        jPanel13.setLayout(new java.awt.GridLayout(0, 4));

        jLabel23.setText("Lordosis Cervical");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.add(jLabel23);

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel17.add(jCheckBox6);

        jPanel13.add(jPanel17);

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.setLayout(new java.awt.GridLayout(1, 1));

        jCheckBox9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel18.add(jCheckBox9);

        jPanel13.add(jPanel18);

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel19.add(jCheckBox10);

        jPanel13.add(jPanel19);

        jPanel11.add(jPanel13);

        jPanel15.setLayout(new java.awt.GridLayout(0, 4));

        jLabel24.setText("Cifosis Dorsal");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.add(jLabel24);

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel20.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel20.add(jCheckBox7);

        jPanel15.add(jPanel20);

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel21.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel21.add(jCheckBox8);

        jPanel15.add(jPanel21);

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel22.add(jCheckBox11);

        jPanel15.add(jPanel22);

        jPanel11.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(0, 4));

        jLabel25.setText("Lordosis Lumbar");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.add(jLabel25);

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel23.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel23.add(jCheckBox12);

        jPanel16.add(jPanel23);

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel24.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel24.add(jCheckBox13);

        jPanel16.add(jPanel24);

        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel25.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });
        jPanel25.add(jCheckBox14);

        jPanel16.add(jPanel25);

        jPanel11.add(jPanel16);

        jPanel14.setBackground(new java.awt.Color(202, 237, 228));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setLayout(new java.awt.GridLayout(2, 1));

        jPanel26.setLayout(new java.awt.GridLayout(0, 3));

        jLabel26.setText("Hallazgo (si) (no)");
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel26.add(jLabel26);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Dorsal");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel26.add(jLabel27);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Lumbar");
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel26.add(jLabel28);

        jPanel14.add(jPanel26);

        jPanel27.setLayout(new java.awt.GridLayout(0, 3));

        jLabel29.setText("Escoliosis");
        jLabel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel27.add(jLabel29);

        jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel28.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel28.add(jCheckBox15);

        jPanel27.add(jPanel28);

        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel29.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel29.add(jCheckBox16);

        jPanel27.add(jPanel29);

        jPanel14.add(jPanel27);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel31.setBackground(new java.awt.Color(202, 237, 228));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("Movilidad / Dolor"));

        jPanel32.setBackground(new java.awt.Color(202, 237, 228));
        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel32.setLayout(new java.awt.GridLayout(3, 0));

        jPanel33.setLayout(new java.awt.GridLayout(0, 5));

        jLabel30.setText("Columna");
        jLabel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel33.add(jLabel30);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Flexión");
        jLabel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel33.add(jLabel31);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Extensón");
        jLabel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel33.add(jLabel32);

        jPanel36.setLayout(new java.awt.GridLayout(2, 1));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Inflexiones Laterales");
        jLabel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel36.add(jLabel33);

        jPanel37.setLayout(new java.awt.GridLayout(0, 2));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("DER.");
        jLabel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel37.add(jLabel34);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("IZQ.");
        jLabel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel37.add(jLabel35);

        jPanel36.add(jPanel37);

        jPanel33.add(jPanel36);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Rotación");
        jLabel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel33.add(jLabel36);

        jPanel32.add(jPanel33);

        jPanel34.setLayout(new java.awt.GridLayout(0, 5));

        jLabel37.setText("Cervical");
        jLabel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel34.add(jLabel37);

        jPanel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel38.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel38.add(jCheckBox17);

        jPanel34.add(jPanel38);

        jPanel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel39.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel39.add(jCheckBox18);

        jPanel34.add(jPanel39);

        jPanel40.setLayout(new java.awt.GridLayout(1, 0));

        jPanel46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel46.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel46.add(jCheckBox19);

        jPanel40.add(jPanel46);

        jPanel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel47.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel47.add(jCheckBox20);

        jPanel40.add(jPanel47);

        jPanel34.add(jPanel40);

        jPanel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel41.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel41.add(jCheckBox21);

        jPanel34.add(jPanel41);

        jPanel32.add(jPanel34);

        jPanel35.setLayout(new java.awt.GridLayout(0, 5));

        jLabel38.setText("Lumbar");
        jLabel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel35.add(jLabel38);

        jPanel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel42.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel42.add(jCheckBox22);

        jPanel35.add(jPanel42);

        jPanel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel43.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel43.add(jCheckBox23);

        jPanel35.add(jPanel43);

        jPanel44.setLayout(new java.awt.GridLayout(1, 0));

        jPanel48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel48.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel48.add(jCheckBox24);

        jPanel44.add(jPanel48);

        jPanel49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel49.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel49.add(jCheckBox25);

        jPanel44.add(jPanel49);

        jPanel35.add(jPanel44);

        jPanel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel45.setLayout(new java.awt.GridLayout(1, 0));

        jCheckBox26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel45.add(jCheckBox26);

        jPanel35.add(jPanel45);

        jPanel32.add(jPanel35);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel50.setBackground(new java.awt.Color(202, 237, 228));
        jPanel50.setBorder(javax.swing.BorderFactory.createTitledBorder("Palpación"));

        jPanel51.setBackground(new java.awt.Color(202, 237, 228));
        jPanel51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel51.setLayout(new java.awt.GridLayout(3, 1));

        jPanel52.setLayout(new java.awt.GridLayout(0, 3));

        jLabel39.setText("Apófisis espinosas dolorosa");
        jLabel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel52.add(jLabel39);

        jPanel56.setLayout(new java.awt.GridLayout(0, 1));

        jPanel58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel58.setLayout(new java.awt.GridLayout(0, 2));

        buttonGroup5.add(jRadioButton17);
        jRadioButton17.setText("SI");
        jRadioButton17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel58.add(jRadioButton17);

        buttonGroup5.add(jRadioButton18);
        jRadioButton18.setText("NO");
        jRadioButton18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel58.add(jRadioButton18);

        jPanel56.add(jPanel58);

        jPanel52.add(jPanel56);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel52.add(jScrollPane2);

        jPanel51.add(jPanel52);

        jPanel53.setLayout(new java.awt.GridLayout(0, 3));

        jLabel40.setText("Contractura muscular");
        jLabel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel53.add(jLabel40);

        jPanel57.setLayout(new java.awt.GridLayout(0, 1));

        jPanel59.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel59.setLayout(new java.awt.GridLayout(0, 2));

        buttonGroup6.add(jRadioButton19);
        jRadioButton19.setText("SI");
        jRadioButton19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton19.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });
        jPanel59.add(jRadioButton19);

        buttonGroup6.add(jRadioButton21);
        jRadioButton21.setText("NO");
        jRadioButton21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton21.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel59.add(jRadioButton21);

        jPanel57.add(jPanel59);

        jPanel53.add(jPanel57);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel53.add(jScrollPane3);

        jPanel51.add(jPanel53);

        jPanel54.setLayout(new java.awt.GridLayout(0, 3));

        jLabel41.setText("Dolor espalda baja");
        jLabel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel54.add(jLabel41);

        jPanel55.setLayout(new java.awt.GridLayout(0, 1));

        jPanel60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel60.setLayout(new java.awt.GridLayout(0, 2));

        buttonGroup7.add(jRadioButton20);
        jRadioButton20.setText("SI");
        jRadioButton20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel60.add(jRadioButton20);

        buttonGroup7.add(jRadioButton22);
        jRadioButton22.setText("NO");
        jRadioButton22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton22.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel60.add(jRadioButton22);

        jPanel55.add(jPanel60);

        jPanel54.add(jPanel55);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel54.add(jScrollPane4);

        jPanel51.add(jPanel54);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel61.setBackground(new java.awt.Color(202, 237, 228));
        jPanel61.setBorder(javax.swing.BorderFactory.createTitledBorder("Maniobras radiculo / discopatías"));

        jPanel62.setBackground(new java.awt.Color(202, 237, 228));
        jPanel62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel62.setLayout(new java.awt.GridLayout(3, 0));

        jPanel63.setLayout(new java.awt.GridLayout(0, 2));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("CIATICO");
        jPanel63.add(jLabel42);

        jPanel66.setLayout(new java.awt.GridLayout(0, 2));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel66.add(jPanel67);

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("(+ / -)");
        jLabel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel66.add(jLabel43);

        jPanel63.add(jPanel66);

        jPanel62.add(jPanel63);

        jPanel64.setLayout(new java.awt.GridLayout(0, 2));

        jLabel44.setText("Signo de Lasegue");
        jLabel44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel64.add(jLabel44);

        jPanel68.setLayout(new java.awt.GridLayout(2, 0));

        jPanel69.setLayout(new java.awt.GridLayout(0, 2));

        jLabel45.setText("DERECHA");
        jLabel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel69.add(jLabel45);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel69.add(jTextField2);

        jPanel68.add(jPanel69);

        jPanel70.setLayout(new java.awt.GridLayout(0, 2));

        jLabel46.setText("IZQUIERDA");
        jLabel46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel70.add(jLabel46);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel70.add(jTextField3);

        jPanel68.add(jPanel70);

        jPanel64.add(jPanel68);

        jPanel62.add(jPanel64);

        jPanel65.setLayout(new java.awt.GridLayout(0, 2));

        jLabel47.setText("Signo de Bragard");
        jLabel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel65.add(jLabel47);

        jPanel71.setLayout(new java.awt.GridLayout(2, 0));

        jPanel72.setLayout(new java.awt.GridLayout(0, 2));

        jLabel48.setText("DERECHA");
        jLabel48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel72.add(jLabel48);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel72.add(jTextField4);

        jPanel71.add(jPanel72);

        jPanel73.setLayout(new java.awt.GridLayout(0, 2));

        jLabel49.setText("IZQUIERDA");
        jLabel49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel73.add(jLabel49);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel73.add(jTextField5);

        jPanel71.add(jPanel73);

        jPanel65.add(jPanel71);

        jPanel62.add(jPanel65);

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("COLUMNA VERTEBRAL", jPanel3);

        jPanel4.setBackground(new java.awt.Color(202, 237, 228));

        jPanel79.setBackground(new java.awt.Color(202, 237, 228));
        jPanel79.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel79.setLayout(new java.awt.GridLayout(3, 0));

        jPanel81.setLayout(new java.awt.GridLayout(0, 2));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("MUÑECAS");
        jPanel81.add(jLabel50);

        jPanel87.setLayout(new java.awt.GridLayout(0, 2));

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel87.add(jPanel88);

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("(+ / -)");
        jLabel51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel87.add(jLabel51);

        jPanel81.add(jPanel87);

        jPanel79.add(jPanel81);

        jPanel89.setLayout(new java.awt.GridLayout(0, 2));

        jLabel56.setText("Test de Phalen (palmas 90°)");
        jLabel56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel89.add(jLabel56);

        jPanel90.setLayout(new java.awt.GridLayout(2, 0));

        jPanel91.setLayout(new java.awt.GridLayout(0, 2));

        jLabel57.setText("DERECHA");
        jLabel57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel91.add(jLabel57);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });
        jPanel91.add(jTextField10);

        jPanel90.add(jPanel91);

        jPanel92.setLayout(new java.awt.GridLayout(0, 2));

        jLabel58.setText("IZQUIERDA");
        jLabel58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel92.add(jLabel58);

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });
        jPanel92.add(jTextField11);

        jPanel90.add(jPanel92);

        jPanel89.add(jPanel90);

        jPanel79.add(jPanel89);

        jPanel93.setLayout(new java.awt.GridLayout(0, 2));

        jLabel59.setText("Test de Tinel (percutir mediano)");
        jLabel59.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel93.add(jLabel59);

        jPanel94.setLayout(new java.awt.GridLayout(2, 0));

        jPanel95.setLayout(new java.awt.GridLayout(0, 2));

        jLabel60.setText("DERECHA");
        jLabel60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel95.add(jLabel60);

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
        });
        jPanel95.add(jTextField12);

        jPanel94.add(jPanel95);

        jPanel96.setLayout(new java.awt.GridLayout(0, 2));

        jLabel61.setText("IZQUIERDA");
        jLabel61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel96.add(jLabel61);

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
        });
        jPanel96.add(jTextField13);

        jPanel94.add(jPanel96);

        jPanel93.add(jPanel94);

        jPanel79.add(jPanel93);

        jPanel97.setBackground(new java.awt.Color(202, 237, 228));
        jPanel97.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel97.setLayout(new java.awt.GridLayout(3, 0));

        jPanel98.setLayout(new java.awt.GridLayout(0, 2));

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("PIE");
        jPanel98.add(jLabel62);

        jPanel99.setLayout(new java.awt.GridLayout(0, 2));

        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel99.add(jPanel100);

        jPanel109.setLayout(new java.awt.GridLayout(0, 2));

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("SI");
        jLabel63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel109.add(jLabel63);

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("NO");
        jLabel70.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel109.add(jLabel70);

        jPanel99.add(jPanel109);

        jPanel98.add(jPanel99);

        jPanel97.add(jPanel98);

        jPanel101.setLayout(new java.awt.GridLayout(0, 2));

        jLabel64.setText("CAVO");
        jLabel64.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel101.add(jLabel64);

        jPanel102.setLayout(new java.awt.GridLayout(2, 0));

        jPanel103.setLayout(new java.awt.GridLayout(0, 2));

        jLabel65.setText("DERECHA");
        jLabel65.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel103.add(jLabel65);

        jPanel75.setLayout(new java.awt.GridLayout(0, 2));

        jPanel110.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel110.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup8.add(jRadioButton9);
        jRadioButton9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel110.add(jRadioButton9);

        jPanel75.add(jPanel110);

        jPanel111.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel111.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup8.add(jRadioButton10);
        jRadioButton10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel111.add(jRadioButton10);

        jPanel75.add(jPanel111);

        jPanel103.add(jPanel75);

        jPanel102.add(jPanel103);

        jPanel104.setLayout(new java.awt.GridLayout(0, 2));

        jLabel66.setText("IZQUIERDA");
        jLabel66.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel104.add(jLabel66);

        jPanel77.setLayout(new java.awt.GridLayout(0, 2));

        jPanel78.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel78.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup9.add(jRadioButton11);
        jRadioButton11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel78.add(jRadioButton11);

        jPanel77.add(jPanel78);

        jPanel80.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel80.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup9.add(jRadioButton12);
        jRadioButton12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel80.add(jRadioButton12);

        jPanel77.add(jPanel80);

        jPanel104.add(jPanel77);

        jPanel102.add(jPanel104);

        jPanel101.add(jPanel102);

        jPanel97.add(jPanel101);

        jPanel105.setLayout(new java.awt.GridLayout(0, 2));

        jLabel67.setText("PLANO");
        jLabel67.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel105.add(jLabel67);

        jPanel106.setLayout(new java.awt.GridLayout(2, 0));

        jPanel107.setLayout(new java.awt.GridLayout(0, 2));

        jLabel68.setText("DERECHA");
        jLabel68.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel107.add(jLabel68);

        jPanel76.setLayout(new java.awt.GridLayout(0, 2));

        jPanel82.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel82.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup10.add(jRadioButton13);
        jRadioButton13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel82.add(jRadioButton13);

        jPanel76.add(jPanel82);

        jPanel83.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel83.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup10.add(jRadioButton14);
        jRadioButton14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel83.add(jRadioButton14);

        jPanel76.add(jPanel83);

        jPanel107.add(jPanel76);

        jPanel106.add(jPanel107);

        jPanel108.setLayout(new java.awt.GridLayout(0, 2));

        jLabel69.setText("IZQUIERDA");
        jLabel69.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel108.add(jLabel69);

        jPanel84.setLayout(new java.awt.GridLayout(0, 2));

        jPanel85.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel85.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup11.add(jRadioButton15);
        jRadioButton15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel85.add(jRadioButton15);

        jPanel84.add(jPanel85);

        jPanel86.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel86.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup11.add(jRadioButton16);
        jRadioButton16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel86.add(jRadioButton16);

        jPanel84.add(jPanel86);

        jPanel108.add(jPanel84);

        jPanel106.add(jPanel108);

        jPanel105.add(jPanel106);

        jPanel97.add(jPanel105);

        jPanel112.setBackground(new java.awt.Color(202, 237, 228));
        jPanel112.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel112.setLayout(new java.awt.GridLayout(3, 0));

        jPanel113.setLayout(new java.awt.GridLayout(0, 2));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("REFLEJOS");
        jPanel113.add(jLabel52);

        jPanel114.setLayout(new java.awt.GridLayout(0, 2));

        javax.swing.GroupLayout jPanel115Layout = new javax.swing.GroupLayout(jPanel115);
        jPanel115.setLayout(jPanel115Layout);
        jPanel115Layout.setHorizontalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel115Layout.setVerticalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel114.add(jPanel115);

        jPanel124.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel124.setLayout(new java.awt.GridLayout(2, 0));

        jLabel53.setText("Grados 0, 1+, 2+");
        jPanel124.add(jLabel53);

        jLabel54.setText("Normal 3+, 4+");
        jPanel124.add(jLabel54);

        jPanel114.add(jPanel124);

        jPanel113.add(jPanel114);

        jPanel112.add(jPanel113);

        jPanel116.setLayout(new java.awt.GridLayout(0, 2));

        jLabel71.setText("Rotuliano");
        jLabel71.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel116.add(jLabel71);

        jPanel117.setLayout(new java.awt.GridLayout(2, 0));

        jPanel118.setLayout(new java.awt.GridLayout(0, 2));

        jLabel72.setText("DERECHA");
        jLabel72.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel118.add(jLabel72);
        jPanel118.add(jTextField14);

        jPanel117.add(jPanel118);

        jPanel119.setLayout(new java.awt.GridLayout(0, 2));

        jLabel73.setText("IZQUIERDA");
        jLabel73.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel119.add(jLabel73);

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel119.add(jTextField15);

        jPanel117.add(jPanel119);

        jPanel116.add(jPanel117);

        jPanel112.add(jPanel116);

        jPanel120.setLayout(new java.awt.GridLayout(0, 2));

        jLabel74.setText("Aquileo");
        jLabel74.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel120.add(jLabel74);

        jPanel121.setLayout(new java.awt.GridLayout(2, 0));

        jPanel122.setLayout(new java.awt.GridLayout(0, 2));

        jLabel75.setText("DERECHA");
        jLabel75.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel122.add(jLabel75);

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel122.add(jTextField16);

        jPanel121.add(jPanel122);

        jPanel123.setLayout(new java.awt.GridLayout(0, 2));

        jLabel76.setText("IZQUIERDA");
        jLabel76.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel123.add(jLabel76);

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel123.add(jTextField17);

        jPanel121.add(jPanel123);

        jPanel120.add(jPanel121);

        jPanel112.add(jPanel120);

        jPanel125.setBackground(new java.awt.Color(202, 237, 228));
        jPanel125.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción de anormalidades si son ( + )"));
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel125Layout = new javax.swing.GroupLayout(jPanel125);
        jPanel125.setLayout(jPanel125Layout);
        jPanel125Layout.setHorizontalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel125Layout.setVerticalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jPanel112, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EXTREMIDADES SUPERIORES / INFERIORES", jPanel4);

        jPanel5.setBackground(new java.awt.Color(202, 237, 228));

        jPanel127.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel127.setLayout(new java.awt.GridLayout(7, 0));

        jPanel128.setLayout(new java.awt.GridLayout(0, 10));

        jLabel102.setText("ARTICULACIÓN");
        jPanel128.add(jLabel102);

        javax.swing.GroupLayout jPanel144Layout = new javax.swing.GroupLayout(jPanel144);
        jPanel144.setLayout(jPanel144Layout);
        jPanel144Layout.setHorizontalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel144Layout.setVerticalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel128.add(jPanel144);

        jLabel55.setText("FLEXIÓN");
        jLabel55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel128.add(jLabel55);

        jLabel77.setText("EXTENSIÓN");
        jLabel77.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel128.add(jLabel77);

        jLabel78.setText("ROT. INT.");
        jLabel78.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel128.add(jLabel78);

        jLabel79.setText("ROT. EXT.");
        jLabel79.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel128.add(jLabel79);

        jLabel80.setText("ABDU");
        jLabel80.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel128.add(jLabel80);

        jLabel81.setText("ADU");
        jLabel81.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel128.add(jLabel81);

        jPanel142.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel142.setLayout(new java.awt.GridLayout(2, 0));

        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("FUERZA");
        jPanel142.add(jLabel100);

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("/ TONO");
        jPanel142.add(jLabel101);

        jPanel128.add(jPanel142);

        jPanel143.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel143.setLayout(new java.awt.GridLayout(2, 0));

        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("DOLOR");
        jPanel143.add(jLabel82);

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("(SI / NO)");
        jPanel143.add(jLabel83);

        jPanel128.add(jPanel143);

        jPanel127.add(jPanel128);

        jPanel130.setLayout(new java.awt.GridLayout(0, 10));

        jLabel84.setText("Hombro");
        jLabel84.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel130.add(jLabel84);

        jPanel131.setLayout(new java.awt.GridLayout(2, 0));

        jLabel85.setText("DERECHA");
        jLabel85.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel131.add(jLabel85);

        jLabel86.setText("IZQUIERDA");
        jLabel86.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel131.add(jLabel86);

        jPanel130.add(jPanel131);

        jPanel74.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel74.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel74.add(jCheckBox76);

        jCheckBox75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel74.add(jCheckBox75);

        jPanel130.add(jPanel74);

        jPanel149.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel149.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel149.add(jCheckBox89);

        jCheckBox90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel149.add(jCheckBox90);

        jPanel130.add(jPanel149);

        jPanel150.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel150.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel150.add(jCheckBox91);

        jCheckBox92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel150.add(jCheckBox92);

        jPanel130.add(jPanel150);

        jPanel151.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel151.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel151.add(jCheckBox93);

        jCheckBox94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel151.add(jCheckBox94);

        jPanel130.add(jPanel151);

        jPanel152.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel152.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel152.add(jCheckBox95);

        jCheckBox96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel152.add(jCheckBox96);

        jPanel130.add(jPanel152);

        jPanel153.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel153.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel153.add(jCheckBox97);

        jCheckBox98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel153.add(jCheckBox98);

        jPanel130.add(jPanel153);

        jPanel154.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel154.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel154.add(jCheckBox99);

        jCheckBox100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel154.add(jCheckBox100);

        jPanel130.add(jPanel154);

        jPanel155.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel155.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel155.add(jCheckBox101);

        jCheckBox102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel155.add(jCheckBox102);

        jPanel130.add(jPanel155);

        jPanel127.add(jPanel130);

        jPanel132.setLayout(new java.awt.GridLayout(0, 10));

        jLabel87.setText("Codo");
        jLabel87.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel132.add(jLabel87);

        jPanel133.setLayout(new java.awt.GridLayout(2, 0));

        jLabel88.setText("DERECHA");
        jLabel88.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel133.add(jLabel88);

        jLabel89.setText("IZQUIERDA");
        jLabel89.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel133.add(jLabel89);

        jPanel132.add(jPanel133);

        jPanel156.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel156.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel156.add(jCheckBox103);

        jCheckBox104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel156.add(jCheckBox104);

        jPanel132.add(jPanel156);

        jPanel157.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel157.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel157.add(jCheckBox105);

        jCheckBox106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel157.add(jCheckBox106);

        jPanel132.add(jPanel157);

        jPanel158.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel158.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel158.add(jCheckBox107);

        jCheckBox108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel158.add(jCheckBox108);

        jPanel132.add(jPanel158);

        jPanel159.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel159.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel159.add(jCheckBox109);

        jCheckBox110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel159.add(jCheckBox110);

        jPanel132.add(jPanel159);

        jPanel160.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel160.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel160.add(jCheckBox111);

        jCheckBox112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel160.add(jCheckBox112);

        jPanel132.add(jPanel160);

        jPanel161.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel161.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel161.add(jCheckBox113);

        jCheckBox114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel161.add(jCheckBox114);

        jPanel132.add(jPanel161);

        jPanel162.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel162.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel162.add(jCheckBox115);

        jCheckBox116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel162.add(jCheckBox116);

        jPanel132.add(jPanel162);

        jPanel163.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel163.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel163.add(jCheckBox117);

        jCheckBox118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel163.add(jCheckBox118);

        jPanel132.add(jPanel163);

        jPanel127.add(jPanel132);

        jPanel134.setLayout(new java.awt.GridLayout(0, 10));

        jLabel90.setText("Muñeca");
        jLabel90.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel134.add(jLabel90);

        jPanel135.setLayout(new java.awt.GridLayout(2, 0));

        jLabel91.setText("DERECHA");
        jLabel91.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel135.add(jLabel91);

        jLabel92.setText("IZQUIERDA");
        jLabel92.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel135.add(jLabel92);

        jPanel134.add(jPanel135);

        jPanel164.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel164.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel164.add(jCheckBox119);

        jCheckBox120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel164.add(jCheckBox120);

        jPanel134.add(jPanel164);

        jPanel165.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel165.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel165.add(jCheckBox121);

        jCheckBox122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel165.add(jCheckBox122);

        jPanel134.add(jPanel165);

        jPanel166.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel166.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel166.add(jCheckBox123);

        jCheckBox124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel166.add(jCheckBox124);

        jPanel134.add(jPanel166);

        jPanel167.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel167.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel167.add(jCheckBox125);

        jCheckBox126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel167.add(jCheckBox126);

        jPanel134.add(jPanel167);

        jPanel168.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel168.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel168.add(jCheckBox127);

        jCheckBox128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel168.add(jCheckBox128);

        jPanel134.add(jPanel168);

        jPanel169.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel169.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel169.add(jCheckBox129);

        jCheckBox130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel169.add(jCheckBox130);

        jPanel134.add(jPanel169);

        jPanel170.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel170.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel170.add(jCheckBox131);

        jCheckBox132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel170.add(jCheckBox132);

        jPanel134.add(jPanel170);

        jPanel171.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel171.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel171.add(jCheckBox133);

        jCheckBox134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel171.add(jCheckBox134);

        jPanel134.add(jPanel171);

        jPanel127.add(jPanel134);

        jPanel136.setLayout(new java.awt.GridLayout(0, 10));

        jLabel93.setText("Cadera");
        jLabel93.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel136.add(jLabel93);

        jPanel137.setLayout(new java.awt.GridLayout(2, 0));

        jLabel94.setText("DERECHA");
        jLabel94.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel137.add(jLabel94);

        jLabel95.setText("IZQUIERDA");
        jLabel95.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel137.add(jLabel95);

        jPanel136.add(jPanel137);

        jPanel172.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel172.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel172.add(jCheckBox135);

        jCheckBox136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel172.add(jCheckBox136);

        jPanel136.add(jPanel172);

        jPanel173.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel173.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel173.add(jCheckBox137);

        jCheckBox138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel173.add(jCheckBox138);

        jPanel136.add(jPanel173);

        jPanel174.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel174.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel174.add(jCheckBox139);

        jCheckBox140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel174.add(jCheckBox140);

        jPanel136.add(jPanel174);

        jPanel175.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel175.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel175.add(jCheckBox141);

        jCheckBox142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel175.add(jCheckBox142);

        jPanel136.add(jPanel175);

        jPanel176.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel176.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel176.add(jCheckBox143);

        jCheckBox144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel176.add(jCheckBox144);

        jPanel136.add(jPanel176);

        jPanel177.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel177.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel177.add(jCheckBox145);

        jCheckBox146.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel177.add(jCheckBox146);

        jPanel136.add(jPanel177);

        jPanel178.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel178.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel178.add(jCheckBox147);

        jCheckBox148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel178.add(jCheckBox148);

        jPanel136.add(jPanel178);

        jPanel179.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel179.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel179.add(jCheckBox149);

        jCheckBox150.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel179.add(jCheckBox150);

        jPanel136.add(jPanel179);

        jPanel127.add(jPanel136);

        jPanel138.setLayout(new java.awt.GridLayout(0, 10));

        jLabel96.setText("Rodilla");
        jLabel96.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel138.add(jLabel96);

        jPanel139.setLayout(new java.awt.GridLayout(2, 0));

        jLabel97.setText("DERECHA");
        jLabel97.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel139.add(jLabel97);

        jLabel98.setText("IZQUIERDA");
        jLabel98.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel139.add(jLabel98);

        jPanel138.add(jPanel139);

        jPanel180.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel180.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel180.add(jCheckBox151);

        jCheckBox152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel180.add(jCheckBox152);

        jPanel138.add(jPanel180);

        jPanel181.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel181.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel181.add(jCheckBox153);

        jCheckBox154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel181.add(jCheckBox154);

        jPanel138.add(jPanel181);

        jPanel182.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel182.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel182.add(jCheckBox155);

        jCheckBox156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel182.add(jCheckBox156);

        jPanel138.add(jPanel182);

        jPanel183.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel183.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel183.add(jCheckBox157);

        jCheckBox158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel183.add(jCheckBox158);

        jPanel138.add(jPanel183);

        jPanel184.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel184.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel184.add(jCheckBox159);

        jCheckBox160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel184.add(jCheckBox160);

        jPanel138.add(jPanel184);

        jPanel185.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel185.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel185.add(jCheckBox161);

        jCheckBox162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel185.add(jCheckBox162);

        jPanel138.add(jPanel185);

        jPanel186.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel186.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel186.add(jCheckBox163);

        jCheckBox164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel186.add(jCheckBox164);

        jPanel138.add(jPanel186);

        jPanel187.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel187.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel187.add(jCheckBox165);

        jCheckBox166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel187.add(jCheckBox166);

        jPanel138.add(jPanel187);

        jPanel127.add(jPanel138);

        jPanel140.setLayout(new java.awt.GridLayout(0, 10));

        jLabel99.setText("Tobillo");
        jLabel99.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel140.add(jLabel99);

        jPanel141.setLayout(new java.awt.GridLayout(2, 0));

        jLabel103.setText("DERECHA");
        jLabel103.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel141.add(jLabel103);

        jLabel104.setText("IZQUIERDA");
        jLabel104.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel141.add(jLabel104);

        jPanel140.add(jPanel141);

        jPanel188.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel188.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel188.add(jCheckBox167);

        jCheckBox168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel188.add(jCheckBox168);

        jPanel140.add(jPanel188);

        jPanel189.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel189.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel189.add(jCheckBox169);

        jCheckBox170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel189.add(jCheckBox170);

        jPanel140.add(jPanel189);

        jPanel190.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel190.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel190.add(jCheckBox171);

        jCheckBox172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel190.add(jCheckBox172);

        jPanel140.add(jPanel190);

        jPanel191.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel191.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel191.add(jCheckBox173);

        jCheckBox174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel191.add(jCheckBox174);

        jPanel140.add(jPanel191);

        jPanel192.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel192.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel192.add(jCheckBox175);

        jCheckBox176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel192.add(jCheckBox176);

        jPanel140.add(jPanel192);

        jPanel193.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel193.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel193.add(jCheckBox177);

        jCheckBox178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel193.add(jCheckBox178);

        jPanel140.add(jPanel193);

        jPanel194.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel194.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel194.add(jCheckBox179);

        jCheckBox180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel194.add(jCheckBox180);

        jPanel140.add(jPanel194);

        jPanel195.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel195.setLayout(new java.awt.GridLayout(2, 1));

        jCheckBox181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel195.add(jCheckBox181);

        jCheckBox182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel195.add(jCheckBox182);

        jPanel140.add(jPanel195);

        jPanel127.add(jPanel140);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));
        jScrollPane6.setViewportView(jTextArea6);

        jCheckBox27.setBackground(new java.awt.Color(202, 237, 228));
        jCheckBox27.setText("Normal");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel127, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 338, Short.MAX_VALUE)
                .addComponent(jCheckBox27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel127, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("ARTICULACIONES", jPanel5);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(202, 237, 228));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "III. DIAGNÓSTICOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel105.setText("Diagnóstico :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblDx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tblDx);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField62)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel105)
                        .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/cancel.png"))); // NOI18N
        jButton2.setToolTipText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        jButton3.setToolTipText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel126.setBackground(new java.awt.Color(202, 237, 228));
        jPanel126.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONCLUSIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaConclusiones.setColumns(20);
        txaConclusiones.setRows(5);
        jScrollPane8.setViewportView(txaConclusiones);

        javax.swing.GroupLayout jPanel126Layout = new javax.swing.GroupLayout(jPanel126);
        jPanel126.setLayout(jPanel126Layout);
        jPanel126Layout.setHorizontalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8)
        );
        jPanel126Layout.setVerticalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel126Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        oFichaOsteomuscular = registrar();
        if (oFichaOsteomuscular != null) {
            oArticulacion = registrarArticulacion(oFichaOsteomuscular);
            oDiagnosticoOsteomuscular = registrarDxOsteomuscular();
        } else {
            Mensajes.msjRegError();
        }
        if (oFichaOsteomuscular != null && oArticulacion != null && oDiagnosticoOsteomuscular != null) {
            Mensajes.msjRegCorrecta();
            //Imprimir ficha  de evaluacion oftalmologica
            imprimirFicha(oFichaOsteomuscular);
            //limpiar todos los  componentes
            resetComponentFicha();
        } else {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        switch (jTextField2.getText().trim()) {
            case "+":
                jTextField2.setText("+");
                break;
            case "-":
                jTextField2.setText("-");
                break;
            default:
                jTextField2.setText("");
                break;
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        switch (jTextField3.getText().trim()) {
            case "+":
                jTextField3.setText("+");
                break;
            case "-":
                jTextField3.setText("-");
                break;
            default:
                jTextField3.setText("");
                break;
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        switch (jTextField4.getText().trim()) {
            case "+":
                jTextField4.setText("+");
                break;
            case "-":
                jTextField4.setText("-");
                break;
            default:
                jTextField4.setText("");
                break;
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        switch (jTextField5.getText().trim()) {
            case "+":
                jTextField5.setText("+");
                break;
            case "-":
                jTextField5.setText("-");
                break;
            default:
                jTextField5.setText("");
                break;
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        switch (jTextField10.getText().trim()) {
            case "+":
                jTextField10.setText("+");
                break;
            case "-":
                jTextField10.setText("-");
                break;
            default:
                jTextField10.setText("");
                break;
        }
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        switch (jTextField11.getText().trim()) {
            case "+":
                jTextField11.setText("+");
                break;
            case "-":
                jTextField11.setText("-");
                break;
            default:
                jTextField11.setText("");
                break;
        }
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        switch (jTextField12.getText().trim()) {
            case "+":
                jTextField12.setText("+");
                break;
            case "-":
                jTextField12.setText("-");
                break;
            default:
                jTextField12.setText("");
                break;
        }
    }//GEN-LAST:event_jTextField12KeyReleased

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
        switch (jTextField13.getText().trim()) {
            case "+":
                jTextField13.setText("+");
                break;
            case "-":
                jTextField13.setText("-");
                break;
            default:
                jTextField13.setText("");
                break;
        }
    }//GEN-LAST:event_jTextField13KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jTextField62.getText().trim().equals("")) {
            agregarDx();
            personalizarVistaTabla();
            resetComponentDx();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese diagnóstico", "Atención", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetComponentFicha();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (jRadioButton3.isSelected()) {
            habilitaComponentes();
        } else {
            desHabilitaComponentes();
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox100;
    private javax.swing.JCheckBox jCheckBox101;
    private javax.swing.JCheckBox jCheckBox102;
    private javax.swing.JCheckBox jCheckBox103;
    private javax.swing.JCheckBox jCheckBox104;
    private javax.swing.JCheckBox jCheckBox105;
    private javax.swing.JCheckBox jCheckBox106;
    private javax.swing.JCheckBox jCheckBox107;
    private javax.swing.JCheckBox jCheckBox108;
    private javax.swing.JCheckBox jCheckBox109;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox110;
    private javax.swing.JCheckBox jCheckBox111;
    private javax.swing.JCheckBox jCheckBox112;
    private javax.swing.JCheckBox jCheckBox113;
    private javax.swing.JCheckBox jCheckBox114;
    private javax.swing.JCheckBox jCheckBox115;
    private javax.swing.JCheckBox jCheckBox116;
    private javax.swing.JCheckBox jCheckBox117;
    private javax.swing.JCheckBox jCheckBox118;
    private javax.swing.JCheckBox jCheckBox119;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox120;
    private javax.swing.JCheckBox jCheckBox121;
    private javax.swing.JCheckBox jCheckBox122;
    private javax.swing.JCheckBox jCheckBox123;
    private javax.swing.JCheckBox jCheckBox124;
    private javax.swing.JCheckBox jCheckBox125;
    private javax.swing.JCheckBox jCheckBox126;
    private javax.swing.JCheckBox jCheckBox127;
    private javax.swing.JCheckBox jCheckBox128;
    private javax.swing.JCheckBox jCheckBox129;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox130;
    private javax.swing.JCheckBox jCheckBox131;
    private javax.swing.JCheckBox jCheckBox132;
    private javax.swing.JCheckBox jCheckBox133;
    private javax.swing.JCheckBox jCheckBox134;
    private javax.swing.JCheckBox jCheckBox135;
    private javax.swing.JCheckBox jCheckBox136;
    private javax.swing.JCheckBox jCheckBox137;
    private javax.swing.JCheckBox jCheckBox138;
    private javax.swing.JCheckBox jCheckBox139;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox140;
    private javax.swing.JCheckBox jCheckBox141;
    private javax.swing.JCheckBox jCheckBox142;
    private javax.swing.JCheckBox jCheckBox143;
    private javax.swing.JCheckBox jCheckBox144;
    private javax.swing.JCheckBox jCheckBox145;
    private javax.swing.JCheckBox jCheckBox146;
    private javax.swing.JCheckBox jCheckBox147;
    private javax.swing.JCheckBox jCheckBox148;
    private javax.swing.JCheckBox jCheckBox149;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox150;
    private javax.swing.JCheckBox jCheckBox151;
    private javax.swing.JCheckBox jCheckBox152;
    private javax.swing.JCheckBox jCheckBox153;
    private javax.swing.JCheckBox jCheckBox154;
    private javax.swing.JCheckBox jCheckBox155;
    private javax.swing.JCheckBox jCheckBox156;
    private javax.swing.JCheckBox jCheckBox157;
    private javax.swing.JCheckBox jCheckBox158;
    private javax.swing.JCheckBox jCheckBox159;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox160;
    private javax.swing.JCheckBox jCheckBox161;
    private javax.swing.JCheckBox jCheckBox162;
    private javax.swing.JCheckBox jCheckBox163;
    private javax.swing.JCheckBox jCheckBox164;
    private javax.swing.JCheckBox jCheckBox165;
    private javax.swing.JCheckBox jCheckBox166;
    private javax.swing.JCheckBox jCheckBox167;
    private javax.swing.JCheckBox jCheckBox168;
    private javax.swing.JCheckBox jCheckBox169;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox170;
    private javax.swing.JCheckBox jCheckBox171;
    private javax.swing.JCheckBox jCheckBox172;
    private javax.swing.JCheckBox jCheckBox173;
    private javax.swing.JCheckBox jCheckBox174;
    private javax.swing.JCheckBox jCheckBox175;
    private javax.swing.JCheckBox jCheckBox176;
    private javax.swing.JCheckBox jCheckBox177;
    private javax.swing.JCheckBox jCheckBox178;
    private javax.swing.JCheckBox jCheckBox179;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox180;
    private javax.swing.JCheckBox jCheckBox181;
    private javax.swing.JCheckBox jCheckBox182;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox89;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBox jCheckBox90;
    private javax.swing.JCheckBox jCheckBox91;
    private javax.swing.JCheckBox jCheckBox92;
    private javax.swing.JCheckBox jCheckBox93;
    private javax.swing.JCheckBox jCheckBox94;
    private javax.swing.JCheckBox jCheckBox95;
    private javax.swing.JCheckBox jCheckBox96;
    private javax.swing.JCheckBox jCheckBox97;
    private javax.swing.JCheckBox jCheckBox98;
    private javax.swing.JCheckBox jCheckBox99;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tblDx;
    private javax.swing.JTextArea txaConclusiones;
    // End of variables declaration//GEN-END:variables

    private FichaOsteomuscular registrar() {
        oFichaOsteomuscular = new FichaOsteomuscular();
        oFichaOsteomuscularBl = new FichaOsteomuscularBl();

        oFichaOsteomuscular.setPostSedente((Double) jSpinner1.getValue());
        oFichaOsteomuscular.setPostBipodestacion((Double) jSpinner2.getValue());
        if (jRadioButton1.isSelected()) {
            oFichaOsteomuscular.setPostForzada("SI");
        } else if (jRadioButton4.isSelected()) {
            oFichaOsteomuscular.setPostForzada("NO");
        }
        if (jRadioButton2.isSelected()) {
            oFichaOsteomuscular.setMovRepetitivos("SI");
        } else if (jRadioButton5.isSelected()) {
            oFichaOsteomuscular.setMovRepetitivos("NO");
        }
        if (jRadioButton3.isSelected()) {
            oFichaOsteomuscular.setMovManualCarga("SI");
            if (!jTextField6.getText().trim().equals("")) {
                oFichaOsteomuscular.setPesoDesde(Double.valueOf(jTextField6.getText().trim()));
            }
            if (!jTextField7.getText().trim().equals("")) {
                oFichaOsteomuscular.setPesoHasta(Double.valueOf(jTextField7.getText().trim()));
            }
            if (jCheckBox1.isSelected()) {
                oFichaOsteomuscular.setMetLevanta(true);
            } else {
                oFichaOsteomuscular.setMetLevanta(false);
            }
            if (jCheckBox2.isSelected()) {
                oFichaOsteomuscular.setMetEmpuja(true);
            } else {
                oFichaOsteomuscular.setMetEmpuja(false);
            }
            if (jCheckBox3.isSelected()) {
                oFichaOsteomuscular.setMetArrastra(true);
            } else {
                oFichaOsteomuscular.setMetArrastra(false);
            }
        } else if (jRadioButton6.isSelected()) {
            oFichaOsteomuscular.setMovManualCarga("NO");
        }
        if (jRadioButton7.isSelected()) {
            oFichaOsteomuscular.setUsuarioPvd("SI");
            if (!jTextField1.getText().trim().equals("")) {
                oFichaOsteomuscular.setHorasDia(Double.valueOf(jTextField1.getText().trim()));
            }
        } else {
            oFichaOsteomuscular.setUsuarioPvd("NO");
        }
        if (jCheckBox4.isSelected()) {
            oFichaOsteomuscular.setDominanciaDiestro(true);
        } else {
            oFichaOsteomuscular.setDominanciaDiestro(false);
        }
        if (jCheckBox5.isSelected()) {
            oFichaOsteomuscular.setDominanciaZurdo(true);
        } else {
            oFichaOsteomuscular.setDominanciaZurdo(false);
        }
        // <editor-fold defaultstate="collapsed" desc="SET EXAMEN FISICO - COLUMNA VERTEBRAL"> 
        if (jCheckBox6.isSelected()) {
            oFichaOsteomuscular.setLordosisCervicalNormal(true);
        } else {
            oFichaOsteomuscular.setLordosisCervicalNormal(false);
        }
        if (jCheckBox9.isSelected()) {
            oFichaOsteomuscular.setLordosisCervicalIncrementada(true);
        } else {
            oFichaOsteomuscular.setLordosisCervicalIncrementada(false);
        }
        if (jCheckBox10.isSelected()) {
            oFichaOsteomuscular.setLordosisCervicalDisminuida(true);
        } else {
            oFichaOsteomuscular.setLordosisCervicalDisminuida(false);
        }
        if (jCheckBox7.isSelected()) {
            oFichaOsteomuscular.setCifosisNormal(true);
        } else {
            oFichaOsteomuscular.setCifosisNormal(false);
        }
        if (jCheckBox8.isSelected()) {
            oFichaOsteomuscular.setCifosisIncrementada(true);
        } else {
            oFichaOsteomuscular.setCifosisIncrementada(false);
        }
        if (jCheckBox11.isSelected()) {
            oFichaOsteomuscular.setCifosisDisminuida(true);
        } else {
            oFichaOsteomuscular.setCifosisDisminuida(false);
        }
        if (jCheckBox12.isSelected()) {
            oFichaOsteomuscular.setLordosisLumbarNormal(true);
        } else {
            oFichaOsteomuscular.setLordosisLumbarNormal(false);
        }
        if (jCheckBox13.isSelected()) {
            oFichaOsteomuscular.setLordosisLumbarIncrementada(true);
        } else {
            oFichaOsteomuscular.setLordosisLumbarIncrementada(false);
        }
        if (jCheckBox14.isSelected()) {
            oFichaOsteomuscular.setLordosisLumbarDisminuida(true);
        } else {
            oFichaOsteomuscular.setLordosisLumbarDisminuida(false);
        }
        if (jCheckBox15.isSelected()) {
            oFichaOsteomuscular.setEscoliosisDorsal(true);
        } else {
            oFichaOsteomuscular.setEscoliosisDorsal(false);
        }
        if (jCheckBox16.isSelected()) {
            oFichaOsteomuscular.setEscoliosisLumbar(true);
        } else {
            oFichaOsteomuscular.setEscoliosisLumbar(false);
        }
        oFichaOsteomuscular.setCervicalFlexion(jCheckBox17.isSelected());
        oFichaOsteomuscular.setCervicalExtension(jCheckBox18.isSelected());
        oFichaOsteomuscular.setCervicalDer(jCheckBox19.isSelected());
        oFichaOsteomuscular.setCervicalIzq(jCheckBox20.isSelected());
        oFichaOsteomuscular.setCervicalRotacion(jCheckBox21.isSelected());
        oFichaOsteomuscular.setLumbarFlexion(jCheckBox22.isSelected());
        oFichaOsteomuscular.setLumbarExtension(jCheckBox23.isSelected());
        oFichaOsteomuscular.setLumbarDer(jCheckBox24.isSelected());
        oFichaOsteomuscular.setLumbarIzq(jCheckBox25.isSelected());
        oFichaOsteomuscular.setLumbarRotacion(jCheckBox25.isSelected());
        
        if (!jTextArea1.getText().trim().equals("")) {
            oFichaOsteomuscular.setMovDolorObservacion(jTextArea1.getText().trim().toUpperCase());
        } else {
            oFichaOsteomuscular.setMovDolorObservacion("");
        }
        if (jRadioButton17.isSelected()) {
            oFichaOsteomuscular.setOpofisisEspDolorosa(true);
        } else if (jRadioButton18.isSelected()) {
            oFichaOsteomuscular.setOpofisisEspDolorosa(false);
        }
        if (!jTextArea2.getText().trim().equals("")) {
            oFichaOsteomuscular.setOpofisisEspDolorosaObser(jTextArea2.getText().trim().toUpperCase());
        } else {
            oFichaOsteomuscular.setOpofisisEspDolorosaObser("");
        }

        if (jRadioButton19.isSelected()) {
            oFichaOsteomuscular.setContracturaMuscular(true);
        } else if (jRadioButton21.isSelected()) {
            oFichaOsteomuscular.setContracturaMuscular(false);
        }
        if (!jTextArea3.getText().trim().equals("")) {
            oFichaOsteomuscular.setContracturaMuscularObser(jTextArea3.getText().trim().toUpperCase());
        } else {
            oFichaOsteomuscular.setContracturaMuscularObser("");
        }

        if (jRadioButton20.isSelected()) {
            oFichaOsteomuscular.setDolorEspalda(true);
        } else if (jRadioButton22.isSelected()) {
            oFichaOsteomuscular.setDolorEspalda(false);
        }
        if (!jTextArea4.getText().trim().equals("")) {
            oFichaOsteomuscular.setDolorEspaldaObser(jTextArea4.getText().trim().toUpperCase());
        } else {
            oFichaOsteomuscular.setDolorEspaldaObser("");
        }

        if (!jTextField2.getText().trim().equals("")) {
            oFichaOsteomuscular.setSignoLasegueDer(jTextField2.getText().trim());
        } else {
            oFichaOsteomuscular.setSignoLasegueDer("");
        }

        if (!jTextField3.getText().trim().equals("")) {
            oFichaOsteomuscular.setSignoLasegueIzq(jTextField3.getText().trim());
        } else {
            oFichaOsteomuscular.setSignoLasegueIzq("");
        }

        if (!jTextField4.getText().trim().equals("")) {
            oFichaOsteomuscular.setSignoBragardDer(jTextField4.getText().trim());
        } else {
            oFichaOsteomuscular.setSignoBragardDer("");
        }

        if (!jTextField5.getText().trim().equals("")) {
            oFichaOsteomuscular.setSignoBragardIzq(jTextField5.getText().trim());
        } else {
            oFichaOsteomuscular.setSignoBragardIzq("");
        }
        // </editor-fold> 
        // <editor-fold defaultstate="collapsed" desc="SET EXAMEN FISICO - EXTREMIDADES SUPERIORES E INFERIORES"> 
        if (!jTextField10.getText().trim().equals("")) {
            oFichaOsteomuscular.setTestPhalenDer(jTextField10.getText().trim());
        } else {
            oFichaOsteomuscular.setTestPhalenDer("");
        }

        if (!jTextField11.getText().trim().equals("")) {
            oFichaOsteomuscular.setTestPhalenIzq(jTextField11.getText().trim());
        } else {
            oFichaOsteomuscular.setTestPhalenIzq("");
        }

        if (!jTextField12.getText().trim().equals("")) {
            oFichaOsteomuscular.setTestTinelDer(jTextField12.getText().trim());
        } else {
            oFichaOsteomuscular.setTestTinelDer("");
        }

        if (!jTextField13.getText().trim().equals("")) {
            oFichaOsteomuscular.setTestTinelIzq(jTextField13.getText().trim());
        } else {
            oFichaOsteomuscular.setTestTinelIzq("");
        }

        if (jRadioButton9.isSelected()) {
            oFichaOsteomuscular.setCavoDer(true);
        } else if (jRadioButton10.isSelected()) {
            oFichaOsteomuscular.setCavoDer(false);
        }

        if (jRadioButton11.isSelected()) {
            oFichaOsteomuscular.setCavoIzq(true);
        } else if (jRadioButton12.isSelected()) {
            oFichaOsteomuscular.setCavoIzq(false);
        }

        if (jRadioButton13.isSelected()) {
            oFichaOsteomuscular.setPlanoDer(true);
        } else if (jRadioButton14.isSelected()) {
            oFichaOsteomuscular.setPlanoDer(false);
        }

        if (jRadioButton15.isSelected()) {
            oFichaOsteomuscular.setPlanoIzq(true);
        } else if (jRadioButton16.isSelected()) {
            oFichaOsteomuscular.setPlanoIzq(false);
        }

        if (!jTextField14.getText().trim().equals("")) {
            oFichaOsteomuscular.setRotulianoDer(jTextField14.getText().trim());
        } else {
            oFichaOsteomuscular.setRotulianoDer("");
        }

        if (!jTextField15.getText().trim().equals("")) {
            oFichaOsteomuscular.setRotulianoIzq(jTextField15.getText().trim());
        } else {
            oFichaOsteomuscular.setRotulianoIzq("");
        }

        if (!jTextField16.getText().trim().equals("")) {
            oFichaOsteomuscular.setAquilioDer(jTextField16.getText().trim());
        } else {
            oFichaOsteomuscular.setAquilioDer("");
        }

        if (!jTextField17.getText().trim().equals("")) {
            oFichaOsteomuscular.setAquilioIzq(jTextField17.getText().trim());
        } else {
            oFichaOsteomuscular.setAquilioIzq("");
        }

        if (!jTextArea5.getText().trim().equals("")) {
            oFichaOsteomuscular.setDescAnomaliaNeg(jTextArea5.getText().trim());
        } else {
            oFichaOsteomuscular.setDescAnomaliaNeg("");
        }

        oFichaOsteomuscular.setIdUser(userTemp.getIdUsuario());
        oFichaOsteomuscular.setAtencionOcupacional(oAtencionOcupacional);
        oFichaOsteomuscular.setConclusion(txaConclusiones.getText().toUpperCase().trim());
        return oFichaOsteomuscularBl.registrar(oFichaOsteomuscular);

        // </editor-fold> 
        // <editor-fold defaultstate="collapsed" desc="SET EXAMEN FISICO - ARTICULACIONES "> 
        // </editor-fold>       
    }

    private Articulacion registrarArticulacion(FichaOsteomuscular oFichaOsteomuscular) {
        oArticulacion = new Articulacion();
        oArticulacionBl = new ArticulacionBl();

        oArticulacion.setFichaOsteomuscular(oFichaOsteomuscular);
        if (jCheckBox76.isSelected()) {
            oArticulacion.setHombroFlexionDer(true);
        } else {
            oArticulacion.setHombroFlexionDer(false);
        }
        if (jCheckBox75.isSelected()) {
            oArticulacion.setHombroFlexionIzq(true);
        } else {
            oArticulacion.setHombroFlexionIzq(false);
        }

        if (jCheckBox89.isSelected()) {
            oArticulacion.setHombroExtensionDer(true);
        } else {
            oArticulacion.setHombroExtensionDer(false);
        }
        if (jCheckBox90.isSelected()) {
            oArticulacion.setHombroExtensionIzq(true);
        } else {
            oArticulacion.setHombroExtensionIzq(false);
        }

        if (jCheckBox91.isSelected()) {
            oArticulacion.setHombroRotIntDer(true);
        } else {
            oArticulacion.setHombroRotIntDer(false);
        }
        if (jCheckBox92.isSelected()) {
            oArticulacion.setHombroRotIntIzq(true);
        } else {
            oArticulacion.setHombroRotIntIzq(false);
        }

        if (jCheckBox93.isSelected()) {
            oArticulacion.setHombroRotExtDer(true);
        } else {
            oArticulacion.setHombroRotExtDer(false);
        }
        if (jCheckBox94.isSelected()) {
            oArticulacion.setHombroRotExtIzq(true);
        } else {
            oArticulacion.setHombroRotExtIzq(false);
        }

        if (jCheckBox95.isSelected()) {
            oArticulacion.setHombroAbduDer(true);
        } else {
            oArticulacion.setHombroAbduDer(false);
        }
        if (jCheckBox96.isSelected()) {
            oArticulacion.setHombreAbduIzq(true);
        } else {
            oArticulacion.setHombreAbduIzq(false);
        }

        if (jCheckBox97.isSelected()) {
            oArticulacion.setHombroAduDer(true);
        } else {
            oArticulacion.setHombroAduDer(false);
        }
        if (jCheckBox98.isSelected()) {
            oArticulacion.setHombroAduIzq(true);
        } else {
            oArticulacion.setHombroAduIzq(false);
        }

        if (jCheckBox99.isSelected()) {
            oArticulacion.setHombroFuerzaDer(true);
        } else {
            oArticulacion.setHombroFuerzaDer(false);
        }
        if (jCheckBox100.isSelected()) {
            oArticulacion.setHombroFuerzaIzq(true);
        } else {
            oArticulacion.setHombroFuerzaIzq(false);
        }

        if (jCheckBox101.isSelected()) {
            oArticulacion.setHombroDolorDer(true);
        } else {
            oArticulacion.setHombroDolorDer(false);
        }
        if (jCheckBox102.isSelected()) {
            oArticulacion.setHombroDolorIzq(true);
        } else {
            oArticulacion.setHombroDolorIzq(false);
        }
        //CODO
        if (jCheckBox103.isSelected()) {
            oArticulacion.setCodoFlexionDer(true);
        } else {
            oArticulacion.setCodoFlexionDer(false);
        }
        if (jCheckBox104.isSelected()) {
            oArticulacion.setCodoFlexionIzq(true);
        } else {
            oArticulacion.setCodoFlexionIzq(false);
        }

        if (jCheckBox105.isSelected()) {
            oArticulacion.setCodoExtensionDer(true);
        } else {
            oArticulacion.setCodoExtensionDer(false);
        }
        if (jCheckBox106.isSelected()) {
            oArticulacion.setCodoExtensionIzq(true);
        } else {
            oArticulacion.setCodoExtensionIzq(false);
        }

        if (jCheckBox107.isSelected()) {
            oArticulacion.setCodoRotIntDer(true);
        } else {
            oArticulacion.setCodoRotIntDer(false);
        }
        if (jCheckBox108.isSelected()) {
            oArticulacion.setCodoRotIntIzq(true);
        } else {
            oArticulacion.setCodoRotIntIzq(false);
        }

        if (jCheckBox109.isSelected()) {
            oArticulacion.setCodoRotExtDer(true);
        } else {
            oArticulacion.setCodoRotExtDer(false);
        }
        if (jCheckBox110.isSelected()) {
            oArticulacion.setCodoRotExtIzq(true);
        } else {
            oArticulacion.setCodoRotExtIzq(false);
        }

        if (jCheckBox111.isSelected()) {
            oArticulacion.setCodoAbduDer(true);
        } else {
            oArticulacion.setCodoAbduDer(false);
        }
        if (jCheckBox112.isSelected()) {
            oArticulacion.setCodoAbduIzq(true);
        } else {
            oArticulacion.setCodoAbduIzq(false);
        }

        if (jCheckBox113.isSelected()) {
            oArticulacion.setCodoAduDer(true);
        } else {
            oArticulacion.setCodoAduDer(false);
        }
        if (jCheckBox114.isSelected()) {
            oArticulacion.setCodoAduIzq(true);
        } else {
            oArticulacion.setCodoAduIzq(false);
        }

        if (jCheckBox115.isSelected()) {
            oArticulacion.setCodoFuerzaDer(true);
        } else {
            oArticulacion.setCodoFuerzaDer(false);
        }
        if (jCheckBox116.isSelected()) {
            oArticulacion.setCodoFuerzaIzq(true);
        } else {
            oArticulacion.setCodoFuerzaIzq(false);
        }

        if (jCheckBox117.isSelected()) {
            oArticulacion.setCodoDolorDer(true);
        } else {
            oArticulacion.setCodoDolorDer(false);
        }
        if (jCheckBox118.isSelected()) {
            oArticulacion.setCodoDolorIzq(true);
        } else {
            oArticulacion.setCodoDolorIzq(false);
        }

        //MUÑECA
        if (jCheckBox119.isSelected()) {
            oArticulacion.setMunecaFlexionDer(true);
        } else {
            oArticulacion.setMunecaFlexionDer(false);
        }
        if (jCheckBox120.isSelected()) {
            oArticulacion.setMunecaFlexionIzq(true);
        } else {
            oArticulacion.setMunecaFlexionIzq(false);
        }

        if (jCheckBox121.isSelected()) {
            oArticulacion.setMunecaExtensionDer(true);
        } else {
            oArticulacion.setMunecaExtensionDer(false);
        }
        if (jCheckBox122.isSelected()) {
            oArticulacion.setMunecaExtensionIzq(true);
        } else {
            oArticulacion.setMunecaExtensionIzq(false);
        }

        if (jCheckBox123.isSelected()) {
            oArticulacion.setMunecaRotIntDer(true);
        } else {
            oArticulacion.setMunecaRotIntDer(false);
        }
        if (jCheckBox124.isSelected()) {
            oArticulacion.setMunecaRotIntIzq(true);
        } else {
            oArticulacion.setMunecaRotIntIzq(false);
        }

        if (jCheckBox125.isSelected()) {
            oArticulacion.setMunecaRotExtDer(true);
        } else {
            oArticulacion.setMunecaRotExtDer(false);
        }
        if (jCheckBox126.isSelected()) {
            oArticulacion.setMunecaRotExtIzq(true);
        } else {
            oArticulacion.setMunecaRotExtIzq(false);
        }

        if (jCheckBox127.isSelected()) {
            oArticulacion.setMunecaAbduDer(true);
        } else {
            oArticulacion.setMunecaAbduDer(false);
        }
        if (jCheckBox128.isSelected()) {
            oArticulacion.setMunecaAbduIzq(true);
        } else {
            oArticulacion.setMunecaAbduIzq(false);
        }

        if (jCheckBox129.isSelected()) {
            oArticulacion.setMunecaAduDer(true);
        } else {
            oArticulacion.setMunecaAduDer(false);
        }
        if (jCheckBox130.isSelected()) {
            oArticulacion.setMunecaAduIzq(true);
        } else {
            oArticulacion.setMunecaAduIzq(false);
        }

        if (jCheckBox131.isSelected()) {
            oArticulacion.setMunecaFuerzaDer(true);
        } else {
            oArticulacion.setMunecaFuerzaDer(false);
        }
        if (jCheckBox132.isSelected()) {
            oArticulacion.setMunecaFuerzaIzq(true);
        } else {
            oArticulacion.setMunecaFuerzaIzq(false);
        }

        if (jCheckBox133.isSelected()) {
            oArticulacion.setMunecaDolorDer(true);
        } else {
            oArticulacion.setMunecaDolorDer(false);
        }
        if (jCheckBox134.isSelected()) {
            oArticulacion.setMunecaDolorIzq(true);
        } else {
            oArticulacion.setMunecaDolorIzq(false);
        }
        //CADERA
        if (jCheckBox135.isSelected()) {
            oArticulacion.setCaderaFlexionDer(true);
        } else {
            oArticulacion.setCaderaFlexionDer(false);
        }
        if (jCheckBox136.isSelected()) {
            oArticulacion.setCaderaFlexionIzq(true);
        } else {
            oArticulacion.setCaderaFlexionIzq(false);
        }

        if (jCheckBox137.isSelected()) {
            oArticulacion.setCaderaExtensionDer(true);
        } else {
            oArticulacion.setCaderaExtensionDer(false);
        }
        if (jCheckBox138.isSelected()) {
            oArticulacion.setCaderaExtensionIzq(true);
        } else {
            oArticulacion.setCaderaExtensionIzq(false);
        }

        if (jCheckBox139.isSelected()) {
            oArticulacion.setCaderaRotIntDer(true);
        } else {
            oArticulacion.setCaderaRotIntDer(false);
        }
        if (jCheckBox140.isSelected()) {
            oArticulacion.setCaderaRotIntIzq(true);
        } else {
            oArticulacion.setCaderaRotIntIzq(false);
        }

        if (jCheckBox141.isSelected()) {
            oArticulacion.setCaderaRotExtDer(true);
        } else {
            oArticulacion.setCaderaRotExtDer(false);
        }
        if (jCheckBox142.isSelected()) {
            oArticulacion.setCaderaRotExtIzq(true);
        } else {
            oArticulacion.setCaderaRotExtIzq(false);
        }

        if (jCheckBox143.isSelected()) {
            oArticulacion.setCaderaAbduDer(true);
        } else {
            oArticulacion.setCaderaAbduDer(false);
        }
        if (jCheckBox144.isSelected()) {
            oArticulacion.setCaderaAbduIzq(true);
        } else {
            oArticulacion.setCaderaAbduIzq(false);
        }

        if (jCheckBox145.isSelected()) {
            oArticulacion.setCaderaAduDer(true);
        } else {
            oArticulacion.setCaderaAduDer(false);
        }
        if (jCheckBox146.isSelected()) {
            oArticulacion.setCaderaAduIzq(true);
        } else {
            oArticulacion.setCaderaAduIzq(false);
        }

        if (jCheckBox147.isSelected()) {
            oArticulacion.setCaderaFuerzaDer(true);
        } else {
            oArticulacion.setCaderaFuerzaDer(false);
        }
        if (jCheckBox148.isSelected()) {
            oArticulacion.setCaderaFuerzaIzq(true);
        } else {
            oArticulacion.setCaderaFuerzaIzq(false);
        }

        if (jCheckBox149.isSelected()) {
            oArticulacion.setCaderaDolorDer(true);
        } else {
            oArticulacion.setCaderaDolorDer(false);
        }
        if (jCheckBox150.isSelected()) {
            oArticulacion.setCaderaDolorIzq(true);
        } else {
            oArticulacion.setCaderaDolorIzq(false);
        }

        //RODILLA
        if (jCheckBox151.isSelected()) {
            oArticulacion.setRodillaFlexionDer(true);
        } else {
            oArticulacion.setRodillaFlexionDer(false);
        }
        if (jCheckBox152.isSelected()) {
            oArticulacion.setRodillaFlexionIzq(true);
        } else {
            oArticulacion.setRodillaFlexionIzq(false);
        }

        if (jCheckBox153.isSelected()) {
            oArticulacion.setRodillaExtensionDer(true);
        } else {
            oArticulacion.setRodillaExtensionDer(false);
        }
        if (jCheckBox154.isSelected()) {
            oArticulacion.setRodillaExtensionIzq(true);
        } else {
            oArticulacion.setRodillaExtensionIzq(false);
        }

        if (jCheckBox155.isSelected()) {
            oArticulacion.setRodillaRotIntDer(true);
        } else {
            oArticulacion.setRodillaRotIntDer(false);
        }
        if (jCheckBox156.isSelected()) {
            oArticulacion.setRodillaRotIntIzq(true);
        } else {
            oArticulacion.setRodillaRotIntIzq(false);
        }

        if (jCheckBox157.isSelected()) {
            oArticulacion.setRodillaRotExtDer(true);
        } else {
            oArticulacion.setRodillaRotExtDer(false);
        }
        if (jCheckBox158.isSelected()) {
            oArticulacion.setRodillaRotExtIzq(true);
        } else {
            oArticulacion.setRodillaRotExtIzq(false);
        }

        if (jCheckBox159.isSelected()) {
            oArticulacion.setRodillaAbduDer(true);
        } else {
            oArticulacion.setRodillaAbduDer(false);
        }
        if (jCheckBox160.isSelected()) {
            oArticulacion.setRodillaAbduIzq(true);
        } else {
            oArticulacion.setRodillaAbduIzq(false);
        }

        if (jCheckBox161.isSelected()) {
            oArticulacion.setRodillaAduDer(true);
        } else {
            oArticulacion.setRodillaAduDer(false);
        }
        if (jCheckBox162.isSelected()) {
            oArticulacion.setRodillaAduIzq(true);
        } else {
            oArticulacion.setRodillaAduIzq(false);
        }

        if (jCheckBox163.isSelected()) {
            oArticulacion.setRodillaFuerzaDer(true);
        } else {
            oArticulacion.setRodillaFuerzaDer(false);
        }
        if (jCheckBox164.isSelected()) {
            oArticulacion.setRodillaFuerzaIzq(true);
        } else {
            oArticulacion.setRodillaFuerzaIzq(false);
        }

        if (jCheckBox165.isSelected()) {
            oArticulacion.setRodillaDolorDer(true);
        } else {
            oArticulacion.setRodillaDolorDer(false);
        }
        if (jCheckBox166.isSelected()) {
            oArticulacion.setRodillaDolorIzq(true);
        } else {
            oArticulacion.setRodillaDolorIzq(false);
        }
        //TOBILLO
        if (jCheckBox167.isSelected()) {
            oArticulacion.setTobilloFlexionDer(true);
        } else {
            oArticulacion.setTobilloFlexionDer(false);
        }
        if (jCheckBox168.isSelected()) {
            oArticulacion.setTobilloFlexionIzq(true);
        } else {
            oArticulacion.setTobilloFlexionIzq(false);
        }

        if (jCheckBox169.isSelected()) {
            oArticulacion.setTobilloExtensionDer(true);
        } else {
            oArticulacion.setTobilloExtensionDer(false);
        }
        if (jCheckBox170.isSelected()) {
            oArticulacion.setTobilloExtensionIzq(true);
        } else {
            oArticulacion.setTobilloExtensionIzq(false);
        }

        if (jCheckBox171.isSelected()) {
            oArticulacion.setTobilloRotIntDer(true);
        } else {
            oArticulacion.setTobilloRotIntDer(false);
        }
        if (jCheckBox172.isSelected()) {
            oArticulacion.setTobilloRotIntIzq(true);
        } else {
            oArticulacion.setTobilloRotIntIzq(false);
        }

        if (jCheckBox173.isSelected()) {
            oArticulacion.setTobilloRotExtDer(true);
        } else {
            oArticulacion.setTobilloRotExtDer(false);
        }
        if (jCheckBox174.isSelected()) {
            oArticulacion.setTobilloRotExtIzq(true);
        } else {
            oArticulacion.setTobilloRotExtIzq(false);
        }

        if (jCheckBox175.isSelected()) {
            oArticulacion.setTobilloAbduDer(true);
        } else {
            oArticulacion.setTobilloAbduDer(false);
        }
        if (jCheckBox176.isSelected()) {
            oArticulacion.setTobilloAbduIzq(true);
        } else {
            oArticulacion.setTobilloAbduIzq(false);
        }

        if (jCheckBox175.isSelected()) {
            oArticulacion.setTobilloAduDer(true);
        } else {
            oArticulacion.setTobilloAduDer(false);
        }
        if (jCheckBox176.isSelected()) {
            oArticulacion.setTobilloAduIzq(true);
        } else {
            oArticulacion.setTobilloAduIzq(false);
        }

        if (jCheckBox177.isSelected()) {
            oArticulacion.setTobilloAduDer(true);
        } else {
            oArticulacion.setTobilloAduDer(false);
        }
        if (jCheckBox178.isSelected()) {
            oArticulacion.setTobilloAduIzq(true);
        } else {
            oArticulacion.setTobilloAduIzq(false);
        }

        if (jCheckBox179.isSelected()) {
            oArticulacion.setTobilloFuerzaDer(true);
        } else {
            oArticulacion.setTobilloFuerzaDer(false);
        }
        if (jCheckBox180.isSelected()) {
            oArticulacion.setTobilloFuerzaIzq(true);
        } else {
            oArticulacion.setTobilloFuerzaIzq(false);
        }

        if (jCheckBox181.isSelected()) {
            oArticulacion.setTobilloDolorDer(true);
        } else {
            oArticulacion.setTobilloDolorDer(false);
        }
        if (jCheckBox182.isSelected()) {
            oArticulacion.setTobilloDolorIzq(true);
        } else {
            oArticulacion.setTobilloDolorIzq(false);
        }

        if (!jTextArea6.getText().trim().equals("")) {
            oArticulacion.setObservacion(jTextArea6.getText().trim().toUpperCase());
        } else {
            oArticulacion.setObservacion("");
        }
        if (jCheckBox27.isSelected()) {
            oArticulacion.setTodoNormal(true);
        } else {
            oArticulacion.setTodoNormal(false);
        }

        return oArticulacionBl.registrar(oArticulacion);

    }

    private void personalizarVistaTabla() {
        Utilitarios.formateaColumna(0, tblDx, 80);
    }

    private void agregarDx() {
        oDiagnosticoOsteomuscular = new DiagnosticoOsteomuscular();

        oDiagnosticoOsteomuscular.setDiagnostico(jTextField62.getText().trim().toUpperCase());
        oDiagnosticoOsteomuscular.setFichaOsteomuscular(oFichaOsteomuscular);
        oModeloDxOsteomuscular.add(oDiagnosticoOsteomuscular);
        jTextField62.requestFocus();
    }

    private void resetComponentDx() {
        jTextField62.setText("");
    }

    private DiagnosticoOsteomuscular registrarDxOsteomuscular() {
        if (oModeloDxOsteomuscular.size() > 0) {
            for (int i = 0; i < oModeloDxOsteomuscular.size(); i++) {
                oDiagnosticoOsteomuscular = new DiagnosticoOsteomuscular();
                oDiagnosticoOsteomuscularBl = new DiagnosticoOsteomuscularBl();
                oDiagnosticoOsteomuscular = oModeloDxOsteomuscular.get(i);
                oDiagnosticoOsteomuscular.setFichaOsteomuscular(oFichaOsteomuscular);
                oDiagnosticoOsteomuscularBl.registrar(oDiagnosticoOsteomuscular);
            }
            return oDiagnosticoOsteomuscular;
        } else {
            return null;
        }

    }

    void enviarDatosAtencionOcupacionalApanel(AtencionOcupacional oAtencionOcupacional) {
        this.oAtencionOcupacional = oAtencionOcupacional;
    }

    void enviarDatosUser(Usuario user, Persona per, Rol rol) {
        userTemp = user;
        perTemp = per;
        rolTemp = rol;
    }

    private void imprimirFicha(FichaOsteomuscular oFichaOsteomuscular) {
        try {
            ds = new DSConeccion(root.getConfig());
            reportGenric = new ReportGeneric(ds.getConeccion());
            reportGenric.setReportParent("/lissa/reportes/");
            reportPanel = reportGenric.mkReport("FichaOsteomuscular", new String[]{"ID_FICHA"}, new Object[]{oFichaOsteomuscular.getIdfichaosteomuscular()});
            reportVisor = new JInternalFrame();
            reportVisor.setTitle("Historia Clinica Digital");
            reportVisor.setIconifiable(true);
            reportVisor.setClosable(true);
            reportVisor.getContentPane().add(reportPanel);
            root.insertarInternalFrames(reportVisor);
            reportVisor.setMaximum(true);
        } catch (Exception ex) {
            Logger.getLogger(JPanel_EvaluacionOsteomuscular.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void resetComponentFicha() {
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup5.clearSelection();
        buttonGroup6.clearSelection();
        buttonGroup7.clearSelection();
        buttonGroup8.clearSelection();
        buttonGroup9.clearSelection();
        buttonGroup10.clearSelection();
        buttonGroup11.clearSelection();
        buttonGroup12.clearSelection();
        jTextField6.setText("");
        jTextField7.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jTextField1.setText("");
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox12.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
        jCheckBox16.setSelected(false);
        jCheckBox17.setSelected(false);
        jCheckBox18.setSelected(false);
        jCheckBox19.setSelected(false);
        jCheckBox20.setSelected(false);
        jCheckBox21.setSelected(false);
        jCheckBox22.setSelected(false);
        jCheckBox23.setSelected(false);
        jCheckBox24.setSelected(false);
        jCheckBox25.setSelected(false);
        jCheckBox26.setSelected(false);
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
        jTextArea4.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextArea5.setText("");
        jTextField62.setText("");
        oModeloDxOsteomuscular.clear();
        jCheckBox75.setSelected(false);
        jCheckBox76.setSelected(false);
        jCheckBox89.setSelected(false);
        jCheckBox90.setSelected(false);
        jCheckBox91.setSelected(false);
        jCheckBox92.setSelected(false);
        jCheckBox93.setSelected(false);
        jCheckBox94.setSelected(false);
        jCheckBox95.setSelected(false);
        jCheckBox96.setSelected(false);
        jCheckBox97.setSelected(false);
        jCheckBox98.setSelected(false);
        jCheckBox99.setSelected(false);
        jCheckBox100.setSelected(false);
        jCheckBox101.setSelected(false);
        jCheckBox102.setSelected(false);
        jCheckBox103.setSelected(false);
        jCheckBox104.setSelected(false);
        jCheckBox105.setSelected(false);
        jCheckBox106.setSelected(false);
        jCheckBox107.setSelected(false);
        jCheckBox108.setSelected(false);
        jCheckBox109.setSelected(false);
        jCheckBox110.setSelected(false);
        jCheckBox111.setSelected(false);
        jCheckBox112.setSelected(false);
        jCheckBox113.setSelected(false);
        jCheckBox114.setSelected(false);
        jCheckBox115.setSelected(false);
        jCheckBox116.setSelected(false);
        jCheckBox117.setSelected(false);
        jCheckBox118.setSelected(false);
        jCheckBox119.setSelected(false);
        jCheckBox120.setSelected(false);
        jCheckBox121.setSelected(false);
        jCheckBox122.setSelected(false);
        jCheckBox123.setSelected(false);
        jCheckBox124.setSelected(false);
        jCheckBox125.setSelected(false);
        jCheckBox126.setSelected(false);
        jCheckBox127.setSelected(false);
        jCheckBox128.setSelected(false);
        jCheckBox129.setSelected(false);
        jCheckBox130.setSelected(false);
        jCheckBox131.setSelected(false);
        jCheckBox132.setSelected(false);
        jCheckBox133.setSelected(false);
        jCheckBox134.setSelected(false);
        jCheckBox135.setSelected(false);
        jCheckBox136.setSelected(false);
        jCheckBox137.setSelected(false);
        jCheckBox138.setSelected(false);
        jCheckBox139.setSelected(false);
        jCheckBox140.setSelected(false);
        jCheckBox141.setSelected(false);
        jCheckBox142.setSelected(false);
        jCheckBox143.setSelected(false);
        jCheckBox144.setSelected(false);
        jCheckBox145.setSelected(false);
        jCheckBox146.setSelected(false);
        jCheckBox147.setSelected(false);
        jCheckBox148.setSelected(false);
        jCheckBox149.setSelected(false);
        jCheckBox150.setSelected(false);
        jCheckBox151.setSelected(false);
        jCheckBox152.setSelected(false);
        jCheckBox153.setSelected(false);
        jCheckBox154.setSelected(false);
        jCheckBox155.setSelected(false);
        jCheckBox156.setSelected(false);
        jCheckBox157.setSelected(false);
        jCheckBox158.setSelected(false);
        jCheckBox159.setSelected(false);
        jCheckBox160.setSelected(false);
        jCheckBox161.setSelected(false);
        jCheckBox162.setSelected(false);
        jCheckBox163.setSelected(false);
        jCheckBox164.setSelected(false);
        jCheckBox165.setSelected(false);
        jCheckBox166.setSelected(false);
        jCheckBox167.setSelected(false);
        jCheckBox168.setSelected(false);
        jCheckBox169.setSelected(false);
        jCheckBox170.setSelected(false);
        jCheckBox171.setSelected(false);
        jCheckBox172.setSelected(false);
        jCheckBox173.setSelected(false);
        jCheckBox174.setSelected(false);
        jCheckBox175.setSelected(false);
        jCheckBox176.setSelected(false);
        jCheckBox177.setSelected(false);
        jCheckBox178.setSelected(false);
        jCheckBox179.setSelected(false);
        jCheckBox180.setSelected(false);
        jCheckBox181.setSelected(false);
        jCheckBox182.setSelected(false);
        jCheckBox27.setSelected(false);
        jTextArea6.setText("");
        txaConclusiones.setText("");
    }

    private void habilitaComponentes() {
        jTextField6.setEnabled(true);
        jTextField7.setEnabled(true);
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
    }

    private void desHabilitaComponentes() {
        jTextField6.setEnabled(false);
        jTextField7.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
    }
}
