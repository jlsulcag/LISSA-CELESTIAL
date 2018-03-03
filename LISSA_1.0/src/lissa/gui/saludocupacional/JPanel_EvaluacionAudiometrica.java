package lissa.gui.saludocupacional;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lissa.be.AtencionOcupacional;
import lissa.be.FichaAudiometria;
import lissa.be.Persona;
import lissa.be.Rol;
import lissa.be.Usuario;
import lissa.bl.FichaAudiometriaBl;
import lissa.ds.DSConeccion;
import lissa.gui.JF_Principal;
import lissa.reportes.ReportGeneric;
import lissa.util.Mensajes;

public class JPanel_EvaluacionAudiometrica extends javax.swing.JPanel {

    private JF_Principal root;
    private AtencionOcupacional oAtencionOcupacional;
    private Usuario userTemp;
    private Persona perTemp;
    private Rol rolTemp;
    private FichaAudiometria oFichaAudiometria;
    private FichaAudiometriaBl oFichaAudiometriaBl;
    
    private ReportGeneric reportGenric = null;
    private JPanel reportPanel = null;
    private DSConeccion ds = null;
    private JInternalFrame reportVisor = null;

    public JPanel_EvaluacionAudiometrica(JF_Principal root) {
        initComponents();
        this.root = root;
        //centrarContenCbx();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jPanel32 = new javax.swing.JPanel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jPanel35 = new javax.swing.JPanel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jPanel43 = new javax.swing.JPanel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jPanel48 = new javax.swing.JPanel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jPanel53 = new javax.swing.JPanel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jPanel58 = new javax.swing.JPanel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jPanel63 = new javax.swing.JPanel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel111 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel113 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel114 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel115 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jPanel117 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Anamnesis_ruido = new javax.swing.JTextArea();
        jPanel66 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jPanel77 = new javax.swing.JPanel();
        jRadioButton22 = new javax.swing.JRadioButton();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jRadioButton23 = new javax.swing.JRadioButton();
        jPanel82 = new javax.swing.JPanel();
        jRadioButton24 = new javax.swing.JRadioButton();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel86 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jPanel90 = new javax.swing.JPanel();
        jRadioButton26 = new javax.swing.JRadioButton();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jRadioButton27 = new javax.swing.JRadioButton();
        jPanel95 = new javax.swing.JPanel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jPanel96 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel98 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        jPanel100 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel101 = new javax.swing.JPanel();
        jPanel102 = new javax.swing.JPanel();
        jRadioButton29 = new javax.swing.JRadioButton();
        jPanel103 = new javax.swing.JPanel();
        jRadioButton30 = new javax.swing.JRadioButton();
        jPanel104 = new javax.swing.JPanel();
        jPanel105 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        jPanel107 = new javax.swing.JPanel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jPanel108 = new javax.swing.JPanel();
        jRadioButton32 = new javax.swing.JRadioButton();
        jPanel109 = new javax.swing.JPanel();
        jPanel110 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        jPanel138 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel134 = new javax.swing.JPanel();
        jPanel140 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel141 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel135 = new javax.swing.JPanel();
        jPanel142 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel148 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel136 = new javax.swing.JPanel();
        jPanel144 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jPanel149 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel137 = new javax.swing.JPanel();
        jPanel146 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jPanel150 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(202, 237, 228));

        jPanel1.setBackground(new java.awt.Color(202, 237, 228));

        jPanel2.setBackground(new java.awt.Color(202, 237, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES O.R.L", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(6, 0));

        jPanel4.setLayout(new java.awt.GridLayout(0, 2));
        jPanel4.add(jLabel3);

        jPanel11.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SI");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NO");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.add(jLabel2);

        jPanel4.add(jPanel11);

        jPanel3.add(jPanel4);

        jPanel13.setLayout(new java.awt.GridLayout(0, 2));

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setText("1. Otits Cronica");
        jPanel14.add(jLabel4);

        jPanel13.add(jPanel14);

        jPanel15.setLayout(new java.awt.GridLayout(0, 2));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jRadioButton1);

        jPanel15.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jRadioButton2);

        jPanel15.add(jPanel6);

        jPanel13.add(jPanel15);

        jPanel3.add(jPanel13);

        jPanel17.setLayout(new java.awt.GridLayout(0, 2));

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setText("2. Ototoxicidad");
        jPanel18.add(jLabel5);

        jPanel17.add(jPanel18);

        jPanel16.setLayout(new java.awt.GridLayout(0, 2));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jRadioButton3);

        jPanel16.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jRadioButton4);

        jPanel16.add(jPanel8);

        jPanel17.add(jPanel16);

        jPanel3.add(jPanel17);

        jPanel21.setLayout(new java.awt.GridLayout(0, 2));

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setText("3. T.E.C.");
        jPanel22.add(jLabel6);

        jPanel21.add(jPanel22);

        jPanel20.setLayout(new java.awt.GridLayout(0, 2));

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jRadioButton5);

        jPanel20.add(jPanel9);

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jRadioButton6);

        jPanel20.add(jPanel12);

        jPanel21.add(jPanel20);

        jPanel3.add(jPanel21);

        jPanel25.setLayout(new java.awt.GridLayout(0, 2));

        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel26.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setText("4. Meningitis");
        jPanel26.add(jLabel7);

        jPanel25.add(jPanel26);

        jPanel24.setLayout(new java.awt.GridLayout(0, 2));

        jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel28.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup4.add(jRadioButton7);
        jRadioButton7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel28.add(jRadioButton7);

        jPanel24.add(jPanel28);

        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel32.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel32.add(jRadioButton8);

        jPanel24.add(jPanel32);

        jPanel25.add(jPanel24);

        jPanel3.add(jPanel25);

        jPanel29.setLayout(new java.awt.GridLayout(0, 2));

        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel30.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setText("5. Rinitis");
        jPanel30.add(jLabel8);

        jPanel29.add(jPanel30);

        jPanel33.setLayout(new java.awt.GridLayout(0, 2));

        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel34.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup5.add(jRadioButton9);
        jRadioButton9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel34.add(jRadioButton9);

        jPanel33.add(jPanel34);

        jPanel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel35.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup5.add(jRadioButton10);
        jRadioButton10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel35.add(jRadioButton10);

        jPanel33.add(jPanel35);

        jPanel29.add(jPanel33);

        jPanel3.add(jPanel29);

        jPanel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel36.setLayout(new java.awt.GridLayout(6, 0));

        jPanel37.setLayout(new java.awt.GridLayout(0, 2));
        jPanel37.add(jLabel9);

        jPanel38.setLayout(new java.awt.GridLayout(0, 2));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SI");
        jLabel10.setToolTipText("");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel38.add(jLabel10);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("NO");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel38.add(jLabel11);

        jPanel37.add(jPanel38);

        jPanel36.add(jPanel37);

        jPanel39.setLayout(new java.awt.GridLayout(0, 2));

        jPanel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel40.setLayout(new java.awt.GridLayout(1, 0));

        jLabel12.setText("6.  Parotiditis");
        jPanel40.add(jLabel12);

        jPanel39.add(jPanel40);

        jPanel41.setLayout(new java.awt.GridLayout(0, 2));

        jPanel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel42.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup6.add(jRadioButton11);
        jRadioButton11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel42.add(jRadioButton11);

        jPanel41.add(jPanel42);

        jPanel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel43.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup6.add(jRadioButton12);
        jRadioButton12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel43.add(jRadioButton12);

        jPanel41.add(jPanel43);

        jPanel39.add(jPanel41);

        jPanel36.add(jPanel39);

        jPanel44.setLayout(new java.awt.GridLayout(0, 2));

        jPanel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel45.setLayout(new java.awt.GridLayout(1, 0));

        jLabel13.setText("7. Sarampión");
        jPanel45.add(jLabel13);

        jPanel44.add(jPanel45);

        jPanel46.setLayout(new java.awt.GridLayout(0, 2));

        jPanel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel47.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup7.add(jRadioButton13);
        jRadioButton13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel47.add(jRadioButton13);

        jPanel46.add(jPanel47);

        jPanel48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel48.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup7.add(jRadioButton14);
        jRadioButton14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel48.add(jRadioButton14);

        jPanel46.add(jPanel48);

        jPanel44.add(jPanel46);

        jPanel36.add(jPanel44);

        jPanel49.setLayout(new java.awt.GridLayout(0, 2));

        jPanel50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel50.setLayout(new java.awt.GridLayout(1, 0));

        jLabel14.setText("8. Walkman");
        jPanel50.add(jLabel14);

        jPanel49.add(jPanel50);

        jPanel51.setLayout(new java.awt.GridLayout(0, 2));

        jPanel52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel52.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup8.add(jRadioButton15);
        jRadioButton15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel52.add(jRadioButton15);

        jPanel51.add(jPanel52);

        jPanel53.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel53.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup8.add(jRadioButton16);
        jRadioButton16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel53.add(jRadioButton16);

        jPanel51.add(jPanel53);

        jPanel49.add(jPanel51);

        jPanel36.add(jPanel49);

        jPanel54.setLayout(new java.awt.GridLayout(0, 2));

        jPanel55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel55.setLayout(new java.awt.GridLayout(1, 0));

        jLabel15.setText("9. Trauma Auditivo");
        jPanel55.add(jLabel15);

        jPanel54.add(jPanel55);

        jPanel56.setLayout(new java.awt.GridLayout(0, 2));

        jPanel57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel57.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup9.add(jRadioButton17);
        jRadioButton17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel57.add(jRadioButton17);

        jPanel56.add(jPanel57);

        jPanel58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel58.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup9.add(jRadioButton18);
        jRadioButton18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel58.add(jRadioButton18);

        jPanel56.add(jPanel58);

        jPanel54.add(jPanel56);

        jPanel36.add(jPanel54);

        jPanel59.setLayout(new java.awt.GridLayout(0, 2));

        jPanel60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel60.setLayout(new java.awt.GridLayout(1, 0));

        jLabel16.setText("10. Otros");
        jPanel60.add(jLabel16);

        jPanel59.add(jPanel60);

        jPanel61.setLayout(new java.awt.GridLayout(0, 2));

        jPanel62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel62.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup10.add(jRadioButton19);
        jRadioButton19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel62.add(jRadioButton19);

        jPanel61.add(jPanel62);

        jPanel63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel63.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup10.add(jRadioButton20);
        jRadioButton20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel63.add(jRadioButton20);

        jPanel61.add(jPanel63);

        jPanel59.add(jPanel61);

        jPanel36.add(jPanel59);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("OTROS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel64.setBackground(new java.awt.Color(202, 237, 228));
        jPanel64.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OCUPACIONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel17.setText("Trabajos anteriores con exposicion a ruido: (Equipos pesados en operaciones de mina, chancadora, molienda,  remolienda");

        jLabel54.setText(" en la concentradora, estación de bombeo, etc.) Especificar periodo, horario y niveles de ruido de ser posible:");

        jPanel111.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel112.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Protección auricular personal en areas de ruido");

        javax.swing.GroupLayout jPanel112Layout = new javax.swing.GroupLayout(jPanel112);
        jPanel112.setLayout(jPanel112Layout);
        jPanel112Layout.setHorizontalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel112Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel112Layout.setVerticalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel112Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        jPanel113.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("TIEMPO DE USO");

        javax.swing.GroupLayout jPanel113Layout = new javax.swing.GroupLayout(jPanel113);
        jPanel113.setLayout(jPanel113Layout);
        jPanel113Layout.setHorizontalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel113Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel113Layout.setVerticalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel113Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        jPanel114.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel114.setLayout(new java.awt.GridLayout(4, 1));

        jLabel21.setText("Tapones");
        jPanel114.add(jLabel21);

        jLabel24.setText("Orejeras");
        jPanel114.add(jLabel24);

        jLabel25.setText("Algodones");
        jPanel114.add(jLabel25);

        jLabel26.setText("Otros");
        jPanel114.add(jLabel26);

        jPanel115.setBackground(new java.awt.Color(202, 237, 228));
        jPanel115.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel115.setLayout(new java.awt.GridLayout(4, 1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "SIEMPRE", "EN OCASIONES", "NUNCA", " " }));
        jPanel115.add(jComboBox5);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "SIEMPRE", "EN OCASIONES", "NUNCA", " " }));
        jPanel115.add(jComboBox6);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "SIEMPRE", "EN OCASIONES", "NUNCA", " " }));
        jPanel115.add(jComboBox7);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "SIEMPRE", "EN OCASIONES", "NUNCA", " " }));
        jPanel115.add(jComboBox8);

        javax.swing.GroupLayout jPanel111Layout = new javax.swing.GroupLayout(jPanel111);
        jPanel111.setLayout(jPanel111Layout);
        jPanel111Layout.setHorizontalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel111Layout.createSequentialGroup()
                .addGroup(jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel111Layout.setVerticalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel111Layout.createSequentialGroup()
                .addGroup(jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel117.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Anamnesis_ruido.setColumns(20);
        Anamnesis_ruido.setRows(5);
        jScrollPane4.setViewportView(Anamnesis_ruido);

        javax.swing.GroupLayout jPanel117Layout = new javax.swing.GroupLayout(jPanel117);
        jPanel117.setLayout(jPanel117Layout);
        jPanel117Layout.setHorizontalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );
        jPanel117Layout.setVerticalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel54))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel64Layout.createSequentialGroup()
                    .addComponent(jPanel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 291, Short.MAX_VALUE)))
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                    .addGap(0, 420, Short.MAX_VALUE)
                    .addComponent(jPanel117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addComponent(jPanel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addComponent(jPanel117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
        );

        jPanel66.setBackground(new java.awt.Color(202, 237, 228));
        jPanel66.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SINTOMATOLOGÍA ACTUAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel70.setBackground(new java.awt.Color(202, 237, 228));
        jPanel70.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel70.setLayout(new java.awt.GridLayout(3, 0));

        jPanel71.setLayout(new java.awt.GridLayout(0, 2));
        jPanel71.add(jLabel22);

        jPanel72.setLayout(new java.awt.GridLayout(0, 2));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("SI");
        jLabel23.setToolTipText("");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel72.add(jLabel23);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("NO");
        jLabel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel72.add(jLabel31);

        jPanel71.add(jPanel72);

        jPanel70.add(jPanel71);

        jPanel73.setBackground(new java.awt.Color(202, 237, 228));
        jPanel73.setLayout(new java.awt.GridLayout(0, 2));

        jPanel74.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel74.setLayout(new java.awt.GridLayout(1, 0));

        jLabel32.setText("Acúfenos");
        jPanel74.add(jLabel32);

        jPanel73.add(jPanel74);

        jPanel75.setLayout(new java.awt.GridLayout(0, 2));

        jPanel76.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel76.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup11.add(jRadioButton21);
        jRadioButton21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel76.add(jRadioButton21);

        jPanel75.add(jPanel76);

        jPanel77.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel77.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup11.add(jRadioButton22);
        jRadioButton22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel77.add(jRadioButton22);

        jPanel75.add(jPanel77);

        jPanel73.add(jPanel75);

        jPanel70.add(jPanel73);

        jPanel78.setBackground(new java.awt.Color(202, 237, 228));
        jPanel78.setLayout(new java.awt.GridLayout(0, 2));

        jPanel79.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel79.setLayout(new java.awt.GridLayout(1, 0));

        jLabel33.setText("Vértigo");
        jPanel79.add(jLabel33);

        jPanel78.add(jPanel79);

        jPanel80.setLayout(new java.awt.GridLayout(0, 2));

        jPanel81.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel81.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup12.add(jRadioButton23);
        jRadioButton23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel81.add(jRadioButton23);

        jPanel80.add(jPanel81);

        jPanel82.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel82.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup12.add(jRadioButton24);
        jRadioButton24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel82.add(jRadioButton24);

        jPanel80.add(jPanel82);

        jPanel78.add(jPanel80);

        jPanel70.add(jPanel78);

        jPanel83.setBackground(new java.awt.Color(202, 237, 228));
        jPanel83.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel83.setLayout(new java.awt.GridLayout(3, 0));

        jPanel84.setLayout(new java.awt.GridLayout(0, 2));
        jPanel84.add(jLabel34);

        jPanel85.setLayout(new java.awt.GridLayout(0, 2));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("SI");
        jLabel35.setToolTipText("");
        jLabel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel85.add(jLabel35);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("NO");
        jLabel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel85.add(jLabel36);

        jPanel84.add(jPanel85);

        jPanel83.add(jPanel84);

        jPanel86.setBackground(new java.awt.Color(202, 237, 228));
        jPanel86.setLayout(new java.awt.GridLayout(0, 2));

        jPanel87.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel87.setLayout(new java.awt.GridLayout(1, 0));

        jLabel37.setText("Hipoacusia");
        jPanel87.add(jLabel37);

        jPanel86.add(jPanel87);

        jPanel88.setLayout(new java.awt.GridLayout(0, 2));

        jPanel89.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel89.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup13.add(jRadioButton25);
        jRadioButton25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel89.add(jRadioButton25);

        jPanel88.add(jPanel89);

        jPanel90.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel90.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup13.add(jRadioButton26);
        jRadioButton26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel90.add(jRadioButton26);

        jPanel88.add(jPanel90);

        jPanel86.add(jPanel88);

        jPanel83.add(jPanel86);

        jPanel91.setBackground(new java.awt.Color(202, 237, 228));
        jPanel91.setLayout(new java.awt.GridLayout(0, 2));

        jPanel92.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel92.setLayout(new java.awt.GridLayout(1, 0));

        jLabel38.setText("Otalgia");
        jPanel92.add(jLabel38);

        jPanel91.add(jPanel92);

        jPanel93.setLayout(new java.awt.GridLayout(0, 2));

        jPanel94.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel94.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup14.add(jRadioButton27);
        jRadioButton27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel94.add(jRadioButton27);

        jPanel93.add(jPanel94);

        jPanel95.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel95.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup14.add(jRadioButton28);
        jRadioButton28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel95.add(jRadioButton28);

        jPanel93.add(jPanel95);

        jPanel91.add(jPanel93);

        jPanel83.add(jPanel91);

        jPanel96.setBackground(new java.awt.Color(202, 237, 228));
        jPanel96.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel96.setLayout(new java.awt.GridLayout(3, 0));

        jPanel97.setLayout(new java.awt.GridLayout(0, 2));
        jPanel97.add(jLabel39);

        jPanel98.setLayout(new java.awt.GridLayout(0, 2));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("SI");
        jLabel40.setToolTipText("");
        jLabel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel98.add(jLabel40);

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("NO");
        jLabel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel98.add(jLabel41);

        jPanel97.add(jPanel98);

        jPanel96.add(jPanel97);

        jPanel99.setLayout(new java.awt.GridLayout(0, 2));

        jPanel100.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel100.setLayout(new java.awt.GridLayout(2, 0));

        jLabel42.setText("Exposición reciente a ruido");
        jPanel100.add(jLabel42);

        jLabel43.setText("(14 Horas previas)");
        jPanel100.add(jLabel43);

        jPanel99.add(jPanel100);

        jPanel101.setLayout(new java.awt.GridLayout(0, 2));

        jPanel102.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel102.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup15.add(jRadioButton29);
        jRadioButton29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel102.add(jRadioButton29);

        jPanel101.add(jPanel102);

        jPanel103.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel103.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup15.add(jRadioButton30);
        jRadioButton30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel103.add(jRadioButton30);

        jPanel101.add(jPanel103);

        jPanel99.add(jPanel101);

        jPanel96.add(jPanel99);

        jPanel104.setLayout(new java.awt.GridLayout(0, 2));

        jPanel105.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel105.setLayout(new java.awt.GridLayout(2, 0));

        jLabel44.setText("Prácticas ruidosas tiro,");
        jPanel105.add(jLabel44);

        jLabel45.setText("frecuencia de Discotecas");
        jPanel105.add(jLabel45);

        jPanel104.add(jPanel105);

        jPanel106.setLayout(new java.awt.GridLayout(0, 2));

        jPanel107.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel107.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup16.add(jRadioButton31);
        jRadioButton31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel107.add(jRadioButton31);

        jPanel106.add(jPanel107);

        jPanel108.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel108.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup16.add(jRadioButton32);
        jRadioButton32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel108.add(jRadioButton32);

        jPanel106.add(jPanel108);

        jPanel104.add(jPanel106);

        jPanel96.add(jPanel104);

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel96, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jPanel83, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel109.setBackground(new java.awt.Color(202, 237, 228));
        jPanel109.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMEN ORL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel110.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel110.setLayout(new java.awt.GridLayout(5, 0));

        jPanel133.setLayout(new java.awt.GridLayout(0, 2));

        jPanel138.setLayout(new java.awt.GridLayout(1, 0));
        jPanel133.add(jPanel138);

        jPanel139.setLayout(new java.awt.GridLayout(1, 2));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("O. DERECHO");
        jLabel46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel139.add(jLabel46);

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("O. IZQUIERDO");
        jLabel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel139.add(jLabel47);

        jPanel133.add(jPanel139);

        jPanel110.add(jPanel133);

        jPanel134.setLayout(new java.awt.GridLayout(0, 2));

        jPanel140.setLayout(new java.awt.GridLayout(1, 0));

        jLabel55.setText("Pabellon Auricular");
        jLabel55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel140.add(jLabel55);

        jPanel134.add(jPanel140);

        jPanel141.setLayout(new java.awt.GridLayout(1, 2));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel141.add(jTextField1);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel141.add(jTextField2);

        jPanel134.add(jPanel141);

        jPanel110.add(jPanel134);

        jPanel135.setLayout(new java.awt.GridLayout(0, 2));

        jPanel142.setLayout(new java.awt.GridLayout(1, 0));

        jLabel56.setText("C. Auditivo  Ext.");
        jLabel56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel142.add(jLabel56);

        jPanel135.add(jPanel142);

        jPanel148.setLayout(new java.awt.GridLayout(1, 2));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel148.add(jTextField3);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel148.add(jTextField4);

        jPanel135.add(jPanel148);

        jPanel110.add(jPanel135);

        jPanel136.setLayout(new java.awt.GridLayout(0, 2));

        jPanel144.setLayout(new java.awt.GridLayout(1, 0));

        jLabel57.setText("Timpano");
        jLabel57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel144.add(jLabel57);

        jPanel136.add(jPanel144);

        jPanel149.setLayout(new java.awt.GridLayout(1, 2));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel149.add(jTextField5);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel149.add(jTextField6);

        jPanel136.add(jPanel149);

        jPanel110.add(jPanel136);

        jPanel137.setLayout(new java.awt.GridLayout(0, 2));

        jPanel146.setLayout(new java.awt.GridLayout(1, 0));

        jLabel58.setText("Fosas Nasales");
        jLabel58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel146.add(jLabel58);

        jPanel137.add(jPanel146);

        jPanel150.setLayout(new java.awt.GridLayout(1, 2));

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel150.add(jTextField7);

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel150.add(jTextField8);

        jPanel137.add(jPanel150);

        jPanel110.add(jPanel137);

        javax.swing.GroupLayout jPanel109Layout = new javax.swing.GroupLayout(jPanel109);
        jPanel109.setLayout(jPanel109Layout);
        jPanel109Layout.setHorizontalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel109Layout.setVerticalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel109Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel110, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(202, 237, 228));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONCLUSIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(202, 237, 228));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RECOMENDACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/cancel.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetComponent();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (isDatosValidos()) {
            oFichaAudiometria = registrar();
            if (oFichaAudiometria != null) {
                Mensajes.msjRegCorrecta();
                imprimir(oFichaAudiometria);
                resetComponent();
            } else {
                Mensajes.msjRegError();
            }
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS DATOS", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Componentes">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Anamnesis_ruido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
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
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
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
    private javax.swing.JPanel jPanel66;
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
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
    /*
     *METODO PARA CENTRAR CONTENIDO DE LOS COMBOBOX
     private void centrarContenCbx() {
     DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
     dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
     jComboBox5.setRenderer(dlcr);
     }
     */

    private void resetComponent() {
        buttonGroup1.clearSelection();
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
        buttonGroup13.clearSelection();
        buttonGroup14.clearSelection();
        buttonGroup15.clearSelection();
        buttonGroup16.clearSelection();
        jTextArea1.setText("");
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jComboBox7.setSelectedIndex(0);
        jComboBox8.setSelectedIndex(0);
        Anamnesis_ruido.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
    }

    void enviarDatosAtencionOcupacionalApanel(AtencionOcupacional oAtencionOcupacional) {
        this.oAtencionOcupacional = oAtencionOcupacional;
    }

    void enviarDatosUser(Usuario userTemp, Persona perTemp, Rol rolTemp) {
        this.userTemp = userTemp;
        this.perTemp = perTemp;
        this.rolTemp = rolTemp;
    }

    private FichaAudiometria registrar() {
        oFichaAudiometria = new FichaAudiometria();
        oFichaAudiometriaBl = new FichaAudiometriaBl();

        oFichaAudiometria.setAtencionOcupacional(oAtencionOcupacional);
        oFichaAudiometria.setIdUsuario(userTemp.getIdUsuario());
        if (jRadioButton1.isSelected()) {
            oFichaAudiometria.setOtitsCronica(Boolean.TRUE);
        } else if (jRadioButton2.isSelected()) {
            oFichaAudiometria.setOtitsCronica(Boolean.FALSE);
        }
        if (jRadioButton3.isSelected()) {
            oFichaAudiometria.setOtotoxidad(Boolean.TRUE);
        } else if (jRadioButton4.isSelected()) {
            oFichaAudiometria.setOtotoxidad(Boolean.FALSE);
        }
        if (jRadioButton5.isSelected()) {
            oFichaAudiometria.setTec(Boolean.TRUE);
        } else if (jRadioButton6.isSelected()) {
            oFichaAudiometria.setTec(Boolean.FALSE);
        }
        if (jRadioButton7.isSelected()) {
            oFichaAudiometria.setMeningitis(Boolean.TRUE);
        } else if (jRadioButton8.isSelected()) {
            oFichaAudiometria.setMeningitis(Boolean.FALSE);
        }
        if (jRadioButton9.isSelected()) {
            oFichaAudiometria.setRinitis(Boolean.TRUE);
        } else if (jRadioButton10.isSelected()) {
            oFichaAudiometria.setRinitis(Boolean.FALSE);
        }
        if (jRadioButton11.isSelected()) {
            oFichaAudiometria.setParotiditis(Boolean.TRUE);
        } else if (jRadioButton12.isSelected()) {
            oFichaAudiometria.setParotiditis(Boolean.FALSE);
        }
        if (jRadioButton13.isSelected()) {
            oFichaAudiometria.setSarampion(Boolean.TRUE);
        } else if (jRadioButton14.isSelected()) {
            oFichaAudiometria.setSarampion(Boolean.FALSE);
        }
        if (jRadioButton15.isSelected()) {
            oFichaAudiometria.setWalkman(Boolean.TRUE);
        } else if (jRadioButton16.isSelected()) {
            oFichaAudiometria.setWalkman(Boolean.FALSE);
        }
        if (jRadioButton17.isSelected()) {
            oFichaAudiometria.setTraumaAuditivo(Boolean.TRUE);
        } else if (jRadioButton18.isSelected()) {
            oFichaAudiometria.setTraumaAuditivo(Boolean.FALSE);
        }
        if (!jTextArea1.getText().toUpperCase().trim().equals("")) {
            oFichaAudiometria.setOtros(jTextArea1.getText().toUpperCase().trim());
        } else {
            oFichaAudiometria.setOtros("");
        }
        if (jComboBox5.getSelectedIndex() > 0) {
            oFichaAudiometria.setTampones(jComboBox5.getSelectedItem().toString());
        } else {
            oFichaAudiometria.setTampones("---");
        }
        if (jComboBox6.getSelectedIndex() > 0) {
            oFichaAudiometria.setOrejanas(jComboBox6.getSelectedItem().toString());
        } else {
            oFichaAudiometria.setOrejanas("---");
        }
        if (jComboBox7.getSelectedIndex() > 0) {
            oFichaAudiometria.setAlgodones(jComboBox7.getSelectedItem().toString());
        } else {
            oFichaAudiometria.setAlgodones("---");
        }
        if (jComboBox8.getSelectedIndex() > 0) {
            oFichaAudiometria.setOtrosProtecAuric(jComboBox8.getSelectedItem().toString());
        } else {
            oFichaAudiometria.setOtrosProtecAuric("---");
        }
        if (!Anamnesis_ruido.getText().toUpperCase().trim().equals("")) {
            oFichaAudiometria.setOcupacionalesObserv(Anamnesis_ruido.getText().toUpperCase().trim());
        } else {
            oFichaAudiometria.setOcupacionalesObserv("");
        }
        if (jRadioButton21.isSelected()) {
            oFichaAudiometria.setAcufenos(Boolean.TRUE);
        } else if (jRadioButton22.isSelected()) {
            oFichaAudiometria.setAcufenos(Boolean.FALSE);
        }
        if (jRadioButton23.isSelected()) {
            oFichaAudiometria.setVertigo(Boolean.TRUE);
        } else if (jRadioButton24.isSelected()) {
            oFichaAudiometria.setVertigo(Boolean.FALSE);
        }
        if (jRadioButton25.isSelected()) {
            oFichaAudiometria.setHipoacusia(Boolean.TRUE);
        } else if (jRadioButton26.isSelected()) {
            oFichaAudiometria.setHipoacusia(Boolean.FALSE);
        }
        if (jRadioButton27.isSelected()) {
            oFichaAudiometria.setOtalgia(Boolean.TRUE);
        } else if (jRadioButton28.isSelected()) {
            oFichaAudiometria.setOtalgia(Boolean.FALSE);
        }
        if (jRadioButton29.isSelected()) {
            oFichaAudiometria.setEsposicionRecienteRuido(Boolean.TRUE);
        } else if (jRadioButton30.isSelected()) {
            oFichaAudiometria.setEsposicionRecienteRuido(Boolean.FALSE);
        }
        if (jRadioButton31.isSelected()) {
            oFichaAudiometria.setPracticasRuidosas(Boolean.TRUE);
        } else if (jRadioButton32.isSelected()) {
            oFichaAudiometria.setPracticasRuidosas(Boolean.FALSE);
        }
        oFichaAudiometria.setPabellonDer(jTextField1.getText().toUpperCase().trim());
        oFichaAudiometria.setPabellonIzq(jTextField2.getText().toUpperCase().trim());
        oFichaAudiometria.setAuditivoDer(jTextField3.getText().toUpperCase().trim());
        oFichaAudiometria.setAuditivoIzq(jTextField4.getText().toUpperCase().trim());
        oFichaAudiometria.setTimpanoDer(jTextField5.getText().toUpperCase().trim());
        oFichaAudiometria.setTimpanoIzq(jTextField6.getText().toUpperCase().trim());
        oFichaAudiometria.setFosasNasalesDer(jTextField7.getText().toUpperCase().trim());
        oFichaAudiometria.setFosasNasalesIzq(jTextField8.getText().toUpperCase().trim());
        oFichaAudiometria.setConclusion(jTextArea2.getText().toUpperCase().trim());
        oFichaAudiometria.setRecomendaciones(jTextArea3.getText().toUpperCase().trim());

        return oFichaAudiometriaBl.registrar(oFichaAudiometria);
    }

    private boolean isDatosValidos() {
        return true;
    }

    private void imprimir(FichaAudiometria oFichaAudiometria) {
        try {
            ds = new DSConeccion(root.getConfig());
            reportGenric = new ReportGeneric(ds.getConeccion());
            reportGenric.setReportParent("/lissa/reportes/");
            reportPanel = reportGenric.mkReport("FichaAudiometria", new String[]{"ID_FICHA"}, new Object[]{oFichaAudiometria.getIdfichaaudiometria()});
            reportVisor = new JInternalFrame();
            reportVisor.setTitle("Historia Clinica Digital");
            reportVisor.setIconifiable(true);
            reportVisor.setClosable(true);
            reportVisor.getContentPane().add(reportPanel);
            root.insertarInternalFrames(reportVisor);
            reportVisor.setMaximum(true);
        } catch (Exception ex) {
            Logger.getLogger(JPanel_EvaluacionAudiometrica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
