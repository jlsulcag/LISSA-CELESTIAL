package lissa.gui.farmacia;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import lissa.be.Almacen;
import lissa.be.AlmacenProducto;
import lissa.be.Compra;
import lissa.be.DetalleCompra;
import lissa.be.DetalleKardex;
import lissa.be.Kardex;
import lissa.be.Producto;
import lissa.be.Proveedor;
import lissa.bl.AlmacenProductoBl;
import lissa.bl.CompraBl;
import lissa.bl.DetalleCompraBl;
import lissa.bl.DetalleKardexBl;
import lissa.bl.KardexBl;
import lissa.bl.ProveedorBl;
import lissa.controller.AlmacenCtrl;
import lissa.ds.DSConeccion;
import lissa.gui.JF_Principal;
import lissa.reportes.ReportGeneric;
import lissa.table.ModeloDocCompra;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

public class JIF_BuscarComprobanteCompras extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private ModeloDocCompra oModeloDocCompra;
    private List<Compra> listCompra;
    private CompraBl oCompraBl;
    private Compra oCompra;
    private Proveedor oProveedor;
    private ProveedorBl oProveedorBl;
    private Compra oCompraTemp2;
    private DetalleCompra oDetalleCompra;
    private DetalleCompraBl oDetalleCompraBl;
    private List<DetalleCompra> listDetalleCompra;
    private Kardex oKardex;
    private KardexBl oKardexBl;
    private JComboBox cbxAlmacen;
    private AlmacenCtrl oAlmacenCtrl;
    private DetalleKardex oDetalleKardex;
    private DetalleKardexBl oDetalleKardexBl;
    private AlmacenProducto oAlmacenProducto;
    private AlmacenProductoBl oAlmacenProductoBl;
    //Variables para el reporte
    private ReportGeneric reportGenric = null;
    private JPanel reportPanel = null;
    private DSConeccion ds = null;
    private JInternalFrame reportVisor = null;

    public JIF_BuscarComprobanteCompras(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloDocCompra = new ModeloDocCompra();
        tblResultados.setModel(oModeloDocCompra);
        cbxAlmacen = new JComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txfNumRuc = new javax.swing.JTextField();
        btnBusqAvanzada = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txfMotivoAnulacion = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Búsqueda comprobantes de compra");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("N° Comprobante :");

        txfNumRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNumRucKeyReleased(evt);
            }
        });

        btnBusqAvanzada.setText("Búsqueda Avanzada");
        btnBusqAvanzada.setEnabled(false);
        btnBusqAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusqAvanzadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNumRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBusqAvanzada)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBusqAvanzada)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txfNumRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

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

        jButton2.setText("Anular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Motivo de anulación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txfMotivoAnulacion)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txfMotivoAnulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txfNumRucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNumRucKeyReleased
        Utilitarios.validaCaracterNumerico(evt, txfNumRuc);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txfNumRuc.getText().trim().equals("")) {
                buscarPersonaxNumComprobante(txfNumRuc.getText().trim().toUpperCase());
//                oProveedor = buscarProveedorxRuc(txfNumRuc.getText().trim().toUpperCase());
//                if (oProveedor != null) {
//                    txfRazonSocial.setText(oProveedor.getPersonaJuridica().getRazonSocial());
//                    listdocsCompras(oProveedor.getIdproveedor());
//                }
                personalizarTabla();
            } else {
                Mensajes.msjValidarIngreso();
            }
        }
    }//GEN-LAST:event_txfNumRucKeyReleased

    private void btnBusqAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusqAvanzadaActionPerformed
//        root.jifBuscarPersonaNatural.setInvocador(JIF_BuscarPersonaNatural.JIF_BUSCAR_COMPROBANTE_VENTA);
//        root.insertarInternalFrames(root.jifBuscarPersonaNatural);
    }//GEN-LAST:event_btnBusqAvanzadaActionPerformed

    private void tblResultadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseReleased
        obtenerDatos();
    }//GEN-LAST:event_tblResultadosMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        procesarAnulacion();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        if (oCompra.getEstado().equals("ANU")) {
            Mensajes.docAnulado();
        } else {
            imprimirComprobante(oCompra);
        }

    }//GEN-LAST:event_btnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqAvanzada;
    private javax.swing.JButton btnImprimir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txfMotivoAnulacion;
    private javax.swing.JTextField txfNumRuc;
    // End of variables declaration//GEN-END:variables

    private void personalizarTabla() {
        System.out.println("");
    }

    private Proveedor buscarProveedorxRuc(String ruc) {
        oProveedorBl = new ProveedorBl();
        return oProveedorBl.buscar(ruc);
    }

    private void listdocsCompras(long idproveedor) {
        listCompra = new LinkedList<>();
        oCompraBl = new CompraBl();
        oModeloDocCompra.clear();
        listCompra = oCompraBl.listarxIdProveedor(idproveedor);
        for (Compra comp : listCompra) {
            oModeloDocCompra.add(comp);
        }
    }

    private void obtenerDatos() {
        //oCompra = new Compra();
        if (tblResultados.getRowSelectionAllowed() && tblResultados.getSelectedRow() != -1) {
            oCompra = oModeloDocCompra.get(tblResultados.getSelectedRow());
        }
    }

    private void imprimirComprobante(Compra oCompra) {

        try {
            ds = new lissa.ds.DSConeccion(root.getConfig());
            reportGenric = new ReportGeneric(ds.getConeccion());
            reportGenric.setReportParent("/lissa/reportes/");
            reportPanel = reportGenric.mkReport("Far_ComprobanteCompra", new String[]{"ID_COMPRA"}, new Object[]{oCompra.getIdcompra()});
            reportVisor = new JInternalFrame();
            reportVisor.setTitle("Comprobante");
            reportVisor.setIconifiable(true);
            reportVisor.setClosable(true);
            reportVisor.setResizable(true);
            reportVisor.getContentPane().add(reportPanel);
            root.insertarInternalFrames(reportVisor);
            reportVisor.setMaximum(true);
        } catch (Exception ex) {
            Logger.getLogger(JIF_BuscarComprobanteCompras.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void procesarAnulacion() {
        if (isDatosValidos()) {
            int resAlmacenStock = -1;
            int res = anular();//Anula compra
            if (res == 0) {//Exito de actualizacion
                //registrar movimientos  de kardex
                oKardex = registrarKardex();
                //Buscar detalles de la compra seleccionada para la salida de las cantidades de almacen
                oDetalleCompraBl = new DetalleCompraBl();
                listDetalleCompra = oDetalleCompraBl.listarXCompra(oCompra);
                if (!listDetalleCompra.isEmpty()) {
                    //actualizar el stock a sacar de almacen
                    for (DetalleCompra obj : listDetalleCompra) {
                        if (oKardex != null) {
//                            registrarDetalleKardex(oKardex, listDetalleCompra);
                            registrarDetalleKardex(oKardex, obj);
                        }
                        resAlmacenStock = actualizarAlmacenStock(obj);//Actualizar Stock en el almacen que corresponda
                        if (resAlmacenStock == 0) {
                            Mensajes.msjRegCorrecta();
                            inicializar();
                        } else {
                            Mensajes.msjRegError();
                        }
                    }
                }
            }
        } else {
            Mensajes.msjValidarIngreso();
        }
    }

    private boolean isDatosValidos() {
        return (tblResultados.getRowSelectionAllowed()
                && tblResultados.getSelectedRow() != -1
                && !txfMotivoAnulacion.getText().trim().toUpperCase().equals(""));
    }

    private int anular() {
        oCompraBl = new CompraBl();
        oCompraTemp2 = new Compra();

        oCompraTemp2.setIdcompra(oCompra.getIdcompra());
        oCompraTemp2.setFarComprobante(oCompra.getFarComprobante());
        oCompraTemp2.setNumeroComprobante(oCompra.getNumeroComprobante());
        oCompraTemp2.setFechaCompra(oCompra.getFechaCompra());
        oCompraTemp2.setIdProveedor(oCompra.getIdProveedor());
        oCompraTemp2.setSerie(oCompra.getSerie());
        oCompraTemp2.setHoraReg(oCompra.getHoraReg());
        oCompraTemp2.setFechaReg(oCompra.getFechaReg());
        oCompraTemp2.setValorNeto(oCompra.getValorNeto());
        oCompraTemp2.setValorIgv(oCompra.getValorIgv());
        oCompraTemp2.setValorBruto(oCompra.getValorBruto());
        oCompraTemp2.setEstado("ANU");
        oCompraTemp2.setMotivoAunulacion(txfMotivoAnulacion.getText().trim().toUpperCase());
        oCompraTemp2.setNumeroCompra(oCompra.getNumeroCompra());
        oCompraTemp2.setIdUsuarioReg(oCompra.getIdUsuarioReg());
        oCompraTemp2.setValorDescuento(oCompra.getValorDescuento());
        oCompraTemp2.setValorTotal(oCompra.getValorTotal());

        int res = oCompraBl.actualizar(oCompraTemp2);
        return res;
    }

    private Kardex registrarKardex() {
        oKardex = new Kardex();
        oKardexBl = new KardexBl();

        //oKardex.setAlmacenByIdDestino(null); //destino = ninguno
        oKardex.setAlmacenByIdAlmacenAfectado((Almacen) cbxAlmacen.getSelectedItem()); // afectado es almacen
        oKardex.setTipoOperacion("SALIDA");
        oKardex.setOperacion("ANULACIÓN DE COMPRA");
        oKardex.setFechaMov(new Date());
        oKardex.setHoraMov(Utilitarios.horaActual());
        oKardex.setComprobante("");
        oKardex.setNumSerie("");
        oKardex.setNumComprobante(0);
        oKardex.setPersonaOrigen("");
        oKardex.setPersonaDestino("");
        oKardex.setObservacion("");

        return oKardexBl.registrar(oKardex);
    }

    public void inicializar() {
        txfNumRuc.setText("");
        txfMotivoAnulacion.setText("");
        cargarCbxAlmacen();
        oModeloDocCompra.clear();
    }

    private void cargarCbxAlmacen() {
        oAlmacenCtrl = new AlmacenCtrl(root);
        oAlmacenCtrl.rellenaAlmacen(cbxAlmacen);
        oAlmacenCtrl.defaultSelectAlmacen("almacen", cbxAlmacen);
    }

    private void registrarDetalleKardex(Kardex oKardex, DetalleCompra obj) {
        //for (int i = 0; i < listDetalleCompra.size(); i++) {
            oDetalleKardex = new DetalleKardex();
            oDetalleKardexBl = new DetalleKardexBl();
//            oDetalleCompra = listDetalleCompra.get(i);
            oDetalleCompra = obj;

            oDetalleKardex.setKardex(oKardex);
            oDetalleKardex.setProducto(oDetalleCompra.getProducto());
            if(oDetalleCompra.getIsUnitario()){
                oDetalleKardex.setCantidad(oDetalleCompra.getCantidad());
            }else{
                oDetalleKardex.setCantidad(oDetalleCompra.getCantidad()*oDetalleCompra.getProducto().getFraccion());
            }
            
            //Buscar Stock anterior
            long stockAnt = stockAnterior(oDetalleCompra.getProducto().getIdproducto(), ((Almacen) cbxAlmacen.getSelectedItem()).getIdalmacen());
            System.out.println("stock anterior "+stockAnt);
            
            oDetalleKardex.setStockAntOrig(Integer.parseInt(stockAnt + ""));
            oDetalleKardex.setStockActOrig(Integer.parseInt((stockAnt - oDetalleKardex.getCantidad()) + ""));
            oDetalleKardex.setStockAnt(Integer.parseInt(stockAnt + ""));
            oDetalleKardex.setStockActual(Integer.parseInt((stockAnt - oDetalleKardex.getCantidad()) + ""));
            int num = oDetalleKardexBl.maxNumMov();
            oDetalleKardex.setNumeroMovimiento(num + 1);
            //

            oDetalleKardexBl.registrar(oDetalleKardex);
        //}
    }

    private long stockAnterior(int idproducto, int idalmacen) {
        oAlmacenProductoBl = new AlmacenProductoBl();
        return oAlmacenProductoBl.buscar(idproducto, idalmacen);
    }

    private int actualizarAlmacenStock(DetalleCompra obj) {
        int res = -1;
//        for (int i = 0; i < listDetalleCompra.size(); i++) {
            oAlmacenProducto = new AlmacenProducto();
            oAlmacenProductoBl = new AlmacenProductoBl();
            //buscar en almacen por producto y nombre de almacen para su actualizacion y lote y retornar el objeto a actualizar
            //Buscar por lote
            oDetalleCompra = obj;
            oAlmacenProducto = buscarAlmacenProductoXlote(oDetalleCompra.getLote(), (Almacen) cbxAlmacen.getSelectedItem(), oDetalleCompra.getProducto());
            oAlmacenProducto.setStockActual(oAlmacenProducto.getStockActual() + oDetalleCompra.getCantidad());
            res = oAlmacenProductoBl.actualizar(oAlmacenProducto);
//        }
        return res;
    }

    private AlmacenProducto buscarAlmacenProductoXlote(String lote, Almacen oAlmacen, Producto oProducto) {
        oAlmacenProductoBl = new AlmacenProductoBl();
        return oAlmacenProductoBl.buscarProductoxAlmacenyLote(lote, oAlmacen, oProducto);
    }

    private void buscarPersonaxNumComprobante(String num) {
        oCompraBl = new CompraBl();
        listCompra = oCompraBl.listarXNumComprobante(num);
        oModeloDocCompra.clear();
        if (!listCompra.isEmpty()) {
            for (Compra obj : listCompra) {
                oModeloDocCompra.add(obj);
            }
        } else {
            Mensajes.msjResultVacio();
        }
    }
}
