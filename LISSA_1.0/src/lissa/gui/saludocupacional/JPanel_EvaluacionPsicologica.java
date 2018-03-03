package lissa.gui.saludocupacional;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import lissa.be.AtencionOcupacional;
import lissa.be.EmpresaActual;
import lissa.be.FichaPsicologica;
import lissa.be.FichaPsicologicaPsicotecnico;
import lissa.be.HistoriaClinica;
import lissa.be.PacientePrueba;
import lissa.be.Persona;
import lissa.be.PersonaJuridica;
import lissa.be.Rol;
import lissa.be.Usuario;
import lissa.bl.EmpresaActualBl;
import lissa.bl.FichaPsicologicaBl;
import lissa.bl.FichaPsicologicaPsicotecnicoBl;
import lissa.bl.PacientePruebaBl;
import lissa.bl.PersonaJuridicaBl;
import lissa.bl.SoFmoAntecedentesOcupacionalesBl;
import lissa.ds.DSConeccion;
import lissa.gui.JF_Principal;
import lissa.reportes.ReportGeneric;
import lissa.table.ModeloSoFmoAntOcup;
import lissa.util.Mensajes;

public class JPanel_EvaluacionPsicologica extends javax.swing.JPanel {

    private JF_Principal root;
    private AtencionOcupacional oAtencionOcupacional;
    private Usuario userTemp;
    private Persona perTemp;
    private Rol rolTemp;

    private FichaPsicologica oFichaPsicologica;
    private FichaPsicologicaBl oFichaPsicologicaBl;
    private PacientePrueba oPacientePrueba;
    private PacientePruebaBl oPacientePruebaBl;
    private FichaPsicologicaPsicotecnico oFichaPsicologicaPsicotecnico;
    private FichaPsicologicaPsicotecnicoBl oFichaPsicologicaPsicotecnicoBl;
    private PersonaJuridica oPersonaJuridica;
    private PersonaJuridicaBl oPersonaJuridicaBl;
    private SoFmoAntecedentesOcupacionalesBl oSoFmoAntecedentesOcupacionalesBl;
    private ModeloSoFmoAntOcup oModeloSoFmoAntOcup;
    private EmpresaActualBl oEmpresaActualBl;
    private EmpresaActual oEmpresaActual;
    
    private ReportGeneric reportGenric = null;
    private JPanel reportPanel = null;
    private DSConeccion ds = null;
    private JInternalFrame reportVisor = null;

    public JPanel_EvaluacionPsicologica(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloSoFmoAntOcup = new ModeloSoFmoAntOcup();
        tblAntecedentesOcupacionales.setModel(oModeloSoFmoAntOcup);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMotivo = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaHistoriaFamiliar = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaAccidentesEnfermedades = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaHabitos = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txaOtrasObservaciones = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txfArea = new javax.swing.JTextField();
        chbxSubsuelo = new javax.swing.JCheckBox();
        chbxSuperficie = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        txfTiempoLaborado = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txfPuesto = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txfRiesgo = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txfMedidasSeguridad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txfEmpresa = new javax.swing.JTextField();
        txfActividad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAntecedentesOcupacionales = new javax.swing.JTable();
        btnSiguiente = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        chbxPsicolaboral = new javax.swing.JCheckBox();
        chbxPsicotecnico = new javax.swing.JCheckBox();
        jdcFechaEvaluacion = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbxPresentacion = new javax.swing.JComboBox();
        cbxPostura = new javax.swing.JComboBox();
        cbxRitmo = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        cbxTono = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        cbxArticulacion = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cbxTiempo = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        cbxEspacio = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        cbxPersona = new javax.swing.JComboBox();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txfLucidoAtento = new javax.swing.JTextField();
        txfPensamiento = new javax.swing.JTextField();
        txfPercepcion = new javax.swing.JTextField();
        txfmemcp = new javax.swing.JTextField();
        txfmemmp = new javax.swing.JTextField();
        txfmemlp = new javax.swing.JTextField();
        cbxInteligencia = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txfApetito = new javax.swing.JTextField();
        txfSuenio = new javax.swing.JTextField();
        txfPersonalidad = new javax.swing.JTextField();
        txfAfectividad = new javax.swing.JTextField();
        txfConductaSexual = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblPruebasPsicologicas = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaAreaCognitiva = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txaAreaEmocional = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        cbxCondicion = new javax.swing.JComboBox();
        jButton11 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txfNivelIntelectual = new javax.swing.JTextField();
        txfCoordinacion = new javax.swing.JTextField();
        txfNivelMemoria = new javax.swing.JTextField();
        txfPersonalidad1 = new javax.swing.JTextField();
        txfEfectividad = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txaAreaCognitiva1 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txaAreaEmocional1 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cbxPresentacion1 = new javax.swing.JComboBox();
        cbxPostura1 = new javax.swing.JComboBox();
        cbxRitmo1 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        cbxTono1 = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        cbxArticulacion1 = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cbxTiempo1 = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        cbxEspacio1 = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        cbxPersona1 = new javax.swing.JComboBox();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txaMotivoEvaluacion = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txaRecomendaciones = new javax.swing.JTextArea();
        jPanel20 = new javax.swing.JPanel();
        cbxCondicion1 = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(202, 237, 228));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(202, 237, 228));

        jPanel2.setBackground(new java.awt.Color(202, 237, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOTIVO DE EVALUACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaMotivo.setColumns(20);
        txaMotivo.setRows(5);
        jScrollPane1.setViewportView(txaMotivo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(202, 237, 228));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTORIA FAMILIAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaHistoriaFamiliar.setColumns(20);
        txaHistoriaFamiliar.setRows(5);
        jScrollPane3.setViewportView(txaHistoriaFamiliar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel7.setBackground(new java.awt.Color(202, 237, 228));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIDENTES Y ENFERMEDADES: (Durante el tiempo de trabajo)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaAccidentesEnfermedades.setColumns(20);
        txaAccidentesEnfermedades.setRows(5);
        jScrollPane4.setViewportView(txaAccidentesEnfermedades);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(202, 237, 228));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HÁBITOS: (Pasatiempo, consumo de tabaco,alchool y/o drogas)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaHabitos.setColumns(20);
        txaHabitos.setRows(5);
        jScrollPane6.setViewportView(txaHabitos);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(202, 237, 228));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OTRAS OBSERVACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaOtrasObservaciones.setColumns(20);
        txaOtrasObservaciones.setRows(5);
        jScrollPane5.setViewportView(txaOtrasObservaciones);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(202, 237, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS OCUPACIONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(202, 237, 228));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMPRESA ACTUAL(postula, trabaja o trabajó)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Área de trabajo:");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        chbxSubsuelo.setBackground(new java.awt.Color(202, 237, 228));
        chbxSubsuelo.setText("Subsuelo");
        chbxSubsuelo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        chbxSubsuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxSubsueloActionPerformed(evt);
            }
        });

        chbxSuperficie.setBackground(new java.awt.Color(202, 237, 228));
        chbxSuperficie.setText("Superficie");
        chbxSuperficie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chbxSuperficie.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        chbxSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxSuperficieActionPerformed(evt);
            }
        });

        jLabel21.setText("Tiempo total laborando");

        txfTiempoLaborado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTiempoLaboradoActionPerformed(evt);
            }
        });

        jLabel32.setText("Puesto:");

        txfPuesto.setEnabled(false);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Principales Riesgos:");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Medidas de Seguridad:");
        jLabel53.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel10.setText("Empresa :");

        txfEmpresa.setEnabled(false);

        txfActividad.setEnabled(false);
        txfActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfActividadActionPerformed(evt);
            }
        });

        jLabel3.setText("Actividad de la empresa :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbxSuperficie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbxSubsuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfTiempoLaborado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfRiesgo)
                    .addComponent(txfMedidasSeguridad)))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfActividad))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txfActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbxSuperficie)
                            .addComponent(chbxSubsuelo)
                            .addComponent(jLabel21))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfTiempoLaborado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel34)
                    .addComponent(txfRiesgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel53)
                    .addComponent(txfMedidasSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txfPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(202, 237, 228));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES OCUPACIONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblAntecedentesOcupacionales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tblAntecedentesOcupacionales);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/next-icon.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Examenes :");

        chbxPsicolaboral.setBackground(new java.awt.Color(202, 237, 228));
        chbxPsicolaboral.setText("Psicolaboral");
        chbxPsicolaboral.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chbxPsicolaboral.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chbxPsicotecnico.setBackground(new java.awt.Color(202, 237, 228));
        chbxPsicotecnico.setText("Psicotecnico");
        chbxPsicotecnico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chbxPsicotecnico.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chbxPsicotecnico.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbxPsicotecnicoStateChanged(evt);
            }
        });

        jdcFechaEvaluacion.setDateFormatString("dd/MM/yyyy");
        jdcFechaEvaluacion.setEnabled(false);

        jLabel24.setText("FECHA :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(49, 49, 49)
                .addComponent(chbxPsicolaboral)
                .addGap(27, 27, 27)
                .addComponent(chbxPsicotecnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdcFechaEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(chbxPsicolaboral)
                    .addComponent(chbxPsicotecnico)
                    .addComponent(jLabel24))
                .addGap(762, 765, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PSICOLABORAL I", jPanel1);

        jPanel6.setBackground(new java.awt.Color(202, 237, 228));

        jPanel11.setBackground(new java.awt.Color(202, 237, 228));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMEN MENTAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel12.setBackground(new java.awt.Color(202, 237, 228));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVACION DE CONDUCTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel7.setText("Presentación :");

        jLabel8.setText("Postura :");

        jLabel17.setText("Discurso :");

        jLabel18.setText("Ritmo :");

        cbxPresentacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ADECUADO", "INADECUADO" }));

        cbxPostura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ERGUIDA", "ENCORVADA" }));
        cbxPostura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cbxRitmo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "LENTO", "RAPIDO", "FLUIDO" }));

        jLabel20.setText("Tono :");

        cbxTono.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "BAJO", "MODERADO", "ALTO" }));

        jLabel22.setText("Articulación :");

        cbxArticulacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "CON DIFICULTAD", "SIN DIFICULTAD" }));

        jLabel30.setText("Orientación :");

        jLabel31.setText("Tiempo :");

        cbxTiempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ORIENTADO", "DESORIENTADO" }));

        jLabel33.setText("Espacio :");

        cbxEspacio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ORIENTADO", "DESORIENTADO" }));

        jLabel35.setText("Persona :");

        cbxPersona.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ORIENTADO", "DESORIENTADO" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel7)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel31))))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxTono, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxArticulacion, 0, 218, Short.MAX_VALUE)
                            .addComponent(cbxTiempo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxEspacio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPersona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxRitmo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPostura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPostura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRitmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxArticulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(cbxPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(202, 237, 228));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROCESOS COGNITIVOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setText("Lucido, atento :");

        jLabel2.setText("Pensamiento :");

        jLabel4.setText("Percepción :");

        jLabel5.setText("Memoria :");

        jLabel6.setText("Corto plazo");

        jLabel9.setText("Mediano plazo");

        jLabel11.setText("Largo plazo");

        jLabel12.setText("Inteligencia :");

        cbxInteligencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "MUY SUPERIOR", "SUPERIOR", "NORMAL BRILLANTE", "MUY TORPE", "NORMAL TORPE", "FRONTERIZO", "RM LEVE", "RM MODERADO", "RM SEVERO", "RM PROFUNDO" }));

        jLabel13.setText("Apetito :");

        jLabel14.setText("Sueño :");

        jLabel15.setText("Personalidad :");

        jLabel16.setText("Afectividad :");

        jLabel54.setText("Conducta Sexual :");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfmemcp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfmemmp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfmemlp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxInteligencia, 0, 332, Short.MAX_VALUE)
                                    .addComponent(txfApetito))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfAfectividad)
                                    .addComponent(txfConductaSexual)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfPersonalidad)
                                    .addComponent(txfSuenio)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfPensamiento)
                                    .addComponent(txfPercepcion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txfLucidoAtento, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfLucidoAtento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfPensamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfPercepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(txfmemcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfmemmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfmemlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbxInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txfApetito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txfSuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txfPersonalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txfAfectividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txfConductaSexual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jPanel14.setBackground(new java.awt.Color(202, 237, 228));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRUEBAS PSICOLOGICAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblPruebasPsicologicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Inventario Millon  de Estilos de Personalidad - MIPS"},
                {null, "Escala de Motivaciones Psicosociales - MPS"},
                {null, "Luria - DNA Diagnostico Neuropsicologico de Adultos"},
                {null, "Escala de apreciación del Estres - EAE"},
                {null, "Inventario de Burnout de Maslach"},
                {null, "Clima Laboral"},
                {null, "Bateria de Conductores"},
                {null, "WAIS"},
                {null, "Test BENTON"},
                {null, "Test Bender"},
                {null, "Inventario de la ansiedad ZUNG"},
                {null, "Inventario de la depresion ZUNG"},
                {null, "Escala de Memoria de Wechsler"},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PTJE", "Pruebas Psicológicas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblPruebasPsicologicas);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 454, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 454, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(202, 237, 228));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGNOSTICO FINAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaAreaCognitiva.setColumns(20);
        txaAreaCognitiva.setRows(5);
        txaAreaCognitiva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AREA COGNITIVA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane2.setViewportView(txaAreaCognitiva);

        txaAreaEmocional.setColumns(20);
        txaAreaEmocional.setRows(5);
        txaAreaEmocional.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AREA EMOCIONAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane8.setViewportView(txaAreaEmocional);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane8)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(202, 237, 228));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONDICIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbxCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "APTO", "NO APTO" }));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbxCondicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbxCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        jButton11.setToolTipText("Guardar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/back-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/next-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButton1))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PSICOLABORAL II", jPanel6);

        jPanel28.setBackground(new java.awt.Color(202, 237, 228));

        jPanel18.setBackground(new java.awt.Color(202, 237, 228));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESULTDADOS DE EVALUACIÓN:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Nivel intelectual : ");
        jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Coordinación Vizomotriz :");
        jLabel44.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Nivel de memoria:");
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Personalidad :");
        jLabel46.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Afectividad :");
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txfCoordinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCoordinacionActionPerformed(evt);
            }
        });

        txfNivelMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNivelMemoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfNivelIntelectual, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(txfCoordinacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfNivelMemoria)
                    .addComponent(txfPersonalidad1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfEfectividad)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNivelIntelectual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel44)
                    .addComponent(txfCoordinacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel45)
                    .addComponent(txfNivelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel46)
                    .addComponent(txfPersonalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel47)
                    .addComponent(txfEfectividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(202, 237, 228));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONCLUSIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaAreaCognitiva1.setColumns(20);
        txaAreaCognitiva1.setRows(5);
        txaAreaCognitiva1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AREA COGNITIVA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane10.setViewportView(txaAreaCognitiva1);

        txaAreaEmocional1.setColumns(20);
        txaAreaEmocional1.setRows(5);
        txaAreaEmocional1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AREA EMOCIONAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jScrollPane11.setViewportView(txaAreaEmocional1);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
            .addComponent(jScrollPane11)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(202, 237, 228));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVACION DE CONDUCTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel25.setText("Presentación :");

        jLabel26.setText("Postura :");

        jLabel27.setText("Discurso :");

        jLabel28.setText("Ritmo :");

        cbxPresentacion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ADECUADO", "INADECUADO" }));

        cbxPostura1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ERGUIDA", "ENCOGIDA" }));
        cbxPostura1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cbxRitmo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "LENTO", "RAPIDO", "FLUIDO" }));

        jLabel29.setText("Tono :");

        cbxTono1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "BAJO", "MODERADO", "ALTO" }));

        jLabel36.setText("Articulación :");

        cbxArticulacion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "CON DIFICULTAD", "SIN DIFICULTAD" }));

        jLabel37.setText("Orientación :");

        jLabel38.setText("Tiempo :");

        cbxTiempo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ORIENTADO", "DESORIENTADO" }));

        jLabel39.setText("Espacio :");

        cbxEspacio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ORIENTADO", "DESORIENTADO" }));

        jLabel40.setText("Persona :");

        cbxPersona1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "ORIENTADO", "DESORIENTADO" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxPresentacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel36)
                            .addComponent(jLabel38))))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPostura1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxRitmo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxTono1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxArticulacion1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxTiempo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxEspacio1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxPersona1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPresentacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPostura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRitmo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxArticulacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEspacio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(cbxPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(202, 237, 228));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOTIVO DE EVALUACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaMotivoEvaluacion.setColumns(20);
        txaMotivoEvaluacion.setRows(5);
        jScrollPane12.setViewportView(txaMotivoEvaluacion);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(202, 237, 228));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RECOMENDACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txaRecomendaciones.setColumns(20);
        txaRecomendaciones.setRows(5);
        jScrollPane13.setViewportView(txaRecomendaciones);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(202, 237, 228));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONDICIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbxCondicion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "APTO", "NO APTO" }));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbxCondicion1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbxCondicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/back-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("PSICOTECNICO", jPanel28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txfActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfActividadActionPerformed

    private void chbxSubsueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxSubsueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxSubsueloActionPerformed

    private void chbxSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxSuperficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxSuperficieActionPerformed

    private void txfTiempoLaboradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTiempoLaboradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTiempoLaboradoActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (isDatosValidos()) {
            registrar();
        } else {
            Mensajes.msjValidarIngreso();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txfCoordinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCoordinacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCoordinacionActionPerformed

    private void txfNivelMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNivelMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNivelMemoriaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (isDatosValidosPsicotecnico()) {
            registrarPsicotecnico();
        } else {
            Mensajes.msjValidarIngreso();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void chbxPsicotecnicoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbxPsicotecnicoStateChanged
        if(chbxPsicotecnico.isSelected()){
            habilitaFichaPsicotecnico(true);
        }else{
            habilitaFichaPsicotecnico(false);
        }
        
    }//GEN-LAST:event_chbxPsicotecnicoStateChanged

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(chbxPsicotecnico.isSelected()){
            jTabbedPane1.setSelectedIndex(2);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox cbxArticulacion;
    private javax.swing.JComboBox cbxArticulacion1;
    private javax.swing.JComboBox cbxCondicion;
    private javax.swing.JComboBox cbxCondicion1;
    private javax.swing.JComboBox cbxEspacio;
    private javax.swing.JComboBox cbxEspacio1;
    private javax.swing.JComboBox cbxInteligencia;
    private javax.swing.JComboBox cbxPersona;
    private javax.swing.JComboBox cbxPersona1;
    private javax.swing.JComboBox cbxPostura;
    private javax.swing.JComboBox cbxPostura1;
    private javax.swing.JComboBox cbxPresentacion;
    private javax.swing.JComboBox cbxPresentacion1;
    private javax.swing.JComboBox cbxRitmo;
    private javax.swing.JComboBox cbxRitmo1;
    private javax.swing.JComboBox cbxTiempo;
    private javax.swing.JComboBox cbxTiempo1;
    private javax.swing.JComboBox cbxTono;
    private javax.swing.JComboBox cbxTono1;
    private javax.swing.JCheckBox chbxPsicolaboral;
    private javax.swing.JCheckBox chbxPsicotecnico;
    private javax.swing.JCheckBox chbxSubsuelo;
    private javax.swing.JCheckBox chbxSuperficie;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel28;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdcFechaEvaluacion;
    private javax.swing.JTable tblAntecedentesOcupacionales;
    private javax.swing.JTable tblPruebasPsicologicas;
    private javax.swing.JTextArea txaAccidentesEnfermedades;
    private javax.swing.JTextArea txaAreaCognitiva;
    private javax.swing.JTextArea txaAreaCognitiva1;
    private javax.swing.JTextArea txaAreaEmocional;
    private javax.swing.JTextArea txaAreaEmocional1;
    private javax.swing.JTextArea txaHabitos;
    private javax.swing.JTextArea txaHistoriaFamiliar;
    private javax.swing.JTextArea txaMotivo;
    private javax.swing.JTextArea txaMotivoEvaluacion;
    private javax.swing.JTextArea txaOtrasObservaciones;
    private javax.swing.JTextArea txaRecomendaciones;
    private javax.swing.JTextField txfActividad;
    private javax.swing.JTextField txfAfectividad;
    private javax.swing.JTextField txfApetito;
    private javax.swing.JTextField txfArea;
    private javax.swing.JTextField txfConductaSexual;
    private javax.swing.JTextField txfCoordinacion;
    private javax.swing.JTextField txfEfectividad;
    private javax.swing.JTextField txfEmpresa;
    private javax.swing.JTextField txfLucidoAtento;
    private javax.swing.JTextField txfMedidasSeguridad;
    private javax.swing.JTextField txfNivelIntelectual;
    private javax.swing.JTextField txfNivelMemoria;
    private javax.swing.JTextField txfPensamiento;
    private javax.swing.JTextField txfPercepcion;
    private javax.swing.JTextField txfPersonalidad;
    private javax.swing.JTextField txfPersonalidad1;
    private javax.swing.JTextField txfPuesto;
    private javax.swing.JTextField txfRiesgo;
    private javax.swing.JTextField txfSuenio;
    private javax.swing.JTextField txfTiempoLaborado;
    private javax.swing.JTextField txfmemcp;
    private javax.swing.JTextField txfmemlp;
    private javax.swing.JTextField txfmemmp;
    // End of variables declaration//GEN-END:variables

    void enviarDatosAtencionOcupacionalApanel(AtencionOcupacional oAtencionOcupacional) {
        this.oAtencionOcupacional = oAtencionOcupacional;
        /*Buscar el nombre de la empresa  para la cual se esta evaluando*/
        recuperarEmpresa(oAtencionOcupacional);
        /*Listar en la tabla los antecedentes ocupacionales que fueron llenados en triaje*/
        listarAntOcupacionales(oAtencionOcupacional.getHistoriaClinica());
        /*Generar fecha actual*/
        generarFechaActual();
    }

    void enviarDatosUser(Usuario userTemp, Persona perTemp, Rol rolTemp) {
        this.userTemp = userTemp;
        this.perTemp = perTemp;
        this.rolTemp = rolTemp;
    }

    private boolean isDatosValidos() {
        return true;
    }

    private void registrar() {
        oFichaPsicologica = registrarFicha(oAtencionOcupacional);
        /*Registrar los datos adicionales a la empresa actual*/
        registrarEmpresaActual(oAtencionOcupacional);
        /**/
        if (oFichaPsicologica != null) {
            registrarPruebas(oFichaPsicologica);
            Mensajes.msjRegCorrecta();
            imprimirFicha(oFichaPsicologica);  
            resetComponentFichaPsicologica();
        } else {
            Mensajes.msjRegError();
        }
    }

    private FichaPsicologica registrarFicha(AtencionOcupacional oAtencionOcupacional) {
        oFichaPsicologica = new FichaPsicologica();
        oFichaPsicologicaBl = new FichaPsicologicaBl();
        oFichaPsicologica.setAtencionOcupacional(oAtencionOcupacional);
        oFichaPsicologica.setMotivoEvaluacion(txaMotivo.getText().toUpperCase().trim());
        oFichaPsicologica.setHistoriaFamiliar(txaHistoriaFamiliar.getText().toUpperCase().trim());
        oFichaPsicologica.setAccidenteEnfermedad(txaAccidentesEnfermedades.getText().toUpperCase().trim());
        oFichaPsicologica.setHabito(txaHabitos.getText().toUpperCase().trim());
        oFichaPsicologica.setOtraObservacion(txaOtrasObservaciones.getText().toUpperCase().trim());
        oFichaPsicologica.setPresentacion(cbxPresentacion.getSelectedItem().toString());
        oFichaPsicologica.setPostura(cbxPostura.getSelectedItem().toString());
        oFichaPsicologica.setDiscursoRitmo(cbxRitmo.getSelectedItem().toString());
        oFichaPsicologica.setDiscursoTono(cbxTono.getSelectedItem().toString());
        oFichaPsicologica.setDiscursoArt(cbxArticulacion.getSelectedItem().toString());
        oFichaPsicologica.setOrientacionTiempo(cbxTiempo.getSelectedItem().toString());
        oFichaPsicologica.setOrientacionEspacio(cbxEspacio.getSelectedItem().toString());
        oFichaPsicologica.setOrientacionPersona(cbxPersona.getSelectedItem().toString());
        oFichaPsicologica.setLucidoAtento(txfLucidoAtento.getText().toUpperCase().trim());
        oFichaPsicologica.setPensamiento(txfPensamiento.getText().toUpperCase().trim());
        oFichaPsicologica.setPercepcion(txfPercepcion.getText().toUpperCase().trim());
        oFichaPsicologica.setMemoriaCp(txfmemcp.getText().toUpperCase().trim());
        oFichaPsicologica.setMemoriaMp(txfmemmp.getText().toUpperCase().trim());
        oFichaPsicologica.setMemoriaLp(txfmemlp.getText().toUpperCase().trim());
        oFichaPsicologica.setInteligencia(cbxInteligencia.getSelectedItem().toString());
        oFichaPsicologica.setApetito(txfApetito.getText().toUpperCase().trim());
        oFichaPsicologica.setSuenio(txfSuenio.getText().toUpperCase().trim());
        oFichaPsicologica.setPersonalidad(txfPersonalidad.getText().toUpperCase().trim());
        oFichaPsicologica.setAfectividad(txfAfectividad.getText().toUpperCase().trim());
        oFichaPsicologica.setConductaSexual(txfConductaSexual.getText().toUpperCase().trim());
        oFichaPsicologica.setDxAreaCognitiva(txaAreaCognitiva.getText().toUpperCase().trim());
        oFichaPsicologica.setDxAreaEmocional(txaAreaEmocional.getText().toUpperCase().trim());
        oFichaPsicologica.setFechaEvaluacion(jdcFechaEvaluacion.getDate());
        oFichaPsicologica.setCondicion(cbxCondicion.getSelectedItem().toString());
        oFichaPsicologica.setIdUsuario(userTemp.getIdUsuario());
        oFichaPsicologica.setExamenPsicolaboral(chbxPsicolaboral.isSelected());
        oFichaPsicologica.setExamenPsicotecnico(chbxPsicotecnico.isSelected());

        return oFichaPsicologicaBl.registrar(oFichaPsicologica);

    }

    private void registrarPruebas(FichaPsicologica oFichaPsicologica) { 
        for (int i = 0; i < tblPruebasPsicologicas.getRowCount(); i++) {
            for (int j = 0; j < tblPruebasPsicologicas.getColumnCount(); j++) {
                oPacientePrueba = new PacientePrueba();
                oPacientePruebaBl = new PacientePruebaBl();
                oPacientePrueba.setPtje((String) tblPruebasPsicologicas.getValueAt(i, j));
                oPacientePrueba.setPrueba((String) tblPruebasPsicologicas.getValueAt(i, j+1));
                oPacientePrueba.setFichaPsicologica(oFichaPsicologica);
                oPacientePruebaBl.registrar(oPacientePrueba);
                j = tblPruebasPsicologicas.getColumnCount();
            }
        }
    }

    private boolean isDatosValidosPsicotecnico() {
        return true;
    }

    private void registrarPsicotecnico() {
        oFichaPsicologicaPsicotecnico = registrarFichaPsicotecnico(oAtencionOcupacional);
        if (oFichaPsicologicaPsicotecnico != null) {
            Mensajes.msjRegCorrecta();
            imprimirFicha(oFichaPsicologicaPsicotecnico);
            resetComponentFichaPsicotecnica();
        } else {
            Mensajes.msjRegError();
        }
    }

    private FichaPsicologicaPsicotecnico registrarFichaPsicotecnico(AtencionOcupacional oAtencionOcupacional) {
        oFichaPsicologicaPsicotecnico = new FichaPsicologicaPsicotecnico();
        oFichaPsicologicaPsicotecnicoBl = new FichaPsicologicaPsicotecnicoBl();
        oFichaPsicologicaPsicotecnico.setAtencionOcupacional(oAtencionOcupacional);
        oFichaPsicologicaPsicotecnico.setMotivoEvaluacion(txaMotivoEvaluacion.getText().toUpperCase().trim());
        oFichaPsicologicaPsicotecnico.setPresentacion(cbxPresentacion1.getSelectedItem().toString());
        oFichaPsicologicaPsicotecnico.setPostura(cbxPostura1.getSelectedItem().toString());
        oFichaPsicologicaPsicotecnico.setDiscursoRitmo(cbxRitmo1.getSelectedItem().toString());
        oFichaPsicologicaPsicotecnico.setDiscursoTono(cbxTono1.getSelectedItem().toString());
        oFichaPsicologicaPsicotecnico.setDiscursoArticulacion(cbxArticulacion1.getSelectedItem().toString());
        oFichaPsicologicaPsicotecnico.setOrientacionTiempo(cbxTiempo1.getSelectedItem().toString());
        oFichaPsicologicaPsicotecnico.setOrientacionEspacio(cbxEspacio1.getSelectedItem().toString());
        oFichaPsicologicaPsicotecnico.setOrientacionPersona(cbxPersona1.getSelectedItem().toString());
        oFichaPsicologicaPsicotecnico.setNivelIntelectual(txfNivelIntelectual.getText().toUpperCase().trim());
        oFichaPsicologicaPsicotecnico.setCoordinacionVisomotriz(txfCoordinacion.getText().toUpperCase().trim());
        oFichaPsicologicaPsicotecnico.setNivelMemoria(txfNivelMemoria.getText().toUpperCase().trim());
        oFichaPsicologicaPsicotecnico.setPersonalidad(txfPersonalidad1.getText().toUpperCase().trim());
        oFichaPsicologicaPsicotecnico.setAfectividad(txfEfectividad.getText().toUpperCase().trim());
        oFichaPsicologicaPsicotecnico.setConAreaCognitiva(txaAreaCognitiva1.getText().toUpperCase().trim());
        oFichaPsicologicaPsicotecnico.setConAreaEmocional(txaAreaEmocional1.getText().toUpperCase().trim());
        oFichaPsicologicaPsicotecnico.setRecomendacion(txaRecomendaciones.getText().toUpperCase().trim());
        oFichaPsicologicaPsicotecnico.setCondicion(cbxCondicion1.getSelectedItem().toString());
        oFichaPsicologicaPsicotecnico.setIdUsuario(userTemp.getIdUsuario());
        
        return oFichaPsicologicaPsicotecnicoBl.registrar(oFichaPsicologicaPsicotecnico);
    }

    private void recuperarEmpresa(AtencionOcupacional oAtencionOcupacional) {
        oPersonaJuridica = new PersonaJuridica();
        oPersonaJuridicaBl = new PersonaJuridicaBl();
        oPersonaJuridica = oPersonaJuridicaBl.buscarxId(oAtencionOcupacional);
        if(oPersonaJuridica != null){
            imprimirDatos(oPersonaJuridica, oAtencionOcupacional);
        }
    }

    private void imprimirDatos(PersonaJuridica oPersonaJuridica, AtencionOcupacional oAtencionOcupacional) {
        txfEmpresa.setText(oPersonaJuridica.getRazonSocial());
        txfActividad.setText(oPersonaJuridica.getActividadEcon());
        txfPuesto.setText(oAtencionOcupacional.getPuestoPostula());
    }

    private void listarAntOcupacionales(HistoriaClinica historiaClinica) {
        oSoFmoAntecedentesOcupacionalesBl = new SoFmoAntecedentesOcupacionalesBl();
        oModeloSoFmoAntOcup.addAll(oSoFmoAntecedentesOcupacionalesBl.listar(historiaClinica));
    }

    private void registrarEmpresaActual(AtencionOcupacional oAtencionOcupacional) {
        oEmpresaActual = new EmpresaActual();
        oEmpresaActualBl = new EmpresaActualBl();
        oEmpresaActual.setAtencionOcupacional(oAtencionOcupacional);
        oEmpresaActual.setAreaTrabajo(txfArea.getText().toUpperCase().trim());
        oEmpresaActual.setSuperficie(chbxSuperficie.isSelected());
        oEmpresaActual.setSubsuelo(chbxSubsuelo.isSelected());
        oEmpresaActual.setTiempoLaborando(txfTiempoLaborado.getText().toUpperCase().trim());
        oEmpresaActual.setRiesgo(txfRiesgo.getText().toUpperCase().trim());
        oEmpresaActual.setMedidaSeguridad(txfMedidasSeguridad.getText().toUpperCase().trim());
        oEmpresaActualBl.registrar(oEmpresaActual);
    }

    private void habilitaFichaPsicotecnico(boolean b) {
        jTabbedPane1.setEnabledAt(2, b);
    }

    private void generarFechaActual() {
        Calendar calendar = Calendar.getInstance();//Variable de Objeto Calendar        
        //fecha de sistema
        jdcFechaEvaluacion.setCalendar(calendar);
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

    private void imprimirFicha(FichaPsicologica oFichaPsicologica) {
        try {
            ds = new DSConeccion(root.getConfig());
            reportGenric = new ReportGeneric(ds.getConeccion());
            reportGenric.setReportParent("/lissa/reportes/");
            reportPanel = reportGenric.mkReport("FichaPsicologica", new String[]{"ID"}, new Object[]{oFichaPsicologica.getIdfichapsicologica()});
            reportVisor = new JInternalFrame();
            reportVisor.setTitle("Historia Clinica Digital");
            reportVisor.setIconifiable(true);
            reportVisor.setClosable(true);
            reportVisor.getContentPane().add(reportPanel);
            root.insertarInternalFrames(reportVisor);
            reportVisor.setMaximum(true);
        } catch (Exception ex) {
            Logger.getLogger(JPanel_EvaluacionPsicologica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void imprimirFicha(FichaPsicologicaPsicotecnico oFichaPsicologicaPsicotecnico) {
        try {
            ds = new DSConeccion(root.getConfig());
            reportGenric = new ReportGeneric(ds.getConeccion());
            reportGenric.setReportParent("/lissa/reportes/");
            reportPanel = reportGenric.mkReport("FichaPsicotecnico", new String[]{"ID_FPP"}, new Object[]{oFichaPsicologicaPsicotecnico.getIdfichapsicologicapsicotecnico()});
            reportVisor = new JInternalFrame();
            reportVisor.setTitle("Historia Clinica Digital");
            reportVisor.setIconifiable(true);
            reportVisor.setClosable(true);
            reportVisor.getContentPane().add(reportPanel);
            root.insertarInternalFrames(reportVisor);
            reportVisor.setMaximum(true);
        } catch (Exception ex) {
            Logger.getLogger(JPanel_EvaluacionPsicologica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void resetComponentFichaPsicologica() {
        chbxPsicolaboral.setSelected(false);
        //chbxPsicotecnico.setSelected(false);
        jdcFechaEvaluacion.setDate(null);
        txaMotivo.setText("");
        //Datos ocupacionales
        txfEmpresa.setText("");
        txfActividad.setText("");
        txfArea.setText("");
        chbxSuperficie.setSelected(false);
        chbxSubsuelo.setSelected(false);
        txfTiempoLaborado.setText("");
        txfPuesto.setText("");
        txfRiesgo.setText("");
        txfMedidasSeguridad.setText("");
        oModeloSoFmoAntOcup.clear();
        //Antecedentes
        txaHistoriaFamiliar.setText("");
        txaAccidentesEnfermedades.setText("");
        txaHabitos.setText("");
        txaOtrasObservaciones.setText("");
        //Examen Mental - Observacion de conductas
        cbxPresentacion.setSelectedIndex(0);
        cbxPostura.setSelectedIndex(0);
        cbxRitmo.setSelectedIndex(0);
        cbxTono.setSelectedIndex(0);
        cbxArticulacion.setSelectedIndex(0);
        cbxTiempo.setSelectedIndex(0);
        cbxEspacio.setSelectedIndex(0);
        cbxPersona.setSelectedIndex(0);
        //Examen Mental - Procesos cognitivos
        txfLucidoAtento.setText("");
        txfPensamiento.setText("");
        txfPercepcion.setText("");
        txfmemcp.setText("");
        txfmemmp.setText("");
        txfmemlp.setText("");
        cbxInteligencia.setSelectedIndex(0);
        txfApetito.setText("");
        txfSuenio.setText("");
        txfPersonalidad.setText("");
        txfAfectividad.setText("");
        txfConductaSexual.setText("");
        txaAreaCognitiva.setText("");
        txaAreaEmocional.setText("");
        cbxCondicion.setSelectedIndex(0);
    }

    private void resetComponentFichaPsicotecnica() {
        chbxPsicotecnico.setSelected(false);
        txaMotivoEvaluacion.setText("");
        cbxPresentacion1.setSelectedIndex(0);
        cbxPostura1.setSelectedIndex(0);
        cbxRitmo1.setSelectedIndex(0);
        cbxTono1.setSelectedIndex(0);
        cbxArticulacion1.setSelectedIndex(0);
        cbxTiempo1.setSelectedIndex(0);
        cbxEspacio1.setSelectedIndex(0);
        cbxPersona1.setSelectedIndex(0);
        txfNivelIntelectual.setText("");
        txfCoordinacion.setText("");
        txfNivelMemoria.setText("");
        txfPersonalidad1.setText("");
        txfEfectividad.setText("");
        txaAreaCognitiva1.setText("");
        txaAreaEmocional1.setText("");
        txaRecomendaciones.setText("");
        cbxCondicion1.setSelectedIndex(0);
    }
}
