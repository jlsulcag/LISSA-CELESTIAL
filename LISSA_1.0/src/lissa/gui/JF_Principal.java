package lissa.gui;
// <editor-fold defaultstate="collapsed" desc="Import">

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import lissa.be.Caja;
import lissa.be.Persona;
import lissa.be.Rol;
import lissa.be.Usuario;
import lissa.bl.CajaBl;
import lissa.conf.FileConf;
import lissa.gui.farmacia.JIF_AdminFormaFarmaceutica;
import lissa.gui.farmacia.JIF_AdminLaboratorio;
import lissa.gui.farmacia.JIF_AdminPresentacion;
import lissa.gui.farmacia.JIF_AdminProducto;
import lissa.gui.farmacia.JIF_RegistroMovimiento;
import lissa.gui.farmacia.JIF_BuscarComprobanteCompras;
import lissa.gui.farmacia.JIF_BuscarComprobanteVenta;
import lissa.gui.farmacia.JIF_BusqProductos;
import lissa.gui.farmacia.JIF_BusqProveedor;
import lissa.gui.farmacia.JIF_CantidadVenta;
import lissa.gui.farmacia.JIF_CerrarCajaFar;
import lissa.gui.farmacia.JIF_Compras;
import lissa.gui.farmacia.JIF_ConsultaFPS;
import lissa.gui.farmacia.JIF_FormaPago;
import lissa.gui.farmacia.JIF_KardexAlmacen;
import lissa.gui.farmacia.JIF_Migrar;
import lissa.gui.farmacia.JIF_NotaSalidaFar;
import lissa.gui.farmacia.JIF_NuevoProducto;
import lissa.gui.farmacia.JIF_ProductosVencidos;
import lissa.gui.farmacia.JIF_ProductosXVencer;
import lissa.gui.farmacia.JIF_RegAreaConsumo;
import lissa.gui.farmacia.JIF_RegFormaFarmaceutica;
import lissa.gui.farmacia.JIF_RegPresentacion;
import lissa.gui.farmacia.JIF_RegLaboratorio;
import lissa.gui.farmacia.JIF_RegVentas;
import lissa.gui.farmacia.JIF_StockActual;
import lissa.gui.rep.JIF_ComprasResumen;
import lissa.gui.rep.JIF_RecaudacionTipoPaciente;
import lissa.gui.rep.JIF_RepVentas;
import lissa.gui.rep.JIF_SalidasXFecha;
import lissa.gui.saludocupacional.JIF_HistoriaClinicaOcupacional;
import lissa.gui.saludocupacional.JPanel_Certificado;
import lissa.gui.saludocupacional.JPanel_EvaluacionAudiometrica;
import lissa.gui.saludocupacional.JPanel_EvaluacionOftalmologica;
import lissa.gui.saludocupacional.JPanel_EvaluacionOsteomuscular;
import lissa.gui.saludocupacional.JPanel_EvaluacionPsicologica;
import lissa.gui.saludocupacional.JPanel_FichaMedicoOcupacional;
import lissa.gui.saludocupacional.JPanel_InformeMedicoOcupacional;
import lissa.gui.saludocupacional.JPanel_Triaje;
import lissa.util.Mensajes;
import lissa.util.Reportes;
import lissa.util.Utilitarios;
import lissa.utiles.Background;
// </editor-fold>

public class JF_Principal extends javax.swing.JFrame {

    private Caja oCaja = null;
    private CajaBl ocajaBl = null;

    private Usuario user;
    private Persona oPersona;
    private Rol oRol;

    private boolean isFirst = true;
    private FileConf config;
    public JD_Configuracion jdConf;
    int DimenVentana = JF_Principal.MAXIMIZED_BOTH;
    public JD_IniciarSesion jdIniciarSesion = null;
    public JIF_BuscarServicio jifBuscarServicio = null;
    public JIF_BuscarProcedimiento jifBuscarProcedimiento;
    public JIF_EmitirComprobante jifEmitirComprobante = null;
    public JIF_BuscarPersonaNatural jifBuscarPersonaNatural = null;
    public JIF_AdministrarPersonaJuridica jifAdministrarPersonaJuridica = null;
    public JIF_BuscarPersonaJuridica jifBuscarPersonaJuridica = null;
    public JIF_AdministrarPersonaNatural jifAdministrarPersonanatural = null;
    public JIF_FondoPrevision jifFondoPrevision = null;
    public JIF_RegistrarUsuario jifRegistrarUsuario = null;
    public JIF_AdministrarComprobante jifAdministrarComprobante = null;
    public JIF_Reporte_RecaudacionDiariaTipoDocFecha jifReporteCajaDiario = null;
    public JIF_ReporteCajaMensual jifReporteCajaMensual = null;
    public JD_Contactenos jdContactenos = null;
    public JIF_CambiarContraseña jifCambiarContraseña = null;
    public JIF_AdministrarMedico jifAdministrarMedico = null;
    public JIF_BuscarMedico jifBuscarMedico = null;
    public JIF_BuscarFondoPrevisionTemp jifBuscarFondoPrevTemp = null;
    public JIF_BuscarHistoriaClinica jifBuscarHC = null;
    public JIF_RegistrarDiagnostico jifRegistrarDiagnostico = null;
    public JIF_AdminCie10 jifAdminCie10 = null;
    public JIF_Reporte_RecaudacionDiariaXMedico jifReporteRecaudacionPorMedico = null;
    public JIF_Reporte_RecaudacionResumen jifReporteRecaudacionResumen = null;
    public JIF_Reporte_RecaudacionPorServicio jifReporteRecaudacionXServicio = null;
    public JIF_OrdenLaboratorio jifOrdenLaboratorio = null;
    public JIF_HistoriaClinica jifHistoriaClinica = null;
    public JPanel_HistoriaClinica jPanel_HistoriaClinica = null;
    public JIF_AbrirCaja jifAbrirCaja = null;
    public JIF_CerrarCaja jifCerrarCaja = null;
    public JIF_BuscarCajeros jifBuscarCajeros = null;
    public JIF_AtencionFondoPrev jifAtencionFondoPrev = null;
    public JIF_RepTurno jifRepTurno = null;
    public JIF_HistoriaClinicaOcupacional jifHistoriaClinicaOcupacional = null;
    public JIF_Admision jifAdmision = null;
    public JPanel_EvaluacionOftalmologica jpEvalOftalmologica = null;
    public JPanel_EvaluacionOsteomuscular jpEvalOsteomuscular = null;
    public JPanel_EvaluacionAudiometrica jpEvalAudiometrica = null;
    public JPanel_Certificado jpCertificado = null;
    public JPanel_FichaMedicoOcupacional jpFichaMedicoOcupacional = null;
    public JPanel_EvaluacionPsicologica jpEvalPsicologica = null;
    public JPanel_Triaje jpTriaje = null;
    public JIF_CitaMedica jifCitaMedica = null;
    public JPanel_Admision jpAdmision;
    public JIF_AddEspecialidad jifAddEspecialidad;
    public JPanel_InformeMedicoOcupacional jpInformeMedicoOcupacional;
    public JIF_AdministrarSeguro jifAdministrarSeguro;
    public JIF_PagoMedicos jifPagoMedicos;
    //JIF para el modulo de farmacia
    public JIF_RegFormaFarmaceutica jifFormaFarmaceutica;
    public JIF_RegPresentacion jifRegPresentacion;
    public JIF_AdminProducto jifAdminProducto;
    public JIF_NuevoProducto jifNuevoProducto;
    public JIF_RegLaboratorio jifRegLaboratorio;
    public JIF_Compras jifCompras;
    public JIF_BusqProductos jifBusqProductos;
    public JIF_RegistroMovimiento jifAlmacen;
    public JIF_AdminPresentacion jifAdminPresentacion;
    public JIF_AdminFormaFarmaceutica jifAdminFormaFarmaceutica;
    public JIF_AdminLaboratorio jifAdminLaboratorio;
    public JIF_KardexAlmacen jifKardexAlmacen;
    public JIF_StockActual jifStockActual;
    public JIF_CerrarCajaFar jifCerrarCajaFar;
    
    public JIF_RegVentas jifRegVentas;
    public JIF_ComprasResumen jifComprasResumen;
    public JIF_RepVentas jifRepVentas;
    public JIF_ProductosXVencer jifProductosXVencer;
    public JIF_RecaudacionTipoPaciente jifRecaudaciobTipoPaciente;
    public JIF_BusqProveedor jifBusqProveedor;
    public JIF_Migrar jifMigrar;
    public JIF_CantidadVenta jifCantidadVenta;
    public JIF_ProductosVencidos jifProductosVencidos;
    public JIF_ConsultaFPS jifConsultaFPS;
    public JIF_BuscarComprobanteVenta jifBuscarComprobanteVenta;
    public JIF_FormaPago jifFormaPago;
    public JIF_SalidasXFecha jifSalidasXFecha;
    public JIF_BuscarComprobanteCompras jifBuscarComprobantesCompras;
    public JIF_NotaSalidaFar jifNotaSalidafar;
    public JIF_RegAreaConsumo jifRegAreaConsumo;
    public JIF_AdministrarServicio jifAdministrarServicio;

//    private JD_BackUpDB_Creator_Sirec bcpc = null;
//    private JD_BackUpDB_Restore_Sirec bcpr = null;
    public JF_Principal() throws Exception {
        //look 1
//        try {
//            UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
//        } catch (ParseException | UnsupportedLookAndFeelException e) {
//        }
        //look 2
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.updateComponentTreeUI(JF_Principal.this);

        initComponents();

        setExtendedState(DimenVentana);
        personalizaFondoEscritorio(JDPContenedor);

        //Seccion para la configuracion
        jdConf = new JD_Configuracion(this);
        //jdConf.setIconImage(icon.getImage());
        setConfig(jdConf.getConfig());
        if (!jdConf.isValidDBStructure()) {
//            bcpr = new JD_BackUpDB_Restore_Sirec(this);
//            bcpr.setIconImage(icon.getImage());
//            bcpr.validaRestauracionBackUp();
        }
        //fin configuracion

        jifAdminFormaFarmaceutica = new JIF_AdminFormaFarmaceutica(this);
        jifAdminLaboratorio = new JIF_AdminLaboratorio(this);
        jifAdminPresentacion = new JIF_AdminPresentacion(this);
        jifAdminProducto = new JIF_AdminProducto(this);
        jifAlmacen = new JIF_RegistroMovimiento(this);
        jifBusqProductos = new JIF_BusqProductos(this);
        jifBusqProveedor = new JIF_BusqProveedor(this);
        jifCantidadVenta = new JIF_CantidadVenta(this);
        jifCerrarCajaFar = new JIF_CerrarCajaFar(this);
        jifCompras = new JIF_Compras(this);
        jifConsultaFPS = new JIF_ConsultaFPS(this);
        jifKardexAlmacen = new JIF_KardexAlmacen(this);
        jifMigrar = new JIF_Migrar(this);
        jifNuevoProducto = new JIF_NuevoProducto(this);
        jifProductosXVencer = new JIF_ProductosXVencer(this);
        jifProductosVencidos = new JIF_ProductosVencidos(this);
        jifFormaFarmaceutica = new JIF_RegFormaFarmaceutica(this);
        jifRegLaboratorio = new JIF_RegLaboratorio(this);
        jifRegPresentacion = new JIF_RegPresentacion(this);
        jifRegVentas = new JIF_RegVentas(this);
        jifStockActual = new JIF_StockActual(this);
        jifComprasResumen = new JIF_ComprasResumen(this);
        jifRepVentas = new JIF_RepVentas(this);
        jifBuscarComprobanteVenta = new JIF_BuscarComprobanteVenta(this);
        jifBuscarComprobantesCompras = new JIF_BuscarComprobanteCompras(this);
        jifNotaSalidafar = new JIF_NotaSalidaFar(this);
        jifBuscarProcedimiento = new JIF_BuscarProcedimiento(this);

        //carga de iniciar sesion
        //carga de iniciar sesion
        jdIniciarSesion = new JD_IniciarSesion(this);
        if (isFirst) {
            jdIniciarSesion.setVisible(true);
            isFirst = false;
        }
        //fin de inicio de sesion

        jifBuscarServicio = new JIF_BuscarServicio(this);
        jifEmitirComprobante = new JIF_EmitirComprobante(this);
        jifBuscarPersonaNatural = new JIF_BuscarPersonaNatural(this);
        jifAdministrarPersonaJuridica = new JIF_AdministrarPersonaJuridica(this);
        jifAdministrarPersonanatural = new JIF_AdministrarPersonaNatural(this);
        jifFondoPrevision = new JIF_FondoPrevision(this);
        jifRegistrarUsuario = new JIF_RegistrarUsuario(this);
        jifAdministrarComprobante = new JIF_AdministrarComprobante(this);
        jifReporteCajaDiario = new JIF_Reporte_RecaudacionDiariaTipoDocFecha(this);
        jifReporteCajaMensual = new JIF_ReporteCajaMensual(this);
        jifCambiarContraseña = new JIF_CambiarContraseña(this);
        jifAdministrarMedico = new JIF_AdministrarMedico(this);
        jifBuscarMedico = new JIF_BuscarMedico(this);
        jifBuscarFondoPrevTemp = new JIF_BuscarFondoPrevisionTemp(this);
        jifBuscarHC = new JIF_BuscarHistoriaClinica(this);
        jifRegistrarDiagnostico = new JIF_RegistrarDiagnostico(this);
        jifAdminCie10 = new JIF_AdminCie10(this);
        jifReporteRecaudacionPorMedico = new JIF_Reporte_RecaudacionDiariaXMedico(this);
        jifReporteRecaudacionResumen = new JIF_Reporte_RecaudacionResumen(this);
        jifReporteRecaudacionXServicio = new JIF_Reporte_RecaudacionPorServicio(this);
        jdContactenos = new JD_Contactenos(this);
        jifOrdenLaboratorio = new JIF_OrdenLaboratorio(this);
        jifHistoriaClinica = new JIF_HistoriaClinica(this);
        jPanel_HistoriaClinica = new JPanel_HistoriaClinica(this);
        jifAbrirCaja = new JIF_AbrirCaja(this);
        jifCerrarCaja = new JIF_CerrarCaja(this);
        jifBuscarCajeros = new JIF_BuscarCajeros(this);
        jifAtencionFondoPrev = new JIF_AtencionFondoPrev(this);
        jifRepTurno = new JIF_RepTurno(this);
        jifHistoriaClinicaOcupacional = new JIF_HistoriaClinicaOcupacional(this);
        jifAdmision = new JIF_Admision(this);
        jpEvalOftalmologica = new JPanel_EvaluacionOftalmologica(this);
        jpEvalOsteomuscular = new JPanel_EvaluacionOsteomuscular(this);
        jpEvalAudiometrica = new JPanel_EvaluacionAudiometrica(this);
        jpCertificado = new JPanel_Certificado(this);
        jpFichaMedicoOcupacional = new JPanel_FichaMedicoOcupacional(this);
        jpEvalPsicologica = new JPanel_EvaluacionPsicologica(this);
        jpTriaje = new JPanel_Triaje(this);
        jifAdministrarSeguro = new JIF_AdministrarSeguro(this);
        jifCitaMedica = new JIF_CitaMedica(this);
        jifBuscarPersonaJuridica = new JIF_BuscarPersonaJuridica(this);
        jpAdmision = new JPanel_Admision(this);
        jifAddEspecialidad = new JIF_AddEspecialidad(this);
        jifRecaudaciobTipoPaciente = new JIF_RecaudacionTipoPaciente(this);
        jifPagoMedicos = new JIF_PagoMedicos(this);
        jpInformeMedicoOcupacional = new JPanel_InformeMedicoOcupacional(this);
        jifFormaPago = new JIF_FormaPago(this);
        jifRegAreaConsumo = new JIF_RegAreaConsumo(this);
        jifAdministrarServicio = new JIF_AdministrarServicio(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPContenedor = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        jmbPrincipal = new javax.swing.JMenuBar();
        jmInicio = new javax.swing.JMenu();
        jmiIniciarSesion = new javax.swing.JMenuItem();
        jmiCerrarSesion = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmCita = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jmAdmision = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jmAtencion = new javax.swing.JMenu();
        jmiEmitirComprobante = new javax.swing.JMenuItem();
        jmCaja = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jmHistoriaClinica = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jmReportes = new javax.swing.JMenu();
        jmi001 = new javax.swing.JMenuItem();
        jmi002 = new javax.swing.JMenuItem();
        jmi003 = new javax.swing.JMenuItem();
        jmi005 = new javax.swing.JMenuItem();
        jmi006 = new javax.swing.JMenuItem();
        jmi007 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmPersonal = new javax.swing.JMenu();
        MantenerProfesional = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jmMiCuenta = new javax.swing.JMenu();
        JMCambiarContrasenia = new javax.swing.JMenuItem();
        jmConfiguracion = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        Ayuda = new javax.swing.JMenuItem();
        JMAcercaDe = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISSA");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JDPContenedor.setBackground(java.awt.SystemColor.controlHighlight);

        jTextField1.setText("jTextField1");

        jmbPrincipal.setBackground(new java.awt.Color(20, 92, 168));

        jmInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Turn-Off.png"))); // NOI18N
        jmInicio.setText("INICIO");
        jmInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmInicio.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jmiIniciarSesion.setText("Iniciar Sesión");
        jmiIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIniciarSesionActionPerformed(evt);
            }
        });
        jmInicio.add(jmiIniciarSesion);

        jmiCerrarSesion.setText("Cerrar Sesión");
        jmiCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSesionActionPerformed(evt);
            }
        });
        jmInicio.add(jmiCerrarSesion);

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmInicio.add(jmiSalir);

        jmbPrincipal.add(jmInicio);

        jmCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/citas.png"))); // NOI18N
        jmCita.setText("CITA");
        jmCita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmCita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmCita.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jMenuItem17.setText("Citas");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jmCita.add(jMenuItem17);

        jmbPrincipal.add(jmCita);

        jmAdmision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/User-Files48.png"))); // NOI18N
        jmAdmision.setText("ADMISION");
        jmAdmision.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmAdmision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmAdmision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmAdmision.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jmAdmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdmisionActionPerformed(evt);
            }
        });

        jMenuItem15.setText("Admisión");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jmAdmision.add(jMenuItem15);

        jMenuItem16.setText("Persona Jurídica");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jmAdmision.add(jMenuItem16);

        jmbPrincipal.add(jmAdmision);

        jmAtencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/doctor-icon.png"))); // NOI18N
        jmAtencion.setText("ATENCION");
        jmAtencion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmAtencion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmAtencion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmAtencion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jmiEmitirComprobante.setText("Emitir Comprobante");
        jmiEmitirComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEmitirComprobanteActionPerformed(evt);
            }
        });
        jmAtencion.add(jmiEmitirComprobante);

        jmbPrincipal.add(jmAtencion);

        jmCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Cash-register-icon.png"))); // NOI18N
        jmCaja.setText("CAJA");
        jmCaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmCaja.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jmCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCajaActionPerformed(evt);
            }
        });

        jMenuItem12.setText("Aperturar Caja");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jmCaja.add(jMenuItem12);

        jMenuItem13.setText("Cerrar Caja");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jmCaja.add(jMenuItem13);

        jMenuItem1.setText("Pago Médico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmCaja.add(jMenuItem1);

        jMenu1.setText("Administrar Comprobante");

        jMenuItem9.setText("Admisión");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jmCaja.add(jMenu1);

        jmbPrincipal.add(jmCaja);

        jmHistoriaClinica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/history.png"))); // NOI18N
        jmHistoriaClinica.setText("HISTORIA CLINICA");
        jmHistoriaClinica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmHistoriaClinica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmHistoriaClinica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmHistoriaClinica.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jmHistoriaClinica.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jmHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmHistoriaClinicaActionPerformed(evt);
            }
        });

        jMenuItem11.setText("Historia Clínica");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jmHistoriaClinica.add(jMenuItem11);

        jmbPrincipal.add(jmHistoriaClinica);

        jmReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/custom-reports-icon.png"))); // NOI18N
        jmReportes.setText("REPORTES");
        jmReportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmReportes.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jmReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmReportesActionPerformed(evt);
            }
        });

        jmi001.setText("Reporte caja por turno");
        jmi001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi001ActionPerformed(evt);
            }
        });
        jmReportes.add(jmi001);

        jmi002.setText("Recaudación Mensual");
        jmi002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi002ActionPerformed(evt);
            }
        });
        jmReportes.add(jmi002);

        jmi003.setText("Recaudación por Fecha");
        jmi003.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi003ActionPerformed(evt);
            }
        });
        jmReportes.add(jmi003);

        jmi005.setText("Recaudación por Médico");
        jmi005.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi005ActionPerformed(evt);
            }
        });
        jmReportes.add(jmi005);

        jmi006.setText("Recaudación por Servicios");
        jmi006.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi006ActionPerformed(evt);
            }
        });
        jmReportes.add(jmi006);

        jmi007.setText("Recaudación X tipo de Paciente");
        jmi007.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi007ActionPerformed(evt);
            }
        });
        jmReportes.add(jmi007);
        jmReportes.add(jSeparator1);

        jmbPrincipal.add(jmReportes);

        jmPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/user-settings.png"))); // NOI18N
        jmPersonal.setText("PERSONAL");
        jmPersonal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmPersonal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmPersonal.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jmPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPersonalActionPerformed(evt);
            }
        });

        MantenerProfesional.setText("Usuarios del Sistema");
        MantenerProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenerProfesionalActionPerformed(evt);
            }
        });
        jmPersonal.add(MantenerProfesional);

        jMenuItem7.setText("Staff Profesional");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jmPersonal.add(jMenuItem7);

        jmbPrincipal.add(jmPersonal);

        jmMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/System-Security.png"))); // NOI18N
        jmMiCuenta.setText("MI CUENTA");
        jmMiCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmMiCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmMiCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmMiCuenta.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        JMCambiarContrasenia.setText("Cambiar Contaseña");
        JMCambiarContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMCambiarContraseniaActionPerformed(evt);
            }
        });
        jmMiCuenta.add(JMCambiarContrasenia);

        jmbPrincipal.add(jmMiCuenta);

        jmConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/application-settings.png"))); // NOI18N
        jmConfiguracion.setText("CONFIGURACIÓN");
        jmConfiguracion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmConfiguracion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jMenuItem2.setText("Servicio");
        jmConfiguracion.add(jMenuItem2);

        jMenuItem3.setText("Procedimiento");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmConfiguracion.add(jMenuItem3);

        jMenuItem5.setText("Especialidad");
        jmConfiguracion.add(jMenuItem5);

        jmbPrincipal.add(jmConfiguracion);

        jmAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/help.png"))); // NOI18N
        jmAyuda.setText("AYUDA");
        jmAyuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmAyuda.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Ayuda.setText("Manual de Usuario");
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });
        jmAyuda.add(Ayuda);

        JMAcercaDe.setText("Contactenos");
        JMAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMAcercaDeActionPerformed(evt);
            }
        });
        jmAyuda.add(JMAcercaDe);

        jMenuItem4.setText("Acerca de Lissa");
        jmAyuda.add(jMenuItem4);

        jmbPrincipal.add(jmAyuda);

        setJMenuBar(jmbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JDPContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void MantenerProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenerProfesionalActionPerformed
        insertarInternalFrames(jifRegistrarUsuario);
        jifRegistrarUsuario.inicializar();
    }//GEN-LAST:event_MantenerProfesionalActionPerformed

    private void jmAdmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdmisionActionPerformed
    }//GEN-LAST:event_jmAdmisionActionPerformed

    private void JMAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMAcercaDeActionPerformed
        jdContactenos.setVisible(true);
    }//GEN-LAST:event_JMAcercaDeActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        visorManual();
    }//GEN-LAST:event_AyudaActionPerformed

    private void jmiEmitirComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmitirComprobanteActionPerformed
        buscarCaja();
        if (oCaja != null) {
            insertarInternalFrames(jifEmitirComprobante);
            jifEmitirComprobante.inicializar();
            jifEmitirComprobante.cargarDatosUsuario(user);
            jifEmitirComprobante.EnviarDatosCaja(oCaja);
        } else {
            JOptionPane.showMessageDialog(null, "Aperture caja antes realizar cualquier operación", "Atención", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jmiEmitirComprobanteActionPerformed

    private void jmPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPersonalActionPerformed


    }//GEN-LAST:event_jmPersonalActionPerformed

    private void jmiCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSesionActionPerformed
        cerrarSesion();
    }//GEN-LAST:event_jmiCerrarSesionActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        //jPanel8.setBounds(jDesktopPane1.getWidth()-(jPanel8.getWidth()+10),jPanel3.getHeight()+10,jPanel8.getWidth(),jPanel8.getHeight());       
        //jPanel3.setBounds(jDesktopPane1.getWidth()-(jPanel3.getWidth()+10),5,jPanel3.getWidth(),jPanel3.getHeight());
    }//GEN-LAST:event_formComponentResized

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //Utilitarios.maximizar(this);
        //Utilitarios.centreaVentana(this);
    }//GEN-LAST:event_formComponentShown

    private void jmCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCajaActionPerformed

    }//GEN-LAST:event_jmCajaActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        insertarInternalFrames(jifAdministrarComprobante);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        salir();
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIniciarSesionActionPerformed
        jdIniciarSesion.setVisible(true);
    }//GEN-LAST:event_jmiIniciarSesionActionPerformed

    private void JMCambiarContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMCambiarContraseniaActionPerformed
        insertarInternalFrames(jifCambiarContraseña);
        jifCambiarContraseña.cargarDatosUser(user, oPersona);
    }//GEN-LAST:event_JMCambiarContraseniaActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        insertarInternalFrames(jifAdministrarMedico);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jmHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmHistoriaClinicaActionPerformed

    }//GEN-LAST:event_jmHistoriaClinicaActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        insertarInternalFrames(jifHistoriaClinica);
        jifHistoriaClinica.cargarDatosUser(user, oPersona, oRol);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        //BUSCAR  SI EXISTE ALGUNA CAJA ABIERTA
        /*Si existe alguna caja abierta para el usuario a asignar, entonces no debe permitir la apertura
         *Si el usuario aun no tiene  ninguna caja aperturada, proceder  con su aperetura*/
        insertarInternalFrames(jifAbrirCaja);
        jifAbrirCaja.inicializar();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        if (oRol.getDenominacion().trim().equals("FARMACIA")) {
            insertarInternalFrames(jifCerrarCajaFar);
            jifCerrarCajaFar.cargarDatosUser(user, oPersona, oRol);
            jifCerrarCajaFar.inicializar();
        } else {
            insertarInternalFrames(jifCerrarCaja);
            jifCerrarCaja.cargarDatosUser(user, oPersona, oRol);
            jifCerrarCaja.inicializar();
        }


    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jmi006ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi006ActionPerformed
        insertarInternalFrames(jifReporteRecaudacionXServicio);
        jifReporteRecaudacionXServicio.iniciar();
    }//GEN-LAST:event_jmi006ActionPerformed

    private void jmi002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi002ActionPerformed
        insertarInternalFrames(jifReporteCajaMensual);
    }//GEN-LAST:event_jmi002ActionPerformed

    private void jmi005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi005ActionPerformed
        insertarInternalFrames(jifReporteRecaudacionPorMedico);
        jifReporteRecaudacionPorMedico.iniciar();
    }//GEN-LAST:event_jmi005ActionPerformed

    private void jmi003ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi003ActionPerformed
        insertarInternalFrames(jifReporteCajaDiario);
        jifReporteCajaDiario.iniciar();
    }//GEN-LAST:event_jmi003ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        salir();
    }//GEN-LAST:event_formWindowClosing

    private void jmReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmReportesActionPerformed

    }//GEN-LAST:event_jmReportesActionPerformed

    private void jmi001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi001ActionPerformed
        insertarInternalFrames(jifRepTurno);
    }//GEN-LAST:event_jmi001ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        insertarInternalFrames(jifAdmision);
        jifAdmision.iniciar();
        jifAdmision.enviarDatos(user, oPersona, oRol);
        jifAdmision.enviarDatosCaja(buscarCaja());
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        insertarInternalFrames(jifAdministrarPersonaJuridica);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        insertarInternalFrames(jifCitaMedica);
        jifCitaMedica.cargarDatosUser(user, oPersona, oRol);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jmi007ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi007ActionPerformed
        insertarInternalFrames(jifRecaudaciobTipoPaciente);
    }//GEN-LAST:event_jmi007ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        insertarInternalFrames(jifPagoMedicos);
        jifPagoMedicos.inicializar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        insertarInternalFrames(jifAdministrarServicio);
        jifAdministrarServicio.iniciar();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    new JF_Principal().setVisible(true);

                } catch (Exception ex) {
                    Logger.getLogger(JF_Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ayuda;
    private javax.swing.JDesktopPane JDPContenedor;
    private javax.swing.JMenuItem JMAcercaDe;
    private javax.swing.JMenuItem JMCambiarContrasenia;
    private javax.swing.JMenuItem MantenerProfesional;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu jmAdmision;
    private javax.swing.JMenu jmAtencion;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenu jmCaja;
    private javax.swing.JMenu jmCita;
    private javax.swing.JMenu jmConfiguracion;
    private javax.swing.JMenu jmHistoriaClinica;
    private javax.swing.JMenu jmInicio;
    private javax.swing.JMenu jmMiCuenta;
    private javax.swing.JMenu jmPersonal;
    private javax.swing.JMenu jmReportes;
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JMenuItem jmi001;
    private javax.swing.JMenuItem jmi002;
    private javax.swing.JMenuItem jmi003;
    private javax.swing.JMenuItem jmi005;
    private javax.swing.JMenuItem jmi006;
    private javax.swing.JMenuItem jmi007;
    private javax.swing.JMenuItem jmiCerrarSesion;
    private javax.swing.JMenuItem jmiEmitirComprobante;
    private javax.swing.JMenuItem jmiIniciarSesion;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables

    private void ponerFondo(JDesktopPane JDPContenedor) {
        BufferedImage imagen = null;
        URL path = getClass().getClassLoader().getResource("lissa/imagenes/backgroundFinal1.jpg");

        try {
            imagen = ImageIO.read(path);
            JDPContenedor.setBorder(new Background(imagen));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertarInternalFrames(JInternalFrame jif) {
        try {
            Utilitarios.insertaInternalFrame(jif, JDPContenedor);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(JF_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void personalizaFondoEscritorio(JDesktopPane dp) {
        BufferedImage imagen = null;
        URL path = getClass().getResource("/lissa/resources/FondoDesktop.png");
        try {
            imagen = ImageIO.read(path);
            dp.setBorder(new DesktopPaneBackground(imagen));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void visorManual() {
        JOptionPane.showMessageDialog(null, "El Manual  de usuario no esta disponible", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }

    private void salir() {
        int op = JOptionPane.showConfirmDialog(this, "Esta seguro que desea salir del sistema.", "Atención", JOptionPane.YES_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            cerrarSesion();
            System.exit(0);
        }
    }

    public void loguinStart() {
        jdIniciarSesion.validaConfFile();
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Persona getoPersona() {
        return oPersona;
    }

    public void setoPersona(Persona oPersona) {
        this.oPersona = oPersona;
    }

    public FileConf getConfig() {
        return config;
    }

    public void setConfig(FileConf config) {
        this.config = config;
    }

    private long numCajasAbi() {
        ocajaBl = new CajaBl();
        return ocajaBl.numCajasAbi();
    }

    public Rol getoRol() {
        return oRol;
    }

    public void setoRol(Rol oRol) {
        this.oRol = oRol;
    }

    private void generarReporte() {
        Reportes rep = new Reportes(this);
        rep.reporteStockTotal();
    }

    private void reportesXResponsabilidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class DesktopPaneBackground implements Border {

        private final BufferedImage image;

        public DesktopPaneBackground(BufferedImage image) {
            this.image = image;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(0, 0, 0, 0);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawImage(image, 0, 0, c.getWidth(), c.getHeight(), null);
        }
    }

    public void configuraInterfazAdministrador() {
        jmbPrincipal.removeAll();
        habilitarLoguin();
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(jmCita);
        jmbPrincipal.add(jmAdmision);
        jmbPrincipal.add(jmAtencion);
        //menu caja
        jmbPrincipal.add(jmCaja);
        jmCaja.removeAll();
        jmCaja.add(jMenuItem12);
        jmCaja.add(jMenuItem13);
        jmCaja.add(jMenuItem1);
        jmCaja.add(jMenu1);
        //
        jmbPrincipal.add(jmHistoriaClinica);
        //Reportes
        jmbPrincipal.add(jmReportes);
        jmReportes.removeAll();
        jmReportes.add(jmi001);
        jmReportes.add(jmi002);
        jmReportes.add(jmi003);
        jmReportes.add(jmi005);
        //jmReportes.add(jmi006);
        //jmReportes.add(jmi007);
        //fin reportes
        jmbPrincipal.add(jmPersonal);
        jmbPrincipal.add(jmMiCuenta);
        //Menu configuraciones
        jmbPrincipal.add(jmConfiguracion);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.add(jmAyuda);        

        jmbPrincipal.updateUI();
    }

    public void configuraInterfazAdmision() {
        jmbPrincipal.removeAll();
        habilitarLoguin();
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(jmCita);
        jmbPrincipal.add(jmAdmision);
        //Definir las opciones del menu atencion
        jmbPrincipal.add(jmAtencion);
        jmAtencion.removeAll();
        jmAtencion.add(jmiEmitirComprobante);
        //
        jmbPrincipal.add(jmCaja);
        jmCaja.removeAll();
        jmCaja.add(jMenuItem12);
        jmCaja.add(jMenuItem13);
        jmCaja.add(jMenuItem1);
        jmbPrincipal.add(jmMiCuenta);
        //Definir sus opciones del menu
        jmbPrincipal.add(jmReportes);
        jmReportes.removeAll();
        jmReportes.add(jmi003);
        jmReportes.add(jmi005);
        //jmReportes.add(jmi006);
        //jmReportes.add(jmi007);
        //
        jmbPrincipal.add(jmPersonal);
        jmbPrincipal.add(jmMiCuenta);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.add(jmAyuda);

        jmbPrincipal.updateUI();
    }

    public void configuraInterfazJefeCaja() {
        jmbPrincipal.removeAll();
        habilitarLoguin();
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(jmAtencion);
        //menu caja
        jmbPrincipal.add(jmCaja);
        jmCaja.removeAll();
        jmCaja.add(jMenuItem12);
        jmCaja.add(jMenuItem13);
        jmCaja.add(jMenuItem1);
        jmCaja.add(jMenu1);
        jmbPrincipal.add(jmMiCuenta);
        jmbPrincipal.add(jmReportes);
        //Definir sus opciones del menu
        jmReportes.removeAll();
        jmReportes.add(jmi003);
        jmReportes.add(jmi005);
        //jmReportes.add(jmi006);
        //jmReportes.add(jmi007);
        //
        jmbPrincipal.add(jmPersonal);
        jmbPrincipal.add(jmMiCuenta);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.add(jmAyuda);

        jmbPrincipal.updateUI();
    }

    public void configuraInterfazEnfermeria() {
        jmbPrincipal.removeAll();
        habilitarLoguin();
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(jmHistoriaClinica);
        jmHistoriaClinica.removeAll();
        jmHistoriaClinica.add(jMenuItem11);
        jmbPrincipal.add(jmReportes);
        jmReportes.removeAll();
        jmbPrincipal.add(jmMiCuenta);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.add(jmAyuda);

        jmbPrincipal.updateUI();
    }

    public void configuraInterfazContabilidad() {
        jmbPrincipal.removeAll();
        habilitarLoguin();
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(jmReportes);
        jmbPrincipal.add(jmMiCuenta);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.add(jmAyuda);

        jmbPrincipal.updateUI();
    }

    public void configuraInterfazGerencia() {
        jmbPrincipal.removeAll();
        habilitarLoguin();
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(jmReportes);
        jmbPrincipal.add(jmMiCuenta);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.add(jmAyuda);

        jmbPrincipal.updateUI();
    }

    public void configuraInterfazFarmacia() {
        jmbPrincipal.removeAll();
        habilitarLoguin();
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(jmCaja);
        jmCaja.removeAll();
        jmCaja.add(jMenuItem12);
        jmCaja.add(jMenuItem13);
        jmbPrincipal.add(jmReportes);
        jmReportes.removeAll();
        jmbPrincipal.add(jmMiCuenta);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.add(jmAyuda);

        
        jmbPrincipal.updateUI();
    }

    public void configuraInterfazSistemas() {
        jmbPrincipal.removeAll();
        habilitarLoguin();
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(jmPersonal);
        jmbPrincipal.add(jmMiCuenta);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.add(jmAyuda);

        jmbPrincipal.updateUI();
    }

    public void configuraInterfazOcupacional() {
        jmbPrincipal.removeAll();
        habilitarLoguin();
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(jmAdmision);        
        jmbPrincipal.add(jmHistoriaClinica);
        jmHistoriaClinica.removeAll();
        jmbPrincipal.add(jmMiCuenta);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.add(jmAyuda);

        jmbPrincipal.updateUI();
    }

    private void cerrarSesion() {
        this.setUser(null);
        jmbPrincipal.removeAll();
        jmInicio.removeAll();
        jmInicio.add(jmiIniciarSesion);
        //jmInicio.add(jmiCerrarSesion);
        jmInicio.add(jmiSalir);
        jmbPrincipal.add(jmInicio);
        jmbPrincipal.add(Box.createHorizontalGlue());
        jmbPrincipal.updateUI();
        JDPContenedor.removeAll();

    }

    public void desHabilitarLoguin() {
        jmInicio.removeAll();
        jmInicio.add(jmiIniciarSesion);
        jmInicio.add(jmiSalir);
    }

    public void habilitarLoguin() {
        jmInicio.removeAll();
        jmInicio.add(jmiCerrarSesion);
        jmInicio.add(jmiSalir);
    }

    public Caja buscarCaja() {
        oCaja = new Caja();
        ocajaBl = new CajaBl();
        oCaja = ocajaBl.buscarPorIdusuario(user);
        return oCaja;
    }
}
