package lissa.gui.farmacia;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import lissa.be.AlmacenProducto;
import lissa.be.DetalleVenta;
import lissa.gui.JF_Principal;

/**
 *
 * @author JSULCAG
 */
public class JIF_CantidadVenta extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private AlmacenProducto oAlmacenProducto;
    private DetalleVenta oDetalleVenta;

    private int invocador;
    public static final int JIF_VENTAS = 1;
    public static final int JIF_ALMACEN = 2;
    public static final int JIF_NOTASALIDA = 3;

    public JIF_CantidadVenta(JF_Principal root) {
        initComponents();
        this.root = root;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfCantidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txfPrecioSugerido = new javax.swing.JTextField();
        chbxPrecioSugerido = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txfPrecioMin = new javax.swing.JTextField();
        chbxPrecioMin = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txfPrecioMax = new javax.swing.JTextField();
        chbxPrecioMax = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cantidad");

        jLabel1.setText("Cantidad :");

        txfCantidad.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txfCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfCantidadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        jLabel2.setText("Precio Sugerido :");
        jPanel2.add(jLabel2);

        txfPrecioSugerido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfPrecioSugerido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txfPrecioSugerido);

        buttonGroup1.add(chbxPrecioSugerido);
        chbxPrecioSugerido.setSelected(true);
        chbxPrecioSugerido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(chbxPrecioSugerido);

        jLabel3.setText("Precio Min :");
        jPanel2.add(jLabel3);

        txfPrecioMin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfPrecioMin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPrecioMin.setEnabled(false);
        jPanel2.add(txfPrecioMin);

        buttonGroup1.add(chbxPrecioMin);
        chbxPrecioMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(chbxPrecioMin);

        jLabel4.setText("Precio Max :");
        jPanel2.add(jLabel4);

        txfPrecioMax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfPrecioMax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPrecioMax.setEnabled(false);
        jPanel2.add(txfPrecioMax);

        buttonGroup1.add(chbxPrecioMax);
        chbxPrecioMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(chbxPrecioMax);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (!txfCantidad.getText().trim().equals("")) {
            cargarDatos();
        }
        resetComponent();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txfCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAceptar.doClick();
        }
    }//GEN-LAST:event_txfCantidadKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbxPrecioMax;
    private javax.swing.JCheckBox chbxPrecioMin;
    private javax.swing.JCheckBox chbxPrecioSugerido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txfCantidad;
    private javax.swing.JTextField txfPrecioMax;
    private javax.swing.JTextField txfPrecioMin;
    private javax.swing.JTextField txfPrecioSugerido;
    // End of variables declaration//GEN-END:variables

    void enviarDatos(AlmacenProducto obj, int invocador) {
        oAlmacenProducto = obj;
        setInvocador(invocador);
        txfPrecioSugerido.setText(oAlmacenProducto.getPrecioVenta().toString());
        txfPrecioMin.setText(oAlmacenProducto.getPrecioMin().toString());
        txfPrecioMax.setText(oAlmacenProducto.getPrecioMax().toString());

    }

    public int getInvocador() {
        return invocador;
    }

    public void setInvocador(int invocador) {
        this.invocador = invocador;
    }

    private void cargarDatos() {
        oDetalleVenta = new DetalleVenta();
        oDetalleVenta.setProducto(oAlmacenProducto.getProducto());
        if (chbxPrecioSugerido.isSelected()) {//se guarda el precio ingresado en la caja de texto
            oDetalleVenta.setPrecioVenta(new BigDecimal(txfPrecioSugerido.getText().trim()));
        } else if (chbxPrecioMin.isSelected()) {
            oDetalleVenta.setPrecioVenta(oAlmacenProducto.getPrecioMin());
        } else if (chbxPrecioMax.isSelected()) {
            oDetalleVenta.setPrecioVenta(oAlmacenProducto.getPrecioMax());
        }
        oDetalleVenta.setLote(oAlmacenProducto.getLote());

        if (Integer.parseInt(txfCantidad.getText().trim()) > oAlmacenProducto.getStockActual()) {
            JOptionPane.showMessageDialog(null, "Stock no disponible", "Atención", JOptionPane.INFORMATION_MESSAGE);
            txfCantidad.setText("");
            txfCantidad.requestFocus();
        } else {
            oDetalleVenta.setCantidadVenta(Integer.parseInt(txfCantidad.getText().trim()));
            switch (getInvocador()) {
                case JIF_VENTAS:
                    root.jifRegVentas.enviaDatosProducto(oDetalleVenta);
                    break;
                case JIF_ALMACEN:
                    root.jifAlmacen.enviaDatosProducto(oDetalleVenta);
                    break;
                case JIF_NOTASALIDA:
                    root.jifNotaSalidafar.enviaDatosProducto(oDetalleVenta);
                    break;
            }
            this.doDefaultCloseAction();

        }
    }

    private void resetComponent() {
        txfCantidad.setText("");
        buttonGroup1.clearSelection();
        chbxPrecioSugerido.setSelected(true);
    }
}
