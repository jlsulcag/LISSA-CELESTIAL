package lissa.gui.saludocupacional;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import lissa.be.AtencionOcupacional;
import lissa.be.Cie10;
import lissa.be.ExamenClinico;
import lissa.be.FichaMedicoOcupacional;
import lissa.be.FichaPsicologica;
import lissa.be.FichaPsicologicaPsicotecnico;
import lissa.be.HabitoNocivo;
import lissa.be.HistoriaClinica;
import lissa.be.Persona;
import lissa.be.Rol;
import lissa.be.SoFmoAbsentismo;
import lissa.be.SoFmoAntecedentesPatFam;
import lissa.be.SoFmoAntecedentesPatPer;
import lissa.be.SoFmoConclusiones;
import lissa.be.SoFmoDiagnosticos;
import lissa.be.SoFmoEvaluacionMedica;
import lissa.be.SoFmoExamenFisico;
import lissa.be.SoFmoHabitos;
import lissa.be.Usuario;
import lissa.bl.ExamenClinicoBl;
import lissa.bl.FichaAudiometriaBl;
import lissa.bl.FichaMedicoOcupBl;
import lissa.bl.FichaOftalmologicaBl;
import lissa.bl.FichaOsteomuscularBl;
import lissa.bl.FichaPsicologicaBl;
import lissa.bl.FichaPsicologicaPsicotecnicoBl;
import lissa.bl.HabitoNocivoBl;
import lissa.bl.SoFmoAbsentismoBl;
import lissa.bl.SoFmoAntecedentesOcupacionalesBl;
import lissa.bl.SoFmoAntecedentesPatFamBl;
import lissa.bl.SoFmoAntecedentesPatPerBl;
import lissa.bl.SoFmoConclusionesBl;
import lissa.bl.SoFmoDiagnosticosBl;
import lissa.bl.SoFmoEvaluacionMedicaBl;
import lissa.bl.SoFmoExamenFisicoBl;
import lissa.bl.SoFmoHabitosBl;
import lissa.controller.HabitoNocivoCtrl;
import lissa.ds.DSConeccion;
import lissa.gui.JF_Principal;
import lissa.gui.JIF_AdminCie10;
import lissa.reportes.ReportGeneric;
import lissa.table.ModeloSoFmoAbsentismo;
import lissa.table.ModeloSoFmoAntOcup;
import lissa.table.ModeloSoFmoDiagnostico;
import lissa.table.ModeloSoFmoHabito;
import lissa.util.Mensajes;

public class JPanel_FichaMedicoOcupacional extends javax.swing.JPanel {

    private JF_Principal root;

    private AtencionOcupacional oAtencionOcupacional;
    private Usuario userTemp;
    private Persona perTemp;
    private Rol rolTemp;

    private int numeroFicha = 0;

    private HabitoNocivoCtrl oHabitoNocivoCtrl;
    private SoFmoHabitos oSoFmoHabitos;
    private SoFmoHabitosBl oSoFmoHabitosBl;
    private ModeloSoFmoHabito oModeloSoFmoHabito;
    private SoFmoAbsentismo oSoFmoAbsentismo;
    private SoFmoAbsentismoBl oSoFmoAbsentismoBl;
    private ModeloSoFmoAbsentismo oModeloSoFmoAbsentismo;
    private FichaMedicoOcupacional oFichaMedicoOcupacional;
    private FichaMedicoOcupBl oFichaMedicoOcupBl;
    private SoFmoDiagnosticos oSoFmoDiagnosticos;
    private SoFmoDiagnosticosBl oSoFmoDiagnosticosBl;
    private SoFmoExamenFisico oSoFmoExamenFisico;
    private SoFmoExamenFisicoBl oSoFmoExamenFisicoBl;
    private SoFmoConclusiones oSoFmoConclusiones;
    private SoFmoConclusionesBl oSoFmoConclusionesBl;
    private SoFmoAntecedentesPatPer oSoFmoAntecedentesPatPer;
    private SoFmoAntecedentesPatPerBl oSoFmoAntecedentesPatPerBl;
    private SoFmoEvaluacionMedica oSoFmoEvaluacionMedica;
    private SoFmoEvaluacionMedicaBl oSoFmoEvaluacionMedicaBl;
    private SoFmoAntecedentesPatFam oSoFmoAntecedentesPatFam;
    private SoFmoAntecedentesPatFamBl oSoFmoAntecedentesPatFamBl;
    private ModeloSoFmoAntOcup oModeloSoFmoAntOcup;
    private SoFmoAntecedentesOcupacionalesBl oSoFmoAntecedentesOcupacionalesBl;

    private FichaPsicologicaBl oFichaPsicologicaBl;
    private FichaPsicologica oFichaPsicologica;
    private FichaPsicologicaPsicotecnicoBl oFichaPsicologicaPsicotecnicoBl;
    private FichaPsicologicaPsicotecnico oFichaPsicologicaPsicotecnico;
    private FichaOftalmologicaBl oFichaOftalmologicaBl;
    private FichaAudiometriaBl oFichaAudiometriaBl;
    private FichaOsteomuscularBl oFichaOsteomuscularBl;

    private ExamenClinico oExamenClinico;
    private ExamenClinicoBl oExamenClinicoBl;

    private Cie10 oCie10;
    private ModeloSoFmoDiagnostico oModeloSoFmoDiagnostico;
    
     private ReportGeneric reportGenric = null;
    private JPanel reportPanel = null;
    private DSConeccion ds = null;
    private JInternalFrame reportVisor = null;

    public JPanel_FichaMedicoOcupacional(JF_Principal root) {
        initComponents();
        this.root = root;
        oHabitoNocivoCtrl = new HabitoNocivoCtrl(root);
        oHabitoNocivoCtrl.rellenaHabitoNocivo(cbxHabitos);
        oModeloSoFmoHabito = new ModeloSoFmoHabito();
        tblHabitos.setModel(oModeloSoFmoHabito);
        oModeloSoFmoAbsentismo = new ModeloSoFmoAbsentismo();
        tblAbsentismo.setModel(oModeloSoFmoAbsentismo);
        oModeloSoFmoAntOcup = new ModeloSoFmoAntOcup();
        tblAntecedentesOcupacionales.setModel(oModeloSoFmoAntOcup);
        oModeloSoFmoDiagnostico = new ModeloSoFmoDiagnostico();
        tblSoFmoDiagnostico.setModel(oModeloSoFmoDiagnostico);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        chbxAlergias = new javax.swing.JCheckBox();
        chbxDiabetes = new javax.swing.JCheckBox();
        chbxTbc = new javax.swing.JCheckBox();
        chbxHepatitisB = new javax.swing.JCheckBox();
        chbxAsma = new javax.swing.JCheckBox();
        chbxHta = new javax.swing.JCheckBox();
        chbxIts = new javax.swing.JCheckBox();
        chbxTifoidea = new javax.swing.JCheckBox();
        chbxBronquitis = new javax.swing.JCheckBox();
        chbxNeoplasia = new javax.swing.JCheckBox();
        chbxConvulsiones = new javax.swing.JCheckBox();
        chbxQuemaduras = new javax.swing.JCheckBox();
        chbxCirugias = new javax.swing.JCheckBox();
        chbxIntoxicaciones = new javax.swing.JCheckBox();
        chbxOtros = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabitos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        cbxHabitos = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txfTipoHabito = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txfCantidadHabito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txfFrecuenciaHabito = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txfPadre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txfMadre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txfHermanos = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txfEsposo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txfHijosVivos = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txfNumHijosVivos = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txfHijosFallecidos = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txfNumHijosFallecidos = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txfEnfermedadAccidente = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        rbtnAbsentismoSi = new javax.swing.JRadioButton();
        rbtnAbsentismoNo = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        txfAnio = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txfDiasDescanso = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAbsentismo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAntecedentesOcupacionales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txfNumFichaMedica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jdcFechaFichaMedica = new com.toedter.calendar.JDateChooser();
        jButton11 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        chbxSistemaNervioso = new javax.swing.JCheckBox();
        txfSistemaNervioso = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        chbxPiel = new javax.swing.JCheckBox();
        txfPiel = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        chbxCabello = new javax.swing.JCheckBox();
        txfCabello = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        chbxSistemaLinfatico = new javax.swing.JCheckBox();
        txfSistemaLinfatico = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        chbxMiembrosInferiores = new javax.swing.JCheckBox();
        txfMiembrosInferiores = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        chbxMiembrosSuperiores = new javax.swing.JCheckBox();
        txfMiembrosSuperiores = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        chbxColumna = new javax.swing.JCheckBox();
        txfColumna = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        chbxMarcha = new javax.swing.JCheckBox();
        txfMarcha = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        chbxLocomotor = new javax.swing.JCheckBox();
        txfAparatoLocomotor = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        chbxAparatoGenitourinario = new javax.swing.JCheckBox();
        txfAparatoGenitourinario = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        chbxAparatoDigestivo = new javax.swing.JCheckBox();
        txfAparatoDigestivo = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        chbxAparatoCardioascular = new javax.swing.JCheckBox();
        txfAparatoCardiovascular = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        chbxAparatoRespiratorio = new javax.swing.JCheckBox();
        txfAparatoRespiratorio = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        chbxCuello = new javax.swing.JCheckBox();
        txfCuello = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        chbxFaringe = new javax.swing.JCheckBox();
        txfFaringe = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        chbxBoca = new javax.swing.JCheckBox();
        txfBoca = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        chbxNariz = new javax.swing.JCheckBox();
        txfNariz = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        chbxOidos = new javax.swing.JCheckBox();
        txfOido = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        chbxOjos = new javax.swing.JCheckBox();
        txfOjo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txfTalla = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txfPeso = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txfImc = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txfPerimetroAbdominal = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txfFrecRespiratoria = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txfFrecCardiaca = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txfPa = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txfTemperatura = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaAnamnesis = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txaEctoscopia = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaConclusionesEvalPsicologica = new javax.swing.JTextArea();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txaConclusionesPsicotecnico = new javax.swing.JTextArea();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txaConcOftalmologica = new javax.swing.JTextArea();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txaConclusionesAudiometria = new javax.swing.JTextArea();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txaOsteomuscular = new javax.swing.JTextArea();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txaEspirometria = new javax.swing.JTextArea();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txaConcRadiograficas = new javax.swing.JTextArea();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txaHallazgos = new javax.swing.JTextArea();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txaOtros = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txfDiagnostico = new javax.swing.JTextField();
        rbtnP = new javax.swing.JRadioButton();
        rbtnD = new javax.swing.JRadioButton();
        rbtnR = new javax.swing.JRadioButton();
        jLabel57 = new javax.swing.JLabel();
        txfCie10 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblSoFmoDiagnostico = new javax.swing.JTable();
        txfCie10Desc = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        cbxCondicion = new javax.swing.JComboBox();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txaRecomendaciones = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setBackground(new java.awt.Color(202, 237, 228));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(202, 237, 228));

        jPanel2.setBackground(new java.awt.Color(202, 237, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES PATOLOGICOS PERSONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(202, 237, 228));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setLayout(new java.awt.GridLayout(3, 5));

        chbxAlergias.setBackground(new java.awt.Color(202, 237, 228));
        chbxAlergias.setText("Alergias");
        chbxAlergias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxAlergias.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxAlergias);

        chbxDiabetes.setBackground(new java.awt.Color(202, 237, 228));
        chbxDiabetes.setText("Diabetes");
        chbxDiabetes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxDiabetes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxDiabetes);

        chbxTbc.setBackground(new java.awt.Color(202, 237, 228));
        chbxTbc.setText("TBC");
        chbxTbc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxTbc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxTbc);

        chbxHepatitisB.setBackground(new java.awt.Color(202, 237, 228));
        chbxHepatitisB.setText("Hepatitis B");
        chbxHepatitisB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxHepatitisB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxHepatitisB);

        chbxAsma.setBackground(new java.awt.Color(202, 237, 228));
        chbxAsma.setText("Asma");
        chbxAsma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxAsma.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxAsma);

        chbxHta.setBackground(new java.awt.Color(202, 237, 228));
        chbxHta.setText("HTA");
        chbxHta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxHta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxHta);

        chbxIts.setBackground(new java.awt.Color(202, 237, 228));
        chbxIts.setText("ITS");
        chbxIts.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxIts.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxIts);

        chbxTifoidea.setBackground(new java.awt.Color(202, 237, 228));
        chbxTifoidea.setText("Tifoidea");
        chbxTifoidea.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxTifoidea.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxTifoidea);

        chbxBronquitis.setBackground(new java.awt.Color(202, 237, 228));
        chbxBronquitis.setText("Bronquitis");
        chbxBronquitis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxBronquitis.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxBronquitis);

        chbxNeoplasia.setBackground(new java.awt.Color(202, 237, 228));
        chbxNeoplasia.setText("Neoplasia");
        chbxNeoplasia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxNeoplasia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxNeoplasia);

        chbxConvulsiones.setBackground(new java.awt.Color(202, 237, 228));
        chbxConvulsiones.setText("Convulsiones");
        chbxConvulsiones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxConvulsiones.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxConvulsiones);

        chbxQuemaduras.setBackground(new java.awt.Color(202, 237, 228));
        chbxQuemaduras.setText("Quemaduras");
        chbxQuemaduras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxQuemaduras.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxQuemaduras);

        chbxCirugias.setBackground(new java.awt.Color(202, 237, 228));
        chbxCirugias.setText("Cirugias");
        chbxCirugias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxCirugias.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxCirugias);

        chbxIntoxicaciones.setBackground(new java.awt.Color(202, 237, 228));
        chbxIntoxicaciones.setText("Intoxicaciones");
        chbxIntoxicaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxIntoxicaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxIntoxicaciones);

        chbxOtros.setBackground(new java.awt.Color(202, 237, 228));
        chbxOtros.setText("Otros");
        chbxOtros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxOtros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel6.add(chbxOtros);

        jPanel3.setBackground(new java.awt.Color(202, 237, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HABITOS NOCIVOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblHabitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblHabitos);

        jLabel14.setText("Habitos :");

        jLabel15.setText("Tipo :");

        jLabel16.setText("Cantidad :");

        jLabel10.setText("Frecuencia :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/remove.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addComponent(cbxHabitos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfTipoHabito, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfCantidadHabito, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfFrecuenciaHabito, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(cbxHabitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txfTipoHabito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(txfCantidadHabito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txfFrecuenciaHabito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(202, 237, 228));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES PATOLOGICOS FAMILIARES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel11.setText("Padre :");

        jLabel12.setText("Madre :");

        jLabel13.setText("Hermanos :");

        jLabel17.setText("Esposo (a) :");

        jLabel18.setText("Hijos vivos :");

        jLabel19.setText("N°");

        jLabel20.setText("Hijos fallecidos :");

        jLabel21.setText("N°");

        jPanel5.setBackground(new java.awt.Color(202, 237, 228));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ABSENTISMO: ENFERMEDADES Y ACCIDENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel22.setText("Enfermedad Accidente :");

        jLabel23.setText("Asociado al trabajo :");

        rbtnAbsentismoSi.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup1.add(rbtnAbsentismoSi);
        rbtnAbsentismoSi.setText("Sí");
        rbtnAbsentismoSi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtnAbsentismoSi.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rbtnAbsentismoNo.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup1.add(rbtnAbsentismoNo);
        rbtnAbsentismoNo.setText("No");
        rbtnAbsentismoNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtnAbsentismoNo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel24.setText("Año :");

        jLabel25.setText("Días de descanso :");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/add.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/remove.png"))); // NOI18N

        tblAbsentismo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblAbsentismo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfEnfermedadAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnAbsentismoSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnAbsentismoNo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfDiasDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3)
                        .addComponent(jButton4))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(txfEnfermedadAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(rbtnAbsentismoSi)
                        .addComponent(rbtnAbsentismoNo)
                        .addComponent(jLabel24)
                        .addComponent(txfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(txfDiasDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfPadre)
                    .addComponent(txfEsposo, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txfHijosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfNumHijosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txfMadre))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txfHijosFallecidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNumHijosFallecidos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txfHermanos)))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txfPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txfMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txfHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txfEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txfHijosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txfNumHijosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txfHijosFallecidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txfNumHijosFallecidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(202, 237, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES OCUPACIONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblAntecedentesOcupacionales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblAntecedentesOcupacionales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );

        jLabel1.setText("N° DE FICHA MEDICA :");

        txfNumFichaMedica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfNumFichaMedica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNumFichaMedica.setEnabled(false);

        jLabel2.setText("FECHA :");

        jdcFechaFichaMedica.setDateFormatString("dd/MM/yyyy");
        jdcFechaFichaMedica.setEnabled(false);
        jdcFechaFichaMedica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/next-icon.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNumFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txfNumFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jdcFechaFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton11)
                .addGap(2, 2, 2))
        );

        jTabbedPane1.addTab("ANTECEDENTES", jPanel12);

        jPanel13.setBackground(new java.awt.Color(202, 237, 228));

        jPanel11.setBackground(new java.awt.Color(202, 237, 228));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMEN FISICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel15.setBackground(new java.awt.Color(202, 237, 228));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel15.setLayout(new java.awt.GridBagLayout());

        chbxSistemaNervioso.setBackground(new java.awt.Color(202, 237, 228));
        chbxSistemaNervioso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxSistemaNervioso, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfSistemaNervioso, gridBagConstraints);

        jLabel29.setText("Piel");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel29, gridBagConstraints);

        chbxPiel.setBackground(new java.awt.Color(202, 237, 228));
        chbxPiel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxPiel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfPiel, gridBagConstraints);

        jLabel30.setText("Cabello");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel30, gridBagConstraints);

        chbxCabello.setBackground(new java.awt.Color(202, 237, 228));
        chbxCabello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxCabello, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfCabello, gridBagConstraints);

        jLabel31.setText("Nariz");
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel31, gridBagConstraints);

        chbxSistemaLinfatico.setBackground(new java.awt.Color(202, 237, 228));
        chbxSistemaLinfatico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxSistemaLinfatico, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfSistemaLinfatico, gridBagConstraints);

        jLabel32.setText("Boca");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel32, gridBagConstraints);

        chbxMiembrosInferiores.setBackground(new java.awt.Color(202, 237, 228));
        chbxMiembrosInferiores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxMiembrosInferiores, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfMiembrosInferiores, gridBagConstraints);

        jLabel33.setText("Faringe");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel33, gridBagConstraints);

        chbxMiembrosSuperiores.setBackground(new java.awt.Color(202, 237, 228));
        chbxMiembrosSuperiores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxMiembrosSuperiores, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfMiembrosSuperiores, gridBagConstraints);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Organo o Sistema");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel34, gridBagConstraints);

        chbxColumna.setBackground(new java.awt.Color(202, 237, 228));
        chbxColumna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxColumna, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfColumna, gridBagConstraints);

        jLabel35.setText("Aparato Respiratorio");
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel35, gridBagConstraints);

        chbxMarcha.setBackground(new java.awt.Color(202, 237, 228));
        chbxMarcha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxMarcha, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfMarcha, gridBagConstraints);

        jLabel44.setText("Aparato Cardiovascular");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel44, gridBagConstraints);

        chbxLocomotor.setBackground(new java.awt.Color(202, 237, 228));
        chbxLocomotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxLocomotor, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfAparatoLocomotor, gridBagConstraints);

        jLabel45.setText("Aparato Digestivo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel45, gridBagConstraints);

        chbxAparatoGenitourinario.setBackground(new java.awt.Color(202, 237, 228));
        chbxAparatoGenitourinario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxAparatoGenitourinario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfAparatoGenitourinario, gridBagConstraints);

        jLabel46.setText("Apararto Genitourinario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel46, gridBagConstraints);

        chbxAparatoDigestivo.setBackground(new java.awt.Color(202, 237, 228));
        chbxAparatoDigestivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxAparatoDigestivo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfAparatoDigestivo, gridBagConstraints);

        jLabel47.setText("Aparato Locomotor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel47, gridBagConstraints);

        chbxAparatoCardioascular.setBackground(new java.awt.Color(202, 237, 228));
        chbxAparatoCardioascular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxAparatoCardioascular, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfAparatoCardiovascular, gridBagConstraints);

        jLabel48.setText("Marcha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel48, gridBagConstraints);

        chbxAparatoRespiratorio.setBackground(new java.awt.Color(202, 237, 228));
        chbxAparatoRespiratorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxAparatoRespiratorio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfAparatoRespiratorio, gridBagConstraints);

        jLabel49.setText("Columna");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel49, gridBagConstraints);

        chbxCuello.setBackground(new java.awt.Color(202, 237, 228));
        chbxCuello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxCuello, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfCuello, gridBagConstraints);

        jLabel50.setText("Miembros Superiores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel50, gridBagConstraints);

        chbxFaringe.setBackground(new java.awt.Color(202, 237, 228));
        chbxFaringe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxFaringe, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfFaringe, gridBagConstraints);

        jLabel51.setText("Miembros Inferiores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel51, gridBagConstraints);

        chbxBoca.setBackground(new java.awt.Color(202, 237, 228));
        chbxBoca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxBoca, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfBoca, gridBagConstraints);

        jLabel52.setText("Sistema Linfatico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel52, gridBagConstraints);

        chbxNariz.setBackground(new java.awt.Color(202, 237, 228));
        chbxNariz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxNariz, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfNariz, gridBagConstraints);

        jLabel53.setText("Sistema Nervioso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel53, gridBagConstraints);

        chbxOidos.setBackground(new java.awt.Color(202, 237, 228));
        chbxOidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxOidos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfOido, gridBagConstraints);

        jLabel54.setText("Ojos y Anexos");
        jLabel54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel54, gridBagConstraints);

        chbxOjos.setBackground(new java.awt.Color(202, 237, 228));
        chbxOjos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        jPanel15.add(chbxOjos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 600;
        jPanel15.add(txfOjo, gridBagConstraints);

        jLabel26.setText("Oidos");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel26, gridBagConstraints);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setText("Sin Hallazgos");
        jPanel15.add(jLabel55, new java.awt.GridBagConstraints());

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setText("Con Hallazgos");
        jPanel15.add(jLabel56, new java.awt.GridBagConstraints());

        jLabel27.setText("Cuello");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel15.add(jLabel27, gridBagConstraints);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel7.setBackground(new java.awt.Color(202, 237, 228));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EVALUACION MEDICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(202, 237, 228));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMEN CLINICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel8.setLayout(new java.awt.GridLayout(2, 8));

        jLabel36.setBackground(new java.awt.Color(202, 237, 228));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Talla : ");
        jPanel8.add(jLabel36);

        txfTalla.setEnabled(false);
        jPanel8.add(txfTalla);

        jLabel37.setBackground(new java.awt.Color(202, 237, 228));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Peso (Kg) : ");
        jPanel8.add(jLabel37);

        txfPeso.setEnabled(false);
        jPanel8.add(txfPeso);

        jLabel38.setBackground(new java.awt.Color(202, 237, 228));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("IMC : ");
        jPanel8.add(jLabel38);

        txfImc.setEnabled(false);
        jPanel8.add(txfImc);

        jLabel39.setBackground(new java.awt.Color(202, 237, 228));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Perimetro Abdominal : ");
        jPanel8.add(jLabel39);

        txfPerimetroAbdominal.setEnabled(false);
        jPanel8.add(txfPerimetroAbdominal);

        jLabel40.setBackground(new java.awt.Color(202, 237, 228));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("F. Resp. : ");
        jPanel8.add(jLabel40);

        txfFrecRespiratoria.setEnabled(false);
        jPanel8.add(txfFrecRespiratoria);

        jLabel41.setBackground(new java.awt.Color(202, 237, 228));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("F. Card. : ");
        jPanel8.add(jLabel41);

        txfFrecCardiaca.setEnabled(false);
        jPanel8.add(txfFrecCardiaca);

        jLabel42.setBackground(new java.awt.Color(202, 237, 228));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("PA : ");
        jPanel8.add(jLabel42);

        txfPa.setEnabled(false);
        jPanel8.add(txfPa);

        jLabel43.setBackground(new java.awt.Color(202, 237, 228));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Temperatura : ");
        jPanel8.add(jLabel43);

        txfTemperatura.setEnabled(false);
        jPanel8.add(txfTemperatura);

        jPanel9.setBackground(new java.awt.Color(202, 237, 228));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANAMNESIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaAnamnesis.setColumns(20);
        txaAnamnesis.setRows(5);
        jScrollPane3.setViewportView(txaAnamnesis);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel10.setBackground(new java.awt.Color(202, 237, 228));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ECTOSCOPIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaEctoscopia.setColumns(20);
        txaEctoscopia.setRows(5);
        jScrollPane5.setViewportView(txaEctoscopia);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/back-icon.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/next-icon.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EVALUACION/EXAMEN", jPanel13);

        jPanel18.setBackground(new java.awt.Color(202, 237, 228));

        jPanel14.setBackground(new java.awt.Color(202, 237, 228));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONCLUSIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel20.setBackground(new java.awt.Color(202, 237, 228));
        jPanel20.setLayout(new java.awt.GridLayout(5, 2));

        jPanel21.setBackground(new java.awt.Color(202, 237, 228));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONCLUSIONES DE EVALUACIÓN PSICOLÓGICA - PSICOLABORAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaConclusionesEvalPsicologica.setColumns(20);
        txaConclusionesEvalPsicologica.setRows(5);
        txaConclusionesEvalPsicologica.setEnabled(false);
        jScrollPane6.setViewportView(txaConclusionesEvalPsicologica);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(202, 237, 228));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONCLUSIONES DE EVALUACIÓN PSICOLÓGICA - PSICOTECNICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaConclusionesPsicotecnico.setColumns(20);
        txaConclusionesPsicotecnico.setRows(5);
        txaConclusionesPsicotecnico.setEnabled(false);
        jScrollPane7.setViewportView(txaConclusionesPsicotecnico);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(202, 237, 228));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONCLUSIONES OFTALMOLOGÍA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaConcOftalmologica.setColumns(20);
        txaConcOftalmologica.setRows(5);
        txaConcOftalmologica.setEnabled(false);
        jScrollPane8.setViewportView(txaConcOftalmologica);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(202, 237, 228));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONCLUSIONES AUDIOMETRÍA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaConclusionesAudiometria.setColumns(20);
        txaConclusionesAudiometria.setRows(5);
        txaConclusionesAudiometria.setEnabled(false);
        jScrollPane9.setViewportView(txaConclusionesAudiometria);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(202, 237, 228));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OSTEOMUSCULAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaOsteomuscular.setColumns(20);
        txaOsteomuscular.setRows(5);
        txaOsteomuscular.setEnabled(false);
        jScrollPane10.setViewportView(txaOsteomuscular);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(202, 237, 228));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESPIROMETRÍA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaEspirometria.setColumns(20);
        txaEspirometria.setRows(5);
        jScrollPane11.setViewportView(txaEspirometria);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(202, 237, 228));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONCLUSIONES RADIOGRÁFICAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaConcRadiograficas.setColumns(20);
        txaConcRadiograficas.setRows(5);
        jScrollPane13.setViewportView(txaConcRadiograficas);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(202, 237, 228));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HALLAZGOS PATOLÓGICOS DE LABORATORIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaHallazgos.setColumns(20);
        txaHallazgos.setRows(5);
        jScrollPane15.setViewportView(txaHallazgos);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel20.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(202, 237, 228));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OTROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaOtros.setColumns(20);
        txaOtros.setRows(5);
        jScrollPane16.setViewportView(txaOtros);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel29);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel16.setBackground(new java.awt.Color(202, 237, 228));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGNÓSTICO MÉDICO OCUPACIONAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel28.setText("Diagnóstico :");

        rbtnP.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup2.add(rbtnP);
        rbtnP.setText("P");
        rbtnP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rbtnD.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup2.add(rbtnD);
        rbtnD.setText("D");
        rbtnD.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rbtnR.setBackground(new java.awt.Color(202, 237, 228));
        buttonGroup2.add(rbtnR);
        rbtnR.setText("R");
        rbtnR.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel57.setText("CIE-10 :");

        txfCie10.setEnabled(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/add.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/remove.png"))); // NOI18N

        tblSoFmoDiagnostico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(tblSoFmoDiagnostico);

        txfCie10Desc.setEnabled(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCie10Desc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCie10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jButton8)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txfDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnP)
                            .addComponent(rbtnD)
                            .addComponent(rbtnR)
                            .addComponent(jLabel57)
                            .addComponent(txfCie10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfCie10Desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel17.setBackground(new java.awt.Color(202, 237, 228));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONDICIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbxCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "APTO", "APTO CON RESTRICCIÓN", "NO APTO TEMPORAL" }));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbxCondicion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbxCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel19.setBackground(new java.awt.Color(202, 237, 228));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RECOMENDACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaRecomendaciones.setColumns(20);
        txaRecomendaciones.setRows(5);
        jScrollPane14.setViewportView(txaRecomendaciones);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/cancel.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/back-icon.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONCLUSIONES", jPanel18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isDatosValidosHabitos()) {
            agregarHabitos();
            resetComponentHabitos();
            cbxHabitos.requestFocus();
        } else {
            Mensajes.msjValidarIngreso();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (isDatosValidosAbsentismo()) {
            agregarAbsentismo();
            resetComponentAbsentismo();
            txfEnfermedadAccidente.requestFocus();
        } else {
            Mensajes.msjValidarIngreso();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (isDatosValidos()) {
            registrar();
        } else {
            Mensajes.msjValidarIngreso();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        buscarCie10(JIF_AdminCie10.JIF_HCOCUPACIONAL);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (isDatosValidosDiagnostico()) {
            agregarDiagnostico();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el diagnóstico", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
        personalizaVistaTabla();
        resetComponentDiagnostico();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton12ActionPerformed

// <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbxCondicion;
    private javax.swing.JComboBox cbxHabitos;
    private javax.swing.JCheckBox chbxAlergias;
    private javax.swing.JCheckBox chbxAparatoCardioascular;
    private javax.swing.JCheckBox chbxAparatoDigestivo;
    private javax.swing.JCheckBox chbxAparatoGenitourinario;
    private javax.swing.JCheckBox chbxAparatoRespiratorio;
    private javax.swing.JCheckBox chbxAsma;
    private javax.swing.JCheckBox chbxBoca;
    private javax.swing.JCheckBox chbxBronquitis;
    private javax.swing.JCheckBox chbxCabello;
    private javax.swing.JCheckBox chbxCirugias;
    private javax.swing.JCheckBox chbxColumna;
    private javax.swing.JCheckBox chbxConvulsiones;
    private javax.swing.JCheckBox chbxCuello;
    private javax.swing.JCheckBox chbxDiabetes;
    private javax.swing.JCheckBox chbxFaringe;
    private javax.swing.JCheckBox chbxHepatitisB;
    private javax.swing.JCheckBox chbxHta;
    private javax.swing.JCheckBox chbxIntoxicaciones;
    private javax.swing.JCheckBox chbxIts;
    private javax.swing.JCheckBox chbxLocomotor;
    private javax.swing.JCheckBox chbxMarcha;
    private javax.swing.JCheckBox chbxMiembrosInferiores;
    private javax.swing.JCheckBox chbxMiembrosSuperiores;
    private javax.swing.JCheckBox chbxNariz;
    private javax.swing.JCheckBox chbxNeoplasia;
    private javax.swing.JCheckBox chbxOidos;
    private javax.swing.JCheckBox chbxOjos;
    private javax.swing.JCheckBox chbxOtros;
    private javax.swing.JCheckBox chbxPiel;
    private javax.swing.JCheckBox chbxQuemaduras;
    private javax.swing.JCheckBox chbxSistemaLinfatico;
    private javax.swing.JCheckBox chbxSistemaNervioso;
    private javax.swing.JCheckBox chbxTbc;
    private javax.swing.JCheckBox chbxTifoidea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdcFechaFichaMedica;
    private javax.swing.JRadioButton rbtnAbsentismoNo;
    private javax.swing.JRadioButton rbtnAbsentismoSi;
    private javax.swing.JRadioButton rbtnD;
    private javax.swing.JRadioButton rbtnP;
    private javax.swing.JRadioButton rbtnR;
    private javax.swing.JTable tblAbsentismo;
    private javax.swing.JTable tblAntecedentesOcupacionales;
    private javax.swing.JTable tblHabitos;
    private javax.swing.JTable tblSoFmoDiagnostico;
    private javax.swing.JTextArea txaAnamnesis;
    private javax.swing.JTextArea txaConcOftalmologica;
    private javax.swing.JTextArea txaConcRadiograficas;
    private javax.swing.JTextArea txaConclusionesAudiometria;
    private javax.swing.JTextArea txaConclusionesEvalPsicologica;
    private javax.swing.JTextArea txaConclusionesPsicotecnico;
    private javax.swing.JTextArea txaEctoscopia;
    private javax.swing.JTextArea txaEspirometria;
    private javax.swing.JTextArea txaHallazgos;
    private javax.swing.JTextArea txaOsteomuscular;
    private javax.swing.JTextArea txaOtros;
    private javax.swing.JTextArea txaRecomendaciones;
    private javax.swing.JTextField txfAnio;
    private javax.swing.JTextField txfAparatoCardiovascular;
    private javax.swing.JTextField txfAparatoDigestivo;
    private javax.swing.JTextField txfAparatoGenitourinario;
    private javax.swing.JTextField txfAparatoLocomotor;
    private javax.swing.JTextField txfAparatoRespiratorio;
    private javax.swing.JTextField txfBoca;
    private javax.swing.JTextField txfCabello;
    private javax.swing.JTextField txfCantidadHabito;
    private javax.swing.JTextField txfCie10;
    private javax.swing.JTextField txfCie10Desc;
    private javax.swing.JTextField txfColumna;
    private javax.swing.JTextField txfCuello;
    private javax.swing.JTextField txfDiagnostico;
    private javax.swing.JTextField txfDiasDescanso;
    private javax.swing.JTextField txfEnfermedadAccidente;
    private javax.swing.JTextField txfEsposo;
    private javax.swing.JTextField txfFaringe;
    private javax.swing.JTextField txfFrecCardiaca;
    private javax.swing.JTextField txfFrecRespiratoria;
    private javax.swing.JTextField txfFrecuenciaHabito;
    private javax.swing.JTextField txfHermanos;
    private javax.swing.JTextField txfHijosFallecidos;
    private javax.swing.JTextField txfHijosVivos;
    private javax.swing.JTextField txfImc;
    private javax.swing.JTextField txfMadre;
    private javax.swing.JTextField txfMarcha;
    private javax.swing.JTextField txfMiembrosInferiores;
    private javax.swing.JTextField txfMiembrosSuperiores;
    private javax.swing.JTextField txfNariz;
    private javax.swing.JTextField txfNumFichaMedica;
    private javax.swing.JTextField txfNumHijosFallecidos;
    private javax.swing.JTextField txfNumHijosVivos;
    private javax.swing.JTextField txfOido;
    private javax.swing.JTextField txfOjo;
    private javax.swing.JTextField txfPa;
    private javax.swing.JTextField txfPadre;
    private javax.swing.JTextField txfPerimetroAbdominal;
    private javax.swing.JTextField txfPeso;
    private javax.swing.JTextField txfPiel;
    private javax.swing.JTextField txfSistemaLinfatico;
    private javax.swing.JTextField txfSistemaNervioso;
    private javax.swing.JTextField txfTalla;
    private javax.swing.JTextField txfTemperatura;
    private javax.swing.JTextField txfTipoHabito;
    // End of variables declaration//GEN-END:variables
// </editor-fold> 

    void enviarDatosAtencionOcupacionalApanel(AtencionOcupacional oAtencionOcupacional) {
        this.oAtencionOcupacional = oAtencionOcupacional;
        /*Listar en la tabla los antecedentes ocupacionales que fueron llenados en triaje*/
        listarAntOcupacionales(oAtencionOcupacional.getHistoriaClinica());
        /*Generar fecha y numero de ficha*/
        numeroFicha = generarNumeroFicha() + 1;
        txfNumFichaMedica.setText("" + numeroFicha);
        generarFechaActual();
        /*
         * Recuperar las conclusiones de cada una de las fichas para escribirlas 
         * en las conclusiones de la ficha general
         */
        recuperarConclusionesFichas(oAtencionOcupacional);
        /*
         *Recuperar los datos del examen clinico registrado en triaje
         */
        recuperarExamenClinico(oAtencionOcupacional);
    }

    void enviarDatosUser(Usuario userTemp, Persona perTemp, Rol rolTemp) {
        this.userTemp = userTemp;
        this.perTemp = perTemp;
        this.rolTemp = rolTemp;
    }

    private boolean isDatosValidosHabitos() {
        return true;
    }

    private void agregarHabitos() {
        oSoFmoHabitos = new SoFmoHabitos();
        oSoFmoHabitos.setHabitoNocivo((HabitoNocivo) cbxHabitos.getSelectedItem());
        oSoFmoHabitos.setTipo(txfTipoHabito.getText().toUpperCase().trim());
        oSoFmoHabitos.setCantidad(txfCantidadHabito.getText().toUpperCase().trim());
        oSoFmoHabitos.setFrecuencia(txfFrecuenciaHabito.getText().toUpperCase().trim());

        oModeloSoFmoHabito.add(oSoFmoHabitos);
    }

    private void resetComponentHabitos() {
        cbxHabitos.setSelectedIndex(0);
        txfTipoHabito.setText("");
        txfCantidadHabito.setText("");
        txfFrecuenciaHabito.setText("");
    }

    private boolean isDatosValidosAbsentismo() {
        return true;
    }

    private void agregarAbsentismo() {
        oSoFmoAbsentismo = new SoFmoAbsentismo();
        oSoFmoAbsentismo.setEnfermedadAccidente(txfEnfermedadAccidente.getText().toUpperCase().trim());
        if (rbtnAbsentismoSi.isSelected()) {
            oSoFmoAbsentismo.setAsociadoAlTrabajo(true);
        } else if (rbtnAbsentismoNo.isSelected()) {
            oSoFmoAbsentismo.setAsociadoAlTrabajo(false);
        }
        oSoFmoAbsentismo.setAnio(Integer.parseInt(txfAnio.getText().trim()));
        oSoFmoAbsentismo.setDiasDescanso(Integer.parseInt(txfDiasDescanso.getText().trim()));

        oModeloSoFmoAbsentismo.add(oSoFmoAbsentismo);
    }

    private void resetComponentAbsentismo() {
        txfEnfermedadAccidente.setText("");
        buttonGroup1.clearSelection();
        txfAnio.setText("");
        txfDiasDescanso.setText("");
    }

    private boolean isDatosValidos() {
        return true;
    }

    private void registrar() {
        oFichaMedicoOcupacional = registrarFichaMedicoOcupacional();
        if (oFichaMedicoOcupacional != null) {
            registrarOther(oFichaMedicoOcupacional);
        }
        if (oFichaMedicoOcupacional != null) {
            Mensajes.msjRegCorrecta();
            imprimirFicha(oFichaMedicoOcupacional);
            resetComponentFicha();
        } else {
            Mensajes.msjRegError();
        }
    }

    private FichaMedicoOcupacional registrarFichaMedicoOcupacional() {
        oFichaMedicoOcupacional = new FichaMedicoOcupacional();
        oFichaMedicoOcupBl = new FichaMedicoOcupBl();
        oFichaMedicoOcupacional.setAtencionOcupacional(oAtencionOcupacional);
        oFichaMedicoOcupacional.setIdUsuario(userTemp.getIdUsuario());
        oFichaMedicoOcupacional.setNumeroFicha(Integer.parseInt(txfNumFichaMedica.getText().trim()));
        oFichaMedicoOcupacional.setFecha(jdcFechaFichaMedica.getDate());

        return oFichaMedicoOcupBl.registrar(oFichaMedicoOcupacional);
    }

    private void registrarOther(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        registrarAbsentismo(oFichaMedicoOcupacional);
        registrarDiagnosticos(oFichaMedicoOcupacional);
        registrarExamenFisico(oFichaMedicoOcupacional);
        registrarAntPatFam(oFichaMedicoOcupacional);
        registrarConclusiones(oFichaMedicoOcupacional);
        registrarAntPatPer(oFichaMedicoOcupacional);
        registrarEvalMedica(oFichaMedicoOcupacional);
        registrarHabitos(oFichaMedicoOcupacional);

    }

    private void registrarAbsentismo(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        if (oModeloSoFmoAbsentismo.size() > 0) {
            for (int i = 0; i < oModeloSoFmoAbsentismo.size(); i++) {
                oSoFmoAbsentismo = new SoFmoAbsentismo();
                oSoFmoAbsentismoBl = new SoFmoAbsentismoBl();
                oSoFmoAbsentismo = oModeloSoFmoAbsentismo.get(i);
                oSoFmoAbsentismo.setFichaMedicoOcupacional(oFichaMedicoOcupacional);
                oSoFmoAbsentismoBl.registrar(oSoFmoAbsentismo);
            }
        }
    }

    private void registrarDiagnosticos(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        if (oModeloSoFmoDiagnostico.size() > 0) {
            for (int i = 0; i < oModeloSoFmoDiagnostico.size(); i++) {
                oSoFmoDiagnosticos = new SoFmoDiagnosticos();
                oSoFmoDiagnosticosBl = new SoFmoDiagnosticosBl();
                oSoFmoDiagnosticos = oModeloSoFmoDiagnostico.get(i);
                oSoFmoDiagnosticos.setFichaMedicoOcupacional(oFichaMedicoOcupacional);
                oSoFmoDiagnosticosBl.registrar(oSoFmoDiagnosticos);
            }
        }
    }

    private void registrarExamenFisico(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        oSoFmoExamenFisico = new SoFmoExamenFisico();
        oSoFmoExamenFisicoBl = new SoFmoExamenFisicoBl();
        oSoFmoExamenFisico.setFichaMedicoOcupacional(oFichaMedicoOcupacional);
        oSoFmoExamenFisico.setPiel(chbxPiel.isSelected());
        oSoFmoExamenFisico.setCabello(chbxCabello.isSelected());
        oSoFmoExamenFisico.setOjos(chbxOjos.isSelected());
        oSoFmoExamenFisico.setOidos(chbxOidos.isSelected());
        oSoFmoExamenFisico.setNariz(chbxNariz.isSelected());
        oSoFmoExamenFisico.setBoca(chbxBoca.isSelected());
        oSoFmoExamenFisico.setFaringe(chbxFaringe.isSelected());
        oSoFmoExamenFisico.setCuello(chbxCuello.isSelected());
        oSoFmoExamenFisico.setRespiratorio(chbxAparatoRespiratorio.isSelected());
        oSoFmoExamenFisico.setCardiovascular(chbxAparatoCardioascular.isSelected());
        oSoFmoExamenFisico.setDigestivo(chbxAparatoDigestivo.isSelected());
        oSoFmoExamenFisico.setGenitourinario(chbxAparatoGenitourinario.isSelected());
        oSoFmoExamenFisico.setLocomotor(chbxLocomotor.isSelected());
        oSoFmoExamenFisico.setMarcha(chbxMarcha.isSelected());
        oSoFmoExamenFisico.setColumna(chbxColumna.isSelected());
        oSoFmoExamenFisico.setMiembrosSuperiores(chbxMiembrosSuperiores.isSelected());
        oSoFmoExamenFisico.setMiembrosInferiores(chbxMiembrosInferiores.isSelected());
        oSoFmoExamenFisico.setSistemaLinfatico(chbxSistemaLinfatico.isSelected());
        oSoFmoExamenFisico.setSistemaNervioso(chbxSistemaNervioso.isSelected());

        oSoFmoExamenFisico.setPielDesc(txfPiel.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setCabelloDesc(txfCabello.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setOjosDesc(txfOjo.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setOidosDesc(txfOido.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setNarizDesc(txfNariz.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setBocaDesc(txfBoca.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setFaringeDesc(txfFaringe.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setCuelloDesc(txfCuello.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setRespiratorioDesc(txfAparatoRespiratorio.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setCardiovascularDesc(txfAparatoCardiovascular.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setDigestivoDesc(txfAparatoDigestivo.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setGenitourinarioDesc(txfAparatoGenitourinario.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setLocomotorDesc(txfAparatoLocomotor.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setMarchaDesc(txfMarcha.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setColumnaDesc(txfColumna.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setMiembrosSuperioresDesc(txfMiembrosSuperiores.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setMiembrosInferioresDesc(txfMiembrosInferiores.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setSistemaLinfaticoDesc(txfSistemaLinfatico.getText().toUpperCase().trim());
        oSoFmoExamenFisico.setSistemaNerviosoDesc(txfSistemaNervioso.getText().toUpperCase().trim());

        oSoFmoExamenFisicoBl.registrar(oSoFmoExamenFisico);
    }

    private void registrarAntPatFam(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        oSoFmoAntecedentesPatFam = new SoFmoAntecedentesPatFam();
        oSoFmoAntecedentesPatFamBl = new SoFmoAntecedentesPatFamBl();
        oSoFmoAntecedentesPatFam.setFichaMedicoOcupacional(oFichaMedicoOcupacional);
        oSoFmoAntecedentesPatFam.setPadre(txfPadre.getText().toUpperCase().trim());
        oSoFmoAntecedentesPatFam.setMadre(txfMadre.getText().toUpperCase().trim());
        oSoFmoAntecedentesPatFam.setHermanos(txfHermanos.getText().toUpperCase().trim());
        oSoFmoAntecedentesPatFam.setEsposoa(txfEsposo.getText().toUpperCase().trim());
        oSoFmoAntecedentesPatFam.setHijosVivos(txfHijosVivos.getText().toUpperCase().trim());
        if (!txfNumHijosVivos.getText().toUpperCase().trim().equals("")) {
            oSoFmoAntecedentesPatFam.setNumHijosVivos(Integer.parseInt(txfNumHijosVivos.getText().toUpperCase().trim()));
        }
        oSoFmoAntecedentesPatFam.setHijosFallecidos(txfHijosFallecidos.getText().toUpperCase().trim());
        if (!txfNumHijosFallecidos.getText().toUpperCase().trim().equals("")) {
            oSoFmoAntecedentesPatFam.setNumHijosFallecidos(Integer.parseInt(txfNumHijosFallecidos.getText().toUpperCase().trim()));
        }

        oSoFmoAntecedentesPatFamBl.registrar(oSoFmoAntecedentesPatFam);
    }

    private void registrarConclusiones(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        oSoFmoConclusiones = new SoFmoConclusiones();
        oSoFmoConclusionesBl = new SoFmoConclusionesBl();
        oSoFmoConclusiones.setFichaMedicoOcupacional(oFichaMedicoOcupacional);
        oSoFmoConclusiones.setEvalPsicologica(txaConclusionesEvalPsicologica.getText().toUpperCase().trim());
        oSoFmoConclusiones.setConcEvalPsicologicaPsicotecnico(txaConclusionesPsicotecnico.getText().toUpperCase().trim());
        oSoFmoConclusiones.setConcOftalmologica(txaConcOftalmologica.getText().toUpperCase().trim());
        oSoFmoConclusiones.setAudiometria(txaConclusionesAudiometria.getText().toUpperCase().trim());
        oSoFmoConclusiones.setConcOsteomuscular(txaOsteomuscular.getText().toUpperCase().trim());
        oSoFmoConclusiones.setEspirometria(txaEspirometria.getText().toUpperCase().trim());
        oSoFmoConclusiones.setRadiograficas(txaConcRadiograficas.getText().toUpperCase().trim());
        oSoFmoConclusiones.setHallazgosPatologicos(txaHallazgos.getText().toUpperCase().trim());
        oSoFmoConclusiones.setOtros(txaOtros.getText().toUpperCase().trim());
        oSoFmoConclusiones.setCondicion(cbxCondicion.getSelectedItem().toString().trim());
        oSoFmoConclusiones.setRecomendacion(txaRecomendaciones.getText().toUpperCase().trim());

        oSoFmoConclusionesBl.registrar(oSoFmoConclusiones);
    }

    private void registrarAntPatPer(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        oSoFmoAntecedentesPatPer = new SoFmoAntecedentesPatPer();
        oSoFmoAntecedentesPatPerBl = new SoFmoAntecedentesPatPerBl();
        oSoFmoAntecedentesPatPer.setFichaMedicoOcupacional(oFichaMedicoOcupacional);
        oSoFmoAntecedentesPatPer.setAlergia(chbxAlergias.isSelected());
        oSoFmoAntecedentesPatPer.setDiabetes(chbxDiabetes.isSelected());
        oSoFmoAntecedentesPatPer.setTbc(chbxTbc.isSelected());
        oSoFmoAntecedentesPatPer.setHepatitisb(chbxHepatitisB.isSelected());
        oSoFmoAntecedentesPatPer.setAsma(chbxAsma.isSelected());
        oSoFmoAntecedentesPatPer.setHta(chbxHta.isSelected());
        oSoFmoAntecedentesPatPer.setIts(chbxIts.isSelected());
        oSoFmoAntecedentesPatPer.setTifoidea(chbxTifoidea.isSelected());
        oSoFmoAntecedentesPatPer.setBronquitis(chbxBronquitis.isSelected());
        oSoFmoAntecedentesPatPer.setNeoplasia(chbxNeoplasia.isSelected());
        oSoFmoAntecedentesPatPer.setConvulsiones(chbxConvulsiones.isSelected());
        oSoFmoAntecedentesPatPer.setOtros(chbxOtros.isSelected());
        oSoFmoAntecedentesPatPer.setQuemaduras(chbxQuemaduras.isSelected());
        oSoFmoAntecedentesPatPer.setCirugias(chbxCirugias.isSelected());
        oSoFmoAntecedentesPatPer.setIntoxicaciones(chbxIntoxicaciones.isSelected());
        oSoFmoAntecedentesPatPerBl.registrar(oSoFmoAntecedentesPatPer);
    }

    private void registrarEvalMedica(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        oSoFmoEvaluacionMedica = new SoFmoEvaluacionMedica();
        oSoFmoEvaluacionMedicaBl = new SoFmoEvaluacionMedicaBl();
        oSoFmoEvaluacionMedica.setFichaMedicoOcupacional(oFichaMedicoOcupacional);
        oSoFmoEvaluacionMedica.setAnamnesis(txaAnamnesis.getText().toUpperCase().trim());
        oSoFmoEvaluacionMedica.setTalla(Double.valueOf(txfTalla.getText().trim()));
        oSoFmoEvaluacionMedica.setPeso(Double.valueOf(txfPeso.getText().trim()));
        oSoFmoEvaluacionMedica.setImc(Double.valueOf(txfImc.getText().trim()));
        oSoFmoEvaluacionMedica.setPerimetroAbdominal(Double.valueOf(txfPerimetroAbdominal.getText().trim()));
        oSoFmoEvaluacionMedica.setFr(Double.valueOf(txfFrecRespiratoria.getText().trim()));
        oSoFmoEvaluacionMedica.setFc(Double.valueOf(txfFrecCardiaca.getText().trim()));
        oSoFmoEvaluacionMedica.setPa1(Double.valueOf(txfPa.getText().trim()));
        oSoFmoEvaluacionMedica.setTemperatura(Double.valueOf(txfTemperatura.getText().trim()));
        oSoFmoEvaluacionMedica.setEctoscopia(txaEctoscopia.getText().toUpperCase().trim());
        oSoFmoEvaluacionMedicaBl.registrar(oSoFmoEvaluacionMedica);
    }

    private void registrarHabitos(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        if (oModeloSoFmoHabito.size() > 0) {
            for (int i = 0; i < oModeloSoFmoHabito.size(); i++) {
                oSoFmoHabitos = new SoFmoHabitos();
                oSoFmoHabitosBl = new SoFmoHabitosBl();
                oSoFmoHabitos = oModeloSoFmoHabito.get(i);
                oSoFmoHabitos.setFichaMedicoOcupacional(oFichaMedicoOcupacional);
                oSoFmoHabitosBl.registrar(oSoFmoHabitos);
            }
        }
    }

    private int generarNumeroFicha() {
        oFichaMedicoOcupBl = new FichaMedicoOcupBl();
        return oFichaMedicoOcupBl.generarNumeroFicha();
    }

    private void generarFechaActual() {
        Calendar calendar = Calendar.getInstance();//Variable de Objeto Calendar        
        //fecha de sistema
        jdcFechaFichaMedica.setCalendar(calendar);
        Date inicio = calendar.getTime();
        //Indicamos año hasta -100 del actual
        calendar.add(Calendar.YEAR, -100);
        //Guardamos la configuración en un DATE
        Date fechaAnterior = calendar.getTime();
        //Indicamos año hasta +200 del actual
        calendar.add(Calendar.YEAR, 200);
        //Guardamos la configuración en un DATE
        Date fechaPosterior = calendar.getTime();
        //Usamos el contructor de abajo para crear un modelo para el Spinner
        //SpinnerDateModel(Date value, Comparable start, Comparable end, int calendarField)
        //Utilizamos los datos que creamos más arriba
        //Para fecha utilizamos Calendar.YEAR y para hora Calendar.HOUR, el resto puede ser igual
        SpinnerModel fechaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.YEAR);
        SpinnerModel horaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.HOUR);
        //Indicamos el model para cada Spinner además del formato de fecha y hora según corresponda.
//        fecha.setModel(fechaModel);
//        fecha.setEditor(new JSpinner.DateEditor(fecha, "dd/MM/yyyy"));
//        jsHoraAtencion.setModel(horaModel);
//        jsHoraAtencion.setEditor(new JSpinner.DateEditor(jsHoraAtencion, "HH:mm:ss"));
    }

    private void listarAntOcupacionales(HistoriaClinica oHistoriaClinica) {
        oSoFmoAntecedentesOcupacionalesBl = new SoFmoAntecedentesOcupacionalesBl();
        oModeloSoFmoAntOcup.addAll(oSoFmoAntecedentesOcupacionalesBl.listar(oHistoriaClinica));
    }

    private void recuperarConclusionesFichas(AtencionOcupacional oAtencionOcupacional) {
        /*recuperar conclusiones psicologicas - psicolaboral*/
        oFichaPsicologicaBl = new FichaPsicologicaBl();
        oFichaPsicologica = new FichaPsicologica();
        oFichaPsicologica = oFichaPsicologicaBl.getConclusion(oAtencionOcupacional);
        if (oFichaPsicologica != null) {
            txaConclusionesEvalPsicologica.setText(oFichaPsicologica.getDxAreaCognitiva() + " \n");
            txaConclusionesEvalPsicologica.append(oFichaPsicologica.getDxAreaEmocional());
        }
        /*recuperar conclusiones psicologia - psicotecnico*/
        oFichaPsicologicaPsicotecnico = new FichaPsicologicaPsicotecnico();
        oFichaPsicologicaPsicotecnicoBl = new FichaPsicologicaPsicotecnicoBl();
        oFichaPsicologicaPsicotecnico = oFichaPsicologicaPsicotecnicoBl.getConclusion(oAtencionOcupacional);
        if(oFichaPsicologicaPsicotecnico != null){
            txaConclusionesPsicotecnico.setText(oFichaPsicologicaPsicotecnico.getConAreaCognitiva()+" \n");
            txaConclusionesPsicotecnico.append(oFichaPsicologicaPsicotecnico.getConAreaEmocional());
        }
        /*recuperar conclusiones de audiometria*/
        oFichaAudiometriaBl = new FichaAudiometriaBl();
        txaConclusionesAudiometria.setText(oFichaAudiometriaBl.getConclusion(oAtencionOcupacional));
        /*recuperar conclusiones de oftalmologia*/
        oFichaOftalmologicaBl = new FichaOftalmologicaBl();
        txaConcOftalmologica.setText(oFichaOftalmologicaBl.getConclusion(oAtencionOcupacional));
        /*recuperar conclusiones osteomusculares*/
        oFichaOsteomuscularBl = new FichaOsteomuscularBl();
        txaOsteomuscular.setText(oFichaOsteomuscularBl.getConclusion(oAtencionOcupacional));
    }

    private void recuperarExamenClinico(AtencionOcupacional oAtencionOcupacional) {
        oExamenClinico = new ExamenClinico();
        oExamenClinicoBl = new ExamenClinicoBl();
        oExamenClinico = oExamenClinicoBl.getExamenClinico(oAtencionOcupacional);
        if (oExamenClinico != null) {
            txfTalla.setText(oExamenClinico.getTalla().toString());
            txfPeso.setText(oExamenClinico.getPeso().toString());
            txfImc.setText(oExamenClinico.getImc().toString());
            txfPerimetroAbdominal.setText(oExamenClinico.getPerimetroAbdominal().toString());
            txfFrecRespiratoria.setText(oExamenClinico.getFrecRespiratoria().toString());
            txfFrecCardiaca.setText(oExamenClinico.getFrecCardiaca().toString());
            txfPa.setText(oExamenClinico.getPresionArterial().toString());
            txfTemperatura.setText(oExamenClinico.getTemperatura().toString());
        }
    }

    private void buscarCie10(int JIF_HCOCUPACIONAL) {
        root.jifAdminCie10.setInvocador(JIF_HCOCUPACIONAL);
        root.insertarInternalFrames(root.jifAdminCie10);
    }

    void cargarCie10(Cie10 beanTabla) {
        oCie10 = beanTabla;
        txfCie10.setText(oCie10.getCodigo());
        txfCie10Desc.setText(oCie10.getDescripcion());
    }

    private boolean isDatosValidosDiagnostico() {
        return (!txfDiagnostico.getText().toUpperCase().trim().equals("")
                && !txfCie10.getText().toUpperCase().trim().equals("")
                && !txfCie10Desc.getText().toUpperCase().trim().equals(""));
    }

    private void agregarDiagnostico() {
        oSoFmoDiagnosticos = new SoFmoDiagnosticos();
        oSoFmoDiagnosticos.setDescripcion(txfDiagnostico.getText().toUpperCase().trim());
        oSoFmoDiagnosticos.setP(rbtnP.isSelected());
        oSoFmoDiagnosticos.setD(rbtnD.isSelected());
        oSoFmoDiagnosticos.setR(rbtnR.isSelected());
        oSoFmoDiagnosticos.setIdCie10(oCie10.getIdCie10());
        oModeloSoFmoDiagnostico.add(oSoFmoDiagnosticos);
    }

    private void personalizaVistaTabla() {
        System.out.println("");
    }

    private void resetComponentDiagnostico() {
        this.txfDiagnostico.setText("");
        this.txfCie10.setText("");
        this.txfCie10Desc.setText("");
        buttonGroup2.clearSelection();
    }

    private void imprimirFicha(FichaMedicoOcupacional oFichaMedicoOcupacional) {
        try {
            ds = new DSConeccion(root.getConfig());
            reportGenric = new ReportGeneric(ds.getConeccion());
            reportGenric.setReportParent("/lissa/reportes/");
            reportPanel = reportGenric.mkReport("FichaMedicoOcupacional", new String[]{"ID_FICHA"}, new Object[]{oFichaMedicoOcupacional.getIdfichamedicoocupacional()});
            reportVisor = new JInternalFrame();
            reportVisor.setTitle("Historia Clinica Digital");
            reportVisor.setIconifiable(true);
            reportVisor.setClosable(true);
            reportVisor.getContentPane().add(reportPanel);
            root.insertarInternalFrames(reportVisor);
            reportVisor.setMaximum(true);
        } catch (Exception ex) {
            Logger.getLogger(JPanel_FichaMedicoOcupacional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void resetComponentFicha() {
        txfNumFichaMedica.setText("");
        jdcFechaFichaMedica.setDate(null);
        oModeloSoFmoAntOcup.clear();
        chbxAlergias.setSelected(false);
        chbxDiabetes.setSelected(false);
        chbxTbc.setSelected(false);
        chbxHepatitisB.setSelected(false);
        chbxAsma.setSelected(false);
        chbxHta.setSelected(false);
        chbxIts.setSelected(false);
        chbxTifoidea.setSelected(false);
        chbxBronquitis.setSelected(false);
        chbxNeoplasia.setSelected(false);
        chbxConvulsiones.setSelected(false);
        chbxQuemaduras.setSelected(false);
        chbxCirugias.setSelected(false);
        chbxIntoxicaciones.setSelected(false);
        chbxOtros.setSelected(false);
        cbxHabitos.setSelectedIndex(0);
        txfTipoHabito.setText("");
        txfCantidadHabito.setText("");
        txfFrecuenciaHabito.setText("");
        oModeloSoFmoHabito.clear();
        txfPadre.setText("");
        txfMadre.setText("");
        txfHermanos.setText("");
        txfEsposo.setText("");
        txfHijosVivos.setText("");
        txfNumHijosVivos.setText("");
        txfHijosFallecidos.setText("");
        txfNumHijosFallecidos.setText("");
        txfEnfermedadAccidente.setText("");
        buttonGroup1.clearSelection();
        txfAnio.setText("");
        txfDiasDescanso.setText("");
        oModeloSoFmoAbsentismo.clear();
        txaAnamnesis.setText("");
        txfTalla.setText("");
        txfPeso.setText("");
        txfImc.setText("");
        txfPerimetroAbdominal.setText("");
        txfFrecRespiratoria.setText("");
        txfFrecCardiaca.setText("");
        txfPa.setText("");
        txfTemperatura.setText("");
        txaEctoscopia.setText("");
        chbxPiel.setSelected(false);        
        chbxCabello.setSelected(false);
        chbxOjos.setSelected(false);  
        chbxOidos.setSelected(false);
        chbxNariz.setSelected(false);
        chbxBoca.setSelected(false);
        chbxFaringe.setSelected(false);
        chbxCuello.setSelected(false);
        chbxAparatoRespiratorio.setSelected(false);
        chbxAparatoCardioascular.setSelected(false);
        chbxAparatoDigestivo.setSelected(false);
        chbxAparatoGenitourinario.setSelected(false);
        chbxLocomotor.setSelected(false);
        chbxMarcha.setSelected(false);
        chbxColumna.setSelected(false);
        chbxMiembrosSuperiores.setSelected(false);
        chbxMiembrosInferiores.setSelected(false);
        chbxSistemaLinfatico.setSelected(false);
        chbxSistemaNervioso.setSelected(false);
        txfPiel.setText("");
        txfCabello.setText("");
        txfOjo.setText("");
        txfOido.setText("");
        txfNariz.setText("");
        txfBoca.setText("");
        txfFaringe.setText("");
        txfCuello.setText("");
        txfAparatoRespiratorio.setText("");
        txfAparatoCardiovascular.setText("");
        txfAparatoDigestivo.setText("");
        txfAparatoGenitourinario.setText("");
        txfAparatoLocomotor.setText("");
        txfMarcha.setText("");
        txfColumna.setText("");
        txfMiembrosSuperiores.setText("");
        txfMiembrosInferiores.setText("");
        txfSistemaLinfatico.setText("");
        txfSistemaNervioso.setText("");
        /*Conclusiones*/
        txaConclusionesEvalPsicologica.setText("");
        txaConclusionesPsicotecnico.setText("");
        txaConcOftalmologica.setText("");
        txaConclusionesAudiometria.setText("");
        txaOsteomuscular.setText("");
        txaEspirometria.setText("");
        txaConcRadiograficas.setText("");
        txaHallazgos.setText("");
        txaOtros.setText("");
        txfDiagnostico.setText("");
        buttonGroup2.clearSelection();
        txfCie10Desc.setText("");
        txfCie10.setText("");
        oModeloSoFmoDiagnostico.clear();
        cbxCondicion.setSelectedIndex(0);
        txaRecomendaciones.setText("");
    }

}
