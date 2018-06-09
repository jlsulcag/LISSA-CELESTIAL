package lissa.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lissa.be.Persona;
import lissa.bl.PersonaBl;
import lissa.table.ModeloPersonas;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

public class JIF_AdministrarPersonaNatural extends javax.swing.JInternalFrame {

    private JF_Principal root;
    //variables para las tablas
    private ModeloPersonas modeloPersonas;

    //Objetos para persona
    private Persona oPersona = null;
    private PersonaBl oBLPersona = null;

    private Persona beanTabla;

    //banderas
    private int banBoton = 0;
    private int invocador;
    public static final int JIF_PERSONA_JURIDICA = 1;
    public static final int JIF_CITA = 2;
    public static final int JIF_USUARIO = 3;
    public static final int JIF_VENTAS = 4;
    //public static final int JIF_EMITIR_COMPROBANTE2 = 2;

    public JIF_AdministrarPersonaNatural(JF_Principal root) {
        initComponents();
        this.root = root;
        modeloPersonas = new ModeloPersonas();
        tblResultados.setModel(modeloPersonas);
        personalizaVistaTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfApePaterno = new javax.swing.JTextField();
        txfApeMaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txfNombres = new javax.swing.JTextField();
        txfnNumDni = new javax.swing.JTextField();
        txfTelefono = new javax.swing.JTextField();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        txfBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Maestro de personas");
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setText("Apellido Paterno :");

        jLabel3.setText("Apellido Materno :");

        txfApePaterno.setEnabled(false);

        txfApeMaterno.setEnabled(false);

        jLabel4.setText("Nombres :");

        jLabel5.setText("Fecha de  Nacimiento :");

        jLabel7.setText("Nº DNI :");

        jLabel9.setText("Telefono :");

        txfNombres.setEnabled(false);
        txfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombresActionPerformed(evt);
            }
        });

        txfnNumDni.setEnabled(false);
        txfnNumDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfnNumDniKeyReleased(evt);
            }
        });

        txfTelefono.setEnabled(false);

        jdcFechaNacimiento.setDateFormatString("dd/MM/yyyy");
        jdcFechaNacimiento.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfApePaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(txfApeMaterno)
                    .addComponent(txfNombres)
                    .addComponent(txfnNumDni)
                    .addComponent(txfTelefono))
                .addGap(5, 5, 5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txfApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txfnNumDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5))
                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

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
                .addComponent(txfBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/cancel.png"))); // NOI18N
        btnCancelar.setEnabled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(65, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        btnGuardar.setEnabled(false);
        btnGuardar.setPreferredSize(new java.awt.Dimension(65, 40));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/new.png"))); // NOI18N
        btnNuevo.setPreferredSize(new java.awt.Dimension(65, 40));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/arrow.png"))); // NOI18N
        btnCargar.setToolTipText("Cargar");
        btnCargar.setPreferredSize(new java.awt.Dimension(65, 40));
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombresActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        configuraGuardar();
        personalizaVistaTabla();
        //resetComponent();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPersona();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblResultadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseReleased
        try {
            if (tblResultados.getRowSelectionAllowed()) {
                obtenerDatosTabla();
                estadoTextFields(false);
                activarBotones(true, true, false, true);
                resetPaintComponent();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JIF_AdministrarPersonaNatural.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblResultadosMouseReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        configuraNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblResultados.getSelectedRow() != -1) {
            configuraActualizar();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una persona", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
        personalizaVistaTabla();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        configuraCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        if (beanTabla == null || beanTabla.getIdPersona() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una persona", "Atencion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (isDatosValidos()) {
                cargarDatosPersona();
                this.doDefaultCloseAction();
                modeloPersonas.clear();
                beanTabla = null;
                resetComponent();
            } else {
                JOptionPane.showMessageDialog(null, "Actualice la informacion de la persona antes de cargar", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                paintComponent();
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void txfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBusquedaActionPerformed
        btnBuscar.doClick();
    }//GEN-LAST:event_txfBusquedaActionPerformed

    private void txfnNumDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfnNumDniKeyReleased
        Utilitarios.validaCaracterNumerico(evt, txfnNumDni);
        Utilitarios.validaNumeroCaracteres(txfnNumDni, 8);
        txfnNumDni.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_txfnNumDniKeyReleased

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        resetComponent();
        modeloPersonas.clear();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txfApeMaterno;
    private javax.swing.JTextField txfApePaterno;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfNombres;
    private javax.swing.JTextField txfTelefono;
    private javax.swing.JTextField txfnNumDni;
    // End of variables declaration//GEN-END:variables

    private Persona buscarPersonaXDni() {
        oBLPersona = new PersonaBl();
        return oBLPersona.buscarPersonaXDni(txfnNumDni.getText().trim());
    }

    private void personalizaVistaTabla() {
        Utilitarios.formateaColumna(0, tblResultados, 80);
    }

    private void buscarPersona() {
        oPersona = new Persona();
        oBLPersona = new PersonaBl();
        String ref = txfBusqueda.getText().trim().toUpperCase();
        modeloPersonas.addAll(oBLPersona.buscar(ref));
        personalizaVistaTabla();
        //txfBusqueda.setText("");
        estadoTextFields(false);
    }

    private void obtenerDatosTabla() throws SQLException {
        resetComponent();
        beanTabla = (Persona) modeloPersonas.get(tblResultados.getSelectedRow());
        this.txfNombres.setText(beanTabla.getNombre());
        this.txfApePaterno.setText(beanTabla.getApellidoPaterno());
        this.txfApeMaterno.setText(beanTabla.getApellidoMaterno());
        this.jdcFechaNacimiento.setDate(beanTabla.getFechaNacimiento());
        this.txfnNumDni.setText(beanTabla.getNumeroDocumento());
        this.txfTelefono.setText(beanTabla.getTelefono());
    }

    private void configuraGuardar() {
        if (banBoton == 1) {
            if (isDatosValidos()) {
                if (isDniValido()) {
                    if (registrarPersona() != null) {
                        JOptionPane.showMessageDialog(null, Mensajes.getRegCorrecto(), Mensajes.getTituloAtencion(), JOptionPane.INFORMATION_MESSAGE);
                        modeloPersonas.clear();
                        modeloPersonas.add(buscarPersonaXDni());
                        resetComponent();
                        resetPaintComponent();
                        estadoTextFields(false);
                    } else {
                        JOptionPane.showMessageDialog(null, Mensajes.getRegError(), Mensajes.getTituloError(), JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El N° de DNI ya existe", "Atención", JOptionPane.INFORMATION_MESSAGE);
                    txfnNumDni.setText("");
                    txfnNumDni.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos", "Atención", JOptionPane.INFORMATION_MESSAGE);
                paintComponent();
            }

        } else if (banBoton == 2) {
            if (isDatosValidos()) {
                if (actualizarPersona() != 0) {
                    Mensajes.msjActCorrecta();

                    modeloPersonas.clear();
                    modeloPersonas.add(buscarPersonaXDni());
                    resetComponent();
                } else {
                    Mensajes.msjActErronea();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos", "Atención", JOptionPane.INFORMATION_MESSAGE);
                paintComponent();
            }

        }
    }

    private void configuraNuevo() {
        banBoton = 1;
        tblResultados.setEnabled(true);
        modeloPersonas.clear();
        resetComponent();
        resetPaintComponent();
        estadoTextFields(true);
        activarBotones(false, false, true, true);
        personalizaVistaTabla();
    }

    private void configuraActualizar() {
        banBoton = 2;
        estadoTextFields(true);
        activarBotones(true, false, true, true);
    }

    private Persona registrarPersona() {
        //creamos los  objetos a utilizar
        oPersona = new Persona();
        oBLPersona = new PersonaBl();
        //setear los valores en el nuevo objeto
        oPersona.setApellidoPaterno(txfApePaterno.getText().trim().toUpperCase());
        oPersona.setApellidoMaterno(txfApeMaterno.getText().trim().toUpperCase());
        oPersona.setNombre(txfNombres.getText().trim().toUpperCase());
        oPersona.setNumeroDocumento(txfnNumDni.getText().trim().toUpperCase());
        oPersona.setFechaNacimiento(jdcFechaNacimiento.getDate());
        oPersona.setTelefono(txfTelefono.getText().trim());
        oPersona.setEstado(true);
        oPersona.setFechaReg(new Date());

        return oBLPersona.registrarPersona(oPersona);
    }

    private boolean isDatosValidos() {
        return (!this.txfNombres.getText().trim().equals("")
                && !this.txfApePaterno.getText().trim().equals("")
                && !this.txfApeMaterno.getText().trim().equals("")
                && !this.txfnNumDni.getText().trim().equals(""));
    }

    public void paintComponent() {
        Utilitarios.paintTxfVacio(txfNombres);
        Utilitarios.paintTxfVacio(txfApePaterno);
        Utilitarios.paintTxfVacio(txfApeMaterno);
        Utilitarios.paintTxfVacio(txfnNumDni);
    }

    public void resetPaintComponent() {
        Utilitarios.resetPaintTxf(txfNombres);
        Utilitarios.resetPaintTxf(txfApePaterno);
        Utilitarios.resetPaintTxf(txfApeMaterno);
        Utilitarios.resetPaintTxf(txfnNumDni);
    }

    private void resetComponent() {
        this.txfApePaterno.setText("");
        this.txfApeMaterno.setText("");
        this.txfNombres.setText("");
        this.jdcFechaNacimiento.setDate(null);
        this.txfnNumDni.setText("");
        this.txfTelefono.setText("");
        //txfBusqueda.setText("");
    }

    private void estadoTextFields(Boolean e) {
        this.txfApePaterno.setEnabled(e);
        this.txfApeMaterno.setEnabled(e);
        this.txfNombres.setEnabled(e);
        this.jdcFechaNacimiento.setEnabled(e);
        this.txfnNumDni.setEnabled(e);
        this.txfTelefono.setEnabled(e);
    }

    private void activarBotones(boolean nuevo, boolean modificar, boolean guardar, boolean cancelar) {
        btnNuevo.setEnabled(nuevo);
        btnEditar.setEnabled(modificar);
        btnGuardar.setEnabled(guardar);
        btnCancelar.setEnabled(cancelar);
    }

    private void configuraCancelar() {
        resetComponent();
        resetPaintComponent();
        estadoTextFields(false);
        activarBotones(true, false, false, true);
        btnBuscar.setEnabled(true);
        modeloPersonas.clear();
        oPersona = null;
        personalizaVistaTabla();
    }

    private int actualizarPersona() {
        oPersona = new Persona();
        oBLPersona = new PersonaBl();
        int res = 0;
        oPersona.setIdPersona(beanTabla.getIdPersona());
        oPersona.setApellidoPaterno(txfApePaterno.getText().trim().toUpperCase());
        oPersona.setApellidoMaterno(txfApeMaterno.getText().trim().toUpperCase());
        oPersona.setNombre(txfNombres.getText().trim().toUpperCase());
        oPersona.setNumeroDocumento(txfnNumDni.getText().trim());
        oPersona.setFechaNacimiento(jdcFechaNacimiento.getDate());
        oPersona.setTelefono(txfTelefono.getText().trim());
        //Validar  Dni
        res = oBLPersona.actualizar(oPersona);
        return res;
    }

    private void cargarDatosPersona() {
        //root.jifAdmisionPaciente.cargarDatosPersona(beanTabla);
        switch (getInvocador()) {
            case JIF_CITA:
                root.jifCitaMedica.cargarDatosPersona(beanTabla);
                break;
            case JIF_USUARIO:
                root.jifRegistrarUsuario.cargarDatosPersona(beanTabla);
                break;
        }

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

    public int getInvocador() {
        return invocador;
    }

    public void setInvocador(int invocador) {
        this.invocador = invocador;
    }

}
