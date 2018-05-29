package lissa.gui;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lissa.be.Beneficio;
import lissa.be.Caja;
import lissa.be.Comprobante;
import lissa.be.FondoPrevisionTemp;
import lissa.be.TipoComprobante;
import lissa.be.Paciente;
import lissa.be.FondoSolidaridad;
import lissa.be.HistoriaClinica;
import lissa.be.ItemsComprobante;
import lissa.be.Medico;
import lissa.be.MedicoDerivaAtiende;
import lissa.be.Persona;
import lissa.be.PersonaJuridica;
import lissa.be.Procedimiento;
import lissa.be.SeguroVida;
import lissa.be.SeguroVidaUsaPersona;
import lissa.be.Servicio;
import lissa.be.ServicioFondoSolidaridad;
import lissa.be.Usuario;
import lissa.bl.BoletaBl;
import lissa.bl.BeneficioBl;
import lissa.bl.ComprobanteBl;
import lissa.bl.FondoPrevisionBl;
import lissa.bl.HistoriaClinicaBl;
import lissa.bl.ItemsComprobanteBl;
import lissa.bl.SeguroBl;
import lissa.bl.SeguroPersonaBl;
import lissa.bl.FondoSolidaridadTempBl;
import lissa.bl.MedicoDerivaAtiendeBl;
import lissa.bl.PacienteBl;
import lissa.bl.ServicioFondoSolidaridadBl;
import lissa.ds.DSConeccion;
import lissa.reportes.ReportGeneric;
import lissa.table.ModeloProcedimientoMedico;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;
import lissa.utiles.ManejoControles;
import net.sf.jasperreports.engine.JRException;

public class JIF_EmitirComprobante extends javax.swing.JInternalFrame {

    private Servicio oServicio = null;
    ManejoControles oManejoControles = new ManejoControles();
    BoletaBl oBLBoleta = new BoletaBl();
    int tipoBusqueda = 0;
    int filaTablaItemBoleta;
    int idTempItemBol;
    BigDecimal montoToal = BigDecimal.valueOf(0);
    private JF_Principal root;
    Date FechaInicio = new Date();
    Date FechaFin = new Date();
    private Usuario oUsuario;
    private Caja Ocaja;

    //Nos permitirá llenar  la fecha actual del comprobante de pago
    private String dia;
    private String mes;
    private String anio;

    private ItemsComprobante oItemComprobante;
    private ItemsComprobanteBl oBlItemComprobante;

    private SeguroVida oSeguroVida;
    private SeguroBl blSeguro;
    private SeguroPersonaBl oBlSeguroPersona;

    private Comprobante oComprobante;
    private BoletaBl oBlBoleta;
    private List<SeguroVida> listSeguro;

    private ComprobanteBl oBlComprobante;
    private ItemsComprobante beanTabla;

    private Persona oPersona;
    private PersonaJuridica oPersonaJuridica;
    private PersonaJuridica oPersonaJuridicaOcu;
    private Paciente oPaciente = null;
    private PacienteBl oBlPaciente = null;
    private Medico oMedicoD;
    private Medico oMedicoA;
    private ModeloProcedimientoMedico oModeloPro;
    private HistoriaClinica oHistoriaClinica;
    private HistoriaClinicaBl oHistoriaClinicaBl;

    //private static final double IGV = 0.18;
    private BigDecimal IGV = new BigDecimal("0.18");
    private BigDecimal subTotal = new BigDecimal("0.00");
    private BigDecimal subTotalReg = new BigDecimal("0.00");//sub total para registrar en la BD
    private BigDecimal montoIGV = new BigDecimal("0.00");
    private BigDecimal montoTotal = new BigDecimal("0.00");
    private BigDecimal montoAdicional = new BigDecimal("0.00");
    private BigDecimal montoPagar = new BigDecimal("0.00");
    private BigDecimal montoCubiertoSeguro;
    private BigDecimal montoCubiertoFPS;
    private BigDecimal montoReal = new BigDecimal("0.00");
    private int cubierto;
    //Variables para el reporte
    private ReportGeneric reportGenric = null;
    private JPanel reportPanel = null;
    private DSConeccion ds = null;
    private JInternalFrame reportVisor = null;
    private FondoSolidaridad beanfs = null;
    private ServicioFondoSolidaridad oServFondo = null;
    private ServicioFondoSolidaridadBl oServFondoBl = null;
    private String tipoComprobante = null;
    private List<ItemsComprobante> list = null;
    private FondoPrevisionTemp oFondoPrevisionTemp = null;
    private FondoSolidaridadTempBl oFondoSolidaridadTempBl = null;
    private FondoSolidaridad oFondoSolidaridad = null;
    private FondoPrevisionBl oBlFondoPrevision = null;
    private BeneficioBl oBeneficioBl = null;
    private List<Beneficio> beneficioList;
    public static final int CIEN = 100;
    public static final BigDecimal CIENTODIESIOCHO = new BigDecimal(1.18);
    private ArrayList<MedicoDerivaAtiende> listMedDA;
    private MedicoDerivaAtiende oMedicoDerivaAtiende;
    private MedicoDerivaAtiendeBl oMedicoDerivaAtiendeBl;
    private Procedimiento oProcedimiento;

    public JIF_EmitirComprobante(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloPro = new ModeloProcedimientoMedico();
        tblResultados.setModel(oModeloPro);
        Utilitarios.fechaActual(jdcFechaComprobante);
        personalizaVistaTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        cbxComprobante = new javax.swing.JComboBox();
        jlbTituloComprobante1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jlbTituloComprobante = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txfNumComprobante = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txfNombrePersona = new javax.swing.JTextField();
        txfFacturarA = new javax.swing.JTextField();
        btnBuscarPaciente = new javax.swing.JButton();
        btnBuscarFacturar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txfFactura = new javax.swing.JTextField();
        txfFechaIngreso = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jdcFechaComprobante = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        txfMontoProcedTarifario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txfServicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfMedicoDerivador = new javax.swing.JTextField();
        txfMedicoTratante = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txfMontoDerivado = new javax.swing.JTextField();
        txfMontoAtencion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jsCubiertoSeguro = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txfMontoPagado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbxSeguro = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cbxBeneficio = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        txfMontoAdicional = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txfObservacionServicio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbxTipoPaciente = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultados = new org.jdesktop.swingx.JXTable();
        jLabel17 = new javax.swing.JLabel();
        txfMontoTotal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txfSubTotal = new javax.swing.JTextField();
        txfMontoIGV = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Facturación");
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
                formInternalFrameOpened(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(790, 560));

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cbxComprobante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>", "BOLETA", "FACTURA", "TICKET", "ORDEN DE ATENCION" }));
        cbxComprobante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxComprobanteItemStateChanged(evt);
            }
        });
        cbxComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComprobanteActionPerformed(evt);
            }
        });

        jlbTituloComprobante1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbTituloComprobante1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTituloComprobante1.setText("COMPROBANTE");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(467, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlbTituloComprobante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxComprobante, 0, 154, Short.MAX_VALUE))
                .addGap(266, 266, 266))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(jlbTituloComprobante1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.setBackground(new java.awt.Color(204, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jlbTituloComprobante.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbTituloComprobante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTituloComprobante.setText("BOLETA");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setText("N° : ");

        txfNumComprobante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfNumComprobante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNumComprobante.setEnabled(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNumComprobante))
                    .addComponent(jlbTituloComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jlbTituloComprobante)
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txfNumComprobante))
                .addGap(4, 4, 4))
        );

        jPanel14.setBackground(new java.awt.Color(204, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel26.setText("Paciente : ");

        jLabel27.setText("Facturar a : ");

        txfNombrePersona.setEnabled(false);

        txfFacturarA.setEnabled(false);

        btnBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        btnBuscarFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        btnBuscarFacturar.setEnabled(false);
        btnBuscarFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFacturarActionPerformed(evt);
            }
        });

        jLabel2.setText("RUC: ");

        txfFactura.setEnabled(false);
        txfFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfFacturaActionPerformed(evt);
            }
        });

        txfFechaIngreso.setEditable(false);
        txfFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfFacturarA, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(txfNombrePersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfFactura)
                    .addComponent(txfFechaIngreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(txfNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarFacturar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(txfFacturarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txfFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(204, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("DÍA/MES/AÑO");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jdcFechaComprobante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdcFechaComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txfMontoProcedTarifario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfMontoProcedTarifario.setEnabled(false);
        txfMontoProcedTarifario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfMontoProcedTarifarioKeyReleased(evt);
            }
        });

        jLabel4.setText("S/.");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Servicio : ");

        txfServicio.setEnabled(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Derivado por : ");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Atendido por : ");

        txfMedicoDerivador.setEnabled(false);
        txfMedicoDerivador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMedicoDerivadorActionPerformed(evt);
            }
        });

        txfMedicoTratante.setEnabled(false);
        txfMedicoTratante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMedicoTratanteActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txfMontoDerivado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txfMontoAtencion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("S/.");

        jLabel8.setText("S/.");

        jsCubiertoSeguro.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jsCubiertoSeguro.setEnabled(false);
        jsCubiertoSeguro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsCubiertoSeguroStateChanged(evt);
            }
        });

        jLabel6.setText("S/.");

        txfMontoPagado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel10.setText("Cubierto Seguro (%) : ");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Seguro :");

        cbxSeguro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>" }));
        cbxSeguro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSeguroItemStateChanged(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Beneficio : ");

        cbxBeneficio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>" }));

        jLabel33.setText("Aumt/Desc :");

        txfMontoAdicional.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfMontoAdicional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfMontoAdicionalKeyReleased(evt);
            }
        });

        jLabel38.setText("Observación :");

        jLabel11.setText("Tipo Paciente :");

        cbxTipoPaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECCIONE>", "PARTICULAR", "SEGURO", "OTROS" }));
        cbxTipoPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoPacienteItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTipoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txfMedicoDerivador, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfMontoDerivado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)
                        .addContainerGap(507, Short.MAX_VALUE))
                    .addComponent(txfObservacionServicio)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txfServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfMontoProcedTarifario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel33))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cbxSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cbxBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txfMontoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txfMedicoTratante)
                                        .addGap(10, 10, 10))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jsCubiertoSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfMontoAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(txfMontoPagado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbxTipoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cbxSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(cbxBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txfServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(txfMontoProcedTarifario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jsCubiertoSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(txfMontoPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel33)
                                .addComponent(txfMontoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txfMedicoDerivador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(txfMontoDerivado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txfMontoAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfMedicoTratante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txfObservacionServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle del Comprobante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tblResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblResultados);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("TOTAL S/.");

        txfMontoTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfMontoTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfMontoTotal.setText("0.00");
        txfMontoTotal.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("SUB TOTAL S/.");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("IGV S/.");

        txfSubTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSubTotal.setText("0.00");
        txfSubTotal.setEnabled(false);

        txfMontoIGV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfMontoIGV.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfMontoIGV.setText("0.00");
        txfMontoIGV.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfMontoIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txfSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txfMontoIGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txfMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/add.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/remove.png"))); // NOI18N
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        jButton2.setToolTipText("Guardar e Imprimir");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(1021, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(3, 3, 3)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, Short.MAX_VALUE))
                .addGap(176, 176, 176)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnQuitar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        jScrollPane7.setViewportView(jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComprobanteActionPerformed
        if (cbxComprobante.getSelectedIndex() != 0) {
            estadoTextFields(true);
            configurarComprobante();
        } else {
            estadoTextFields(false);
        }
    }//GEN-LAST:event_cbxComprobanteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isDatosValidosEncabezado()) {
            buscarProcedimiento();
            resetPaintComponent();
        } else {
            Mensajes.msjValidarIngreso();
            paintComponent();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        buscarPersona();
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnBuscarFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFacturarActionPerformed
        buscarPersonaJuridica(JIF_AdministrarPersonaJuridica.JIF_EMITIR_COMPROBANTE);
    }//GEN-LAST:event_btnBuscarFacturarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        resetComponent();
        oComprobante = null;
        oPersona = null;
        oPersonaJuridica = null;
        oServicio = null;
        subTotal = new BigDecimal("0.00");
        montoIGV = new BigDecimal("0.00");
        montoTotal = new BigDecimal("0.00");
        personalizaVistaTabla();
        btnBuscarFacturar.setEnabled(false);
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        personalizaVistaTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void txfFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfFacturaActionPerformed

    private void txfMedicoTratanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMedicoTratanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfMedicoTratanteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buscarMedico(JIF_BuscarMedico.MEDICO_DERIVADOR);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        buscarMedico(JIF_BuscarMedico.MEDICO_ATIENDE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txfMedicoDerivadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMedicoDerivadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfMedicoDerivadorActionPerformed

    private void jsCubiertoSeguroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsCubiertoSeguroStateChanged
        calcularMontoaPagoServicio();
    }//GEN-LAST:event_jsCubiertoSeguroStateChanged

    private void cbxSeguroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSeguroItemStateChanged
        oSeguroVida = new SeguroVida();
        if (cbxSeguro.getSelectedIndex() > 0) {
            oSeguroVida = (SeguroVida) cbxSeguro.getSelectedItem();
            cargarBeneficios();
        }

    }//GEN-LAST:event_cbxSeguroItemStateChanged

    private void txfMontoAdicionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMontoAdicionalKeyReleased
        int code = evt.getKeyCode();
//        if (!txfMontoAdicional.getText().trim().equals("")) {
//            if (code == KeyEvent.VK_ENTER) {
        if (!txfMontoAdicional.getText().trim().equals("")) {
            if (txfMontoAdicional.getText().trim().equals("-")) {
                montoAdicional = new BigDecimal("0.00");
                calcularMontoAPagar();
            } else {
                calcularMontoAPagar();
            }
        } else {
            montoAdicional = new BigDecimal("0.00");
            calcularMontoAPagar();
        }
//            } else {
//                txfMontoPagado.setText(txfMontoServicio.getText().trim());
//            }
//        }


    }//GEN-LAST:event_txfMontoAdicionalKeyReleased

    private void cbxComprobanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxComprobanteItemStateChanged
        if (cbxComprobante.getSelectedItem().toString().trim().equals("FACTURA") || cbxComprobante.getSelectedItem().toString().trim().equals("TICKET")) {
            btnBuscarFacturar.setEnabled(true);
        } else {
            btnBuscarFacturar.setEnabled(false);
        }
    }//GEN-LAST:event_cbxComprobanteItemStateChanged

    private void txfMontoProcedTarifarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMontoProcedTarifarioKeyReleased
        if (!txfMontoProcedTarifario.getText().trim().equals("")) {
            calcularMontoAPagar();
        } else {
            resetMontosCalculados();
            calcularMontoAPagar();
        }
    }//GEN-LAST:event_txfMontoProcedTarifarioKeyReleased

    private void cbxTipoPacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoPacienteItemStateChanged
        if (cbxTipoPaciente.getSelectedItem().toString().trim().equals("SEGURO")) {
            jsCubiertoSeguro.setEnabled(true);
        } else if (cbxTipoPaciente.getSelectedItem().toString().trim().equals("SOCIO")) {
            jsCubiertoSeguro.setEnabled(false);
        }
    }//GEN-LAST:event_cbxTipoPacienteItemStateChanged

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        if (tblResultados.getSelectedRow() != -1) {
            //recalcularMontos();              
            oModeloPro.remove(tblResultados.getSelectedRow());

        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un elemento de la lista", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
        CalcularMontosComprobante(oModeloPro);
        personalizaVistaTabla();
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (isDatosValidosBoleta()) {
            agregarItemsComprobante();
            resetPaintComponent();
            personalizaVistaTabla();
            resetComponentDatosProcedimiento();
        } else {
            Mensajes.msjValidarIngreso();
            paintComponent();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseClicked
        try {
            filaTablaItemBoleta = tblResultados.rowAtPoint(evt.getPoint());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblResultadosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        registrar();
        for (MedicoDerivaAtiende oMedicoDerivaAtiend : listMedDA) {
            oMedicoDerivaAtiendeBl = new MedicoDerivaAtiendeBl();
            oMedicoDerivaAtiendeBl.registrar(oMedicoDerivaAtiend);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarFacturar;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox cbxBeneficio;
    private javax.swing.JComboBox cbxComprobante;
    private javax.swing.JComboBox cbxSeguro;
    private javax.swing.JComboBox cbxTipoPaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private com.toedter.calendar.JDateChooser jdcFechaComprobante;
    private javax.swing.JLabel jlbTituloComprobante;
    private javax.swing.JLabel jlbTituloComprobante1;
    private javax.swing.JSpinner jsCubiertoSeguro;
    private org.jdesktop.swingx.JXTable tblResultados;
    private javax.swing.JTextField txfFactura;
    private javax.swing.JTextField txfFacturarA;
    private javax.swing.JTextField txfFechaIngreso;
    private javax.swing.JTextField txfMedicoDerivador;
    private javax.swing.JTextField txfMedicoTratante;
    private javax.swing.JTextField txfMontoAdicional;
    private javax.swing.JTextField txfMontoAtencion;
    private javax.swing.JTextField txfMontoDerivado;
    private javax.swing.JTextField txfMontoIGV;
    private javax.swing.JTextField txfMontoPagado;
    private javax.swing.JTextField txfMontoProcedTarifario;
    private javax.swing.JTextField txfMontoTotal;
    private javax.swing.JTextField txfNombrePersona;
    private javax.swing.JTextField txfNumComprobante;
    private javax.swing.JTextField txfObservacionServicio;
    private javax.swing.JTextField txfServicio;
    private javax.swing.JTextField txfSubTotal;
    // End of variables declaration//GEN-END:variables

    public void setTipoBusqueda(int pIpoBusqueda) {
        tipoBusqueda = pIpoBusqueda;
    }

    private void obtenerDiaMesAnio() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar();
        dia = Integer.toString(c2.get(Calendar.DATE));
        mes = Integer.toString(c2.get(Calendar.MONTH) + 1);
        anio = Integer.toString(c2.get(Calendar.YEAR));

//        txfDia.setText(dia);
//        txfMes.setText(mes);
//        txfAnio.setText(anio);
    }

    private void estadoTextFields(boolean b) {
//        this.cbxSeguro.setEnabled(b);
//        this.cbxSeguro.setEnabled(b);
        this.btnAgregar.setEnabled(b);
        this.btnQuitar.setEnabled(b);
    }

    private void personalizaVistaTabla() {
        Utilitarios.formateaColumna(0, tblResultados, 80);
        Utilitarios.formateaColumna(3, tblResultados, 70);

        Utilitarios.alinearDatosColumnaTablaDerecha(3, tblResultados);
    }

    private void configurarComprobante() {
        oComprobante = new Comprobante();
        oBlBoleta = new BoletaBl();
        if (cbxComprobante.getSelectedItem().equals("BOLETA")) {
            jlbTituloComprobante.setText("BOLETA");
            oComprobante.setTipoComprobante(new TipoComprobante(2));
            oComprobante.setGrupoNumeracion(1);
            //estadoObjMontos(false);
            txfNumComprobante.setText("" + Utilitarios.numberFormat(generarNumeracionComprobante(), "##########"));
            tipoComprobante = "OtrosComprobantes";
        } else if (cbxComprobante.getSelectedItem().equals("FACTURA")) {
            jlbTituloComprobante.setText("FACTURA");
            oComprobante.setTipoComprobante(new TipoComprobante(1));
            oComprobante.setGrupoNumeracion(2);
            //estadoObjMontos(true);
            txfNumComprobante.setText("" + Utilitarios.numberFormat(generarNumeracionComprobante(), "##########"));
            tipoComprobante = "Factura";
        } else if (cbxComprobante.getSelectedItem().equals("TICKET")) {
            jlbTituloComprobante.setText("TICKET");
            oComprobante.setTipoComprobante(new TipoComprobante(3));
            oComprobante.setGrupoNumeracion(3);
            //estadoObjMontos(false);
            txfNumComprobante.setText("" + Utilitarios.numberFormat(generarNumeracionComprobante(), "##########"));
            tipoComprobante = "OtrosComprobantes";
        } else if (cbxComprobante.getSelectedItem().equals("PROFORMA")) {
            jlbTituloComprobante.setText("PROFORMA");
            oComprobante.setGrupoNumeracion(4);
            oComprobante.setTipoComprobante(new TipoComprobante(4));
            //estadoObjMontos(false);
            txfNumComprobante.setText("" + Utilitarios.numberFormat(generarNumeracionComprobante(), "##########"));
            tipoComprobante = "OtrosComprobantes";
        } else if (cbxComprobante.getSelectedItem().equals("ORDEN DE ATENCION")) {
            jlbTituloComprobante.setText("ORDEN DE ATENCION");
            oComprobante.setGrupoNumeracion(4);
            oComprobante.setTipoComprobante(new TipoComprobante(5));
            //estadoObjMontos(false);
            txfNumComprobante.setText("" + Utilitarios.numberFormat(generarNumeracionComprobante(), "##########"));
            tipoComprobante = "OrdenAtencion";
        } else {
            jlbTituloComprobante.setText("");
            txfNumComprobante.setText("");
            //estadoObjMontos(false);
            oComprobante.setTipoComprobante(new TipoComprobante(0));
        }
    }
    //Genera la numeracion correlativa de acuerdo al tipo de documento especificado
    private Integer generarNumeracionComprobante() {
        oBLBoleta = new BoletaBl();
        return oBLBoleta.obtenerUltNumero(oComprobante.getGrupoNumeracion()) + 1;
    }

    private void registrar() {
        if (isDatosValidosRegistrarBoleta()) {
            //registrarCliente();
            oComprobante = registrarBoleta();
            if (oComprobante != null) {
                registrarDetalleBoleta();
                JOptionPane.showMessageDialog(null, "Registro de comprobante exitoso", "Atención", JOptionPane.INFORMATION_MESSAGE);
                emitirComprobante();
                resetComponent();//Limpiar los datos actuales del comprobante
                this.doDefaultCloseAction();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar servicios", "Error", JOptionPane.ERROR_MESSAGE);
            }
            resetPaintComponent();
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar comprobante", "Error", JOptionPane.ERROR_MESSAGE);
            paintComponent();
        }

    }

    private int registrarCliente() {
        oPaciente = new Paciente();
        oBlPaciente = new PacienteBl();

        oPaciente.setPersona(oPersona);
        oPaciente.setIdpaciente(oBlPaciente.registrar(oPaciente));
        return oPaciente.getIdpaciente();
    }

    private Comprobante registrarBoleta() {
        oBlComprobante = new ComprobanteBl();
        //deberia relacionar  con id  persona
        if (oPaciente != null) {
            oComprobante.setPaciente(oPaciente);

            if (oPersonaJuridica != null) {
                oComprobante.setIdPersonaRucFactura(oPersonaJuridica.getIdPersonaJuridica());
            }
            if (cbxBeneficio.getSelectedIndex() > 0) {
                oComprobante.setBeneficio((Beneficio) cbxBeneficio.getSelectedItem());
            }
            oComprobante.setNumeroBoleta(generarNumeracionComprobante());
            oComprobante.setEstado(true);
            oComprobante.setFechaBoleta(jdcFechaComprobante.getDate());
            oComprobante.setFechaReg(new Date());
            oComprobante.setSubTotal(subTotalReg);
            oComprobante.setMontoIgv(montoIGV);
            oComprobante.setMontoTotal(montoTotal);
            oComprobante.setIdUsuario(getoUsuario().getIdUsuario());
            oComprobante.setCaja(getOcaja());
            //oComprobante.setIdUsuario(4);
            oComprobante.setNumeroOperacion(obtenerNumeroOperacion());
            //tipo de comprobante  ya se  obtuvo en el evento del comboComprobante
            oComprobante.setTipoPaciente(cbxTipoPaciente.getSelectedItem().toString().trim());
            return oBlComprobante.registrar(oComprobante);
        } else {
            JOptionPane.showMessageDialog(null, "Registre su ingreso en Admisión", "Atención", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    private void registrarDetalleBoleta() {
        if (oModeloPro.size() > 0) {
            for (int i = 0; i < oModeloPro.size(); i++) {
                oItemComprobante = new ItemsComprobante();
                oBlItemComprobante = new ItemsComprobanteBl();
                oItemComprobante = (ItemsComprobante) oModeloPro.get(i);
                oItemComprobante.setComprobante(oComprobante);
                if (cbxBeneficio.getSelectedIndex() > 0) {
                    oItemComprobante.setBeneficio((Beneficio) cbxBeneficio.getSelectedItem());
                }

                oItemComprobante = oBlItemComprobante.registrar(oItemComprobante);
                //Registrar el servicio que se emplea con el uso de un fondo de prevision
                registrarEmpleoFondoSolidaridad();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La boleta no contiene procedimientos para su registro", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void agregarItemsComprobante() {
        oItemComprobante = new ItemsComprobante();
        if (!txfServicio.getText().trim().equals("")) {
            //setear valores de cada uno de los items para guardar en la tabla itemBoleta
            oItemComprobante.setProcedimiento(oProcedimiento);
            oItemComprobante.setMontoProcedimiento(oProcedimiento.getCosto());
            oItemComprobante.setConcepto(txfServicio.getText().trim().toUpperCase());
            oItemComprobante.setEstado(true);
            oItemComprobante.setMedicoByIdMedicoDeriva(oMedicoD);
            oItemComprobante.setMedicoByIdMedicoAtiende(oMedicoA);
            if (!txfMontoAdicional.getText().trim().equals("")) {
                oItemComprobante.setImporteAdicional(new BigDecimal(txfMontoAdicional.getText().trim()));
            } else {
                oItemComprobante.setImporteAdicional(new BigDecimal("0.00"));
            }

            if (!txfMontoDerivado.getText().trim().equals("")) {
                oItemComprobante.setMontoDerivacion(new BigDecimal(txfMontoDerivado.getText().trim()));
            } else {
                oItemComprobante.setMontoDerivacion(new BigDecimal("0.00"));
            }
            if (!txfMontoAtencion.getText().trim().equals("")) {
                oItemComprobante.setMontoAtencion(new BigDecimal(txfMontoAtencion.getText().trim()));
            } else {
                oItemComprobante.setMontoAtencion(new BigDecimal("0.00"));
            }
            if (!txfMontoPagado.getText().trim().equals("")) {
                oItemComprobante.setMontoPagado(BigDecimal.valueOf(Double.parseDouble(txfMontoPagado.getText().trim())));
            } else {
                oItemComprobante.setMontoPagado(new BigDecimal("0.00"));
            }
            if (!txfObservacionServicio.getText().trim().equals("")) {
                oItemComprobante.setObservacion(txfObservacionServicio.getText().trim().toUpperCase());
            } else {
                oItemComprobante.setObservacion("");
            }
            oItemComprobante.setPorcCubierto(cubierto);
            if (montoCubiertoSeguro == null) {
                oItemComprobante.setMontoCubierto(BigDecimal.ZERO);
            } else {
                oItemComprobante.setMontoCubierto(montoCubiertoSeguro);
            }

            //fin de seteo de valores
            oModeloPro.add(oItemComprobante);
            //Se agrega a una lista los valores para los datos del medico que deriva o atiende
            agregarMedicoDerivaAtiende(oItemComprobante);

            calcularMontos();

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el concepto o servicio", "Atención", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void agregarMedicoDerivaAtiende(ItemsComprobante oItemComprobante) {
        if (oMedicoD != null) {
            oMedicoDerivaAtiende = new MedicoDerivaAtiende();
            oMedicoDerivaAtiende.setItemsComprobante(oItemComprobante);
            oMedicoDerivaAtiende.setMedico(oMedicoD);
            BigDecimal monto = txfMontoDerivado.getText().trim().equals("") ? BigDecimal.ZERO : new BigDecimal(txfMontoDerivado.getText().trim());
            oMedicoDerivaAtiende.setMonto(monto);
            oMedicoDerivaAtiende.setEstadoPago("DEBE");
            oMedicoDerivaAtiende.setTipoMedico("DERIVA");
            oMedicoDerivaAtiende.setIdCajaafecto(getOcaja().getIdcaja());
            listMedDA.add(oMedicoDerivaAtiende);
        }
        if (oMedicoA != null) {
            oMedicoDerivaAtiende = new MedicoDerivaAtiende();
            oMedicoDerivaAtiende.setItemsComprobante(oItemComprobante);
            oMedicoDerivaAtiende.setMedico(oMedicoA);
            BigDecimal monto = txfMontoAtencion.getText().trim().equals("") ? BigDecimal.ZERO : new BigDecimal(txfMontoAtencion.getText().trim());
            oMedicoDerivaAtiende.setMonto(monto);
            if (oMedicoA != null && oMedicoA.getTipoMedico().getNombre().trim().equals("PLANTA")) {
                oMedicoDerivaAtiende.setEstadoPago("NO SE PAGA");
            } else {
                oMedicoDerivaAtiende.setEstadoPago("DEBE");
            }
            oMedicoDerivaAtiende.setTipoMedico("ATIENDE");
            oMedicoDerivaAtiende.setIdCajaafecto(getOcaja().getIdcaja());
            listMedDA.add(oMedicoDerivaAtiende);
        }
    }

    void cargarDatosServicio(Servicio beanTabla) {
        this.oServicio = beanTabla;
        txfServicio.setText(oServicio.getDenominacion().toUpperCase().trim());
//        txfMontoServicio.setText(oServicio.getCosto().toString());
//        txfMontoPagado.setText(oServicio.getCosto().toString());
    }

    private void buscarProcedimiento() {
        root.insertarInternalFrames(root.jifBuscarProcedimiento);
        root.jifBuscarProcedimiento.inicializar();
    }

    private void buscarPersona() {
        buscarSocio(JIF_BuscarPersonaNatural.JIF_EMITIR_COMPROBANTE);
    }

    void cargarDatosPersona(Persona beanTabla) {
        this.oPersona = beanTabla;
        //busca datos del paciente por  ultimo ingreso
        oBlPaciente = new PacienteBl();
        if (oPersona != null) {
            oPaciente = oBlPaciente.buscarPacienteXid(oPersona.getIdPersona());
            if (oPaciente != null && oPaciente.getComprobantes().isEmpty()) {
                txfNombrePersona.setText(oPersona.getApellidoPaterno().toUpperCase() + " " + oPersona.getApellidoMaterno().toUpperCase() + " " + oPersona.getNombre().toUpperCase());
                txfFechaIngreso.setText(Utilitarios.formatFecha(oPaciente.getFechaIngreso()));
                //Llenar los seguros con los que  cuenta el paciente
                llenarComboSegurosPaciente();
                //fin de busqueda
                txfFechaIngreso.setBackground(Color.GREEN);
            } else {
                txfFechaIngreso.setText("");
                txfFechaIngreso.setBackground(Color.RED);
                JOptionPane.showMessageDialog(null, "REGISTRE UN NUEVO INGRESO", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE DATOS DEL PACIENTE", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void fechaActual() {
        Calendar c = new GregorianCalendar();
        jdcFechaComprobante.setCalendar(c);
    }

    private void llenarComboSegurosPaciente() {
        blSeguro = new SeguroBl();
        oBlSeguroPersona = new SeguroPersonaBl();
        ArrayList<SeguroVidaUsaPersona> list;
        list = oBlSeguroPersona.listar(oPersona.getIdPersona());
        cbxSeguro.removeAllItems();
        cbxSeguro.addItem("<SELECCIONE>");
        for (SeguroVidaUsaPersona list1 : list) {
            SeguroVida seguro = new SeguroVida();
            //seguro = blSeguro.buscar(list1.getIdSeguroVida());
            seguro = blSeguro.buscar(list1.getSeguroVida().getIdSeguroVida());
            seguro.setOp(SeguroVida.DATO);
            cbxSeguro.addItem(seguro);
        }
    }

    private void calcularMontos(BigDecimal costo) {
        if (cbxComprobante.getSelectedItem().equals("FACTURA")) {
            //calcular montos
            subTotal = subTotal.add(costo);
            montoIGV = subTotal.multiply(IGV);
            montoTotal = subTotal.add(montoIGV);
            //Formateando los valores
            DecimalFormat dnf = new DecimalFormat("#.00");
            dnf.format(subTotal);
            dnf.format(montoIGV);
            dnf.format(montoTotal);
            //Imprimiendo valores en pantalla
            txfSubTotal.setText(subTotal.toString());
            txfMontoIGV.setText(montoIGV.toString());
            txfMontoTotal.setText(montoTotal.toString());
        } else {
            subTotal = subTotal.add(costo);
            txfSubTotal.setText(subTotal.toString());
        }
    }

    //Metodo que  calcula los montos segun tipo de comprobante y cantidad de items en la boeta
    private void calcularMontos() {
        oServicio = new Servicio();
        if (oModeloPro.size() > 0) {
            int i = oModeloPro.getRowCount() - 1;
            int j = oModeloPro.getColumnCount() - 1;//3
            oProcedimiento.setCosto(new BigDecimal(oModeloPro.getValueAt(i, j).toString()));

            if (cbxComprobante.getSelectedItem().equals("FACTURA")) {
                subTotal = subTotal.add(oItemComprobante.getMontoPagado());
                montoIGV = (subTotal.multiply(IGV)).divide(new BigDecimal("1.18"), 2, RoundingMode.HALF_UP);
                montoTotal = (subTotal.divide(new BigDecimal("1.18"), 2, RoundingMode.HALF_UP)).add(montoIGV);
                subTotalReg = (subTotal).divide(new BigDecimal("1.18"), 2, RoundingMode.HALF_UP);
                txfSubTotal.setText(subTotal.divide(new BigDecimal("1.18"), 2, RoundingMode.CEILING).toString());
            } else {
                subTotal = subTotal.add(oItemComprobante.getMontoPagado());
                montoIGV = new BigDecimal("0.00").setScale(2, BigDecimal.ROUND_CEILING);
                montoTotal = subTotal.add(montoIGV).setScale(2, BigDecimal.ROUND_CEILING);
                txfSubTotal.setText(subTotal.setScale(2, BigDecimal.ROUND_CEILING).toString());
            }
            //txfSubTotal.setText(subTotal.divide(new BigDecimal("1.18"), 2, RoundingMode.CEILING).toString());
            txfMontoIGV.setText(montoIGV.setScale(2, BigDecimal.ROUND_CEILING).toString());
            txfMontoTotal.setText(montoTotal.setScale(2, BigDecimal.ROUND_CEILING).toString());
        }
    }

    private boolean isDatosValidosBoleta() {
        return (!this.txfNumComprobante.getText().trim().equals("")
                && !this.txfNombrePersona.getText().trim().equals("")
                && this.cbxComprobante.getSelectedIndex() != 0
                && this.jdcFechaComprobante.getDate() != null
                && !this.txfServicio.getText().trim().equals(""));
    }

    private boolean isDatosValidosRegistrarBoleta() {
        return (!this.txfNumComprobante.getText().trim().equals("")
                && !this.txfNombrePersona.getText().trim().equals("")
                && this.cbxComprobante.getSelectedIndex() != 0
                && this.jdcFechaComprobante.getDate() != null
                && this.oModeloPro.size() > 0
                && this.cbxTipoPaciente.getSelectedIndex() != 0);
    }

    public void paintComponent() {
        Utilitarios.paintCbxVacio(cbxComprobante);
        Utilitarios.paintTxfVacio(txfNumComprobante);
        Utilitarios.paintTxfVacio(txfNombrePersona);
        Utilitarios.paintJdcVacio(jdcFechaComprobante);
        Utilitarios.paintCbxVacio(cbxTipoPaciente);
    }

    private void resetPaintComponent() {
        Utilitarios.resetPaintCbx(cbxComprobante);
        Utilitarios.resetPaintTxf(txfNumComprobante);
        Utilitarios.resetPaintTxf(txfNombrePersona);
        Utilitarios.resetPaintJdc(jdcFechaComprobante);
        Utilitarios.resetPaintCbx(cbxTipoPaciente);
    }

    void cargarDatosPersonaJuridica(PersonaJuridica beanTabla) {
        this.oPersonaJuridica = beanTabla;
        txfFacturarA.setText(oPersonaJuridica.getRazonSocial());
        txfFactura.setText(oPersonaJuridica.getNumeroRuc());
    }

    private void recalcularMontos() {
        beanTabla = (ItemsComprobante) oModeloPro.get(tblResultados.getSelectedRow());
        if (oModeloPro.size() > 0) {
            if (cbxComprobante.getSelectedItem().equals("FACTURA")) {
//                subTotal = subTotal.subtract(beanTabla.getServicio().getCosto()).setScale(2, BigDecimal.ROUND_HALF_DOWN);
                montoIGV = subTotal.multiply(IGV).setScale(2, BigDecimal.ROUND_HALF_DOWN);
                montoTotal = subTotal.add(montoIGV).setScale(2, BigDecimal.ROUND_HALF_DOWN);
            } else {
//                subTotal = subTotal.subtract(beanTabla.getServicio().getCosto()).setScale(2, BigDecimal.ROUND_DOWN);
                montoIGV = new BigDecimal("0.00").setScale(2, BigDecimal.ROUND_DOWN);
                montoTotal = subTotal.add(montoIGV).setScale(2, BigDecimal.ROUND_DOWN);
            }
            txfSubTotal.setText(subTotal.toString());
            txfMontoIGV.setText(montoIGV.toString());
            txfMontoTotal.setText(montoTotal.toString());
        }
    }

    private void buscarSocio(int JIF_EMITIR_COMPROBANTE) {
        root.jifBuscarPersonaNatural.setInvocador(JIF_EMITIR_COMPROBANTE);
        try {
            root.insertarInternalFrames(root.jifBuscarPersonaNatural);
            root.jifBuscarPersonaNatural.inicializar();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    private void emitirComprobante() {
        try {
            //ds = new DSConeccion("localhost", "5432", "lissadb", "postgres", "12345678");
            if (cbxComprobante.getSelectedItem().toString().equals("FACTURA") || cbxComprobante.getSelectedItem().toString().equals("BOLETA") || cbxComprobante.getSelectedItem().toString().equals("TICKET")) {
                ds = new lissa.ds.DSConeccion(root.getConfig());
                reportGenric = new ReportGeneric(ds.getConeccion());
                reportGenric.setReportParent("/lissa/reportes/");
                reportPanel = reportGenric.mkReport(tipoComprobante, new String[]{"P_ID_BOLETA"}, new Object[]{oComprobante.getIdComprobante()});
                reportVisor = new JInternalFrame();
                reportVisor.setTitle("Comprobante");
                reportVisor.setIconifiable(true);
                reportVisor.setClosable(true);
                reportVisor.setMaximizable(true);
                reportVisor.getContentPane().add(reportPanel);
                root.insertarInternalFrames(reportVisor);
                reportVisor.setMaximum(true);
            }

        } catch (JRException ex) {
            Logger.getLogger(JIF_EmitirComprobante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JIF_EmitirComprobante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void resetComponent() {
        this.cbxComprobante.setSelectedIndex(0);
        this.cbxSeguro.setSelectedIndex(0);
        this.cbxBeneficio.setSelectedIndex(0);
        this.txfNumComprobante.setText("");
        this.txfNombrePersona.setText("");
        this.txfFacturarA.setText("");
        this.txfFactura.setText("");
        this.txfServicio.setText("");
        this.txfMontoProcedTarifario.setText("");
        this.oModeloPro.clear();
        this.txfSubTotal.setText("0.00");
        this.txfMontoIGV.setText("0.00");
        this.txfMontoTotal.setText("0.00");
        this.txfMontoPagado.setText("");
        this.txfMontoAdicional.setText("");
        this.jsCubiertoSeguro.setValue(0);
        this.txfMontoDerivado.setText("");
        this.txfMontoAtencion.setText("");
        txfFechaIngreso.setText("");
        cbxTipoPaciente.setSelectedIndex(0);
        resetPaintComponent();
    }

    public void cargarDatosUsuario(Usuario user) {
        this.setoUsuario(user);
    }

    public Usuario getoUsuario() {
        return oUsuario;
    }

    public void setoUsuario(Usuario oUsuario) {
        this.oUsuario = oUsuario;
    }

    private Integer obtenerNumeroOperacion() {
        oBLBoleta = new BoletaBl();
        return oBLBoleta.obtenerNumeroOperacion() + 1;
    }

    private void buscarMedico(int MEDICO_DERIVADOR) {
        root.jifBuscarMedico.setInvocador(MEDICO_DERIVADOR);
        try {
            root.insertarInternalFrames(root.jifBuscarMedico);
            root.jifBuscarMedico.inicializar();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    void cargarDatosMedicoD(Medico beanTabla) {
        this.oMedicoD = beanTabla;
        txfMedicoDerivador.setText(oMedicoD.getPersona().getApellidoPaterno().trim() + " " + oMedicoD.getPersona().getApellidoMaterno().trim() + " " + oMedicoD.getPersona().getNombre());
    }

    void cargarDatosMedicoA(Medico beanTabla) {
        this.oMedicoA = beanTabla;
        txfMedicoTratante.setText(oMedicoA.getPersona().getApellidoPaterno().trim() + " " + oMedicoA.getPersona().getApellidoMaterno().trim() + " " + oMedicoA.getPersona().getNombre());
    }

    private void buscarFondoPrevision() {
        root.insertarInternalFrames(root.jifFondoPrevision);
        root.jifFondoPrevision.enviarDatosPersona(oPersona);
    }

    private void calcularMontoaPagoServicio() {
        if (oServicio != null && !txfMontoProcedTarifario.getText().trim().equals("")) {
            calcularMontoAPagar();
            if (cubierto != 0) {
                txfMontoPagado.setText("" + montoPagar);
            } else {
//                txfMontoPagado.setText("" + oServicio.getCosto());
            }
        }

    }

    private void cargarBeneficios() {
        oBeneficioBl = new BeneficioBl();
        cbxBeneficio.removeAllItems();
        beneficioList = oBeneficioBl.buscarXIdSeguro(((SeguroVida) cbxSeguro.getSelectedItem()).getIdSeguroVida());
        if (!beneficioList.isEmpty()) {
            cbxBeneficio.removeAllItems();
            cbxBeneficio.addItem("<SELECCIONE>");
            for (Beneficio beneficio1 : beneficioList) {
                beneficio1.setOp(SeguroVida.DATO);
                cbxBeneficio.addItem(beneficio1);
            }
        }
    }

    private void calcularMontoAPagar() {
        resetMontosCalculados();
        if (!txfMontoProcedTarifario.getText().trim().equals("")) {
            montoReal = new BigDecimal(txfMontoProcedTarifario.getText().trim());
        } else {
            montoReal = BigDecimal.ZERO;
        }

        cubierto = ((Integer) jsCubiertoSeguro.getValue());
        if(txfMontoAdicional.getText().trim().equals("-")){
            montoAdicional = BigDecimal.ZERO;
        }else{
            montoAdicional = !txfMontoAdicional.getText().trim().equals("")?new BigDecimal(txfMontoAdicional.getText().trim()):BigDecimal.ZERO;
        }
        
        montoCubiertoSeguro = (montoReal.multiply(new BigDecimal(cubierto)).setScale(2, RoundingMode.HALF_UP)).divide(new BigDecimal(CIEN));
        montoPagar = ((montoReal.add(montoAdicional)).subtract(montoCubiertoSeguro)).setScale(2, RoundingMode.HALF_UP);
        txfMontoPagado.setText(montoPagar.toString());
    }

    void EnviarDatosCaja(Caja oCaja) {
        this.setOcaja(oCaja);
    }

    public Caja getOcaja() {
        return Ocaja;
    }

    public void setOcaja(Caja Ocaja) {
        this.Ocaja = Ocaja;
    }

    private void estadoObjectsOcupacional(boolean b) {
//        txfEmpresaOcupacional.setEnabled(b);
//        txfRucOcupacional.setEnabled(b);
        txfServicio.setEnabled(b);
        txfMontoProcedTarifario.setEnabled(b);
        txfMontoPagado.setEnabled(b);
    }

//    private void buscarEmpresa() {
//         buscarPersonaJuridica(JIF_AdministrarPersonaJuridica.JIF_EMITIR_COMPROBANTE2);
//    }
//
//    private void buscarPersonaJuridica() {
//        root.insertarInternalFrames(root.jifAdministrarPersonaJuridica);
//    }
    private void buscarPersonaJuridica(int JIF_EMITIR_COMPROBANTE2) {
        root.jifAdministrarPersonaJuridica.setInvocador(JIF_EMITIR_COMPROBANTE2);
        try {
            root.insertarInternalFrames(root.jifAdministrarPersonaJuridica);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Atención", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void registrarEmpleoFondoSolidaridad() {
        if (oFondoSolidaridad != null && cbxBeneficio.getSelectedItem().toString().equalsIgnoreCase("FONDO PREVISION")) {
            oServFondo = new ServicioFondoSolidaridad();
            oServFondoBl = new ServicioFondoSolidaridadBl();
            oServFondo.setFondoSolidaridad(oFondoSolidaridad);
            oServFondo.setItemsComprobante(oItemComprobante);
            oServFondo.setFechaAtencion(new Date());

            oServFondoBl.registrar(oServFondo);
        }
    }

    void enviarDatosPaciente(Persona beanTablaPersona) {
        cargarDatosPersona(beanTablaPersona);
    }

    private void resetMontosCalculados() {
        montoReal = BigDecimal.ZERO;
        cubierto = 0;
        montoAdicional = BigDecimal.ZERO;
        montoCubiertoSeguro = BigDecimal.ZERO;
        montoCubiertoFPS = BigDecimal.ZERO;
        montoPagar = BigDecimal.ZERO;
    }

    private void resetComponentDatosProcedimiento() {
        txfServicio.setText("");
        txfMontoProcedTarifario.setText("");
        txfMedicoDerivador.setText("");
        txfMedicoTratante.setText("");
        txfMontoDerivado.setText("");
        txfMontoPagado.setText("");
        txfMontoAtencion.setText("");
        txfMontoAdicional.setText("");
        jsCubiertoSeguro.setValue(0);
        txfObservacionServicio.setText("");
        oItemComprobante = null;
        oProcedimiento = null;
        oMedicoA = null;
        oMedicoD = null;
    }

    private void calcularMontosParticular() {
        resetMontosCalculados();
        if (!txfMontoProcedTarifario.getText().trim().equals("")) {
            montoReal = new BigDecimal(txfMontoProcedTarifario.getText().trim());
        } else {
            montoReal = BigDecimal.ZERO;
        }
        if (!txfMontoAdicional.getText().trim().equals("")) {
            montoAdicional = new BigDecimal(txfMontoAdicional.getText().trim());
        } else {
            montoAdicional = BigDecimal.ZERO;
        }
        cubierto = 0;
        montoCubiertoSeguro = BigDecimal.ZERO;
        montoCubiertoFPS = BigDecimal.ZERO;
        montoPagar = (montoReal.add(montoAdicional)).setScale(2, RoundingMode.HALF_UP);
        txfMontoPagado.setText(montoPagar.toString());
    }

    private void calcularMontosSeguro() {
        resetMontosCalculados();
        if (!txfMontoProcedTarifario.getText().trim().equals("")) {
            montoReal = new BigDecimal(txfMontoProcedTarifario.getText().trim());
        } else {
            montoReal = BigDecimal.ZERO;
        }
        if (!txfMontoAdicional.getText().trim().equals("")) {
            montoAdicional = new BigDecimal(txfMontoAdicional.getText().trim());
        } else {
            montoAdicional = BigDecimal.ZERO;
        }
        cubierto = Integer.parseInt(jsCubiertoSeguro.getValue().toString());
        montoCubiertoSeguro = montoReal.multiply(new BigDecimal(cubierto).divide(new BigDecimal(CIEN), RoundingMode.HALF_UP)).setScale(2, RoundingMode.HALF_UP);
        montoCubiertoFPS = BigDecimal.ZERO;
        montoPagar = (montoReal.add(montoAdicional)).add(montoCubiertoSeguro).setScale(2, RoundingMode.HALF_UP);
        txfMontoPagado.setText(montoPagar.toString());
    }

    private void calcularMontosSocio() {
        resetMontosCalculados();
        if (!txfMontoProcedTarifario.getText().trim().equals("")) {
            montoReal = new BigDecimal(txfMontoProcedTarifario.getText().trim());
        } else {
            montoReal = BigDecimal.ZERO;
        }
        if (!txfMontoAdicional.getText().trim().equals("")) {
            montoAdicional = new BigDecimal(txfMontoAdicional.getText().trim());
        } else {
            montoAdicional = BigDecimal.ZERO;
        }
        cubierto = 0;
        montoCubiertoSeguro = BigDecimal.ZERO;
        montoPagar = montoReal.subtract(montoCubiertoFPS);
        txfMontoPagado.setText(montoPagar.toString());
    }

    void inicializar() {
//        Utilitarios.fechaActual(jdcFechaComprobante);
//        personalizaVistaTabla();
//        jTabbedPane1.setEnabledAt(1, false);
        listMedDA = new ArrayList<>();
    }

    void enviaDatosProcedimiento(Procedimiento obj) {
        oProcedimiento = obj;
        txfServicio.setText(oProcedimiento.getDenominacion());
        txfMontoProcedTarifario.setText(oProcedimiento.getCosto().toString());
        txfMontoPagado.setText(oProcedimiento.getCosto().toString());
    }

    void enviaListProcedimientos(List<Procedimiento> listProcedimiento) {
        resetMontosCalculados();
        oModeloPro.clear();
        for (Procedimiento procedimiento : listProcedimiento) {
            ItemsComprobante oItemComprobante = new ItemsComprobante();
            oItemComprobante.setProcedimiento(procedimiento);
            oItemComprobante.setMontoProcedimiento(procedimiento.getCosto());
            oItemComprobante.setConcepto(procedimiento.getDenominacion().trim().toUpperCase());
            oItemComprobante.setEstado(true);
            oItemComprobante.setMedicoByIdMedicoDeriva(null);
            oItemComprobante.setMedicoByIdMedicoAtiende(null);
            oItemComprobante.setImporteAdicional(new BigDecimal("0.00"));
            oItemComprobante.setMontoDerivacion(new BigDecimal("0.00"));
            oItemComprobante.setMontoAtencion(new BigDecimal("0.00"));
            oItemComprobante.setMontoPagado(procedimiento.getCosto());
            oItemComprobante.setObservacion("");
            oItemComprobante.setPorcCubierto(0);
            oItemComprobante.setMontoCubierto(BigDecimal.ZERO);

            oModeloPro.add(oItemComprobante);
            //calcularMontosTotales(oItemComprobante);

        }
        CalcularMontosComprobante(oModeloPro);
        personalizaVistaTabla();
    }

    private void calcularMontosTotales(ItemsComprobante oItemComprobante) {
        if (cbxComprobante.getSelectedItem().equals("FACTURA")) {
            subTotal = subTotal.add(oItemComprobante.getMontoPagado());
            montoIGV = (subTotal.multiply(IGV)).divide(CIENTODIESIOCHO, 2, RoundingMode.HALF_UP);
            montoTotal = (subTotal.divide(CIENTODIESIOCHO, 2, RoundingMode.HALF_UP)).add(montoIGV);
            subTotalReg = (subTotal).divide(CIENTODIESIOCHO, 2, RoundingMode.HALF_UP);
            txfSubTotal.setText(subTotal.divide(CIENTODIESIOCHO, 2, RoundingMode.CEILING).toString());
        } else {
            subTotal = subTotal.add(oItemComprobante.getMontoPagado());
            montoIGV = new BigDecimal("0.00").setScale(2, RoundingMode.HALF_UP);
            montoTotal = subTotal.add(montoIGV).setScale(2, RoundingMode.HALF_UP);
            txfSubTotal.setText(subTotal.setScale(2, RoundingMode.HALF_UP).toString());
        }
        //txfSubTotal.setText(subTotal.divide(new BigDecimal("1.18"), 2, RoundingMode.CEILING).toString());
        txfMontoIGV.setText(montoIGV.setScale(2, RoundingMode.HALF_UP).toString());
        txfMontoTotal.setText(montoTotal.setScale(2, RoundingMode.HALF_UP).toString());

    }

    private boolean isDatosValidosEncabezado() {
        return (!this.txfNumComprobante.getText().trim().equals("")
                && !this.txfNombrePersona.getText().trim().equals("")
                && this.cbxComprobante.getSelectedIndex() != 0
                && this.jdcFechaComprobante.getDate() != null
                && this.cbxTipoPaciente.getSelectedIndex() > 0);
    }

    private void CalcularMontosComprobante(ModeloProcedimientoMedico oModeloPro) {
        resetMontosCalculados();
        resetTotales();
        if (oModeloPro.size() != 0) {
            for (int i = 0; i < oModeloPro.size(); i++) {
                ItemsComprobante oItemComprobante = new ItemsComprobante();
                oItemComprobante = oModeloPro.get(i);
                if (cbxComprobante.getSelectedItem().equals("FACTURA")) {
                    subTotal = subTotal.add(oItemComprobante.getMontoPagado());
                    montoIGV = (subTotal.multiply(IGV)).divide(CIENTODIESIOCHO, 2, RoundingMode.HALF_UP);
                    montoTotal = (subTotal.divide(CIENTODIESIOCHO, 2, RoundingMode.HALF_UP)).add(montoIGV);
                    subTotalReg = (subTotal).divide(CIENTODIESIOCHO, 2, RoundingMode.HALF_UP);
                    txfSubTotal.setText(subTotal.divide(CIENTODIESIOCHO, 2, RoundingMode.CEILING).toString());
                } else {
                    subTotal = subTotal.add(oItemComprobante.getMontoPagado());
                    montoIGV = new BigDecimal("0.00").setScale(2, RoundingMode.HALF_UP);
                    montoTotal = subTotal.add(montoIGV).setScale(2, RoundingMode.HALF_UP);
                    txfSubTotal.setText(subTotal.setScale(2, RoundingMode.HALF_UP).toString());
                }
                //txfSubTotal.setText(subTotal.divide(new BigDecimal("1.18"), 2, RoundingMode.CEILING).toString());
                txfMontoIGV.setText(montoIGV.setScale(2, RoundingMode.HALF_UP).toString());
                txfMontoTotal.setText(montoTotal.setScale(2, RoundingMode.HALF_UP).toString());
            }
        } else {
            resetTotales();
            txfSubTotal.setText("0.00");
            txfMontoIGV.setText("0.00");
            txfMontoTotal.setText("0.00");
        }

    }

    private void resetTotales() {
        subTotal = BigDecimal.ZERO;
        montoIGV = BigDecimal.ZERO;
        montoTotal = BigDecimal.ZERO;
    }

}
