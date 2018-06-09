package lissa.gui;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import lissa.be.Cita;
import lissa.be.Medico;
import lissa.be.Persona;
import lissa.be.Rol;
import lissa.be.Usuario;
import lissa.bl.CitaBl;
import lissa.bl.PersonaBl;
import lissa.controller.MedicoCtrl;
import lissa.table.ModeloCita;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

public class JIF_CitaMedica extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private MedicoCtrl ctrl;
    private Persona Opersona;
    private int banBoton = 0;
    private Cita oCita;
    private Cita oCitaTemp;
    private CitaBl oCitaBl;
    Calendar calendar = Calendar.getInstance();

    private Usuario userTemp;
    private Persona perTemp;
    private Rol rolTemp;

    private ModeloCita oModeloCita;
    private ArrayList<Cita> lista;
    private TextAutoCompleter oTextAutoCompleter;
    private Persona oPersona;
    private PersonaBl oPersonaBl;
    private ArrayList<Persona> listPers;

    public JIF_CitaMedica(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloCita = new ModeloCita();
        tblCitas.setModel(oModeloCita);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdcFechaBusqueda = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        cbxMedicoBusqueda = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txfBusquedaPaciente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfPaciente = new javax.swing.JTextField();
        cbxMedico = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfServicio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jsMinutoInicio = new javax.swing.JSpinner();
        jsAmPm1 = new javax.swing.JSpinner();
        jsMinutoFin = new javax.swing.JSpinner();
        jsAmPm2 = new javax.swing.JSpinner();
        jsHoraInicio = new javax.swing.JSpinner();
        jsHoraFin = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Administración de citas");
        setFont(new java.awt.Font("Adobe Arabic", 1, 10)); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setText("Fecha :");

        jLabel2.setText("Medico :");

        cbxMedicoBusqueda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMedicoBusquedaItemStateChanged(evt);
            }
        });
        cbxMedicoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMedicoBusquedaActionPerformed(evt);
            }
        });

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCitasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblCitas);

        jLabel8.setText("Apellido y Nombres :");

        txfBusquedaPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBusquedaPacienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcFechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMedicoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfBusquedaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jdcFechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbxMedicoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txfBusquedaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/new.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/edit.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/cancel.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(50, 41));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Paciente :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Medico :");

        txfPaciente.setEnabled(false);
        txfPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPacienteKeyReleased(evt);
            }
        });

        cbxMedico.setEnabled(false);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha :");

        jdcFecha.setEnabled(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Hora Inicio :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Servicio :");

        txfServicio.setEnabled(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Hora Fin :");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/search.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jsMinutoInicio.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 10));
        jsMinutoInicio.setEnabled(false);

        jsAmPm1.setModel(new javax.swing.SpinnerListModel(new String[] {"AM", "PM"}));
        jsAmPm1.setEnabled(false);

        jsMinutoFin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 10));
        jsMinutoFin.setEnabled(false);

        jsAmPm2.setModel(new javax.swing.SpinnerListModel(new String[] {"AM", "PM"}));
        jsAmPm2.setEnabled(false);

        jsHoraInicio.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        jsHoraInicio.setEnabled(false);

        jsHoraFin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        jsHoraFin.setEnabled(false);

        jLabel10.setText("Estado :");

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PEN", "ATEN", "CANC", "FALT", " " }));
        cbxEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfServicio)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsAmPm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsMinutoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsAmPm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbxMedico, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel9)
                        .addComponent(jsMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jsAmPm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jsMinutoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jsAmPm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jsHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jsHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        configuraActualizar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        configuraNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        abrirAdminPersonaNatural(JIF_AdministrarPersonaNatural.JIF_CITA);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
        personalizarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxMedicoBusquedaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMedicoBusquedaItemStateChanged
        
    }//GEN-LAST:event_cbxMedicoBusquedaItemStateChanged

    private void cbxMedicoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMedicoBusquedaActionPerformed
        if (isDatosValidosBusqueda()) {
            if (cbxMedicoBusqueda.getSelectedIndex() > 0) {
                //Busqueda por medico y fecha
                listar((Medico) cbxMedicoBusqueda.getSelectedItem());
            }
        }
    }//GEN-LAST:event_cbxMedicoBusquedaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cancelar();
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        cancelar();
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txfBusquedaPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBusquedaPacienteKeyReleased
        if(!txfBusquedaPaciente.getText().toUpperCase().trim().equals("") && jdcFechaBusqueda.getDate() != null){
            String ref = txfBusquedaPaciente.getText().toUpperCase().trim();
            listarPorPaciente(ref, jdcFechaBusqueda.getDate());
        }else{
            oModeloCita.clear();
        }
        personalizarTabla();
    }//GEN-LAST:event_txfBusquedaPacienteKeyReleased

    private void tblCitasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCitasMouseReleased
        if(tblCitas.getSelectedRow() != -1 && tblCitas.getRowSelectionAllowed()){
            obtenerDatosTabla();
        }else{
            System.out.println("Aqui");
        }
    }//GEN-LAST:event_tblCitasMouseReleased

    private void txfPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPacienteKeyReleased
        //listarPersonas();
    }//GEN-LAST:event_txfPacienteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cbxEstado;
    private javax.swing.JComboBox cbxMedico;
    private javax.swing.JComboBox cbxMedicoBusqueda;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private com.toedter.calendar.JDateChooser jdcFechaBusqueda;
    private javax.swing.JSpinner jsAmPm1;
    private javax.swing.JSpinner jsAmPm2;
    private javax.swing.JSpinner jsHoraFin;
    private javax.swing.JSpinner jsHoraInicio;
    private javax.swing.JSpinner jsMinutoFin;
    private javax.swing.JSpinner jsMinutoInicio;
    private javax.swing.JTable tblCitas;
    private javax.swing.JTextField txfBusquedaPaciente;
    private javax.swing.JTextField txfPaciente;
    private javax.swing.JTextField txfServicio;
    // End of variables declaration//GEN-END:variables

    

    private void cargarCbxMedicos() {
        ctrl = new MedicoCtrl(root);
        ctrl.rellenaMedico(cbxMedicoBusqueda);
    }

    private void abrirAdminPersonaNatural(int JIF_CITA) {
        root.jifAdministrarPersonanatural.setInvocador(JIF_CITA);
        root.insertarInternalFrames(root.jifAdministrarPersonanatural);
    }

    void cargarDatosPersona(Persona beanTabla) {
        Opersona = new Persona();
        Opersona = beanTabla;
        txfPaciente.setText(Opersona.getNombre().trim() + " " + Opersona.getApellidoPaterno().trim() + " " + Opersona.getApellidoMaterno().trim());

    }

    private void cargarCbxMedicos1() {
        ctrl = new MedicoCtrl(root);
        ctrl.rellenaMedico(cbxMedico);
    }


    private void configuraNuevo() {
        banBoton = 1;
        resetComponent();
        estadoComponent(true);
        estadoBotones(false, false, true, true);
    }

    private void configuraActualizar() {
        banBoton = 2;
        estadoComponent(true);
        estadoBotones(true, false, true, true);
    }

    private void guardar() {
        int res = 0;
        if (banBoton == 1) {
            if (isDatosValidos()) {
                oCita = registrar();
                if (oCita != null) {
                    Mensajes.msjRegCorrecta();
                    listarCitas();
                    resetComponent();
                    estadoComponent(false);
                }
            } else {

            }
        } else if (banBoton == 2) {
            if (isDatosValidos()) {
                res = actualizar();
                if(res == 1){
                    Mensajes.msjActCorrecta();
                    listarCitas();
                    resetComponent();
                    estadoComponent(false);
                }else{
                    Mensajes.msjActErronea();
                }
            } else {
                Mensajes.msjValidarIngreso();
            }
        }
    }

    private boolean isDatosValidos() {
        return (Opersona != null
                && cbxMedico.getSelectedIndex()>0
                && jdcFecha.getDate() != null);
    }

    private Cita registrar() {
        oCita = new Cita();
        oCitaBl = new CitaBl();

        oCita.setPersona(Opersona);
        oCita.setMedico((Medico) cbxMedico.getSelectedItem());
        oCita.setIdUsuario(userTemp.getIdUsuario());
        oCita.setFecha(jdcFecha.getDate());
        oCita.setHoraInicio(jsHoraInicio.getValue().toString() + ":" + jsMinutoInicio.getValue().toString() + " " + jsAmPm1.getValue().toString());
        oCita.setHoraFin(jsHoraFin.getValue().toString() + ":" + jsMinutoFin.getValue().toString() + " " + jsAmPm2.getValue().toString());
        oCita.setServicio(txfServicio.getText().toUpperCase().trim());
        oCita.setEstado(cbxEstado.getSelectedItem().toString());//pendiente de atencion
        oCita.setHoraIni((Integer) jsHoraInicio.getValue());
        oCita.setMinutoIni((Integer) jsMinutoInicio.getValue());
        oCita.setAmPmIni(jsAmPm1.getValue().toString());
        oCita.setHoraFn((Integer) jsHoraFin.getValue());
        oCita.setMinutoFn((Integer) jsMinutoFin.getValue());
        oCita.setAmPmFn(jsAmPm2.getValue().toString());

        return oCitaBl.registrar(oCita);

    }

    private int actualizar() {
        oCitaTemp = new Cita();
        oCitaBl = new CitaBl();
        oCitaTemp.setIdcita(oCita.getIdcita());
        if(Opersona != null){
            oCitaTemp.setPersona(Opersona);
        }else{
            oCitaTemp.setPersona(oCita.getPersona());
        }        
        oCitaTemp.setMedico((Medico) cbxMedico.getSelectedItem());
        oCitaTemp.setIdUsuario(userTemp.getIdUsuario());
        oCitaTemp.setFecha(jdcFecha.getDate());
        oCitaTemp.setHoraInicio(jsHoraInicio.getValue().toString() + ":" + jsMinutoInicio.getValue().toString() + " " + jsAmPm1.getValue().toString());
        oCitaTemp.setHoraFin(jsHoraFin.getValue().toString() + ":" + jsMinutoFin.getValue().toString() + " " + jsAmPm2.getValue().toString());
        oCitaTemp.setServicio(txfServicio.getText().toUpperCase().trim());
        oCitaTemp.setEstado(cbxEstado.getSelectedItem().toString());//pendiente de atencion
        oCitaTemp.setHoraIni((Integer) jsHoraInicio.getValue());
        oCitaTemp.setMinutoIni((Integer) jsMinutoInicio.getValue());
        oCitaTemp.setAmPmIni(jsAmPm1.getValue().toString());
        oCitaTemp.setHoraFn((Integer) jsHoraFin.getValue());
        oCitaTemp.setMinutoFn((Integer) jsMinutoFin.getValue());
        oCitaTemp.setAmPmFn(jsAmPm2.getValue().toString());
        return oCitaBl.actualizar(oCitaTemp);
    }

    void cargarDatosUser(Usuario user, Persona oPersona, Rol oRol) {
        userTemp = user;
        perTemp = oPersona;
        rolTemp = oRol;
    }

    private void resetComponent() {
        txfPaciente.setText("");
        jdcFecha.setDate(null);
        jsHoraInicio.setValue(new Integer(0));
        jsMinutoInicio.setValue(new Integer(0));
        jsAmPm1.setValue(new String("AM"));
        jsHoraFin.setValue(new Integer(0));
        jsMinutoFin.setValue(new Integer(0));
        jsAmPm2.setValue(new String("AM"));
        txfServicio.setText("");
        jdcFechaBusqueda.setDate(null);
        cbxMedico.setSelectedIndex(0);
        cbxMedicoBusqueda.setSelectedIndex(0);
        txfBusquedaPaciente.setText("");
        cbxEstado.setSelectedIndex(0);
    }

    private void estadoComponent(boolean e) {
        jdcFecha.setEnabled(e);
        jsHoraInicio.setEnabled(e);
        jsMinutoInicio.setEnabled(e);
        jsAmPm1.setEnabled(e);
        jsHoraFin.setEnabled(e);
        jsMinutoFin.setEnabled(e);
        jsAmPm2.setEnabled(e);
        txfServicio.setEnabled(e);
        cbxMedico.setEnabled(e);
        cbxEstado.setEnabled(e);
    }

    private void estadoBotones(boolean nuevo, boolean editar, boolean guardar, boolean cancelar) {
        btnNuevo.setEnabled(nuevo);
        btnEditar.setEnabled(editar);
        btnGuardar.setEnabled(guardar);
        btnCancelar.setEnabled(cancelar);
    }

    private boolean isDatosValidosBusqueda() {
        return (jdcFechaBusqueda.getDate() != null
                && (cbxMedicoBusqueda.getSelectedIndex() > 0
                || !txfBusquedaPaciente.getText().toUpperCase().trim().equals("")));
    }

    private void listar(Medico medico) {
        oCitaBl = new CitaBl();
        lista = oCitaBl.listarPorMedico(medico);
        if (!lista.isEmpty()) {
            oModeloCita.addAll(lista);
        } else {
            oModeloCita.clear();
            JOptionPane.showMessageDialog(null, "No tiene ninguna Cita", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
        }
        personalizarTabla();
    }

    
    private void listarPorPaciente(String pac, Date fecha) {
        oCitaBl = new CitaBl();
        oModeloCita.clear();
        lista = oCitaBl.listarPorPacienteFecha(pac, fecha);
        if(!lista.isEmpty()){
            oModeloCita.addAll(lista);
        }else{
            JOptionPane.showMessageDialog(null, "No tiene ninguna Cita", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void listarCitas() {
        oCitaBl = new CitaBl();
        oModeloCita.clear();
        lista = oCitaBl.listar();
        if(!lista.isEmpty()){
            oModeloCita.addAll(lista);
        }
    }

    private void cancelar() {
        resetComponent();
        estadoComponent(false);
        estadoBotones(true, false, false, true);
        listarCitas();
        personalizarTabla();
    }

    private void obtenerDatosTabla() {
        resetComponent();
        estadoComponent(false);
        estadoBotones(true, true, false, true);
        
        oCita = oModeloCita.get(tblCitas.getSelectedRow());
        //Steeo de valore en sus respectivos campos
        txfPaciente.setText(oCita.getPersona().getNombre().trim() + " " + oCita.getPersona().getApellidoPaterno().trim() + " " + oCita.getPersona().getApellidoMaterno().trim());        
        //Recuperar medico
        if (oCita.getMedico() == null) {
            cbxMedico.setSelectedIndex(0);
        } else {
            ctrl.recuperaDatosMedico(oCita.getMedico().getIdMedico() , cbxMedico);
        }
        //        
        jdcFecha.setDate(oCita.getFecha());
        jsHoraInicio.setValue(oCita.getHoraIni());
        jsMinutoInicio.setValue(oCita.getMinutoIni());
        jsAmPm1.setValue(oCita.getAmPmIni());
        jsHoraFin.setValue(oCita.getHoraFn());
        jsMinutoFin.setValue(oCita.getMinutoFn());
        jsAmPm2.setValue(oCita.getAmPmFn());
        txfServicio.setText(oCita.getServicio());
        cbxEstado.setSelectedItem(oCita.getEstado());
    }

    private void addItems() {
        oTextAutoCompleter.addItem("Uno");
        oTextAutoCompleter.addItem("Dos");
        oTextAutoCompleter.addItem("Tres");
        oTextAutoCompleter.addItem("Cuatro");
        oTextAutoCompleter.addItem("Cinco");
        oTextAutoCompleter.addItem("Seis");
//        oTextAutoCompleter.setMode(-1); 
        oTextAutoCompleter.setMode(0); 
//        oTextAutoCompleter.setMode(1); 
        //oTextAutoCompleter.addItems((ArrayList<Object>)(Object)lista);
    }


    private void personalizarTabla() {
        Utilitarios.formateaColumna(0, tblCitas, 80);
        Utilitarios.formateaColumna(1, tblCitas, 80);
        Utilitarios.formateaColumna(2, tblCitas, 80);
        Utilitarios.formateaColumna(3, tblCitas, 80);
        Utilitarios.formateaColumna(7, tblCitas, 50);
    }

    void iniciar() {        
        cargarCbxMedicos();
        cargarCbxMedicos1();
        personalizarTabla();
    }
}
