package lissa.gui;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JCheckBox;
import lissa.be.ItemsComprobante;
import lissa.be.Procedimiento;
import lissa.bl.ProcedimientoBl;
import lissa.render.TCellEditorLaboratorio;
import lissa.table.ModeloLaboratorioAd;
import lissa.table.ModeloProcedimiento;
import lissa.util.Mensajes;
import org.rx.cr.util.Utilitarios;

public class JIF_BuscarProcedimiento extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private ModeloProcedimiento oModeloProcedimiento;
    private Procedimiento oProcedimiento;
    private ProcedimientoBl oProcedimientoBl;
    private ModeloLaboratorioAd oModeloLaboratorioAd = null;
    private List<Procedimiento> listLaboratorio;
    private List<ItemsComprobante> listItemComprobante;
    private List<Procedimiento> listProcedimiento;

    public JIF_BuscarProcedimiento(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloProcedimiento = new ModeloProcedimiento();
        tblResultados.setModel(oModeloProcedimiento);
        oModeloLaboratorioAd = new ModeloLaboratorioAd();
        tblLaboratorio.setModel(oModeloLaboratorioAd);
        listProcedimiento = new LinkedList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txfBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLaboratorio = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Buscar Procedimiento");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setText("Procedimiento : ");

        txfBusqueda.setBackground(new java.awt.Color(255, 255, 204));
        txfBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBusquedaActionPerformed(evt);
            }
        });
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
        tblResultados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblResultadosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfBusqueda)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Procedimiento", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        tblLaboratorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLaboratorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaboratorioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLaboratorio);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jTabbedPane1.addTab("Laboratorio", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBusquedaActionPerformed

    }//GEN-LAST:event_txfBusquedaActionPerformed

    private void txfBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBusquedaKeyReleased
        buscarProcedimiento();
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tblResultados.requestFocus();
        }
    }//GEN-LAST:event_txfBusquedaKeyReleased

    private void tblResultadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblResultadosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            oProcedimiento = oModeloProcedimiento.get(tblResultados.getSelectedRow());
            root.jifEmitirComprobante.enviaDatosProcedimiento(oProcedimiento);
            this.doDefaultCloseAction();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            inicializar();
            txfBusqueda.requestFocus();
        }
    }//GEN-LAST:event_tblResultadosKeyPressed

    private void tblLaboratorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaboratorioMouseClicked
        //seleccionaProcedimiento(evt);
        try {
            oProcedimiento = new Procedimiento();
            if (tblLaboratorio.getColumnModel().getColumn(4).getCellEditor().getCellEditorValue().equals(true)) {
                oProcedimiento = oModeloLaboratorioAd.get(Utilitarios.seleccionarFila(evt));
                if (oProcedimiento != null) {
                    listProcedimiento.add(oProcedimiento);
                }

            }else{
                oProcedimiento = oModeloLaboratorioAd.get(Utilitarios.seleccionarFila(evt));
                if (oProcedimiento != null) {
                    listProcedimiento.remove(oProcedimiento);
                }
            }
        } catch (Exception e) {
            System.out.println("Error de seleccion :" + e);
            //e.printStackTrace();
        }
    }//GEN-LAST:event_tblLaboratorioMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        enviaProcedimientos();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblLaboratorio;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txfBusqueda;
    // End of variables declaration//GEN-END:variables
 private void buscarProcedimiento() {
        oProcedimientoBl = new ProcedimientoBl();
        String ref = txfBusqueda.getText().trim().toUpperCase();
        oModeloProcedimiento.clear();
        if (!ref.equals("")) {
            for (Procedimiento obj : oProcedimientoBl.listarRef(ref)) {
                oModeloProcedimiento.add(obj);
            }
            personalizaVistaTabla();
        } else {
            inicializar();
            //Mensajes.msjValidarIngreso();
        }

    }

    private void personalizaVistaTabla() {
        Utilitarios.formateaAnchoColumnaTabla(0, tblResultados, 80);
        Utilitarios.formateaAnchoColumnaTabla(3, tblResultados, 80);
    }

    void inicializar() {
        txfBusqueda.setText("");
        oModeloProcedimiento.clear();
        oModeloLaboratorioAd.clear();
        listarLaboratorioFull();
        personalizaVistaTabla();
        listProcedimiento.clear();
        tblLaboratorio.getColumnModel().getColumn(4).setCellEditor(new TCellEditorLaboratorio(new JCheckBox()));
    }

    private void listarLaboratorioFull() {
        oProcedimientoBl = new ProcedimientoBl();
        listLaboratorio = oProcedimientoBl.listarLaboratorio();
        if (!listLaboratorio.isEmpty()) {
            for (Procedimiento obj : listLaboratorio) {
                oModeloLaboratorioAd.add(obj);
            }
        }
    }

    private void seleccionaProcedimiento(MouseEvent evt) {
        //try {
        oProcedimiento = new Procedimiento();
        if (tblLaboratorio.getColumnModel().getColumn(4).getCellEditor().getCellEditorValue().equals(true)) {
            oProcedimiento = oModeloLaboratorioAd.get(Utilitarios.seleccionarFila(evt));
            if (oProcedimiento != null) {
                System.out.println("procedimiento " + oProcedimiento.getCosto());
            } else {
                System.out.println("false...");
            }

        }
//        } catch (Exception e) {
//            System.out.println("Error de seleccion :" + e);
//            e.printStackTrace();
//        }
    }

    private void enviaProcedimientos() {
        if(!listProcedimiento.isEmpty()){
            root.jifEmitirComprobante.enviaListProcedimientos(listProcedimiento);
            this.doDefaultCloseAction();
        }
    }
}
