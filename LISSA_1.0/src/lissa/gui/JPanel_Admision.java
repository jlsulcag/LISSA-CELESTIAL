package lissa.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import lissa.be.Caja;
import lissa.be.Especialidad;
import lissa.be.FondoPrevisionTemp;
import lissa.be.FondoSolidaridad;
import lissa.be.HistoriaClinica;
import lissa.be.ItemsComprobante;
import lissa.be.Paciente;
import lissa.be.PeEstadoCivil;
import lissa.be.Persona;
import lissa.be.PersonaJuridica;
import lissa.be.Rol;
import lissa.be.SeguroVida;
import lissa.be.SeguroVidaUsaPersona;
import lissa.be.ServicioFondoSolidaridad;
import lissa.be.TipoDocIdentidad;
import lissa.be.TipoHistoriaClinica;
import lissa.be.Ubigeo;
import lissa.be.Usuario;
import lissa.bl.PersonaBl;
import lissa.bl.FondoPrevisionBl;
import lissa.bl.HistoriaClinicaBl;
import lissa.bl.ItemsComprobanteBl;
import lissa.bl.SeguroBl;
import lissa.bl.SeguroPersonaBl;
import lissa.bl.EstadoCivilBl;
import lissa.bl.FondoSolidaridadTempBl;
import lissa.bl.PacienteBl;
import lissa.bl.TipoDocIdentidadBl;
import lissa.bl.TipoHistoriaClinicaBl;
import lissa.controller.EspecialidadCtrl;
import lissa.controller.EstadoCivilCtrl;
import lissa.controller.TipoDocIdentidadCtrl;
import lissa.controller.TipoHCCtrl;
import lissa.table.ModeloDetalleAtencion;
import lissa.table.ModeloFondoPrevision;
import lissa.table.ModeloFondoPrevisionTemp;
import lissa.table.ModeloPaciente;
import lissa.table.ModeloPersonas;
import lissa.table.ModeloServicioFondoS;
import lissa.table.ModelosSeguroVida;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

public class JPanel_Admision extends javax.swing.JPanel {

    private JF_Principal root;
    private Persona oPersona = null;
    private PersonaBl oBLPersona = null;
    private ModeloPersonas modeloPersonas;
    private SeguroVida oSeguroVida;
    private SeguroBl blSeguro;
    private int generaHC = 0;

    //Objetos para los seguros asignados  a una pesona
    private SeguroVidaUsaPersona oSeguroPersona;
    private SeguroPersonaBl blSeguroPersona;
    private ArrayList<SeguroVidaUsaPersona> listIdSeguros;

    private Persona beanTablaPersona;
    private SeguroVida beanTabla;
    private HistoriaClinica oHistoriaClinica = null;
    private HistoriaClinicaBl oBlHistoriaClinica = null;
    private Paciente oPaciente;
    private PacienteBl oPacienteBl;
    //Objetos para el seguro
    private List<SeguroVida> listSeguro;
    private ModelosSeguroVida oModeloSeguro;

    private int banBoton = 0;
    private int GENEROHC = 0;
    private FondoSolidaridad oFondoSolidaridad = null;
    private FondoPrevisionBl oBlFondoPrevision = null;
    private FondoPrevisionTemp oFondoPrevisionTemp = null;
    private FondoSolidaridadTempBl oFondoSolidaridadTempBl = null;
    private ModeloFondoPrevision oModeloFondoPrevision;
    private ModeloFondoPrevisionTemp oModeloFondoPrevisionTemp;

    private EstadoCivilBl estadoCivilBl;
    private ArrayList<PeEstadoCivil> listEstadoCivil;
    private TipoHistoriaClinicaBl oTipoHistoriaClinicaBl;
    private ArrayList<TipoHistoriaClinica> listTipoHc;
    private TipoDocIdentidadBl oTipoDocIdentidadBl;
    private ArrayList<TipoDocIdentidad> listTipoDocIdentidad;
    private TipoDocIdentidadCtrl oTipoDocIdentidadCtrl;
    private TipoHCCtrl oTipoHCCtrl;
    private EstadoCivilCtrl oEstadoCivilCtrl;
    private EspecialidadCtrl oEspecialidadCtrl;

    private ModeloPaciente oModeloPaciente = null;
    private ArrayList<Paciente> listPaciente;
    private ArrayList<ItemsComprobante> listItemsComprobante;
    private ModeloDetalleAtencion oModeloDetalleAtencion;
    private ItemsComprobanteBl oItemsComprobanteBl;
    private ModeloServicioFondoS oModeloServicioFondoS;
    private JP_Print_HistoriaClinica printHc;

    private Usuario userTemp;
    private Persona perTemp;
    private Rol rolTemp;

    private Caja oCaja;
    private PacienteBl oBlPaciente;

    public JPanel_Admision(JF_Principal root) throws SQLException {
        initComponents();
        this.root = root;
        modeloPersonas = new ModeloPersonas();
        tblResultados.setModel(modeloPersonas);
        oModeloSeguro = new ModelosSeguroVida();
        tblSeguros.setModel(oModeloSeguro);
        oModeloFondoPrevision = new ModeloFondoPrevision();        
        oModeloFondoPrevisionTemp = new ModeloFondoPrevisionTemp();  
        oModeloPaciente = new ModeloPaciente();
        tblIngresos.setModel(oModeloPaciente);
        oModeloDetalleAtencion = new ModeloDetalleAtencion();
        tblServicios.setModel(oModeloDetalleAtencion);
        oModeloServicioFondoS = new ModeloServicioFondoS();
        printHc = new JP_Print_HistoriaClinica(root);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfApePaterno = new javax.swing.JTextField();
        txfApeMaterno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txfNombres = new javax.swing.JTextField();
        txfnNumDni = new javax.swing.JTextField();
        txfTelefono = new javax.swing.JTextField();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        txfGradoInstruccion = new javax.swing.JTextField();
        txfLugarProcedencia = new javax.swing.JTextField();
        txfLugarNacimiento = new javax.swing.JTextField();
        cbxTipoDoc = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        txfCorreo = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        txfOcupacion = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxAutorizaUsoDatos = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jdcIngresoActual = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jdcUltimoIngreso = new com.toedter.calendar.JDateChooser();
        btnRegIngreso = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cbxTipoIngreso = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cbxEspecialidad = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxSeguro = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSeguros = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblIngresos = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        cbxTipoHCBusq = new javax.swing.JComboBox();
        btnAbrirAtenciones = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
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
                .addComponent(txfBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE LA PERSONA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Correo electrónico :");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Grado de instrucción :");

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

        txfTelefono.setEnabled(false);

        jdcFechaNacimiento.setEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sexo :");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "FEMENINO", "MASCULINO" }));
        cbxSexo.setEnabled(false);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Lugar de Procedencia :");

        txfGradoInstruccion.setEnabled(false);

        txfLugarProcedencia.setEnabled(false);

        txfLugarNacimiento.setEnabled(false);
        txfLugarNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLugarNacimientoActionPerformed(evt);
            }
        });

        cbxTipoDoc.setEnabled(false);
        cbxTipoDoc.setMaximumSize(new java.awt.Dimension(28, 20));

        jLabel40.setText("Telefono :");

        txfCorreo.setEnabled(false);

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Estado civil :");

        cbxEstadoCivil.setEnabled(false);

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Ocupación :");

        txfOcupacion.setEnabled(false);

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Nº Doc :");

        jLabel52.setText("Lugar de Nacimiento :");

        jLabel4.setText("Autoriza uso de datos :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbxAutorizaUsoDatos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "SI", "NO", "REVOCÓ" }));
        cbxAutorizaUsoDatos.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfLugarNacimiento)
                                    .addComponent(cbxSexo, 0, 185, Short.MAX_VALUE))))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfGradoInstruccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAutorizaUsoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfnNumDni, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txfApePaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txfCorreo)
                            .addComponent(cbxEstadoCivil, 0, 195, Short.MAX_VALUE)
                            .addComponent(txfOcupacion))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfLugarProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(txfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txfApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txfApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(cbxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txfnNumDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txfLugarProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel52)
                    .addComponent(txfLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15)
                    .addComponent(txfGradoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txfOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxAutorizaUsoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel20.setText("Ingreso actual :");

        jdcIngresoActual.setEnabled(false);
        jdcIngresoActual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel21.setText("Ultimo Ingreso :");

        jdcUltimoIngreso.setEnabled(false);
        jdcUltimoIngreso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnRegIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Ok-icon.png"))); // NOI18N
        btnRegIngreso.setText("Registrar Ingreso");
        btnRegIngreso.setEnabled(false);
        btnRegIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegIngresoActionPerformed(evt);
            }
        });

        jLabel17.setText("Tipo Ingreso :");

        cbxTipoIngreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "CONSULTA", "RE-EVALUACION", "LABORATORIO", "OTROS" }));
        cbxTipoIngreso.setEnabled(false);
        cbxTipoIngreso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoIngresoItemStateChanged(evt);
            }
        });

        jLabel6.setText("Especialidad :");

        cbxEspecialidad.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel21))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTipoIngreso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jdcUltimoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcIngresoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnRegIngreso))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel17)
                    .addComponent(cbxTipoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel21)
                    .addComponent(jdcUltimoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jdcIngresoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegIngreso))
                .addContainerGap())
        );

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setText("Seguro :");

        cbxSeguro.setEnabled(false);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/add.png"))); // NOI18N
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/remove.png"))); // NOI18N
        btnQuitar.setEnabled(false);
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        tblSeguros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblSeguros);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSeguro, 0, 857, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbxSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SEGUROS", jPanel4);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIngresosMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblIngresos);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROCEDIMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tblServicios);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("HISTORIAL DE ATENCIÓN", jPanel15);

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

        btnAbrirAtenciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/medical-report-icon.png"))); // NOI18N
        btnAbrirAtenciones.setToolTipText("Emitir Comprobante");
        btnAbrirAtenciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirAtencionesActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAbrirAtenciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirAtenciones)
                    .addComponent(btnImprimir))
                .addContainerGap())
        );
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
            oModeloFondoPrevisionTemp.clear();
            oModeloFondoPrevision.clear();
            oModeloSeguro.clear();
            oModeloPaciente.clear();
            if (tblResultados.getRowSelectionAllowed() && tblResultados.getSelectedRow() != -1) {
                try {
                    resetComponent();
                    obtenerDatosPaciente();                    
                    estadoSectionIngreso(true);
                    estadoTextFields(false);
                    activarBotones(true, true, false, true);
                } catch (SQLException ex) {
                    Logger.getLogger(JPanel_Admision.class.getName()).log(Level.SEVERE, null, ex);
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

    private void txfLugarNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLugarNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLugarNacimientoActionPerformed

    private void btnRegIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegIngresoActionPerformed
        //Registrar el nuevo ingreso del paciente
        if (isDatosValidosIngreso()) {
            int id = registrarIngresoPaciente();
            if (id != 0) {
                Mensajes.msjRegCorrecta();
                resetPaintComponentesIngreso();
            } else {
                Mensajes.msjRegError();
            }
        } else {            
            Mensajes.msjValidarIngreso();
            paintComponentesIngreso();
        }

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

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        resetComponent();
    }//GEN-LAST:event_formComponentHidden

    private void cbxTipoIngresoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoIngresoItemStateChanged
       
    }//GEN-LAST:event_cbxTipoIngresoItemStateChanged

    private void btnAbrirAtencionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirAtencionesActionPerformed
        if (oPersona != null) {
            if(oCaja != null){
                insetarAtencionPaciente();
            }else{
                JOptionPane.showMessageDialog(null, "Aperture caja antes realizar cualquier operación", "Atención", JOptionPane.ERROR_MESSAGE);
            }            
        } else {
            JOptionPane.showMessageDialog(null, "Cargue los datos de un persona", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirAtencionesActionPerformed

    private void tblIngresosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngresosMouseReleased
        if (tblResultados.getRowSelectionAllowed() && tblResultados.getSelectedRow() != -1) {
            oPaciente = oModeloPaciente.get(tblIngresos.getSelectedRow());
            if (oPaciente != null) {
                listarServicios(oPaciente);
            }

        }
    }//GEN-LAST:event_tblIngresosMouseReleased

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        quitarEliminar();
        personalizaVistaTabla();
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        llenarTablaSeguros();
        personalizaVistaTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirAtenciones;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGenerarHC;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnRegIngreso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbxAutorizaUsoDatos;
    private javax.swing.JComboBox cbxEspecialidad;
    private javax.swing.JComboBox cbxEstadoCivil;
    private javax.swing.JComboBox cbxSeguro;
    private javax.swing.JComboBox cbxSexo;
    private javax.swing.JComboBox cbxTipoDoc;
    private javax.swing.JComboBox cbxTipoHCBusq;
    private javax.swing.JComboBox cbxTipoIngreso;
    private javax.swing.JComboBox cbxTipohc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private com.toedter.calendar.JDateChooser jdcIngresoActual;
    private com.toedter.calendar.JDateChooser jdcUltimoIngreso;
    private javax.swing.JTable tblIngresos;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTable tblSeguros;
    private javax.swing.JTable tblServicios;
    private javax.swing.JTextField txfApeMaterno;
    private javax.swing.JTextField txfApePaterno;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfCorreo;
    private javax.swing.JTextField txfGradoInstruccion;
    private javax.swing.JTextField txfHistoriaClinica;
    private javax.swing.JTextField txfLugarNacimiento;
    private javax.swing.JTextField txfLugarProcedencia;
    private javax.swing.JTextField txfNombres;
    private javax.swing.JTextField txfOcupacion;
    private javax.swing.JTextField txfTelefono;
    private javax.swing.JTextField txfnNumDni;
    // End of variables declaration//GEN-END:variables

    private void personalizaVistaTabla() {
        Utilitarios.formateaColumna(0, tblSeguros, 80);
        Utilitarios.formateaColumna(0, tblResultados, 80);
    }

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

    private void configuraGuardar() {
        //CUANDO EL REGISTRO DEL PACIENTE ES NUEVO
        if (banBoton == 1) {
            if (isDatosValidos()) {
                if (isDniValido()) {
                    registrar();
                    modeloPersonas.clear();
                    modeloPersonas.add(buscarPersonaXDni());
                    oModeloSeguro.clear();
                    oModeloFondoPrevision.clear();
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
                oModeloSeguro.clear();
                oModeloFondoPrevision.clear();
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

    private void fechaIngresoActual() {
        Calendar c = new GregorianCalendar();
        jdcIngresoActual.setCalendar(c);
    }

    void resetComponent() {
        this.txfApePaterno.setText("");
        this.txfApeMaterno.setText("");
        this.txfNombres.setText("");
        this.jdcFechaNacimiento.setDate(null);
        this.txfnNumDni.setText("");
        this.txfTelefono.setText("");
        this.txfHistoriaClinica.setText("");
        this.cbxSexo.setSelectedIndex(0);
        this.txfGradoInstruccion.setText("");
        this.txfLugarNacimiento.setText("");
        this.txfLugarProcedencia.setText("");
        this.jdcUltimoIngreso.setDate(null);
        this.txfBusqueda.setText("");
        this.btnRegIngreso.setEnabled(false);
        this.cbxTipohc.setSelectedIndex(0);
        this.cbxEstadoCivil.setSelectedIndex(0);
        this.txfCorreo.setText("");
        cbxTipoIngreso.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        cbxTipoDoc.setSelectedIndex(0);
        cbxAutorizaUsoDatos.setSelectedIndex(0);
        cbxEspecialidad.setSelectedIndex(0);
    }

    private void activarBotones(boolean guardar, boolean cancelar) {
        btnGuardar.setEnabled(guardar);
        btnCancelar.setEnabled(cancelar);
    }

    private void configuraCancelar() {
        resetComponent();
        resetPaintComponent();
        estadoTextFields(false);
        estadoSectionIngreso(false);
        activarBotones(true, false, false, true);
        modeloPersonas.clear();
        oModeloFondoPrevision.clear();
        oModeloFondoPrevisionTemp.clear();
        oModeloSeguro.clear();
        oModeloDetalleAtencion.clear();
        oPersona = null;
        beanTablaPersona = null;
        oCaja = null;
        oHistoriaClinica = null;
        personalizaVistaTabla();
    }

    private void registrar() {
        //Registrar datos de la persona
        registrarPersona();
        if (generaHC == 1 & !txfHistoriaClinica.getText().equals("")) {
            oHistoriaClinica = registrarHistoriaClinica();
        }
        if (oModeloSeguro.size() > 0) {
            registrarSegurosPaciente();
        }
        //DETERMINAR SI EL INGRESO ES POR SALUD OCUPACIONAL
        //registrarPaciente();
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
        oPersona.setTelefono(txfTelefono.getText().trim());
        if (cbxSexo.getSelectedIndex() == 0) {
            oPersona.setSexo("");
        } else {
            oPersona.setSexo(cbxSexo.getSelectedItem().toString().toUpperCase().trim());
        }
        oPersona.setEstado(Boolean.TRUE);
        oPersona.setFechaReg(new Date());
        oPersona.setGradoInstruccion(txfGradoInstruccion.getText().toUpperCase().trim());
        oPersona.setLugarNacimiento(txfLugarNacimiento.getText().toUpperCase().trim());
        oPersona.setLugarProcedencia(txfLugarProcedencia.getText().toUpperCase().trim());
        oPersona.setOcupacion(txfOcupacion.getText().toUpperCase().trim());
        oPersona.setCorreoElectronico(txfCorreo.getText().toUpperCase().trim());
        if (cbxTipoDoc.getSelectedIndex() > 0) {
            oPersona.setTipoDocIdentidad((TipoDocIdentidad) cbxTipoDoc.getSelectedItem());
        }
        if (cbxEstadoCivil.getSelectedIndex() > 0) {
            oPersona.setPeEstadoCivil((PeEstadoCivil) cbxEstadoCivil.getSelectedItem());
        }
       
        if (cbxAutorizaUsoDatos.getSelectedIndex() > 0) {
            oPersona.setAutorizaUsoDatos(cbxAutorizaUsoDatos.getSelectedItem().toString().trim());
        } else {
            oPersona.setAutorizaUsoDatos("");
        }

        return oBLPersona.registrarPersona(oPersona);
    }

    private int registrarPaciente() {
        oPaciente = new Paciente();
        oPacienteBl = new PacienteBl();
        oPaciente.setPersona(oPersona);
        oPaciente.setFechaIngreso(jdcIngresoActual.getDate());
        oPaciente.setNumeroAtencion(ultimoNumAtencion());
        oPaciente.setEstado("REG");
        return oPacienteBl.registrar(oPaciente);
    }

    private int registrarIngresoPaciente() {
        oPaciente = new Paciente();
        oPacienteBl = new PacienteBl();
        oPaciente.setPersona(beanTablaPersona);
        oPaciente.setUsuario(userTemp);
        oPaciente.setEspecialidad((Especialidad) cbxEspecialidad.getSelectedItem());
        oPaciente.setFechaIngreso(jdcIngresoActual.getDate());
        oPaciente.setNumeroAtencion(ultimoNumAtencion());
        oPaciente.setTipoIngreso(cbxTipoIngreso.getSelectedItem().toString());
        if (oHistoriaClinica != null) {
            oPaciente.setIdHistoriaClinica(oHistoriaClinica.getIdhistoriaclinica());
        }
        oPaciente.setEstado("REG");
        return oPacienteBl.registrar(oPaciente);
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

        //Actualizar seguros
        registrarSegurosPaciente();

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
        oPersona.setTelefono(txfTelefono.getText().trim());
        oPersona.setEstado(Boolean.TRUE);
        oPersona.setFechaReg(beanTablaPersona.getFechaReg());
        oPersona.setGradoInstruccion(txfGradoInstruccion.getText().toUpperCase().trim());
        oPersona.setLugarNacimiento(txfLugarNacimiento.getText().toUpperCase().trim());
        oPersona.setLugarProcedencia(txfLugarProcedencia.getText().toUpperCase().trim());
        if (cbxSexo.getSelectedIndex() == 0) {
            oPersona.setSexo("");
        } else {
            oPersona.setSexo(cbxSexo.getSelectedItem().toString().toUpperCase().trim());
        }
        oPersona.setOcupacion(txfOcupacion.getText().toUpperCase().trim());
        oPersona.setCorreoElectronico(txfCorreo.getText().toUpperCase().trim());
        if (cbxTipoDoc.getSelectedIndex() > 0) {
            oPersona.setTipoDocIdentidad((TipoDocIdentidad) cbxTipoDoc.getSelectedItem());
        }
        if (cbxEstadoCivil.getSelectedIndex() > 0) {
            oPersona.setPeEstadoCivil((PeEstadoCivil) cbxEstadoCivil.getSelectedItem());
        }
        
        //Validar  Dni
        //generar d manera  automatica la historia clinica        
        
        if (cbxAutorizaUsoDatos.getSelectedIndex() > 0) {
            oPersona.setAutorizaUsoDatos(cbxAutorizaUsoDatos.getSelectedItem().toString().trim());
        } else {
            oPersona.setAutorizaUsoDatos("");
        }
        oBLPersona.actualizar(oPersona);
        return oPersona;
    }

    private void llenarCbxSeguro() {
        blSeguro = new SeguroBl();
        listSeguro = blSeguro.listar();
        cbxSeguro.removeAllItems();
        cbxSeguro.addItem("<Seleccione>");
        for (SeguroVida seguro : listSeguro) {
            seguro.setOp(SeguroVida.DATO);
            cbxSeguro.addItem(seguro);
        }
    }

    private void llenarTablaSeguros() {
        if (cbxSeguro.getSelectedIndex() != 0) {
            oSeguroVida = new SeguroVida();
            //oSeguroVida.setIdSeguroVida(cbxSeguro.getSelectedItem());
            oSeguroVida.setIdSeguroVida(((SeguroVida) cbxSeguro.getSelectedItem()).getIdSeguroVida());
            oSeguroVida.setDescripcion(cbxSeguro.getSelectedItem().toString());
            if (!existeSeguroDuplicadoTemp() && !existeSeguroDuplicadoDb()) {
                oModeloSeguro.add(oSeguroVida);
            } else {
                JOptionPane.showMessageDialog(null, "El seguro seleccionado ya existe", "Atención", JOptionPane.INFORMATION_MESSAGE);
            }
            cbxSeguro.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un seguro", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private boolean existeSeguroDuplicadoTemp() {
        boolean val = false;
        for (int i = 0; i < oModeloSeguro.getRowCount(); i++) {
            for (int j = 0; j < oModeloSeguro.getColumnCount(); j++) {
                if (oSeguroVida.getIdSeguroVida() == Integer.parseInt(oModeloSeguro.getValueAt(i, j).toString())) {
                    val = true;
                    i = oModeloSeguro.getRowCount();
                } else {
                    val = false;
                }
                j = oModeloSeguro.getColumnCount();
            }
        }
        return val;
    }

    private boolean existeSeguroDuplicadoDb() {
        SeguroVida seguro = new SeguroVida();
        boolean val = false;
        if (oModeloSeguro.size() > 0) {
            for (int i = 0; i < oModeloSeguro.size(); i++) {
                seguro = (SeguroVida) oModeloSeguro.get(i);
                if (oSeguroVida.getIdSeguroVida() != seguro.getIdSeguroVida()) {
                    val = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El seguro seleccionado ya existe", "Atención", JOptionPane.INFORMATION_MESSAGE);
                    val = true;
                }
            }
        }

        return val;
    }

    private int registrarSegurosPaciente() {
        oSeguroPersona = new SeguroVidaUsaPersona();
        SeguroVida seguro = new SeguroVida();
        blSeguroPersona = new SeguroPersonaBl();
        int id = 0;
        if (oModeloSeguro.size() > 0) {
            for (int i = 0; i < oModeloSeguro.size(); i++) {
                seguro = (SeguroVida) oModeloSeguro.get(i);
                if (!existeSeguroPersona(oPersona.getIdPersona(), oModeloSeguro.get(i).getIdSeguroVida())) {
                    oSeguroPersona.setSeguroVida(seguro);
                    oSeguroPersona.setPersona(oPersona);
                    oSeguroPersona.setEstado(true);
                    oSeguroPersona.setFechaReg(new Date());
                    id = blSeguroPersona.registrar(oSeguroPersona);
                }
            }
        }
        return id;
    }

    public boolean existeSeguroPersona(int idPersona, int idSeguro) {
        blSeguroPersona = new SeguroPersonaBl();
        SeguroVidaUsaPersona temp = new SeguroVidaUsaPersona();
        boolean existe = false;
        temp = blSeguroPersona.buscarSeguroPersona(idPersona, idSeguro);
        if (temp == null) {
            existe = false;
        } else {
            existe = true;
        }
        return existe;
    }

    private void obtenerDatosTabla() {
        beanTabla = (SeguroVida) oModeloSeguro.get(tblSeguros.getSelectedRow());
        Utilitarios.recuperaDatosSeguro(beanTabla.getIdSeguroVida(), this.cbxSeguro);
    }

    private ArrayList<SeguroVidaUsaPersona> listarSegurosPorPersona() {
        blSeguroPersona = new SeguroPersonaBl();
        return blSeguroPersona.listar(beanTablaPersona.getIdPersona());

    }

    private void listarSegurosBD() {
        blSeguro = new SeguroBl();
        listIdSeguros = listarSegurosPorPersona();
        if (!listIdSeguros.isEmpty()) {
            oModeloSeguro.clear();
            for (SeguroVidaUsaPersona svup : listIdSeguros) {
                oModeloSeguro.add(blSeguro.buscar(svup.getSeguroVida().getIdSeguroVida()));
            }
            personalizaVistaTabla();
        }

    }

    private void quitarEliminar() {
        oSeguroPersona = new SeguroVidaUsaPersona();
        blSeguroPersona = new SeguroPersonaBl();
        if (tblSeguros.getSelectedRow() != -1) {
            //obtenerDatosTabla();
//            if (beanTabla.getIdSeguroVida() != 0) {
//                //eliminar desde  la base de datos
//                //blSeguro.eliminar(beanTabla);
//                blSeguroPersona.eliminar(beanTabla.getIdSeguroVida());
//
//            } else {
            //eliminar de forma temporal
            oModeloSeguro.remove(tblSeguros.getSelectedRow());
            //}

        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un elemento de la lista", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }
        cbxSeguro.setSelectedIndex(0);
    }

    private void administrarPaciente() {
        root.insertarInternalFrames(root.jifAdministrarPersonanatural);
    }

    void cargarDatosPersona(Persona beanTabla) {
        HistoriaClinica hc = new HistoriaClinica();
        this.oPersona = beanTabla;
        //txfNombres.setText(oPersona.getApellidoPaterno().toUpperCase() + " " + oPersona.getApellidoMaterno().toUpperCase() + " " + oPersona.getNombre().toUpperCase());
        //txfNumDoc.setText(oPersona.getNumeroDocumento());
        hc = obtenerHistoriaClinica(oPersona.getNumeroDocumento());
        if (hc != null) {
            txfHistoriaClinica.setText(Utilitarios.numberFormat(hc.getNumerohc(), "######"));
        }

        //listarSegurosBD();
    }

    private boolean isDatosValidos() {
        return (!this.txfNombres.getText().trim().equals("")
                && !this.txfApePaterno.getText().trim().equals("")
                && !this.txfApeMaterno.getText().trim().equals("")
                && this.cbxTipoDoc.getSelectedIndex() > 0
                && !this.txfnNumDni.getText().trim().equals(""));

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

    private HistoriaClinica obtenerHistoriaClinica(String numeroDocumento) {
        oHistoriaClinica = new HistoriaClinica();
        oBlHistoriaClinica = new HistoriaClinicaBl();
        oHistoriaClinica = oBlHistoriaClinica.buscarXdniPersona(numeroDocumento);
        return oHistoriaClinica;
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
        this.txfTelefono.setEnabled(e);
        this.cbxSexo.setEnabled(e);
        this.txfGradoInstruccion.setEnabled(e);
        this.txfLugarNacimiento.setEnabled(e);
        this.txfLugarProcedencia.setEnabled(e);
        this.btnGenerarHC.setEnabled(e);
        this.btnAgregar.setEnabled(e);
        this.btnQuitar.setEnabled(e);
        this.cbxSeguro.setEnabled(e);
        this.cbxTipoDoc.setEnabled(e);
        this.cbxTipohc.setEnabled(e);
        txfCorreo.setEnabled(e);
        this.cbxEstadoCivil.setEnabled(e);
        this.txfOcupacion.setEnabled(e);
        cbxAutorizaUsoDatos.setEnabled(e);
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
        this.txfTelefono.setText(beanTablaPersona.getTelefono());
        this.txfGradoInstruccion.setText(beanTablaPersona.getGradoInstruccion());
        this.txfLugarNacimiento.setText(beanTablaPersona.getLugarNacimiento());
        this.txfLugarProcedencia.setText(beanTablaPersona.getLugarProcedencia());
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
        
        if (beanTablaPersona.getAutorizaUsoDatos() == null || beanTablaPersona.getAutorizaUsoDatos().equals("")) {
            this.cbxAutorizaUsoDatos.setSelectedIndex(0);
        } else {
            this.cbxAutorizaUsoDatos.setSelectedItem(beanTablaPersona.getAutorizaUsoDatos());
        }
        //Buscar ultimo ingreso del paciente
        oPaciente = new Paciente();
        oPacienteBl = new PacienteBl();
        oPaciente = oPacienteBl.buscarPacienteXid(beanTablaPersona.getIdPersona());
        if (oPaciente != null) {
            jdcUltimoIngreso.setDate(oPaciente.getFechaIngreso());
        }
        /*Listar Ingresos por fecha. que permita conocer el historial de ingresos*/
        listarIngresosPaciente(beanTablaPersona.getIdPersona());

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
        }

        //Buscar y cargar los  seguros  con los que  cuenta el paciente
        listarSegurosBD();
        
        //Listar fondo de prevision registrados en LISSA por ultima fecha de pago
        oBlFondoPrevision = new FondoPrevisionBl();
        ArrayList<FondoSolidaridad> listfs;
        if (beanTablaPersona != null) {
            listfs = oBlFondoPrevision.listar(beanTablaPersona.getIdPersona());
            if (!listfs.isEmpty()) {
                oModeloFondoPrevision.addAll(listfs);
            }
        }

    }

    private void configuraNuevo() {
        banBoton = 1;
        tblResultados.setEnabled(true);
        modeloPersonas.clear();
        oModeloFondoPrevision.clear();
        oModeloFondoPrevisionTemp.clear();
        oModeloSeguro.clear();        
        estadoSectionIngreso(true);
        resetComponent();
        resetPaintComponent();
        estadoTextFields(true);
        activarBotones(false, false, true, true);
        //poner fecha de sistema para  ultimo ingreso
        fechaIngresoActual();

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

    private Persona buscarPersonaXDni() {
        oBLPersona = new PersonaBl();
        return oBLPersona.buscarPersonaXDni(txfnNumDni.getText().trim());
    }

    private void configuraActualizar() {
        banBoton = 2;
        estadoTextFields(true);
        activarBotones(true, false, true, true);
    }

    private Integer ultimoNumAtencion() {
        oPacienteBl = new PacienteBl();
        return oPacienteBl.ultimoNumAtencion() + 1;
    }

    private void llenarCbxTipoHc() {
        oTipoHistoriaClinicaBl = new TipoHistoriaClinicaBl();
        listTipoHc = oTipoHistoriaClinicaBl.listar();
        if (!listTipoHc.isEmpty()) {
            cbxTipohc.removeAllItems();
            cbxTipohc.addItem("<Seleccionar>");
            for (TipoHistoriaClinica obj : listTipoHc) {
                obj.setOp(TipoHistoriaClinica.DATO);
                cbxTipohc.addItem(obj);
            }
        }
    }

    private void llenarCbxTipoDoc() {
        oTipoDocIdentidadBl = new TipoDocIdentidadBl();
        listTipoDocIdentidad = oTipoDocIdentidadBl.listar();
        if (!listTipoDocIdentidad.isEmpty()) {
            cbxTipoDoc.removeAllItems();
            cbxTipoDoc.addItem("<Seleccionar>");
            for (TipoDocIdentidad obj : listTipoDocIdentidad) {
                obj.setOp(TipoDocIdentidad.DATO);
                cbxTipoDoc.addItem(obj);
            }
        }
    }

    private void llenarCbxEstadoCivil() {
        estadoCivilBl = new EstadoCivilBl();
        listEstadoCivil = estadoCivilBl.listar();
        if (!listEstadoCivil.isEmpty()) {
            cbxEstadoCivil.removeAllItems();
            cbxEstadoCivil.addItem("<Seleccionar>");
            for (PeEstadoCivil obj : listEstadoCivil) {
                obj.setOp(PeEstadoCivil.DATO);
                cbxEstadoCivil.addItem(obj);
            }
        }
    }
    

    private void listarIngresosPaciente(int idPersona) {
        oPacienteBl = new PacienteBl();
        listPaciente = oPacienteBl.listarIngresosPaciente(idPersona);
        if (!listPaciente.isEmpty()) {
            oModeloPaciente.addAll(listPaciente);
        } else {
            oModeloPaciente.clear();
        }
    }

    private void listarServicios(Paciente oPaciente) {
        oItemsComprobanteBl = new ItemsComprobanteBl();
        listItemsComprobante = oItemsComprobanteBl.listarServicios(oPaciente);
        if (!listItemsComprobante.isEmpty()) {
            oModeloDetalleAtencion.addAll(listItemsComprobante);
        } else {
            oModeloDetalleAtencion.clear();
        }
    }

    private void listarAtencionesFondo(FondoSolidaridad oFondoSolidaridad) {
        if (!oFondoSolidaridad.getServicioFondoSolidaridads().isEmpty()) {
            for (ServicioFondoSolidaridad seviciofp : oFondoSolidaridad.getServicioFondoSolidaridads()) {
                oModeloServicioFondoS.add(seviciofp);
            }
        }
    }

    void resetFullComponent() {
        configuraCancelar();
    }

    private void openJifBuscarPersona() {
        root.jifBuscarPersonaJuridica.setInvocador(JIF_BuscarPersonaJuridica.JIF_ADMISION);
        root.insertarInternalFrames(root.jifBuscarPersonaJuridica);
        root.jifBuscarPersonaJuridica.enviarPanel(this);
    }

    private void insetarAtencionPaciente() {
        oBlPaciente = new PacienteBl();
        if (beanTablaPersona != null) {
            oPaciente = oBlPaciente.buscarPacienteXid(beanTablaPersona.getIdPersona());
            if (oPaciente != null && oPaciente.getComprobantes().isEmpty()) {
                root.jifEmitirComprobante.cargarDatosUsuario(getUserTemp());
                root.jifEmitirComprobante.enviarDatosPaciente(beanTablaPersona);
                root.jifEmitirComprobante.EnviarDatosCaja(oCaja);
                root.jifEmitirComprobante.inicializar();
                root.insertarInternalFrames(root.jifEmitirComprobante);
            }else{
                JOptionPane.showMessageDialog(null, "Registre un nuevo ingreso", "Atención", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    void cargarDatos(Usuario user, Persona oPersona, Rol oRol) {
        setUserTemp(user);
        perTemp = oPersona;
        rolTemp = oRol;
    }

    public Usuario getUserTemp() {
        return userTemp;
    }

    public void setUserTemp(Usuario userTemp) {
        this.userTemp = userTemp;
    }

    void enviarDatosCaja(Caja oCaja) {
        this.oCaja = oCaja;
    }

    void iniciar() {
        llenarCbxSeguro();
        //llenarCbxTipoHc();
        oTipoHCCtrl = new TipoHCCtrl(root);
        oTipoHCCtrl.rellenaTipoHC(cbxTipohc);
        oTipoHCCtrl.rellenaTipoHC(cbxTipoHCBusq);
        oTipoHCCtrl.defaultSelectCbx("HISTORIA CLINICA AMBULATORIA", cbxTipoHCBusq);
        //llenarCbxTipoDoc();
        oTipoDocIdentidadCtrl = new TipoDocIdentidadCtrl(root);
        oTipoDocIdentidadCtrl.rellenaTipoDocumento(cbxTipoDoc);
        //llenarCbxEstadoCivil();
        oEstadoCivilCtrl = new EstadoCivilCtrl(root);
        oEstadoCivilCtrl.rellenaEstadoCivil(cbxEstadoCivil);
        //Llena combo especialidad
        oEspecialidadCtrl = new EspecialidadCtrl(root);
        oEspecialidadCtrl.rellenaCbx(cbxEspecialidad);
        //
        personalizaVistaTabla();
        fechaIngresoActual();
    }

    private void estadoSectionIngreso(boolean b) {
        cbxTipoIngreso.setEnabled(b);
        cbxEspecialidad.setEnabled(b);
        btnRegIngreso.setEnabled(b);
    }

    private boolean isDatosValidosIngreso() {
        return (cbxTipoIngreso.getSelectedIndex()>0
                && cbxEspecialidad.getSelectedIndex()>0);
    }

    private void paintComponentesIngreso() {
        Utilitarios.paintCbxVacio(cbxTipoIngreso);
        Utilitarios.paintCbxVacio(cbxEspecialidad);
    }

    private void resetPaintComponentesIngreso() {
        Utilitarios.resetPaintCbx(cbxTipoIngreso);
        Utilitarios.resetPaintCbx(cbxEspecialidad);
    }

    private void imprimir() {
        if(isDatosValidosImpresion()){
            root.jdVisorHc.setPrintHistoriaClinica(printHc);
            root.jdVisorHc.clearData();
            if(beanTablaPersona != null && oHistoriaClinica != null){
                printHc.setFecha_registro(Utilitarios.formatFecha(new Date()));
                printHc.setNumero_hc(oHistoriaClinica.getNumerohc().toString());
                printHc.setApe_paterno(beanTablaPersona.getApellidoPaterno());
                printHc.setApe_materno(beanTablaPersona.getApellidoMaterno());
                printHc.setNombres(beanTablaPersona.getNombre());
                if (beanTablaPersona.getSexo() != null && beanTablaPersona.getSexo().equals("MASCULINO")) {
                    printHc.setSexo("M");
                }else if(beanTablaPersona.getSexo() != null && beanTablaPersona.getSexo().equals("FEMENINO")){
                    printHc.setSexo("F");
                }
                printHc.setFecha_nacimiento(beanTablaPersona.getFechaNacimiento()!= null?Utilitarios.formatFecha(beanTablaPersona.getFechaNacimiento()):"");
                printHc.setEdad(beanTablaPersona.getFechaNacimiento() != null?Utilitarios.obtenerEdad(beanTablaPersona.getFechaNacimiento())+"":"");
                printHc.setLugar_nacimiento(beanTablaPersona.getLugarNacimiento() != null?beanTablaPersona.getLugarNacimiento():"");
                printHc.setProcedencia(beanTablaPersona.getLugarProcedencia() != null?beanTablaPersona.getLugarProcedencia():"");
                printHc.setGrado_instruccion(beanTablaPersona.getGradoInstruccion() != null?beanTablaPersona.getGradoInstruccion():"");
                printHc.setEstado_civil(beanTablaPersona.getPeEstadoCivil() != null ? beanTablaPersona.getPeEstadoCivil().getEstadoCivil():"");
                printHc.setOcupacion(beanTablaPersona.getOcupacion() != null?beanTablaPersona.getOcupacion():"");
                printHc.setDni(beanTablaPersona.getNumeroDocumento() != null?beanTablaPersona.getNumeroDocumento():"");
                printHc.setCelular(beanTablaPersona.getTelefono() != null?"Telefono : "+beanTablaPersona.getTelefono():"");
                
                root.jdVisorHc.pintarDatos();
                root.jdVisorHc.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "No cuenta con HC", "Atención", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            Mensajes.hcSeleccionePersona();
        }
    }

    private boolean isDatosValidosImpresion() {
        return (tblResultados.getRowSelectionAllowed()
                );
    }

}
