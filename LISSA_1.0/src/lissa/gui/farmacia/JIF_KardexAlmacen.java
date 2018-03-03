
package lissa.gui.farmacia;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import lissa.be.Almacen;
import lissa.be.DetalleKardex;
import lissa.be.Producto;
import lissa.bl.DetalleKardexBl;
import lissa.bl.ProductoBl;
import lissa.controller.AlmacenCtrl;
import lissa.gui.JF_Principal;
import lissa.table.ModeloKardexAlmacen;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

public class JIF_KardexAlmacen extends javax.swing.JInternalFrame {
    private JF_Principal root;
    private ModeloKardexAlmacen oModeloKardexAlmacen;
    private DetalleKardexBl oDetalleKardexBl;
    private ArrayList<DetalleKardex> listDetalleKardex;
    private ProductoBl oProductoBl;
    private ArrayList<Producto> listProducto;
    private AlmacenCtrl oAlmacenCtrl;
    public JIF_KardexAlmacen(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloKardexAlmacen = new ModeloKardexAlmacen();
        tblKardex.setModel(oModeloKardexAlmacen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxProducto = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKardex = new javax.swing.JTable();
        btnProcesar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxAlmacen = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Kardex");

        jLabel1.setText("Producto : ");

        tblKardex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblKardex);

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel4.setText("Almacen :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAlmacen, 0, 104, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320)
                        .addComponent(btnProcesar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cbxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(cbxAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProcesar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        if(isDatosValidos()){
            listarKardex();
        }else{
            Mensajes.msjValidarIngreso();
        }
    }//GEN-LAST:event_btnProcesarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox cbxAlmacen;
    private javax.swing.JComboBox cbxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKardex;
    // End of variables declaration//GEN-END:variables

    public void inicializar() {
        cargarCbxProducto();
        cargarCbxAlmacen();
        defaultAlmacen();
    }

    private void cargarCbxProducto() {
        oProductoBl = new ProductoBl();
        listProducto= oProductoBl.listar("");
        cbxProducto.removeAllItems();
        cbxProducto.addItem("<Seleccione>");
        if(!listProducto.isEmpty()){
            for (Producto oProducto : listProducto) {
                oProducto.setOp(Producto.DATO);
                cbxProducto.addItem(oProducto);
            }
        }
    }

    private boolean isDatosValidos() {
        return (cbxProducto.getSelectedIndex() > 0);
    }

    private void listarKardex() {
        oDetalleKardexBl = new DetalleKardexBl();
        listDetalleKardex = oDetalleKardexBl.kardexXalmacen(((Almacen)cbxAlmacen.getSelectedItem()).getNombre(), ((Producto)cbxProducto.getSelectedItem()).getNombre());
        //listDetalleKardex = oDetalleKardexBl.listar(((Producto)cbxProducto.getSelectedItem()).getNombre());
        oModeloKardexAlmacen.clear();
        if(!listDetalleKardex.isEmpty()){
            oModeloKardexAlmacen.addAll(listDetalleKardex);
        }else{
            JOptionPane.showMessageDialog(null, "No existe movimientos", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cargarCbxAlmacen() {
        oAlmacenCtrl = new AlmacenCtrl(root);
        oAlmacenCtrl.rellenaAlmacen(cbxAlmacen);
    }

    private void defaultAlmacen() {
        oAlmacenCtrl = new AlmacenCtrl(root);
        oAlmacenCtrl.defaultSelectAlmacen("ALMACEN", cbxAlmacen);
    }
}
