package lissa.gui.saludocupacional;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import lissa.be.AtencionOcupacional;
import lissa.be.Cie10;
import lissa.be.HistoriaClinica;
import lissa.be.Persona;
import lissa.be.PersonaJuridica;
import lissa.be.Rol;
import lissa.be.Usuario;
import lissa.bl.AtencionOcupacionalBl;
import lissa.bl.HistoriaClinicaBl;
import lissa.bl.PersonaJuridicaBl;
import lissa.controller.EvaluacionOcuCtrl;
import lissa.controller.ExamenOcupCtrl;
import lissa.gui.JF_Principal;
import lissa.gui.JIF_BuscarPersonaNatural;
import lissa.util.Mensajes;
import org.rx.cr.util.Utilitarios;

public class JIF_HistoriaClinicaOcupacional extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private JPanel_EvaluacionOftalmologica jPanel_EvalOftal;
    private EvaluacionOcuCtrl oEvaluacionOcuCtrl;
    private ExamenOcupCtrl oExamenOcupCtrl;
    private Persona oPersona;
    private HistoriaClinica oHistoriaClinica;
    private HistoriaClinicaBl oHistoriaClinicaBl;
    private AtencionOcupacional oAtencionOcupacional;
    private AtencionOcupacionalBl oAtencionOcupacionalBl;
    private PersonaJuridica oPersonaJuridica;
    private PersonaJuridicaBl oPersonaJuridicaBl;

    //private JPanel_HistoriaClinicaOcupacional jPanel_HistoriaClinica_Ocupacional = null;
    private Usuario userTemp;
    private Persona perTemp;
    private Rol rolTemp;

    //Llamamos al panel de ficha de evaluacion osteomuscular
    private JPanel_EvaluacionOsteomuscular jPanel_EvalOsteomuscular;
    private JPanel_EvaluacionAudiometrica jPanel_EvalAudiometrica;
    private JPanel_Certificado jPanel_Certificado;
    private JPanel_FichaMedicoOcupacional jPanel_FichaMedicoOcupacional;
    private JPanel_EvaluacionPsicologica jPanel_EvaluacionPsicologica;
    private JPanel_Triaje jPanel_triaje;
    private JPanel_InformeMedicoOcupacional jPanel_informeMO;

    public JIF_HistoriaClinicaOcupacional(JF_Principal root) {
        initComponents();
        this.root = root;
        jPanel_EvalOftal = new JPanel_EvaluacionOftalmologica(root);
        jPanel_EvalOsteomuscular = new JPanel_EvaluacionOsteomuscular(root);
        jPanel_EvalAudiometrica = new JPanel_EvaluacionAudiometrica(root);
        jPanel_Certificado = new JPanel_Certificado(root);
        jPanel_FichaMedicoOcupacional = new JPanel_FichaMedicoOcupacional(root);
        jPanel_EvaluacionPsicologica = new JPanel_EvaluacionPsicologica(root);
        jPanel_triaje = new JPanel_Triaje(root);
        renameBtn();
        //llenar combo tipo examen
        oExamenOcupCtrl = new ExamenOcupCtrl(root);
        oExamenOcupCtrl.rellenaExamenOcu(cbxExamenOcu);
        //llenar combo tipo evaluacion
        oEvaluacionOcuCtrl = new EvaluacionOcuCtrl(root);
        oEvaluacionOcuCtrl.rellenaEvaluacionOcu(cbxEvaluacionOcu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTaskPaneContainer1 = new org.jdesktop.swingx.JXTaskPaneContainer();
        tpnValoresIniciales = new org.jdesktop.swingx.JXTaskPane();
        btnCertificado = new javax.swing.JButton();
        btnInformeMO = new javax.swing.JButton();
        btnFichaMedicoOcup = new javax.swing.JButton();
        btnFichaEvalOsteoMusc = new javax.swing.JButton();
        btnEvalOftalmologica = new javax.swing.JButton();
        btnFichaEvalAudio = new javax.swing.JButton();
        btnFichaPsicologica = new javax.swing.JButton();
        btnTriaje = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        conten = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jdcFechaAtencion = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        cbxEvaluacionOcu = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        cbxExamenOcu = new javax.swing.JComboBox();
        jPanel17 = new javax.swing.JPanel();
        txfHistoriaClinica = new javax.swing.JTextField();
        btnBuscarPaciente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfNombres = new javax.swing.JTextField();
        txfEdad = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jdcFechanacimiento = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txfNumDni = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txfNumRuc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txfRazonSocial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txfActEconomica = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txfPuesto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txfProyecto = new javax.swing.JTextField();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(202, 237, 228));

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setEnabled(false);
        jSplitPane1.setOneTouchExpandable(true);

        jXTaskPaneContainer1.setBackground(new java.awt.Color(202, 237, 228));
        jXTaskPaneContainer1.setPreferredSize(new java.awt.Dimension(240, 600));
        jXTaskPaneContainer1.setScrollableTracksViewportHeight(true);
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(10);
        jXTaskPaneContainer1.setLayout(verticalLayout1);

        tpnValoresIniciales.setBackground(new java.awt.Color(202, 237, 228));
        tpnValoresIniciales.setForeground(new java.awt.Color(2, 142, 71));
        tpnValoresIniciales.setAnimated(false);
        tpnValoresIniciales.setAutoscrolls(true);
        tpnValoresIniciales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tpnValoresIniciales.setMaximumSize(new java.awt.Dimension(220, 350));
        tpnValoresIniciales.setMinimumSize(new java.awt.Dimension(220, 350));
        tpnValoresIniciales.setPreferredSize(new java.awt.Dimension(220, 360));
        tpnValoresIniciales.setSpecial(true);
        tpnValoresIniciales.setTitle("EXÁMENES");

        btnCertificado.setText("Certificado");
        btnCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertificadoActionPerformed(evt);
            }
        });
        tpnValoresIniciales.add(btnCertificado);

        btnInformeMO.setText("Informe Medico Ocupacional");
        btnInformeMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeMOActionPerformed(evt);
            }
        });
        tpnValoresIniciales.add(btnInformeMO);

        btnFichaMedicoOcup.setText("Ficha Medico Ocupacional");
        btnFichaMedicoOcup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaMedicoOcupActionPerformed(evt);
            }
        });
        tpnValoresIniciales.add(btnFichaMedicoOcup);

        btnFichaEvalOsteoMusc.setText("Osteomuscular");
        btnFichaEvalOsteoMusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaEvalOsteoMuscActionPerformed(evt);
            }
        });
        tpnValoresIniciales.add(btnFichaEvalOsteoMusc);

        btnEvalOftalmologica.setText("Oftalmologia");
        btnEvalOftalmologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvalOftalmologicaActionPerformed(evt);
            }
        });
        tpnValoresIniciales.add(btnEvalOftalmologica);

        btnFichaEvalAudio.setText("Audiometria");
        btnFichaEvalAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaEvalAudioActionPerformed(evt);
            }
        });
        tpnValoresIniciales.add(btnFichaEvalAudio);

        btnFichaPsicologica.setText("Psicologica");
        btnFichaPsicologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaPsicologicaActionPerformed(evt);
            }
        });
        tpnValoresIniciales.add(btnFichaPsicologica);

        btnTriaje.setText("Triaje");
        btnTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriajeActionPerformed(evt);
            }
        });
        tpnValoresIniciales.add(btnTriaje);

        jXTaskPaneContainer1.add(tpnValoresIniciales);

        jScrollPane1.setViewportView(jXTaskPaneContainer1);

        jSplitPane1.setLeftComponent(jScrollPane1);

        conten.setBackground(new java.awt.Color(202, 237, 228));
        conten.setAutoscrolls(true);
        conten.setPreferredSize(new java.awt.Dimension(650, 1100));

        javax.swing.GroupLayout contenLayout = new javax.swing.GroupLayout(conten);
        conten.setLayout(contenLayout);
        contenLayout.setHorizontalGroup(
            contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1053, Short.MAX_VALUE)
        );
        contenLayout.setVerticalGroup(
            contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(conten);

        jSplitPane1.setRightComponent(jScrollPane2);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 102, 102));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("HISTORIA CLÍNICA OCUPACIONAL");

        jTabbedPane1.setBackground(new java.awt.Color(202, 237, 228));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(202, 237, 228));

        jPanel16.setBackground(new java.awt.Color(202, 237, 228));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jdcFechaAtencion.setDateFormatString("dd/MM/yyyy");
        jdcFechaAtencion.setEnabled(false);
        jdcFechaAtencion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdcFechaAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jdcFechaAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(202, 237, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EVALUACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbxEvaluacionOcu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxEvaluacionOcu.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbxEvaluacionOcu, 0, 348, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cbxEvaluacionOcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(202, 237, 228));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbxExamenOcu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxExamenOcu.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbxExamenOcu, 0, 482, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(cbxExamenOcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(202, 237, 228));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HC N°", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txfHistoriaClinica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfHistoriaClinica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfHistoriaClinica.setEnabled(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfHistoriaClinica, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(txfHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(202, 237, 228));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PACIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setText("Apellidos y Nombres :");

        jLabel2.setText("Edad :");

        jLabel3.setText("Sexo :");

        txfNombres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfNombres.setEnabled(false);

        txfEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfEdad.setEnabled(false);
        txfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEdadActionPerformed(evt);
            }
        });

        cbxSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "MASCULINO", "FEMENINO" }));
        cbxSexo.setEnabled(false);

        jLabel6.setText("Fecha de Nacimiento :");

        jdcFechanacimiento.setDateFormatString("dd/MM/yyyy");
        jdcFechanacimiento.setEnabled(false);
        jdcFechanacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setText("DNI N° :");

        txfNumDni.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfNumDni.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNombres)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNumDni, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jdcFechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdcFechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txfNumDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(202, 237, 228));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS OCUPACIONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("N° RUC :");

        txfNumRuc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfNumRuc.setEnabled(false);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Razon Social :");

        txfRazonSocial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfRazonSocial.setEnabled(false);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Actividad económica :");

        txfActEconomica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfActEconomica.setEnabled(false);

        jLabel5.setText("Puesto :");

        txfPuesto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfPuesto.setEnabled(false);

        jLabel7.setText("Proyecto :");

        txfProyecto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txfProyecto.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfNumRuc, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfProyecto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfRazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(txfPuesto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfActEconomica, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(txfNumRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txfActEconomica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txfPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txfProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarPaciente))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DATOS GENERALES", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addGap(2, 2, 2)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertificadoActionPerformed
        if (oPersona != null && oAtencionOcupacional != null) {
            if (oAtencionOcupacional != null && oAtencionOcupacional.getCertificadoMedicoOcupacionals().isEmpty()) {
                jPanel_Certificado = root.jpCertificado;
                addFormPanel(conten, jPanel_Certificado, 0, 0, 890, 356);
                jPanel_Certificado.enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
                jPanel_Certificado.enviarDatosUser(userTemp, perTemp, rolTemp);
            } else {
                JOptionPane.showMessageDialog(null, "REGISTRE UN NUEVO INGRESO", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
                conten.removeAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CARGUE LOS DATOS DEL PACIENTE", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCertificadoActionPerformed

    private void btnEvalOftalmologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvalOftalmologicaActionPerformed
        if (oPersona != null && oAtencionOcupacional != null) {
            if (oAtencionOcupacional != null && oAtencionOcupacional.getFichaOftalmologicas().isEmpty()) {
                jPanel_EvalOftal = root.jpEvalOftalmologica;
                addFormPanel(conten, jPanel_EvalOftal, 0, 0, 900, 1060);
                jPanel_EvalOftal.enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
                jPanel_EvalOftal.enviarDatosUser(userTemp, perTemp, rolTemp);
            } else {
                JOptionPane.showMessageDialog(null, "REGISTRE UN NUEVO INGRESO", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
                conten.removeAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CARGUE LOS DATOS DEL PACIENTE", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnEvalOftalmologicaActionPerformed

    private void txfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEdadActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        buscarPaciente(JIF_BuscarPersonaNatural.JIF_HCOCUPACIONAL);
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnFichaEvalOsteoMuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaEvalOsteoMuscActionPerformed
        if (oPersona != null && oAtencionOcupacional != null) {
            if (oAtencionOcupacional != null && oAtencionOcupacional.getFichaOsteomusculars().isEmpty()) {
                jPanel_EvalOsteomuscular = root.jpEvalOsteomuscular;
                addFormPanel(conten, jPanel_EvalOsteomuscular, 0, 0, 815, 1115);
                jPanel_EvalOsteomuscular.enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
                jPanel_EvalOsteomuscular.enviarDatosUser(userTemp, perTemp, rolTemp);
            } else {
                JOptionPane.showMessageDialog(null, "REGISTRE UN NUEVO INGRESO", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
                conten.removeAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CARGUE LOS DATOS DEL PACIENTE", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnFichaEvalOsteoMuscActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        resetComponentDatosGenerales();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnFichaEvalAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaEvalAudioActionPerformed
        if (oPersona != null && oAtencionOcupacional != null) {
            if (oAtencionOcupacional != null && oAtencionOcupacional.getFichaAudiometrias().isEmpty()) {
                jPanel_EvalAudiometrica = root.jpEvalAudiometrica;
                addFormPanel(conten, jPanel_EvalAudiometrica, 0, 0, 725, 1035);
                jPanel_EvalAudiometrica.enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
                jPanel_EvalAudiometrica.enviarDatosUser(userTemp, perTemp, rolTemp);
            } else {
                JOptionPane.showMessageDialog(null, "REGISTRE UN NUEVO INGRESO", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
                conten.removeAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CARGUE LOS DATOS DEL PACIENTE", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFichaEvalAudioActionPerformed

    private void btnFichaMedicoOcupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaMedicoOcupActionPerformed
        if (oPersona != null && oAtencionOcupacional != null) {
            if (oAtencionOcupacional != null && oAtencionOcupacional.getFichaMedicoOcupacionals().isEmpty()) {
                jPanel_FichaMedicoOcupacional = root.jpFichaMedicoOcupacional;
                addFormPanel(conten, jPanel_FichaMedicoOcupacional, 0, 0, 1005, 870);
                jPanel_FichaMedicoOcupacional.enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
                jPanel_FichaMedicoOcupacional.enviarDatosUser(userTemp, perTemp, rolTemp);
            } else {
                JOptionPane.showMessageDialog(null, "REGISTRE UN NUEVO INGRESO", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
                conten.removeAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CARGUE LOS DATOS DEL PACIENTE", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFichaMedicoOcupActionPerformed

    private void btnFichaPsicologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaPsicologicaActionPerformed
        if (oPersona != null && oAtencionOcupacional != null) {
            if (oAtencionOcupacional != null && oAtencionOcupacional.getFichaPsicologicas().isEmpty()) {
                jPanel_EvaluacionPsicologica = root.jpEvalPsicologica;
                addFormPanel(conten, jPanel_EvaluacionPsicologica, 0, 0, 890, 834);
                jPanel_EvaluacionPsicologica.enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
                jPanel_EvaluacionPsicologica.enviarDatosUser(userTemp, perTemp, rolTemp);
            } else {
                JOptionPane.showMessageDialog(null, "REGISTRE UN NUEVO INGRESO", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
                conten.removeAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CARGUE LOS DATOS DEL PACIENTE", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFichaPsicologicaActionPerformed

    private void btnTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriajeActionPerformed
        if (oPersona != null && oAtencionOcupacional != null) {
            if (oAtencionOcupacional != null && oAtencionOcupacional.getExamenClinicos().isEmpty()) {
                jPanel_triaje = root.jpTriaje;
                addFormPanel(conten, jPanel_triaje, 0, 0, 1000, 365);
                jPanel_triaje.enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
                jPanel_triaje.enviarDatosUser(userTemp, perTemp, rolTemp);
            } else {
                JOptionPane.showMessageDialog(null, "REGISTRE UN NUEVO INGRESO", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
                conten.removeAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CARGUE LOS DATOS DEL PACIENTE", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnTriajeActionPerformed

    private void btnInformeMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeMOActionPerformed
        if (oPersona != null && oAtencionOcupacional != null) {
            if (oAtencionOcupacional != null && oAtencionOcupacional.getInformeMedicoOcupacionals().isEmpty()) {
                if (!oAtencionOcupacional.getExamenClinicos().isEmpty()) {
                    jPanel_informeMO = root.jpInformeMedicoOcupacional;
                    addFormPanel(conten, jPanel_informeMO, 0, 0, 708, 953);//670, 765
                    jPanel_informeMO.enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
                    jPanel_informeMO.enviarDatosUser(userTemp, perTemp, rolTemp);
                }else{
                    JOptionPane.showMessageDialog(null, "No existe registro de examen  clinico.....", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "REGISTRE UN NUEVO INGRESO", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
                conten.removeAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CARGUE LOS DATOS DEL PACIENTE", Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInformeMOActionPerformed

// <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnCertificado;
    private javax.swing.JButton btnEvalOftalmologica;
    private javax.swing.JButton btnFichaEvalAudio;
    private javax.swing.JButton btnFichaEvalOsteoMusc;
    private javax.swing.JButton btnFichaMedicoOcup;
    private javax.swing.JButton btnFichaPsicologica;
    private javax.swing.JButton btnInformeMO;
    private javax.swing.JButton btnTriaje;
    private javax.swing.JComboBox cbxEvaluacionOcu;
    private javax.swing.JComboBox cbxExamenOcu;
    private javax.swing.JComboBox cbxSexo;
    private javax.swing.JPanel conten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1;
    private com.toedter.calendar.JDateChooser jdcFechaAtencion;
    private com.toedter.calendar.JDateChooser jdcFechanacimiento;
    private org.jdesktop.swingx.JXTaskPane tpnValoresIniciales;
    private javax.swing.JTextField txfActEconomica;
    private javax.swing.JTextField txfEdad;
    private javax.swing.JTextField txfHistoriaClinica;
    private javax.swing.JTextField txfNombres;
    private javax.swing.JTextField txfNumDni;
    private javax.swing.JTextField txfNumRuc;
    private javax.swing.JTextField txfProyecto;
    private javax.swing.JTextField txfPuesto;
    private javax.swing.JTextField txfRazonSocial;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 

    private void addFormPanel(JPanel jpc, JPanel jpf, int x, int y, int width, int height) {
        //content.setLayout(null);
        jpc.removeAll();
        jpc.add(jpf);
        jpf.setBounds(x, y, width, height);
        jpf.setBorder(new TitledBorder(""));
        jpc.updateUI();
    }

    private void renameBtn() {
        btnCertificado.setText("<html><p ALIGN=center>CERTIFICADO DE APTITUD</p></br><p ALIGN=center>MEDICO OCUPACIONAL</p></html>");
        btnFichaMedicoOcup.setText("<html><p ALIGN=center>FICHA MEDICO</p></br><p ALIGN=center>OCUPACIONAL</p></html>");
        btnFichaEvalOsteoMusc.setText("<html><p ALIGN=center>FICHA DE EVALUACIÓN</p></br><p ALIGN=center>OSTEOMUSCULAR</p></html>");
        btnEvalOftalmologica.setText("<html><p ALIGN=center>FICHA DE EVALUACIÓN</p></br><p ALIGN=center>OFTALMOLOGICA</p></html>");
        btnFichaEvalAudio.setText("<html><p ALIGN=center>FICHA DE EVALUACIÓN</p></br><p ALIGN=center>AUDIOMETRICA</p></html>");
        btnFichaPsicologica.setText("<html><p ALIGN=center>FICHA DE EVALUACIÓN</p></br><p ALIGN=center>PSICOLÓGICA</p></html>");
        btnTriaje.setText("<html><p ALIGN=center>EVALUACIÓN MÉDICA</p></br><p ALIGN=center>TRIAJE</p></html>");
        btnInformeMO.setText("<html><p ALIGN=center>INFORME MEDICO</p></br><p ALIGN=center>OCUPACIONAL</p></html>");

    }

    private void buscarPaciente(int JIF_HCOCUPACIONAL) {
        root.jifBuscarPersonaNatural.setInvocador(JIF_HCOCUPACIONAL);
        root.insertarInternalFrames(root.jifBuscarPersonaNatural);
    }

    public void cargarDatosPersona(Persona beanTabla) {
        resetComponentDatosGenerales();
        oPersona = beanTabla;

        //Recuperar historia clinica de la persona
        oHistoriaClinica = obtenerHistoriaClinica(oPersona);
        //Recuperar la atencion ocupacional registrada en admision
        if (oHistoriaClinica != null) {
            oAtencionOcupacional = obtenerAtencionOcupacional(oHistoriaClinica);
            //buscar empresa empleadora de la persona
            if (oAtencionOcupacional != null) {
                oPersonaJuridica = obtenerPersonaJuridica(oAtencionOcupacional);
                if (oPersonaJuridica != null) {
                    enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
                    //IMPRIMIR VALORES DE OBJETOS RECUPERADOS EN PANTALLA
                    txfNombres.setText(oPersona.getApellidoPaterno().trim() + " " + oPersona.getApellidoMaterno().trim() + " " + oPersona.getNombre().trim());
                    txfNumDni.setText(oPersona.getNumeroDocumento().trim());
                    if (oPersona.getFechaNacimiento() != null) {
                        jdcFechanacimiento.setDate(oPersona.getFechaNacimiento());
                        txfEdad.setText("" + Utilitarios.obtenerEdad(oPersona.getFechaNacimiento()));
                    }
                    if (oPersona.getSexo() == null || oPersona.getSexo().equals("")) {
                        this.cbxSexo.setSelectedIndex(0);
                    } else {
                        this.cbxSexo.setSelectedItem(oPersona.getSexo());
                    }
                    //HISTORIA CLINICA
                    txfHistoriaClinica.setText(oHistoriaClinica.getNumerohc().toString());
                    //ATENCION OCUPACIONAL
                    oEvaluacionOcuCtrl.recuperaDatosEvaluacionOcu(oAtencionOcupacional.getEvaluacionOcupacional().getIdevaluacionocupacional(), cbxEvaluacionOcu);
                    oExamenOcupCtrl.recuperaExamenOcu(oAtencionOcupacional.getExamenOcupacional().getIdexamenocupacional(), cbxExamenOcu);
                    if (oAtencionOcupacional.getFechaCertificacion() != null) {
                        jdcFechaAtencion.setDate(oAtencionOcupacional.getFechaCertificacion());
                    } else {
                        jdcFechaAtencion.setDate(null);
                    }
                    txfProyecto.setText(oAtencionOcupacional.getProyecto().trim());
                    txfPuesto.setText(oAtencionOcupacional.getPuestoPostula().trim());
                    //EMPRESA
                    txfNumRuc.setText(oPersonaJuridica.getNumeroRuc().trim());
                    txfRazonSocial.setText(oPersonaJuridica.getRazonSocial().trim());
                    txfActEconomica.setText(oPersonaJuridica.getActividadEcon().trim());
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE REGISTRÓ EMPRESA EMPLEADORA", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE INGRESO REGISTRADO PARA EL PACIENTE", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "LA PERSONA NO TIENE HISTORIA CLINICA ACUPACIONAL", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void resetComponentDatosGenerales() {
        txfNombres.setText("");
        txfNumDni.setText("");
        jdcFechanacimiento.setDate(null);
        txfEdad.setText("");
        cbxSexo.setSelectedIndex(0);
        jdcFechaAtencion.setDate(null);
        //jsHoraAtencion.setValue(0);
        cbxExamenOcu.setSelectedIndex(0);
        cbxEvaluacionOcu.setSelectedIndex(0);
        txfHistoriaClinica.setText("");
        txfNumRuc.setText("");
        txfRazonSocial.setText("");
        txfActEconomica.setText("");
        oPersona = null;
        oAtencionOcupacional = null;
        oHistoriaClinica = null;
        oPersonaJuridica = null;
    }

    private HistoriaClinica obtenerHistoriaClinica(Persona oPersona) {
        oHistoriaClinicaBl = new HistoriaClinicaBl();
        oHistoriaClinica = new HistoriaClinica();
        return oHistoriaClinicaBl.buscar(oPersona);
    }

    private AtencionOcupacional obtenerAtencionOcupacional(HistoriaClinica oHistoriaClinica) {
        oAtencionOcupacional = new AtencionOcupacional();
        oAtencionOcupacionalBl = new AtencionOcupacionalBl();
        return oAtencionOcupacionalBl.buscar(oHistoriaClinica);
    }

    private PersonaJuridica obtenerPersonaJuridica(AtencionOcupacional oAtencionOcupacional) {
        oPersonaJuridica = new PersonaJuridica();
        oPersonaJuridicaBl = new PersonaJuridicaBl();
        return oPersonaJuridicaBl.buscarxId(oAtencionOcupacional);
    }

    private void enviarDatosAtencionOcupacionalApanel(AtencionOcupacional oAtencionOcupacional) {
        root.jpEvalOftalmologica.enviarDatosAtencionOcupacionalApanel(oAtencionOcupacional);
    }

    public void cargarDatosUser(Usuario user, Persona oPersona, Rol oRol) {
        userTemp = user;
        perTemp = oPersona;
        rolTemp = oRol;
    }

    public void cargarCie10(Cie10 beanTabla) {
        jPanel_FichaMedicoOcupacional.cargarCie10(beanTabla);
    }

}
