package lissa.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import lissa.be.Especialidad;
import lissa.be.Medico;
import lissa.be.MedicoEspecialidad;
import lissa.be.Persona;
import lissa.be.TipoMedico;
import lissa.bl.PersonaBl;
import lissa.bl.EspecialidadBl;
import lissa.bl.MedicoBl;
import lissa.bl.MedicoEspecialidadBl;
import lissa.bl.TipoMedicoBl;
import lissa.table.ModeloEspecialidad;
import lissa.table.ModeloMedico;
import lissa.table.ModeloPersonas;
import lissa.util.Utilitarios;

public class JIF_AdministrarMedico extends javax.swing.JInternalFrame {

    private JF_Principal root = null;
    private int banBoton = 0;
    private Persona oPersona = null;
    private Medico oMedico = null;
    private PersonaBl oBLPersona = null;
    private MedicoBl oBlMedico = null;
    private TipoMedicoBl oBlTipoMedico = null;
    private List<TipoMedico> listTipoMedico = null;
    private Especialidad oEspecialidad = null;
    private EspecialidadBl oBlEspecialidad = null;
    private List<Especialidad> listEspecialidad = null;
    private ModeloEspecialidad oModeloEspecialidad = null;
    private MedicoEspecialidad oMedicoEspecialidad = null;
    private MedicoEspecialidadBl oBlMedicoEspecialidad = null;
    private ModeloMedico oModeloMedico = null;
    private Persona beanTabla = null;
    private Medico beanTablaM = null;
    private TipoMedico beanTablaTipoMedico = null;
    private TipoMedico oTipoMedico = null;

    public JIF_AdministrarMedico(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloMedico = new ModeloMedico();
        tblResultados.setModel(oModeloMedico);
        oModeloEspecialidad = new ModeloEspecialidad();
        tblEspecialidad.setModel(oModeloEspecialidad);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txfBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txfDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txfTelefono1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfNombres = new javax.swing.JTextField();
        txfApePaterno = new javax.swing.JTextField();
        txfApeMaterno = new javax.swing.JTextField();
        txfnNumDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txfCodColegiatura = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbxTipoMedico = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        rbtnActivo = new javax.swing.JRadioButton();
        rbtnDesactivado = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbxEspecialidad = new javax.swing.JComboBox();
        btnAgregarEspecialidad = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEspecialidad = new javax.swing.JTable();
        btnEliminarEspecialidad = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Administrar personal médico");
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

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados de búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txfDireccion.setEnabled(false);

        jLabel5.setText("Fecha de  Nacimiento :");

        txfTelefono1.setEnabled(false);

        jLabel7.setText("Nº DNI :");

        jLabel8.setText("Dirección :");

        jdcFechaNacimiento.setDateFormatString("dd/MM/yyyy");
        jdcFechaNacimiento.setEnabled(false);

        jLabel9.setText("Telefono :");

        jLabel2.setText("Apellido Paterno :");

        jLabel3.setText("Apellido Materno :");

        txfNombres.setEnabled(false);
        txfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombresActionPerformed(evt);
            }
        });

        txfApePaterno.setEnabled(false);

        txfApeMaterno.setEnabled(false);

        txfnNumDni.setEnabled(false);
        txfnNumDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfnNumDniKeyReleased(evt);
            }
        });

        jLabel4.setText("Nombres :");

        jLabel1.setText("Cod. Colegiatura : ");

        txfCodColegiatura.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txfDireccion))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfApeMaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfNombres)
                            .addComponent(txfApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfnNumDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txfTelefono1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfCodColegiatura)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfnNumDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfCodColegiatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Adicionales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel6.setText("Tipo médico :");

        cbxTipoMedico.setEnabled(false);

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        rbtnActivo.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rbtnActivo);
        rbtnActivo.setSelected(true);
        rbtnActivo.setText("Activo");
        rbtnActivo.setEnabled(false);

        rbtnDesactivado.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rbtnDesactivado);
        rbtnDesactivado.setText("Desactivado");
        rbtnDesactivado.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(rbtnDesactivado)
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnActivo)
                    .addComponent(rbtnDesactivado))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbxTipoMedico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxTipoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.setPreferredSize(new java.awt.Dimension(65, 40));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/edit.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.setPreferredSize(new java.awt.Dimension(65, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/new.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setPreferredSize(new java.awt.Dimension(65, 40));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
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

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));

        jLabel10.setText("Especialidad :");

        cbxEspecialidad.setEnabled(false);

        btnAgregarEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Button-Download-icon.png"))); // NOI18N
        btnAgregarEspecialidad.setToolTipText("Agregar");
        btnAgregarEspecialidad.setEnabled(false);
        btnAgregarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEspecialidadActionPerformed(evt);
            }
        });

        tblEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblEspecialidad);

        btnEliminarEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Button-Upload-icon.png"))); // NOI18N
        btnEliminarEspecialidad.setToolTipText("Quitar");
        btnEliminarEspecialidad.setEnabled(false);
        btnEliminarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEspecialidadActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/add.png"))); // NOI18N
        btnAdd.setToolTipText("Agregar Especialidad");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(cbxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Especialidad", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jTabbedPane1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombresActionPerformed

    private void txfnNumDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfnNumDniKeyReleased
        Utilitarios.validaCaracterNumerico(evt, txfnNumDni);
        Utilitarios.validaNumeroCaracteres(txfnNumDni, 8);
        txfnNumDni.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_txfnNumDniKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        configuraGuardar();
        personalizaVistaTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblResultados.getSelectedRow() != -1) {
            configuraActualizar();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una persona", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        configuraNuevo();
        personalizaVistaTabla();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        configuraCancelar();
        personalizaVistaTabla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEspecialidadActionPerformed
        llenarTablaEspecialidades();
        personalizaVistaTabla();
    }//GEN-LAST:event_btnAgregarEspecialidadActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        resetComponent();
        resetPaintComponent();
        buscarMedico();
        personalizaVistaTabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblResultadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseReleased
        if (tblResultados.getRowSelectionAllowed()) {
            resetComponent();
            oModeloEspecialidad.clear();
            obtenerDatosTabla();
            estadoTextFields(false);
            activarBotones(true, true, false, true);
//            btnAgregarEspecialidad.setEnabled(true);
//            btnEliminarEspecialidad.setEnabled(true);
            personalizaVistaTabla();
        }
    }//GEN-LAST:event_tblResultadosMouseReleased

    private void txfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBusquedaActionPerformed
        btnBuscar.doClick();
    }//GEN-LAST:event_txfBusquedaActionPerformed

    private void btnEliminarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEspecialidadActionPerformed
        eliminarEspecialidadMedicoBd();
        buscarMedico();
        personalizaVistaTabla();
    }//GEN-LAST:event_btnEliminarEspecialidadActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        resetComponent();
        oModeloMedico.clear();
        oModeloEspecialidad.clear();
        personalizaVistaTabla();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        root.insertarInternalFrames(root.jifAddEspecialidad);
        root.jifAddEspecialidad.enviaDatos(this);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAgregarEspecialidad;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarEspecialidad;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxEspecialidad;
    private javax.swing.JComboBox cbxTipoMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JRadioButton rbtnActivo;
    private javax.swing.JRadioButton rbtnDesactivado;
    private javax.swing.JTable tblEspecialidad;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txfApeMaterno;
    private javax.swing.JTextField txfApePaterno;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfCodColegiatura;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfNombres;
    private javax.swing.JTextField txfTelefono1;
    private javax.swing.JTextField txfnNumDni;
    // End of variables declaration//GEN-END:variables

    private void configuraNuevo() {
        banBoton = 1;
        tblResultados.setEnabled(true);
        oModeloMedico.clear();
        oModeloEspecialidad.clear();
        resetComponent();
        estadoTextFields(true);
        estadoBotones(false, false, true, true);
    }

    private void configuraCancelar() {
        banBoton = 0;
        resetComponent();
        resetPaintComponent();
        estadoTextFields(false);
        estadoBotones(true, false, false, true);
        oModeloMedico.clear();
        oModeloEspecialidad.clear();
        oPersona = null;
        oMedico = null;
    }

    private void configuraActualizar() {
        banBoton = 2;
        estadoTextFields(true);
        estadoBotones(true, false, true, true);
    }

    private void configuraGuardar() {
        if (banBoton == 1) {
            if (isDatosValidos()) {
                resetPaintComponent();
                registrar();
                oModeloMedico.clear();
                oModeloEspecialidad.clear();
                oModeloMedico.add(buscarMedicoXDni(oPersona.getNumeroDocumento().trim()));
                resetComponent();
                estadoTextFields(false);
                estadoBotones(true, false, false, true);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos", "Atención", JOptionPane.INFORMATION_MESSAGE);
                paintComponent();
            }

        } else if (banBoton == 2) {
            if (isDatosValidos()) {
                actualizarPersona();
                resetPaintComponent();
                oModeloMedico.clear();
                oModeloEspecialidad.clear();
                oModeloMedico.add(buscarMedicoXDni(oPersona.getNumeroDocumento()));
                resetComponent();
                estadoTextFields(false);
                estadoBotones(true, false, false, true);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos", "Atención", JOptionPane.INFORMATION_MESSAGE);
                paintComponent();
            }

        }
    }

    private void resetComponent() {
        this.txfApePaterno.setText("");
        this.txfApeMaterno.setText("");
        this.txfNombres.setText("");
        this.jdcFechaNacimiento.setDate(null);
        this.txfnNumDni.setText("");
        this.txfDireccion.setText("");
        this.txfTelefono1.setText("");
        this.txfCodColegiatura.setText("");
        this.cbxTipoMedico.setSelectedIndex(0);
        this.cbxEspecialidad.setSelectedIndex(0);
        this.rbtnActivo.setSelected(true);
        this.rbtnDesactivado.setSelected(false);
    }

    private void estadoTextFields(boolean b) {
        this.txfApePaterno.setEnabled(b);
        this.txfApeMaterno.setEnabled(b);
        this.txfNombres.setEnabled(b);
        this.jdcFechaNacimiento.setEnabled(b);
        this.txfnNumDni.setEnabled(b);
        this.txfDireccion.setEnabled(b);
        this.txfTelefono1.setEnabled(b);
        this.cbxTipoMedico.setEnabled(b);
        this.cbxEspecialidad.setEnabled(b);
        this.rbtnActivo.setEnabled(b);
        this.rbtnDesactivado.setEnabled(b);
        this.btnAgregarEspecialidad.setEnabled(b);
        this.btnAdd.setEnabled(b);
        this.txfCodColegiatura.setEnabled(b);
        this.btnEliminarEspecialidad.setEnabled(b);
    }

    private void estadoBotones(boolean nuevo, boolean editar, boolean guardar, boolean cancelar) {
        btnNuevo.setEnabled(nuevo);
        btnEditar.setEnabled(editar);
        btnGuardar.setEnabled(guardar);
        btnCancelar.setEnabled(cancelar);
    }

    public void paintComponent() {
        Utilitarios.paintTxfVacio(txfNombres);
        Utilitarios.paintTxfVacio(txfApePaterno);
        Utilitarios.paintTxfVacio(txfApeMaterno);
        Utilitarios.paintTxfVacio(txfnNumDni);
        Utilitarios.paintCbxVacio(cbxTipoMedico);
    }

    private void resetPaintComponent() {
        Utilitarios.resetPaintTxf(txfNombres);
        Utilitarios.resetPaintTxf(txfApePaterno);
        Utilitarios.resetPaintTxf(txfApeMaterno);
        Utilitarios.resetPaintTxf(txfnNumDni);
        Utilitarios.resetPaintCbx(cbxTipoMedico);
    }

    private boolean isDatosValidos() {
        return (!this.txfNombres.getText().trim().equals("")
                && !this.txfApePaterno.getText().trim().equals("")
                && !this.txfApeMaterno.getText().trim().equals("")
                && !this.txfnNumDni.getText().trim().equals("")
                && this.cbxTipoMedico.getSelectedIndex() > 0
                && this.oModeloEspecialidad.size() > 0);
    }

    private void registrar() {
        registrarPersona();
        registrarMedico();
    }

    private Persona registrarPersona() {
        oPersona = new Persona();
        oBLPersona = new PersonaBl();

        oPersona.setApellidoPaterno(txfApePaterno.getText().trim().toUpperCase());
        oPersona.setApellidoMaterno(txfApeMaterno.getText().trim().toUpperCase());
        oPersona.setNombre(txfNombres.getText().trim().toUpperCase());
        oPersona.setNumeroDocumento(txfnNumDni.getText().trim().toUpperCase());
        oPersona.setFechaNacimiento(jdcFechaNacimiento.getDate());
        oPersona.setTelefono(txfTelefono1.getText().trim());
        oPersona.setDireccion(txfDireccion.getText().trim());

        return oBLPersona.registrarPersona(oPersona);
    }

    private void registrarMedico() {
        oMedico = new Medico();
        oBlMedico = new MedicoBl();
        oMedico.setPersona(oPersona);
        oMedico.setTipoMedico(((TipoMedico) cbxTipoMedico.getSelectedItem()));
        oMedico.setCodigoColegiatura(txfCodColegiatura.getText().trim().toUpperCase());
        oMedico.setFechaReg(new Date());
        if (rbtnActivo.isSelected()) {
            oMedico.setEstado(true);
        } else {
            oMedico.setEstado(false);
        }
        oMedico.setIdMedico(oBlMedico.registrar(oMedico));

        if (oModeloEspecialidad.size() > 0) {
            if (registrarEspecialidadMedico() != 0) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso", "Atención", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error en el registro de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Agregue especialidad", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void llenarCbxTipoMedico() {
        oBlTipoMedico = new TipoMedicoBl();
        listTipoMedico = oBlTipoMedico.listar();
        cbxTipoMedico.removeAllItems();
        cbxTipoMedico.addItem("<Seleccione>");
        for (TipoMedico tipoMedico : listTipoMedico) {
            tipoMedico.setOp(TipoMedico.DATO);
            cbxTipoMedico.addItem(tipoMedico);
        }
    }

    public void llenarCbxEspecialidad() {
        oBlEspecialidad = new EspecialidadBl();
        listEspecialidad = oBlEspecialidad.listar();
        cbxEspecialidad.removeAllItems();
        cbxEspecialidad.addItem("<Seleccione>");
        for (Especialidad especialidad : listEspecialidad) {
            especialidad.setOp(TipoMedico.DATO);
            cbxEspecialidad.addItem(especialidad);
        }
    }

    private void llenarTablaEspecialidades() {
        if (cbxEspecialidad.getSelectedIndex() != 0) {
            oEspecialidad = new Especialidad();
            oEspecialidad.setIdEspecialidad(((Especialidad) cbxEspecialidad.getSelectedItem()).getIdEspecialidad());
            oEspecialidad.setDenominacion(cbxEspecialidad.getSelectedItem().toString());
            if (!existeEspecialidadDuplicadoTemp()) {
                oModeloEspecialidad.add(oEspecialidad);
            } else {
                JOptionPane.showMessageDialog(null, "La especialidad seleccionada ya fue asignado", "Atención", JOptionPane.INFORMATION_MESSAGE);
            }
            cbxEspecialidad.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una especialidad", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void personalizaVistaTabla() {
        Utilitarios.formateaColumna(0, tblEspecialidad, 80);
        Utilitarios.formateaColumna(0, tblResultados, 80);
    }

    private boolean existeEspecialidadDuplicadoTemp() {
        boolean val = false;
        for (int i = 0; i < oModeloEspecialidad.getRowCount(); i++) {
            for (int j = 0; j < oModeloEspecialidad.getColumnCount(); j++) {
                if (oEspecialidad.getIdEspecialidad() == Integer.parseInt(oModeloEspecialidad.getValueAt(i, j).toString())) {
                    val = true;
                    i = oModeloEspecialidad.getRowCount();
                } else {
                    val = false;
                }
                j = oModeloEspecialidad.getColumnCount();
            }
        }
        return val;
    }

    private int registrarEspecialidadMedico() {
        oMedicoEspecialidad = new MedicoEspecialidad();
        oBlMedicoEspecialidad = new MedicoEspecialidadBl();
        ArrayList<String> list = new ArrayList<String>();
        int id = 0;
        if (oModeloEspecialidad.size() > 0) {
            for (int i = 0; i < oModeloEspecialidad.getRowCount(); i++) {
                for (int j = 0; j < oModeloEspecialidad.getColumnCount(); j++) {
                    list.add(oModeloEspecialidad.getValueAt(i, j).toString());
                    oMedicoEspecialidad.setEspecialidad(new Especialidad(Integer.parseInt(oModeloEspecialidad.getValueAt(i, j).toString())));
                    oMedicoEspecialidad.setMedico(oMedico);
                    //validar que  evite duplicados  a nivel de base de datos
                    id = oBlMedicoEspecialidad.registrar(oMedicoEspecialidad);
                    j = oModeloEspecialidad.getColumnCount();
                }
            }
        }
        return id;
    }

    private void buscarMedico() {
        oMedico = new Medico();
        oBlMedico = new MedicoBl();
        String ref = txfBusqueda.getText().trim().toUpperCase();
        oModeloMedico.addAll(oBlMedico.buscar(ref));
        personalizaVistaTabla();
        estadoTextFields(false);
    }

    private Medico buscarMedicoXDni(String dni) {
        oBlMedico = new MedicoBl();
        return oBlMedico.buscarMedicoXDni(dni);
    }

    private void activarBotones(boolean nuevo, boolean modificar, boolean guardar, boolean cancelar) {
        btnNuevo.setEnabled(nuevo);
        btnEditar.setEnabled(modificar);
        btnGuardar.setEnabled(guardar);
        btnCancelar.setEnabled(cancelar);
    }

    private void obtenerDatosTabla() {
        beanTablaM = (Medico) oModeloMedico.get(tblResultados.getSelectedRow());

        this.txfApePaterno.setText(beanTablaM.getPersona().getApellidoPaterno());
        this.txfApeMaterno.setText(beanTablaM.getPersona().getApellidoMaterno());
        this.txfNombres.setText(beanTablaM.getPersona().getNombre());
        this.jdcFechaNacimiento.setDate(beanTablaM.getPersona().getFechaNacimiento());
        this.txfnNumDni.setText(beanTablaM.getPersona().getNumeroDocumento());
        this.txfDireccion.setText(beanTablaM.getPersona().getDireccion());
        this.txfTelefono1.setText(beanTablaM.getPersona().getTelefono());
        //recuperar datos especificos del medico
        txfCodColegiatura.setText(beanTablaM.getCodigoColegiatura());
        if (beanTablaM.getEstado() == true) {
            rbtnActivo.setSelected(true);
            rbtnDesactivado.setSelected(false);
        } else {
            rbtnActivo.setSelected(false);
            rbtnDesactivado.setSelected(true);
        }

        Utilitarios.recuperaDatosTipoMedico(beanTablaM.getTipoMedico().getIdTipoMedico(), this.cbxTipoMedico);

        if (beanTablaM.getMedicoEspecialidads().size() > 0) {
            for (MedicoEspecialidad list1 : beanTablaM.getMedicoEspecialidads()) {
                oEspecialidad = new Especialidad();
                oEspecialidad = oBlEspecialidad.buscar(list1.getEspecialidad().getIdEspecialidad());
                //oModeloEspecialidad.clear();
                oModeloEspecialidad.add(oEspecialidad);
            }
        }

    }

    private void actualizarPersona() {
        oPersona = new Persona();
        oBLPersona = new PersonaBl();
        oPersona.setIdPersona(beanTablaM.getPersona().getIdPersona());
        oPersona.setApellidoPaterno(txfApePaterno.getText().trim().toUpperCase());
        oPersona.setApellidoMaterno(txfApeMaterno.getText().trim().toUpperCase());
        oPersona.setNombre(txfNombres.getText().trim().toUpperCase());
        oPersona.setNumeroDocumento(txfnNumDni.getText().trim().toUpperCase());
        oPersona.setFechaNacimiento(jdcFechaNacimiento.getDate());
        oPersona.setTelefono(txfTelefono1.getText().trim());
        oPersona.setDireccion(txfDireccion.getText().trim());

        oBLPersona.actualizar(oPersona);
        actualizarMedico();
    }

    private void actualizarMedico() {
        oMedico = new Medico();
        oBlMedico = new MedicoBl();

        oMedico.setIdMedico(beanTablaM.getIdMedico());
        oMedico.setPersona(beanTablaM.getPersona());
        oMedico.setTipoMedico(new TipoMedico(((TipoMedico) cbxTipoMedico.getSelectedItem()).getIdTipoMedico()));
        oMedico.setCodigoColegiatura(txfCodColegiatura.getText().trim().toUpperCase());
        if (rbtnActivo.isSelected()) {
            oMedico.setEstado(true);
        } else {
            oMedico.setEstado(false);
        }
        oBlMedico.actualizar(oMedico);
        JOptionPane.showMessageDialog(null, "Actualización Exitosa", "Atención", JOptionPane.INFORMATION_MESSAGE);
//        actualizarEspecialidades();
    }

    public void eliminarEspecialidadMedicoBd() {
        int regEliminados = 0;
        if (tblResultados.getRowSelectionAllowed() && tblResultados.getSelectedRow() != -1) {
            oMedico = oModeloMedico.get(tblResultados.getSelectedRow());
            if (tblEspecialidad.getRowSelectionAllowed() && tblEspecialidad.getSelectedRow() != -1) {
                oEspecialidad = oModeloEspecialidad.get(tblEspecialidad.getSelectedRow());
                oBlMedicoEspecialidad = new MedicoEspecialidadBl();
                oMedicoEspecialidad = new MedicoEspecialidad();
                oMedicoEspecialidad.setEspecialidad(oEspecialidad);
                oMedicoEspecialidad.setMedico(oMedico);
                regEliminados = oBlMedicoEspecialidad.eliminar(oEspecialidad, oMedico);
                if (regEliminados > 0) {
                    JOptionPane.showMessageDialog(null, regEliminados + " Registros eliminados", "Atención", JOptionPane.INFORMATION_MESSAGE);
                }
                //Actualizar lista de especialidades del medico                
                oModeloEspecialidad.remove(tblEspecialidad.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una Especialidad", "Atención", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Médico", "Atención", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void actualizarEspecialidades() {
        oMedicoEspecialidad = new MedicoEspecialidad();
        oBlMedicoEspecialidad = new MedicoEspecialidadBl();
        ArrayList<String> list = new ArrayList<String>();
        int id = 0;
        if (oModeloEspecialidad.size() > 0) {
            for (int i = 0; i < oModeloEspecialidad.getRowCount(); i++) {
                for (int j = 0; j < oModeloEspecialidad.getColumnCount(); j++) {
                    list.add(oModeloEspecialidad.getValueAt(i, j).toString());
                    oMedicoEspecialidad.getEspecialidad().setIdEspecialidad(Integer.parseInt(oModeloEspecialidad.getValueAt(i, j).toString()));
                    oMedicoEspecialidad.setMedico(oMedico);
                    //validar que  evite duplicados  a nivel de base de datos
                    id = oBlMedicoEspecialidad.registrar(oMedicoEspecialidad);
                    j = oModeloEspecialidad.getColumnCount();
                }
            }
        }
        //return id;

    }

    private void listarEspecialidades() {
        oModeloEspecialidad.clear();
        oEspecialidad = oBlEspecialidad.buscar(oEspecialidad.getIdEspecialidad());
        //oModeloEspecialidad.clear();
        oModeloEspecialidad.add(oEspecialidad);
    }

    void iniciar() {
        llenarCbxTipoMedico();
        llenarCbxEspecialidad();
        personalizaVistaTabla();
    }
}
