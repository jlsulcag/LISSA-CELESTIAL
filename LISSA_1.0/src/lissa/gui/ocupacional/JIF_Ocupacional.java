package lissa.gui.ocupacional;

import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lissa.be.AtencionOcupacional;
import lissa.be.EvaluacionOcupacional;
import lissa.be.HistoriaClinica;
import lissa.be.PeEstadoCivil;
import lissa.be.Persona;
import lissa.be.PersonaJuridica;
import lissa.be.PuestoLaboral;
import lissa.be.TipoDocIdentidad;
import lissa.be.TipoHistoriaClinica;
import lissa.bl.AtencionOcupacionalBl;
import lissa.bl.HistoriaClinicaBl;
import lissa.bl.PersonaBl;
import lissa.bl.PersonaJuridicaBl;
import lissa.controller.EstadoCivilCtrl;
import lissa.controller.EvaluacionOcuCtrl;
import lissa.controller.PuestoLaboralCtrl;
import lissa.controller.TipoDocIdentidadCtrl;
import lissa.controller.TipoHCCtrl;
import lissa.gui.JF_Principal;
import lissa.gui.JIF_AdministrarPersonaJuridica;
import lissa.table.ModeloPersonas;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

public class JIF_Ocupacional extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private Persona oPersona = null;
    private PersonaBl oBLPersona = null;
    private ModeloPersonas modeloPersonas;
    private int generaHC = 0;
    private Persona beanTablaPersona;
    private HistoriaClinica oHistoriaClinica = null;
    private HistoriaClinicaBl oBlHistoriaClinica = null;
    private TipoDocIdentidadCtrl oTipoDocIdentidadCtrl;
    private TipoHCCtrl oTipoHCCtrl;
    private EstadoCivilCtrl oEstadoCivilCtrl;
    private PersonaJuridica oPersonaJuridica;
    private PersonaJuridicaBl oPersonaJuridicaBl;
    private int banBoton = 0;
    private AtencionOcupacional oAtencionOcupacional = null;
    private AtencionOcupacionalBl oAtencionOcupacionalBl = null;
    private EvaluacionOcuCtrl oEvaluacionOcuCtrl;
    private PuestoLaboralCtrl oPuestoLaboralCtrl;

    public JIF_Ocupacional(JF_Principal root) {
        initComponents();
        this.root = root;
        oTipoDocIdentidadCtrl = new TipoDocIdentidadCtrl(root);
        oTipoHCCtrl = new TipoHCCtrl(root);
        oEstadoCivilCtrl = new EstadoCivilCtrl(root);
        modeloPersonas = new ModeloPersonas();
        tblResultados.setModel(modeloPersonas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txfBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txfHistoriaClinica = new javax.swing.JTextField();
        btnGenerarHC = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cbxTipohc = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfApePaterno = new javax.swing.JTextField();
        txfApeMaterno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txfNombres = new javax.swing.JTextField();
        txfnNumDni = new javax.swing.JTextField();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox();
        cbxTipoDoc = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox();
        jLabel45 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfGrupoSanguineo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jdcFechaEmision = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jdcFechaExamen = new com.toedter.calendar.JDateChooser();
        btnRegIngreso = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxEvaluacion = new javax.swing.JComboBox();
        txfEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfEmpresa = new javax.swing.JTextField();
        cbxPuestoLaboral = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        cbxTipoHCBusq = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Salud Ocupacional");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel1formComponentHidden(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BÚSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txfBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBusquedaActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblResultadosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        jLabel10.setText("Apellidos y Nombres/DNI:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txfBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 160, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTORIA CLÍNICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setText("N° Historia Clínica :");

        txfHistoriaClinica.setEditable(false);
        txfHistoriaClinica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfHistoriaClinica.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnGenerarHC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Ok-icon.png"))); // NOI18N
        btnGenerarHC.setToolTipText("Generar HC");
        btnGenerarHC.setEnabled(false);
        btnGenerarHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarHCActionPerformed(evt);
            }
        });

        jLabel18.setText("Tipo HC :");

        cbxTipohc.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTipohc, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarHC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btnGenerarHC)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(cbxTipohc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE LA PERSONA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Apellido Paterno :");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Apellido Materno :");

        txfApePaterno.setEnabled(false);
        txfApePaterno.setPreferredSize(new java.awt.Dimension(234, 20));

        txfApeMaterno.setEnabled(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Nombres :");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Fecha de  Nacimiento :");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Tipo Doc :");

        txfNombres.setEnabled(false);
        txfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombresActionPerformed(evt);
            }
        });

        txfnNumDni.setEnabled(false);
        txfnNumDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfnNumDniActionPerformed(evt);
            }
        });
        txfnNumDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfnNumDniKeyReleased(evt);
            }
        });

        jdcFechaNacimiento.setEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sexo :");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "FEMENINO", "MASCULINO" }));
        cbxSexo.setEnabled(false);

        cbxTipoDoc.setEnabled(false);
        cbxTipoDoc.setMaximumSize(new java.awt.Dimension(28, 20));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Estado civil :");

        cbxEstadoCivil.setEnabled(false);

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Nº Doc :");

        jLabel2.setText("Grupo Sanguineo y Factor :");

        txfGrupoSanguineo.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfApeMaterno)
                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                    .addComponent(txfnNumDni, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(txfNombres)
                    .addComponent(txfGrupoSanguineo))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txfApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txfApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(cbxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txfnNumDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txfGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS OCUPACIONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel20.setText("Fecha de Emisión :");

        jdcFechaEmision.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel21.setText("Fecha de Examen :");

        jdcFechaExamen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnRegIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Ok-icon.png"))); // NOI18N
        btnRegIngreso.setText("Registrar Ingreso");
        btnRegIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegIngresoActionPerformed(evt);
            }
        });

        jLabel17.setText("Evaluación :");

        jLabel6.setText("Edad :");

        jLabel4.setText("Puesto Laboral :");

        jLabel7.setText("Empresa :");

        jButton1.setText("+");

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcFechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfEmpresa)
                            .addComponent(cbxEvaluacion, 0, 300, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxPuestoLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jButton2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegIngreso))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel17)
                    .addComponent(jLabel6)
                    .addComponent(cbxEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbxPuestoLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(txfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel21)
                    .addComponent(jdcFechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jdcFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegIngreso))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/new.png"))); // NOI18N
        btnNuevo.setPreferredSize(new java.awt.Dimension(65, 40));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/edit.png"))); // NOI18N
        btnEditar.setEnabled(false);
        btnEditar.setPreferredSize(new java.awt.Dimension(65, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.setPreferredSize(new java.awt.Dimension(65, 40));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/cancel.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(65, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO HISTORIA CLINICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbxTipoHCBusq.setEnabled(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbxTipoHCBusq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(cbxTipoHCBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBusquedaActionPerformed
        btnBuscar.doClick();
    }//GEN-LAST:event_txfBusquedaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPersona();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblResultadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseReleased
        Utilitarios.resetPaintCbx(cbxTipoHCBusq);
        if (cbxTipoHCBusq.getSelectedIndex() > 0) {
            if (tblResultados.getRowSelectionAllowed() && tblResultados.getSelectedRow() != -1) {
                try {
                    resetComponent();
                    obtenerDatosPaciente();
                    estadoTextFields(false);
                    activarBotones(true, true, false, true);
                } catch (SQLException ex) {
                    Logger.getLogger(JIF_Ocupacional.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL TIPO DE HC A CARGAR", "ERROR", JOptionPane.ERROR_MESSAGE);
            Utilitarios.paintCbxVacio(cbxTipoHCBusq);
        }
    }//GEN-LAST:event_tblResultadosMouseReleased

    private void btnGenerarHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarHCActionPerformed
        generaHC = 1;
        generarHistoriaClinica();
    }//GEN-LAST:event_btnGenerarHCActionPerformed

    private void txfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombresActionPerformed

    private void txfnNumDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfnNumDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfnNumDniActionPerformed

    private void txfnNumDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfnNumDniKeyReleased
        if (cbxTipoDoc.getSelectedItem().toString().trim().equals("DNI")) {
            Utilitarios.validaNumeroCaracteres(txfnNumDni, 8);
        }
        Utilitarios.validaCaracterNumerico(evt, txfnNumDni);
        txfnNumDni.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_txfnNumDniKeyReleased

    private void btnRegIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegIngresoActionPerformed
        registrarIngresoOcupacional();
    }//GEN-LAST:event_btnRegIngresoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        configuraNuevo();
        personalizaVistaTabla();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblResultados.getSelectedRow() != -1) {
            configuraActualizar();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una persona", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        configuraGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        configuraCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jPanel1formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1formComponentHidden
        resetComponent();
    }//GEN-LAST:event_jPanel1formComponentHidden

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        root.jifAdministrarPersonaJuridica.setInvocador(JIF_AdministrarPersonaJuridica.JIF_OCUPACIONAL);
        root.insertarInternalFrames(root.jifAdministrarPersonaJuridica);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGenerarHC;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegIngreso;
    private javax.swing.JComboBox cbxEstadoCivil;
    private javax.swing.JComboBox cbxEvaluacion;
    private javax.swing.JComboBox cbxPuestoLaboral;
    private javax.swing.JComboBox cbxSexo;
    private javax.swing.JComboBox cbxTipoDoc;
    private javax.swing.JComboBox cbxTipoHCBusq;
    private javax.swing.JComboBox cbxTipohc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaEmision;
    private com.toedter.calendar.JDateChooser jdcFechaExamen;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txfApeMaterno;
    private javax.swing.JTextField txfApePaterno;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfEdad;
    private javax.swing.JTextField txfEmpresa;
    private javax.swing.JTextField txfGrupoSanguineo;
    private javax.swing.JTextField txfHistoriaClinica;
    private javax.swing.JTextField txfNombres;
    private javax.swing.JTextField txfnNumDni;
    // End of variables declaration//GEN-END:variables

    private void buscarPersona() {
        oPersona = new Persona();
        oBLPersona = new PersonaBl();
        String ref = txfBusqueda.getText().trim().toUpperCase();
        if (!ref.equals("")) {
            if (!oBLPersona.buscar(ref).isEmpty()) {
                modeloPersonas.addAll(oBLPersona.buscar(ref));
            } else {
                JOptionPane.showMessageDialog(null, "No existe resultados de búsqueda", "Atención", JOptionPane.INFORMATION_MESSAGE);
                modeloPersonas.clear();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese parámetros de búsqueda", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }

        personalizaVistaTabla();
    }

    private void personalizaVistaTabla() {
        Utilitarios.formateaColumna(0, tblResultados, 80);
    }

    void resetComponent() {
        this.txfApePaterno.setText("");
        this.txfApeMaterno.setText("");
        this.txfNombres.setText("");
        this.jdcFechaNacimiento.setDate(null);
        this.txfnNumDni.setText("");
        this.txfHistoriaClinica.setText("");
        this.cbxSexo.setSelectedIndex(0);
        this.jdcFechaExamen.setDate(null);
        this.txfBusqueda.setText("");
        this.cbxEstadoCivil.setSelectedIndex(0);
        cbxTipoDoc.setSelectedIndex(0);
        //RESET COMPONENT OCUPACIONAL
        cbxEvaluacion.setSelectedIndex(0);
        txfEdad.setText("");
        cbxPuestoLaboral.setSelectedIndex(0);
        txfEmpresa.setText("");
        jdcFechaEmision.setDate(null);
        jdcFechaExamen.setDate(null);
        txfGrupoSanguineo.setText("");

    }

    private void obtenerDatosPaciente() throws SQLException {
        //resetComponent();
        beanTablaPersona = (Persona) modeloPersonas.get(tblResultados.getSelectedRow());
        this.txfNombres.setText(beanTablaPersona.getNombre());
        this.txfApePaterno.setText(beanTablaPersona.getApellidoPaterno());
        this.txfApeMaterno.setText(beanTablaPersona.getApellidoMaterno());
        this.jdcFechaNacimiento.setDate(beanTablaPersona.getFechaNacimiento());
        //Recuperar tipo de documento
        if (beanTablaPersona.getTipoDocIdentidad() == null) {
            cbxTipoDoc.setSelectedIndex(0);
        } else {
            oTipoDocIdentidadCtrl.recuperaDatosTipoDocumento(beanTablaPersona.getTipoDocIdentidad().getIdtipodocidentidad(), cbxTipoDoc);
        }
        if (beanTablaPersona.getNumeroDocumento() != null) {
            this.txfnNumDni.setText(beanTablaPersona.getNumeroDocumento());
        } else {
            this.txfnNumDni.setText("");
        }
        if (beanTablaPersona.getSexo() == null || beanTablaPersona.getSexo().equals("")) {
            this.cbxSexo.setSelectedIndex(0);
        } else {
            this.cbxSexo.setSelectedItem(beanTablaPersona.getSexo());
        }
        //Recuperar estado civil
        if (beanTablaPersona.getPeEstadoCivil() == null) {
            cbxEstadoCivil.setSelectedIndex(0);
        } else {
            oEstadoCivilCtrl.recuperaDatosEstadoCivil(beanTablaPersona.getPeEstadoCivil().getIdpeestadocivil(), cbxEstadoCivil);
        }
        txfGrupoSanguineo.setText(beanTablaPersona.getGrupoSanguineo());
        //Buscar Numero de historia clinica del paciente seleccionado
        oBlHistoriaClinica = new HistoriaClinicaBl();
        oHistoriaClinica = oBlHistoriaClinica.buscar(beanTablaPersona, (TipoHistoriaClinica) cbxTipoHCBusq.getSelectedItem());
        if (oHistoriaClinica != null) {
            txfHistoriaClinica.setText(Utilitarios.numberFormat(oHistoriaClinica.getNumerohc(), "######"));
            if (oHistoriaClinica.getTipoHistoriaClinica() == null) {
                cbxTipohc.setSelectedIndex(0);
            } else {
                //Recuperar tipo Historia Clinica
                oTipoHCCtrl.recuperaDatosTipoHC(oHistoriaClinica.getTipoHistoriaClinica().getIdtipohc(), cbxTipohc);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Genere una nueva Historia Clinica", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void activarBotones(boolean nuevo, boolean modificar, boolean guardar, boolean cancelar) {
        btnNuevo.setEnabled(nuevo);
        btnEditar.setEnabled(modificar);
        btnGuardar.setEnabled(guardar);
        btnCancelar.setEnabled(cancelar);
    }

    private void estadoTextFields(boolean e) {
        this.txfApePaterno.setEnabled(e);
        this.txfApeMaterno.setEnabled(e);
        this.txfNombres.setEnabled(e);
        this.jdcFechaNacimiento.setEnabled(e);
        this.txfnNumDni.setEnabled(e);
        this.cbxSexo.setEnabled(e);
        this.btnGenerarHC.setEnabled(e);
        this.cbxTipoDoc.setEnabled(e);
        //this.cbxTipohc.setEnabled(e);
        this.cbxEstadoCivil.setEnabled(e);
        txfGrupoSanguineo.setEnabled(e);
    }

    private void generarHistoriaClinica() {
        if (cbxTipohc.getSelectedIndex() > 0) {
            oBlHistoriaClinica = new HistoriaClinicaBl();
            int numHC = 0;
            numHC = oBlHistoriaClinica.generarHCxTipo((TipoHistoriaClinica) cbxTipohc.getSelectedItem()) + 1;
            txfHistoriaClinica.setText("" + Utilitarios.numberFormat(numHC, "######"));
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo de historia a generar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void registrarIngresoOcupacional() {
        /*
         SI  EL INGRESO  ES OCUPACIONAL REGISTRAR  INGRESO DEL PACIENTE. REGISTRAR DATOS DE LA EMPRESA
         Y EL  TIPO DE EVALUACION Y EXAMEN DE  SALUD OCUPACIONAL      
         */
        if (isDatosValidosOcupacional()) {
            oAtencionOcupacional = registrarAtencionOcupacional();
            if (oAtencionOcupacional != null) {
                //Mensajes.msjRegCorrecta();
                root.insertarInternalFrames(root.jifCertificados);
                root.jifCertificados.iniciar();
                root.jifCertificados.enviarDatos(oAtencionOcupacional, beanTablaPersona);
            } else {
                Mensajes.msjRegError();
            }
        } else {
            Mensajes.msjValidarIngreso();
        }

    }

    private boolean isDatosValidosOcupacional() {
        return (oPersonaJuridica != null
                && cbxEvaluacion.getSelectedIndex() > 0
                && !txfEdad.getText().trim().equals("")
                && cbxPuestoLaboral.getSelectedIndex() > 0
                && jdcFechaExamen.getDate() != null
                && jdcFechaEmision.getDate() != null);
    }

    private void configuraCancelar() {
        resetComponent();
        resetPaintComponent();
        estadoTextFields(false);
        activarBotones(true, false, false, true);
        modeloPersonas.clear();
        personalizaVistaTabla();
    }

    private void configuraNuevo() {
        banBoton = 1;
        tblResultados.setEnabled(true);
        modeloPersonas.clear();
        resetComponent();
        resetPaintComponent();
        estadoTextFields(true);
        activarBotones(false, false, true, true);

    }

    private void configuraActualizar() {
        banBoton = 2;
        estadoTextFields(true);
        activarBotones(true, false, true, true);
    }

    public void paintComponent() {
        Utilitarios.paintTxfVacio(txfNombres);
        Utilitarios.paintTxfVacio(txfApePaterno);
        Utilitarios.paintTxfVacio(txfApeMaterno);
        Utilitarios.paintCbxVacio(cbxTipoDoc);
        Utilitarios.paintTxfVacio(txfnNumDni);
    }

    public void resetPaintComponent() {
        Utilitarios.resetPaintTxf(txfNombres);
        Utilitarios.resetPaintTxf(txfApePaterno);
        Utilitarios.resetPaintTxf(txfApeMaterno);
        Utilitarios.resetPaintCbx(cbxTipoDoc);
        Utilitarios.resetPaintTxf(txfnNumDni);
    }

    private void configuraGuardar() {
        //CUANDO EL REGISTRO DEL PACIENTE ES NUEVO
        if (banBoton == 1) {
            if (isDatosValidos()) {
                if (isDniValido()) {
                    registrar();
                    modeloPersonas.clear();
                    modeloPersonas.add(buscarPersonaXDni());
                    personalizaVistaTabla();
                    resetComponent();
                    resetPaintComponent();
                    estadoTextFields(false);
                } else {
                    JOptionPane.showMessageDialog(null, "La persona con el N° de DNI ya se encuentra registrado", "Atención", JOptionPane.INFORMATION_MESSAGE);
                    txfnNumDni.setText("");
                    txfnNumDni.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos", "Atención", JOptionPane.INFORMATION_MESSAGE);
                paintComponent();
            }

        } else if (banBoton == 2) {
            if (isDatosValidos()) {
                actualizar();
                modeloPersonas.clear();
                modeloPersonas.add(buscarPersonaXDni());
                personalizaVistaTabla();
                resetComponent();
                resetPaintComponent();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos", "Atención", JOptionPane.INFORMATION_MESSAGE);
                paintComponent();
            }

        }

        personalizaVistaTabla();
    }

    private boolean isDatosValidos() {
        return (!this.txfNombres.getText().trim().equals("")
                && !this.txfApePaterno.getText().trim().equals("")
                && !this.txfApeMaterno.getText().trim().equals("")
                && this.cbxTipoDoc.getSelectedIndex() > 0
                && !this.txfnNumDni.getText().trim().equals(""));

    }

    private boolean isDniValido() {
        oBLPersona = new PersonaBl();
        boolean existeDni = false;
        if (oBLPersona.buscarPersonaXDni(txfnNumDni.getText().trim()) != null) {
            existeDni = false;
        } else {
            existeDni = true;
        }
        return existeDni;
    }

    private void registrar() {
        //Registrar datos de la persona
        registrarPersona();
        if (generaHC == 1 & !txfHistoriaClinica.getText().equals("")) {
            oHistoriaClinica = registrarHistoriaClinica();
        }
        Mensajes.msjRegCorrecta();
    }

    private Persona registrarPersona() {
        oPersona = new Persona();
        oBLPersona = new PersonaBl();

        oPersona.setApellidoPaterno(txfApePaterno.getText().trim().toUpperCase());
        oPersona.setApellidoMaterno(txfApeMaterno.getText().trim().toUpperCase());
        oPersona.setNombre(txfNombres.getText().trim().toUpperCase());
        oPersona.setNumeroDocumento(txfnNumDni.getText().trim().toUpperCase());
        oPersona.setFechaNacimiento(jdcFechaNacimiento.getDate());
        if (cbxSexo.getSelectedIndex() == 0) {
            oPersona.setSexo("");
        } else {
            oPersona.setSexo(cbxSexo.getSelectedItem().toString().toUpperCase().trim());
        }
        oPersona.setEstado(Boolean.TRUE);
        oPersona.setFechaReg(new Date());
        if (cbxTipoDoc.getSelectedIndex() > 0) {
            oPersona.setTipoDocIdentidad((TipoDocIdentidad) cbxTipoDoc.getSelectedItem());
        }
        if (cbxEstadoCivil.getSelectedIndex() > 0) {
            oPersona.setPeEstadoCivil((PeEstadoCivil) cbxEstadoCivil.getSelectedItem());
        }
        oPersona.setGrupoSanguineo(txfGrupoSanguineo.getText().toUpperCase().trim().equals("")?"":txfGrupoSanguineo.getText().toUpperCase().trim());

        return oBLPersona.registrarPersona(oPersona);
    }

    private HistoriaClinica registrarHistoriaClinica() {
        oHistoriaClinica = new HistoriaClinica();
        oBlHistoriaClinica = new HistoriaClinicaBl();
        //validar  si el numero de historia clinica  ya existe
        oHistoriaClinica.setNumerohc(Integer.parseInt(txfHistoriaClinica.getText().trim()));
        oHistoriaClinica.setFechaRegistro(new Date());
        oHistoriaClinica.setPersona(oPersona);
        oHistoriaClinica.setTipoHistoriaClinica((TipoHistoriaClinica) cbxTipohc.getSelectedItem());

        return oBlHistoriaClinica.registrar(oHistoriaClinica);
    }

    private Persona buscarPersonaXDni() {
        oBLPersona = new PersonaBl();
        return oBLPersona.buscarPersonaXDni(txfnNumDni.getText().trim());
    }

    private void actualizar() {
        //oPersona = new Persona();
        oPersona = actualizarPersona();
        //Si  no tiene Historia Clinica generarle uno nuevo
        if (oHistoriaClinica != null) {
            //la historia de usuario no se puede actualizar
        } else if (!txfHistoriaClinica.getText().trim().equals("")) {
            registrarHistoriaClinica();
        }
        Mensajes.msjActCorrecta();
    }

    private Persona actualizarPersona() {
        oPersona = new Persona();
        oBLPersona = new PersonaBl();
        oPersona.setIdPersona(beanTablaPersona.getIdPersona());
        oPersona.setApellidoPaterno(txfApePaterno.getText().trim().toUpperCase());
        oPersona.setApellidoMaterno(txfApeMaterno.getText().trim().toUpperCase());
        oPersona.setNombre(txfNombres.getText().trim().toUpperCase());
        oPersona.setNumeroDocumento(txfnNumDni.getText().trim());
        oPersona.setFechaNacimiento(jdcFechaNacimiento.getDate());
        oPersona.setEstado(Boolean.TRUE);
        oPersona.setFechaReg(beanTablaPersona.getFechaReg());
        if (cbxSexo.getSelectedIndex() == 0) {
            oPersona.setSexo("");
        } else {
            oPersona.setSexo(cbxSexo.getSelectedItem().toString().toUpperCase().trim());
        }
        if (cbxTipoDoc.getSelectedIndex() > 0) {
            oPersona.setTipoDocIdentidad((TipoDocIdentidad) cbxTipoDoc.getSelectedItem());
        }
        if (cbxEstadoCivil.getSelectedIndex() > 0) {
            oPersona.setPeEstadoCivil((PeEstadoCivil) cbxEstadoCivil.getSelectedItem());
        }
        oPersona.setGrupoSanguineo(txfGrupoSanguineo.getText().toUpperCase().trim().equals("")?"":txfGrupoSanguineo.getText().toUpperCase().trim());
        oBLPersona.actualizar(oPersona);
        return oPersona;
    }

    private AtencionOcupacional registrarAtencionOcupacional() {
        oAtencionOcupacional = new AtencionOcupacional();
        oAtencionOcupacionalBl = new AtencionOcupacionalBl();
        oAtencionOcupacional.setHistoriaClinica(oHistoriaClinica);
        oAtencionOcupacional.setPersonaJuridica(oPersonaJuridica);
        oAtencionOcupacional.setEvaluacionOcupacional((EvaluacionOcupacional) cbxEvaluacion.getSelectedItem());
        oAtencionOcupacional.setPuestoLaboral((PuestoLaboral) cbxPuestoLaboral.getSelectedItem());
        oAtencionOcupacional.setEdadIngreso(Integer.parseInt(txfEdad.getText().trim()));
        oAtencionOcupacional.setFechaExamen(jdcFechaExamen.getDate());
        oAtencionOcupacional.setFechaEmision(jdcFechaEmision.getDate());
        oAtencionOcupacional.setFechaReg(new Date());

        return oAtencionOcupacionalBl.registrar(oAtencionOcupacional);

    }

    public void iniciar() {
        oTipoHCCtrl = new TipoHCCtrl(root);
        oTipoHCCtrl.rellenaTipoHC(cbxTipohc);
        oTipoHCCtrl.rellenaTipoHC(cbxTipoHCBusq);
        oTipoHCCtrl.defaultSelectCbx("HISTORIA CLINICA OCUPACIONAL", cbxTipoHCBusq);
        //
        oTipoHCCtrl.defaultSelectCbx("HISTORIA CLINICA OCUPACIONAL", cbxTipohc);
        //llenarCbxTipoDoc();
        oTipoDocIdentidadCtrl = new TipoDocIdentidadCtrl(root);
        oTipoDocIdentidadCtrl.rellenaTipoDocumento(cbxTipoDoc);
        //llenarCbxEstadoCivil();
        oEstadoCivilCtrl = new EstadoCivilCtrl(root);
        oEstadoCivilCtrl.rellenaEstadoCivil(cbxEstadoCivil);
        //
        oEvaluacionOcuCtrl = new EvaluacionOcuCtrl(root);
        oEvaluacionOcuCtrl.rellenaEvaluacionOcu(cbxEvaluacion);
        //
        oPuestoLaboralCtrl = new PuestoLaboralCtrl(root);
        oPuestoLaboralCtrl.rellenaEvaluacionOcu(cbxPuestoLaboral);
        personalizaVistaTabla();
    }

    public void cargarPersonaJuridica(PersonaJuridica beanTabla) {
        oPersonaJuridica = beanTabla;
        txfEmpresa.setText(oPersonaJuridica.getRazonSocial());
    }

}
