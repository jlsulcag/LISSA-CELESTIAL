/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lissa.gui;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import lissa.be.FondoPrevisionTemp;
import lissa.be.FondoSolidaridad;
import lissa.be.Persona;
import lissa.be.ServicioFondoSolidaridad;
import lissa.bl.FondoPrevisionBl;
import lissa.bl.FondoSolidaridadTempBl;
import lissa.bl.ServicioFondoSolidaridadBl;
import lissa.table.ModeloFondoPrevision;
import lissa.table.ModeloServicioFondoS;
public class JIF_FondoPrevision extends javax.swing.JInternalFrame {

    private Persona oPersona;
    private JF_Principal root;
    private ModeloFondoPrevision oModeloFondoPrevision;
    private ArrayList<FondoSolidaridad> listFondos;
    private FondoSolidaridad oFondoSolidaridad;
    private FondoPrevisionBl oBlFondoPrevision;
    private FondoSolidaridad beanTablaFS;
    private ModeloServicioFondoS oModeloServicioFondoS = null;
    private ServicioFondoSolidaridad oServicioFondoSolidaridad = null;
    private ServicioFondoSolidaridadBl oServicioFondoSolidaridadBl = null;
    private FondoPrevisionTemp oFondoPrevisionTemp = null;
    private FondoSolidaridadTempBl oFondoSolidaridadTempBl = null;

    public JIF_FondoPrevision(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloFondoPrevision = new ModeloFondoPrevision();
        tblFondoPrevision.setModel(oModeloFondoPrevision);
        oModeloServicioFondoS = new ModeloServicioFondoS();
        tblAtenciones.setModel(oModeloServicioFondoS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bntCargar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFondoPrevision = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAtenciones = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Fondo de Previsión");
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

        bntCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/arrow.png"))); // NOI18N
        bntCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCargarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fondo de Previsión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tblFondoPrevision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFondoPrevision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblFondoPrevisionMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblFondoPrevision);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atenciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tblAtenciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblAtenciones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(608, Short.MAX_VALUE)
                .addComponent(bntCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bntCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCargarActionPerformed
        if (beanTablaFS == null || beanTablaFS.getIdFondoSolidaridad() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un item", "Atención", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //cargarDatos();
            this.doDefaultCloseAction();
            oModeloFondoPrevision.clear();
            oModeloServicioFondoS.clear();
            beanTablaFS = null;
        }
    }//GEN-LAST:event_bntCargarActionPerformed

    private void tblFondoPrevisionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFondoPrevisionMouseReleased
        if (tblFondoPrevision.getRowSelectionAllowed()) {
            obtenerDatos();
        }
    }//GEN-LAST:event_tblFondoPrevisionMouseReleased

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        limpiarTablas();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCargar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAtenciones;
    private javax.swing.JTable tblFondoPrevision;
    // End of variables declaration//GEN-END:variables

    void cargarDatos(Persona beanTabla) {
        this.oPersona = beanTabla;
        oFondoSolidaridad = new FondoSolidaridad();
        
        if (oPersona != null) {
            oBlFondoPrevision = new FondoPrevisionBl();
            listFondos = oBlFondoPrevision.listar(oPersona.getIdPersona());
            oFondoSolidaridad.setPersona(oPersona);
            if (listFondos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La persona no tiene fondos", "ATENCION", JOptionPane.ERROR_MESSAGE);
            } else {
                oModeloFondoPrevision.addAll(listFondos);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Verifique sus datos", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
    }

//    private void cargarDatos() {
//        root.jifEmitirComprobante.cargarDatos(beanTablaFS);
//    }

    private void obtenerDatos() {
        beanTablaFS = (FondoSolidaridad) oModeloFondoPrevision.get(tblFondoPrevision.getSelectedRow());
        //listar atenciones por  cada fondo de solidaridad
        oModeloServicioFondoS.clear();
        if (!beanTablaFS.getServicioFondoSolidaridads().isEmpty()) {
            for (ServicioFondoSolidaridad seviciofp : beanTablaFS.getServicioFondoSolidaridads()) {
                oModeloServicioFondoS.add(seviciofp);
            }
        }
        //listarAtenciones(beanTablaFS.getIdFondoSolidaridad());
    }
    
    private void limpiarTablas() {
        oModeloFondoPrevision.clear();
        oModeloServicioFondoS.clear();
    }

    void enviarDatosPersona(Persona oPersona) {
        this.oPersona = oPersona;
        if(this.oPersona != null){
            listarFondoPrevisionXIdSocio(oPersona.getIdPersona());
        }
    }
    
    private void listarFondoPrevisionXIdSocio(int idPersona) {
        oFondoSolidaridad = new FondoSolidaridad();
        oBlFondoPrevision = new FondoPrevisionBl();
        ArrayList<FondoSolidaridad> list;
        list = oBlFondoPrevision.listar(idPersona);
        if (!list.isEmpty()) {
            oModeloFondoPrevision.addAll(list);
        }
    }
}
