package lissa.gui;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JButton;
import lissa.be.Procedimiento;
import lissa.be.Servicio;
import lissa.be.Tarifario;
import lissa.bl.ProcedimientoBl;
import lissa.controller.ServicioCtrl;
import lissa.controller.TarifarioCtrl;
import lissa.table.ModeloProcedimiento;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

public class JIF_AdministrarServicio extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private TarifarioCtrl oTarifarioCtrl;
    private ServicioCtrl oServicioCtrl;
    private Procedimiento oProcedimiento;
    private Procedimiento oProcedimientoTab;
    private Procedimiento oProcedimientoTemp;
    private ProcedimientoBl oProcedimientoBl;
    private ModeloProcedimiento oModeloProcedimiento;
    private int operacion = -1;
    public static final int NUEVO = 1, EDITAR = 2;
    private List<Procedimiento> listProcedimiento;

    public JIF_AdministrarServicio(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloProcedimiento = new ModeloProcedimiento();
        tblResultados.setModel(oModeloProcedimiento);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txfBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfProcedimiento = new javax.swing.JTextField();
        txfCosto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxtarifario = new javax.swing.JComboBox();
        cbxServicio = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Administrar Servicios y Procedimientos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados de búsqueda"));

        txfBusqueda.setBackground(new java.awt.Color(255, 255, 204));
        txfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBusquedaKeyReleased(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfBusqueda)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Servicio"));

        jLabel1.setText("Procedimiento : ");

        jLabel2.setText("Costo S/.  : ");

        txfProcedimiento.setEnabled(false);

        txfCosto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfCosto.setEnabled(false);
        txfCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCostoKeyReleased(evt);
            }
        });

        jLabel4.setText("Tarifario : ");

        jLabel5.setText("Servicio : ");

        cbxtarifario.setEnabled(false);
        cbxtarifario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxtarifarioItemStateChanged(evt);
            }
        });
        cbxtarifario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxtarifarioMouseClicked(evt);
            }
        });
        cbxtarifario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtarifarioActionPerformed(evt);
            }
        });

        cbxServicio.setEnabled(false);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfProcedimiento)
                    .addComponent(cbxtarifario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 205, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbxServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxtarifario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxtarifarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxtarifarioActionPerformed
        //cargarCbxServicio();
    }//GEN-LAST:event_cbxtarifarioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        registrar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txfCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCostoKeyReleased
        Utilitarios.validaCaracterNumericoMoneda(evt, txfCosto);
    }//GEN-LAST:event_txfCostoKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        preparaNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        preparaEditar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblResultadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseReleased
        obtenerDatos();
    }//GEN-LAST:event_tblResultadosMouseReleased

    private void txfBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBusquedaKeyReleased
        buscar();
        personalizaTabla();
    }//GEN-LAST:event_txfBusquedaKeyReleased

    private void cbxtarifarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxtarifarioMouseClicked
        
    }//GEN-LAST:event_cbxtarifarioMouseClicked

    private void cbxtarifarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxtarifarioItemStateChanged
        cargarCbxServicio();
    }//GEN-LAST:event_cbxtarifarioItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertarServicioAdd();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cbxServicio;
    private javax.swing.JComboBox cbxtarifario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txfBusqueda;
    private javax.swing.JTextField txfCosto;
    private javax.swing.JTextField txfProcedimiento;
    // End of variables declaration//GEN-END:variables

    void iniciar() {
        operacion = -1;
        txfBusqueda.requestFocus();
        txfBusqueda.setText("");
        txfProcedimiento.setText("");
        txfCosto.setText("");
        cargarCbxTarifario();
        cbxServicio.removeAllItems();
        estadoBotones(true, false, false, false);
        oModeloProcedimiento.clear();
        personalizaTabla();
        habilitaDeshabilitaDatosServicio(false);
        oProcedimiento = null;
        oProcedimientoBl = null;
    }

    public void cargarCbxTarifario() {
        oTarifarioCtrl = new TarifarioCtrl(root);
        oTarifarioCtrl.rellenaCbx(cbxtarifario);
    }

    private void cargarCbxServicio() {
        if (cbxtarifario.getSelectedIndex() > 0) {
            oServicioCtrl = new ServicioCtrl(root);
            oServicioCtrl.rellenaCbxXidDependiente(cbxServicio, ((Tarifario) cbxtarifario.getSelectedItem()).getIdTarifario());
        } else {
            cbxServicio.removeAllItems();
        }
    }

    private void registrar() {
        if (isDatosValidos()) {
            if (operacion == NUEVO) {
                oProcedimiento = new Procedimiento();
                oProcedimientoBl = new ProcedimientoBl();
                oProcedimiento.setServicio((Servicio) cbxServicio.getSelectedItem());
                oProcedimiento.setDenominacion(txfProcedimiento.getText().trim().toUpperCase());
                oProcedimiento.setCosto(new BigDecimal(txfCosto.getText().trim()));
                oProcedimiento.setEstado("ACT");

                oProcedimiento = oProcedimientoBl.registrar(oProcedimiento);

                if (oProcedimiento.getIdprocedimiento() > 0) {
                    Mensajes.msjRegCorrecta();
                    iniciar();
                } else {
                    Mensajes.msjRegError();
                }
            } else if (operacion == EDITAR) {
                if(oProcedimientoTab != null){
                    oProcedimientoBl = new ProcedimientoBl();
                    oProcedimientoTemp = new Procedimiento();
                    oProcedimientoTemp.setIdprocedimiento(oProcedimientoTab.getIdprocedimiento());
                    oProcedimientoTemp.setServicio((Servicio) cbxServicio.getSelectedItem());
                    oProcedimientoTemp.setDenominacion(txfProcedimiento.getText().trim().toUpperCase());
                    oProcedimientoTemp.setCosto(new BigDecimal(txfCosto.getText().trim()));
                    oProcedimientoTemp.setEstado("ACT");
                    
                    if(oProcedimientoBl.actualizar(oProcedimientoTemp) == 0){
                        Mensajes.msjActCorrecta();
                        iniciar();
                    }else{
                        Mensajes.msjActErronea();
                    }
                    
                }
                
            }

        } else {
            Mensajes.msjValidarIngreso();
        }
    }

    private boolean isDatosValidos() {
        return (cbxtarifario.getSelectedIndex() > 0
                && cbxServicio.getSelectedIndex() > 0
                && !txfProcedimiento.getText().trim().equals("")
                && !txfCosto.getText().trim().equals(""));
    }

    private void estadoBotones(boolean nuevo, boolean editar, boolean guardar, boolean cancelar) {
        btnNuevo.setEnabled(nuevo);
        btnEditar.setEnabled(editar);
        btnGuardar.setEnabled(guardar);
        btnCancelar.setEnabled(cancelar);
    }

    private void preparaNuevo() {
        operacion = 1;
        txfBusqueda.setText("");
        oModeloProcedimiento.clear();
        personalizaTabla();
        habilitaDeshabilitaDatosServicio(true);
        estadoBotones(false, false, true, true);
    }

    private void personalizaTabla() {
        Utilitarios.formateaColumna(0, tblResultados, 60);
        Utilitarios.formateaColumna(4, tblResultados, 60);

        Utilitarios.alinearDatosColumnaTablaDerecha(4, tblResultados);

    }

    private void habilitaDeshabilitaDatosServicio(boolean estado) {
        cbxtarifario.setEnabled(estado);
        cbxServicio.setEnabled(estado);
        txfProcedimiento.setEnabled(estado);
        txfCosto.setEnabled(estado);
        
    }

    private void cancelar() {
        iniciar();
    }

    private void preparaEditar() {
        if (tblResultados.getRowSelectionAllowed() && tblResultados.getSelectedRow() != -1) {
            operacion = 2;
            habilitaDeshabilitaDatosServicio(true);
            estadoBotones(false, false, true, true);
        }

    }

    private void obtenerDatos() {
        if (tblResultados.getRowSelectionAllowed() && tblResultados.getSelectedRow() != -1) {
            oProcedimientoTab =  oModeloProcedimiento.get(tblResultados.getSelectedRow());
            if(oProcedimientoTab != null){
                oTarifarioCtrl.recuperaDatosCbx(oProcedimientoTab.getServicio().getTarifario().getIdTarifario(), cbxtarifario);
                oServicioCtrl.recuperaDatosCbx(oProcedimientoTab.getServicio().getIdservicio(), cbxServicio);
                txfProcedimiento.setText(oProcedimientoTab.getDenominacion());
                txfCosto.setText(oProcedimientoTab.getCosto().toString());
                estadoBotones(false, true, false, true);
                habilitaDeshabilitaDatosServicio(false);
            }
        }else{
            Mensajes.tblSelected();
        }
    }

    private void buscar() {
        listProcedimiento = new LinkedList<>();
        oProcedimientoBl = new ProcedimientoBl();
        oModeloProcedimiento.clear();
        if(!txfBusqueda.getText().trim().toUpperCase().equals("")){
            String ref = txfBusqueda.getText().trim().toUpperCase();
            listProcedimiento = oProcedimientoBl.listarRef(ref);
            if(!listProcedimiento.isEmpty()){
                for (Procedimiento procedimiento : listProcedimiento) {
                    oModeloProcedimiento.add(procedimiento);
                }
            }else{
                oModeloProcedimiento.clear();
            }
        }else{
            oModeloProcedimiento.clear();
        }
    }

    private void insertarServicioAdd() {
        root.insertarInternalFrames(root.jifServicioAdd);
        root.jifServicioAdd.iniciar();
        root.jifServicioAdd.enviaJif(this);
        
    }
}
