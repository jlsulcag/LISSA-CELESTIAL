package lissa.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lissa.be.Persona;
import lissa.be.Rol;
import lissa.be.Usuario;
import lissa.be.UsuarioRol;
import lissa.bl.PersonaBl;
import lissa.bl.RolBl;
import lissa.bl.UsuarioBl;
import lissa.bl.UsuarioRolBl;
import lissa.table.ModeloPersonal;
import lissa.table.TModeloRol;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;
import org.apache.commons.codec.digest.DigestUtils;
import org.rx.cr.ds.DSConeccion;
import static org.rx.cr.util.Utilitarios.*;

public class JIF_RegistrarUsuario extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private TModeloRol tabMD = null;
    private TModeloRol tabMA = null;

    private DSConeccion ds = null;

    private Persona oPersona = null;
    private PersonaBl oBLPersona = null;
    private Usuario oUsuario = null;
    private Usuario oUsuarioAct = null;
    private UsuarioBl oUsuarioBl = null;
    private UsuarioBl oUsuarioBlAct = null;
    private UsuarioRol oUsuarioRol = null;
    private UsuarioRolBl oUsuarioRolBl = null;
    private Rol oRol = null;
    private RolBl oBlRol = null;
    private ModeloPersonal oModeloPersonal = null;
    private Usuario beanTabla = null;
    private int banBoton = 0;
    private static final int RESETPASSWORD_SUCCESS = 1;
    private static final int RESETPASSWORD_FAIL = 2;

    public JIF_RegistrarUsuario(JF_Principal root) throws Exception {
        initComponents();
        //adaptarMovimiento(this);
        this.root = root;
        tabMD = new TModeloRol();
        tabMA = new TModeloRol();
        jTabMD.setModel(tabMD);
        jTabMA.setModel(tabMA);
        oModeloPersonal = new ModeloPersonal();
        tblResultados.setModel(oModeloPersonal);
    }

    //<editor-fold defaultstate="collapsed" desc="Codigo Auto Generado">
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txfApellidoPaterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfApellidoMaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txfDni = new javax.swing.JTextField();
        btnBuscarPersona = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txf_nombre_usuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txf_clave_usuario = new javax.swing.JPasswordField();
        rbtnActivo = new javax.swing.JRadioButton();
        rbtnDesactivado = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txfBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabMD = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabMA = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Administración de usuarios");
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
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombres :");

        txfNombres.setEnabled(false);
        txfNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombresKeyReleased(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellido Paterno :");

        txfApellidoPaterno.setEnabled(false);
        txfApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfApellidoPaternoKeyReleased(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido Materno :");

        txfApellidoMaterno.setEnabled(false);
        txfApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfApellidoMaternoKeyReleased(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI :");

        txfDni.setEnabled(false);
        txfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfDniKeyReleased(evt);
            }
        });

        btnBuscarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        btnBuscarPersona.setToolTipText("Buscar Persona");
        btnBuscarPersona.setEnabled(false);
        btnBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(txfApellidoMaterno)
                    .addComponent(txfNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPersona))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre Usuario :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Clave Usuario :");

        txf_clave_usuario.setEnabled(false);

        rbtnActivo.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rbtnActivo);
        rbtnActivo.setSelected(true);
        rbtnActivo.setText("Activo");
        rbtnActivo.setEnabled(false);

        rbtnDesactivado.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rbtnDesactivado);
        rbtnDesactivado.setText("Desactivado");
        rbtnDesactivado.setEnabled(false);

        jLabel10.setText("Estado : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbtnActivo)
                        .addGap(48, 48, 48)
                        .addComponent(rbtnDesactivado)
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addComponent(txf_clave_usuario)
                    .addComponent(txf_nombre_usuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txf_nombre_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txf_clave_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnActivo)
                    .addComponent(rbtnDesactivado)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/cancel.png"))); // NOI18N
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        btnGuardar.setEnabled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios del sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
        jScrollPane2.setViewportView(tblResultados);

        jLabel5.setText("Apellidos y Nombres / Usuario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txfBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/edit.png"))); // NOI18N
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/new.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Lock-Unlock-icon.png"))); // NOI18N
        jButton6.setToolTipText("Resetear Contraseña");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modulos disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTabMD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Modulo"
            }
        ));
        jTabMD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTabMD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabMDMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTabMD);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modulos asignados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTabMA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Modulo"
            }
        ));
        jTabMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabMAMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTabMA);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jButton2.setText(">");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton2)
                        .addGap(2, 2, 2)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Roles", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(5, 5, 5))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTabMD.getRowSelectionAllowed() && jTabMD.getSelectedRow() != -1) {
            registrarModulo();
        } else {
            Mensajes.tblSelected();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTabMDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMDMouseReleased
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jTabMDMouseReleased

    private void jTabMAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMAMouseReleased
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jTabMAMouseReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTabMA.getSelectedRow() >= 0) {
            oUsuarioRolBl = new UsuarioRolBl();
            //Buscar Usuario Rol  por idUsuario y IdRol
            oUsuarioRol = oUsuarioRolBl.buscar(beanTabla.getIdUsuario(), tabMA.get(jTabMA.getSelectedRow()).getIdrol());
            //Eliminar de la base de datos  y la  vista
            if (oUsuarioRol != null) {
                oUsuarioRolBl.eliminar(oUsuarioRol);
                tabMA.remove(jTabMA.getSelectedRow());
            }
            personalizarTablas();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (banBoton == 1) {
            if (isValidoDatos()) {
                try {
                    registrarUsuario();
                    resetComponent();
                } catch (Exception ex) {
                    Logger.getLogger(JIF_RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese todos los datos", "Atención", JOptionPane.INFORMATION_MESSAGE);
                paintComponent();
            }
        } else if (banBoton == 2) {
            if (isValidoDatos()) {
                try {
                    actualizarCuentaUsuario();
                    oModeloPersonal.clear();
                    resetComponent();
                } catch (Exception ex) {
                    Logger.getLogger(JIF_RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese todos los datos", "Atención", JOptionPane.INFORMATION_MESSAGE);
                paintComponent();
            }
        }
        personalizarTablas();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        resetComponent();
        activarBotones(true, false, false, true);
        oPersona = null;
        oUsuario = null;
        oUsuarioRol = null;
        estadoTextFields(false);
        personalizarTablas();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        personalizarTablas();
    }//GEN-LAST:event_formInternalFrameOpened

    private void txfDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDniKeyReleased
        Utilitarios.validaCaracterNumerico(evt, txfDni);
        Utilitarios.validaNumeroCaracteres(txfDni, 8);
        txfDni.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_txfDniKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPersonal();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblResultadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseReleased
        if (tblResultados.getRowSelectionAllowed()) {
            try {
                obtenerDatosTabla();
                estadoTextFields(false);
                activarBotones(true, true, false, true);
            } catch (SQLException ex) {
                Logger.getLogger(JIF_RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        personalizarTablas();
    }//GEN-LAST:event_tblResultadosMouseReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        configuraNuevo();
        defaultPassword();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblResultados.getSelectedRow() != -1) {
            configuraActualizar();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un personal", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txfNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombresKeyReleased

    }//GEN-LAST:event_txfNombresKeyReleased

    private void txfApellidoPaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidoPaternoKeyReleased

    }//GEN-LAST:event_txfApellidoPaternoKeyReleased

    private void txfApellidoMaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidoMaternoKeyReleased

    }//GEN-LAST:event_txfApellidoMaternoKeyReleased

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        resetComponent();
        activarBotones(true, false, false, true);
        personalizarTablas();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPersonaActionPerformed
        buscarPersona();
    }//GEN-LAST:event_btnBuscarPersonaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (tblResultados.getRowSelectionAllowed() && beanTabla != null) {
            if (resetPassword() == 1) {
                Mensajes.msjResetPassword();
            } else {
                Mensajes.msjActErronea();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cargue los datos de un Usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBusquedaActionPerformed
        btnBuscar.doClick();
    }//GEN-LAST:event_txfBusquedaActionPerformed
    //<editor-fold defaultstate="collapsed" desc="Variables Autogeneradas">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarPersona;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabMA;
    private javax.swing.JTable jTabMD;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbtnActivo;
    private javax.swing.JRadioButton rbtnDesactivado;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txfApellidoMaterno;
    private javax.swing.JTextField txfApellidoPaterno;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfDni;
    private javax.swing.JTextField txfNombres;
    private javax.swing.JPasswordField txf_clave_usuario;
    private javax.swing.JTextField txf_nombre_usuario;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    //</editor-fold>

    private void personalizarTablas() {
        Utilitarios.formateaColumna(0, jTabMD, 50);
        Utilitarios.formateaColumna(0, jTabMA, 50);
        Utilitarios.formateaColumna(0, tblResultados, 50);
        Utilitarios.formateaColumna(0, tblResultados, 100);

    }

    private void cargar_lista_modulos() throws Exception {
        oBlRol = new RolBl();
        tabMD.addAll(oBlRol.listar());
        //personalizarTablas();
    }

    private void registrarUsuario() throws Exception {
        if (oPersona != null) {
            //Validar si la persona ya cuenta con una cuenta de usuario en el sistema
            registrarCuentaUsuario(oPersona);
        }
    }

    private void registrarCuentaUsuario(Persona per) throws Exception {
        oUsuario = new Usuario();
        oUsuarioBl = new UsuarioBl();

        oUsuario.setNombre(txf_nombre_usuario.getText().trim());
        oUsuario.setContrasenia(DigestUtils.md5Hex("LISSA"));
        oUsuario.setPersona(per);
        if (rbtnActivo.isSelected()) {
            oUsuario.setEstado(Boolean.TRUE);
        } else {
            oUsuario.setEstado(Boolean.FALSE);
        }

        oUsuario = oUsuarioBl.registrar(oUsuario);
        cargarDatosUsuario(oUsuario);
        //registrarRolesAsignadosUsuario(oUsuario.getIdUsuario());

    }

    private void registrarRolesAsignadosUsuario(int id) throws Exception {
        oUsuarioRol = new UsuarioRol();
        oUsuarioRolBl = new UsuarioRolBl();
        ArrayList<String> list = new ArrayList<String>();
        int resp = -1;
        if (tabMA.size() > 0) {
            for (int i = 0; i < tabMA.getRowCount(); i++) {
                for (int j = 0; j < tabMA.getColumnCount(); j++) {
                    list.add(tabMA.getValueAt(i, j).toString());
                    //oUsuarioRol.setIdRol(Integer.parseInt(tabMA.getValueAt(i, j).toString()));
                    oUsuarioRol.setRol(new Rol(Integer.parseInt(tabMA.getValueAt(i, j).toString())));
                    //oUsuarioRol.setIdUsuario(id);
                    oUsuarioRol.setUsuario(new Usuario(id));
                    oUsuarioRol.setEstado(Boolean.TRUE);
                    resp = oUsuarioRolBl.registrar(oUsuarioRol);
                    j = tabMA.getColumnCount();
                }
            }
        }
        if (resp > 0) {
            JOptionPane.showMessageDialog(null, "Registro correcto", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error de registro", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
    }

//    private void actualizar() throws Exception {
//        oPersona = new Persona();
//        oBLPersona = new PersonaBl();
//
//        oPersona.setIdPersona(beanTabla.getPersona().getIdPersona());
//        oPersona.setNombre(txfNombres.getText().trim().toUpperCase());
//        oPersona.setApellidoPaterno(txfApellidoPaterno.getText().trim().toUpperCase());
//        oPersona.setApellidoMaterno(txfApellidoMaterno.getText().trim().toUpperCase());
//        oPersona.setNumeroDocumento(txfDni.getText().trim().toUpperCase());
//        oPersona.setEstado(beanTabla.getPersona().getEstado());
//        oPersona.setFechaReg(beanTabla.getPersona().getFechaReg());
//        oBLPersona.actualizar(oPersona);
//        if (oPersona.getIdPersona() > 0) {
//            actualizarCuentaUsuario(oPersona.getIdPersona());
//        }
//
//    }
    private void actualizarCuentaUsuario() throws Exception {
        oUsuarioAct = new Usuario();
        oUsuarioBlAct = new UsuarioBl();

        oUsuarioAct.setIdUsuario(beanTabla.getIdUsuario());
        oUsuarioAct.setPersona(beanTabla.getPersona());
        oUsuarioAct.setNombre(beanTabla.getNombre());
        oUsuarioAct.setContrasenia(beanTabla.getContrasenia());
        oUsuarioAct.setFechaReg(beanTabla.getFechaReg());
        if (rbtnActivo.isSelected()) {
            oUsuarioAct.setEstado(Boolean.TRUE);
        } else {
            oUsuarioAct.setEstado(Boolean.FALSE);
        }

        oUsuarioBl.actualizar(oUsuarioAct);
//        actualizarRolesAsignadosUsuario(oUsuario.getIdUsuario());

    }

//    private void actualizarRolesAsignadosUsuario(int id) throws Exception {
//        oUsuarioRol = new UsuarioRol();
//        oUsuarioRolBl = new UsuarioRolBl();
//        ArrayList<String> list = new ArrayList<String>();
//        int resp = -1;
//        if (tabMA.size() > 0) {
//            for (int i = 0; i < tabMA.getRowCount(); i++) {
//                for (int j = 0; j < tabMA.getColumnCount(); j++) {
//                    list.add(tabMA.getValueAt(i, j).toString());
//                    //oUsuarioRol.setIdRol(Integer.parseInt(tabMA.getValueAt(i, j).toString()));
//                    oUsuarioRol.setRoles(new Roles(Integer.parseInt(tabMA.getValueAt(i, j).toString())));
//                    //oUsuarioRol.setIdUsuario(id);
//                    oUsuarioRol.setUsuario(new Usuario(id));
//                    oUsuarioRol.setEstado(Boolean.TRUE);
//                    resp = oUsuarioRolBl.registrar(oUsuarioRol);
//                    j = tabMA.getColumnCount();
//                }
//            }
//        }
//        if (resp > 0) {
//            JOptionPane.showMessageDialog(null, "Registro correcto", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
//        } else {
//            JOptionPane.showMessageDialog(null, "Error de registro", "ATENCION", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    private boolean isValidoDatos() {
        return (!this.txfNombres.getText().trim().equals("")
                && !this.txfApellidoPaterno.getText().trim().equals("")
                && !this.txfApellidoMaterno.getText().trim().equals("")
                && !this.txfDni.getText().trim().equals("")
                && !this.txf_nombre_usuario.getText().trim().equals("")
                && !this.txf_clave_usuario.getText().trim().equals(""));
    }

    public void paintComponent() {
        Utilitarios.paintTxfVacio(txfNombres);
        Utilitarios.paintTxfVacio(txfApellidoPaterno);
        Utilitarios.paintTxfVacio(txfApellidoMaterno);
        Utilitarios.paintTxfVacio(txfDni);
        Utilitarios.paintTxfVacio(txf_nombre_usuario);
        Utilitarios.paintTxfVacio(txf_clave_usuario);
    }

    public void resetPaintComponent() {
        Utilitarios.resetPaintTxf(txfNombres);
        Utilitarios.resetPaintTxf(txfApellidoPaterno);
        Utilitarios.resetPaintTxf(txfApellidoMaterno);
        Utilitarios.resetPaintTxf(txfDni);
        Utilitarios.resetPaintTxf(txf_nombre_usuario);
        Utilitarios.resetPaintTxf(txf_clave_usuario);
    }

    private void resetComponent() {
        this.txfNombres.setText("");
        this.txfApellidoPaterno.setText("");
        this.txfApellidoMaterno.setText("");
        this.txfDni.setText("");
        this.txf_nombre_usuario.setText("");
        this.txf_clave_usuario.setText("");
        this.tabMA.clear();
        buttonGroup1.clearSelection();
        personalizarTablas();
    }

    private void buscarPersonal() {
        oUsuario = new Usuario();
        oUsuarioBl = new UsuarioBl();
        String ref = txfBusqueda.getText().trim().toUpperCase();
        oModeloPersonal.addAll(oUsuarioBl.buscar(ref));
        personalizarTablas();
        txfBusqueda.setText("");
        estadoTextFields(false);
    }

    private void estadoTextFields(Boolean e) {
        this.txfNombres.setEnabled(e);
        this.txfApellidoPaterno.setEnabled(e);
        this.txfApellidoMaterno.setEnabled(e);
        this.txfDni.setEnabled(e);
    }

    private void activarBotones(boolean nuevo, boolean modificar, boolean guardar, boolean cancelar) {
        btnNuevo.setEnabled(nuevo);
        btnEditar.setEnabled(modificar);
        btnGuardar.setEnabled(guardar);
        btnCancelar.setEnabled(cancelar);
    }

    private void obtenerDatosTabla() throws SQLException {
        resetComponent();
        beanTabla = (Usuario) oModeloPersonal.get(tblResultados.getSelectedRow());
        this.txfNombres.setText(beanTabla.getPersona().getNombre());
        this.txfApellidoPaterno.setText(beanTabla.getPersona().getApellidoPaterno());
        this.txfApellidoMaterno.setText(beanTabla.getPersona().getApellidoMaterno());
        this.txfDni.setText(beanTabla.getPersona().getNumeroDocumento());
        this.txf_nombre_usuario.setText(beanTabla.getNombre());
        this.txf_clave_usuario.setText(beanTabla.getContrasenia());
        if (beanTabla.getEstado()) {
            this.rbtnActivo.setSelected(true);
            this.rbtnDesactivado.setSelected(false);
        } else {
            this.rbtnActivo.setSelected(false);
            this.rbtnDesactivado.setSelected(true);
        }
        //listar modulos
        listarModulosAsignados();

    }

    private void configuraNuevo() {
        banBoton = 1;
        btnBuscarPersona.setEnabled(true);
        tblResultados.setEnabled(true);
        oModeloPersonal.clear();
        this.tabMA.clear();
        resetComponent();
        activarBotones(false, false, true, true);
        jTabMA.setEnabled(true);
        jTabMD.setEnabled(true);
        rbtnActivo.setEnabled(true);
        rbtnDesactivado.setEnabled(true);
        personalizarTablas();
    }

    private void configuraActualizar() {
        banBoton = 2;
        rbtnActivo.setEnabled(true);
        rbtnDesactivado.setEnabled(true);
        activarBotones(true, false, true, true);
    }
    /*
     private void generarNombreUser() {
     if (txfNombres.getText().length() > 0) {
     User = (User.concat(txfNombres.getText().trim().toUpperCase())).substring(0, 1);
     txf_nombre_usuario.setText(User);
     } else {
     User = "";
     txf_nombre_usuario.setText("");
     }
     //algoritmo para unir  apellidos compuestos por mas de dos letras
     String apePaterno = txfApellidoPaterno.getText().toUpperCase().trim();
     String[] splitArr = apePaterno.split(" ");
     for (int i = 0; i < splitArr.length; i++) {
     User2 = User2.concat(splitArr[i]);
     }
     //fin de algoritmo
     if (txfApellidoMaterno.getText().length() > 0) {
     User3 = (txfApellidoMaterno.getText().trim().toUpperCase()).substring(0, 1);
     txf_nombre_usuario.setText(User.concat(User2).concat(User3));
     } else {
     User3 = "";
     txf_nombre_usuario.setText(User.concat(User2));
     }
     }
     */

    private void buscarPersona() {
        root.jifAdministrarPersonanatural.setInvocador(JIF_AdministrarPersonaNatural.JIF_USUARIO);
        root.insertarInternalFrames(root.jifAdministrarPersonanatural);
    }

    void cargarDatosPersona(Persona beanTabla) {
        oPersona = beanTabla;
        txfNombres.setText(oPersona.getNombre());
        txfApellidoPaterno.setText(oPersona.getApellidoPaterno());
        txfApellidoMaterno.setText(oPersona.getApellidoMaterno());
        txfDni.setText(oPersona.getNumeroDocumento());
    }

    private int resetPassword() {
        oUsuarioAct = new Usuario();
        oUsuarioBlAct = new UsuarioBl();
        oUsuarioAct.setIdUsuario(beanTabla.getIdUsuario());
        oUsuarioAct.setPersona(beanTabla.getPersona());
        oUsuarioAct.setNombre(beanTabla.getNombre());
        oUsuarioAct.setContrasenia(DigestUtils.md5Hex("LISSA"));
        oUsuarioAct.setFechaReg(beanTabla.getFechaReg());
        if (rbtnActivo.isSelected()) {
            oUsuarioAct.setEstado(Boolean.TRUE);
        } else {
            oUsuarioAct.setEstado(Boolean.FALSE);
        }
        return oUsuarioBl.actualizar(oUsuarioAct);
    }

    public void inicializar() {
        try {
            cargar_lista_modulos();
            personalizarTablas();
        } catch (Exception ex) {
            Logger.getLogger(JIF_RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void defaultPassword() {
        txf_clave_usuario.setText("LISSA");
    }

    private void cargarDatosUsuario(Usuario oUsuario) {
        oModeloPersonal.add(oUsuario);
    }

    private void registrarModulo() {
        oUsuarioRol = new UsuarioRol();
        oUsuarioRolBl = new UsuarioRolBl();
        oUsuarioRol.setUsuario(beanTabla);
        oUsuarioRol.setRol(tabMD.get(jTabMD.getSelectedRow()));
        oUsuarioRol.setFechaReg(new Date());
        oUsuarioRol.setDescripcion("");
        oUsuarioRol.setEstado(Boolean.TRUE);

        oUsuarioRolBl.registrar(oUsuarioRol);
        //Listar  todos los modulos asignados al usuario
        listarModulosAsignados();
        personalizarTablas();
    }

    private void listarModulos() {
        tabMA.clear();
        beanTabla = oModeloPersonal.get(tblResultados.getSelectedRow());
        for (UsuarioRol obj : beanTabla.getUsuarioRols()) {
            //obtener roles de los usuarios por idRol
            oRol = new Rol();
            oBlRol = new RolBl();
            oRol = oBlRol.buscarId(obj.getRol().getIdrol());
            tabMA.add(oRol);
        }
    }

    //Lista los modulos asignados por id usuario

    private void listarModulosAsignados() {
        tabMA.clear();
        List<Rol> listRoles = new ArrayList<>();
        int idUsuario = beanTabla.getIdUsuario();
        listRoles = oBlRol.listarxUsuario(idUsuario);
        if (!listRoles.isEmpty()) {
            for (Rol oRol : listRoles) {
                tabMA.add(oRol);
            }
        }
    }
}
