package lissa.gui.farmacia;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import lissa.be.Caja;
import lissa.be.Persona;
import lissa.be.Rol;
import lissa.be.Usuario;
import lissa.bl.CajaBl;
import lissa.bl.ComprobanteBl;
import lissa.bl.VentaBl;
import lissa.ds.DSConeccion;
import lissa.gui.JF_Principal;
import lissa.gui.JIF_AtencionFondoPrev;
import lissa.reportes.ReportGeneric;
import lissa.table.ModeloCaja;

public class JIF_CerrarCajaFar extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private ModeloCaja modeloCaja;
    private ArrayList<Caja> listCajas;
    private CajaBl cajaBl;
    private Caja oCaja;

    private ComprobanteBl oComprobanteBl = null;
     private VentaBl oVentaBl = null;
    Calendar calendar = Calendar.getInstance();
    //Variable de Objeto Calendar
    BigDecimal totalFactura = new BigDecimal("0.00");
    BigDecimal totalBoleta = new BigDecimal("0.00");
    BigDecimal totalRecibo = new BigDecimal("0.00");
    BigDecimal totalFinal = new BigDecimal("0.00");
    BigDecimal totalDescuadre = new BigDecimal("0.00");
    BigDecimal totalContabilizado = new BigDecimal("0.00");

      //Variables para el reporte
    private ReportGeneric reportGenric = null;
    private JPanel reportPanel = null;
    private DSConeccion ds = null;
    private JInternalFrame reportVisor = null;
    
    public JIF_AtencionFondoPrev jifAtencionFondoPrev;

    private Usuario userTemp;
    private Persona perTemp;
    private Rol rolTemp;
    private String ParamTemp;

    public JIF_CerrarCajaFar(JF_Principal root) {
        initComponents();
        this.root = root;
        modeloCaja = new ModeloCaja();
        tblCajas.setModel(modeloCaja);
        jifAtencionFondoPrev = new JIF_AtencionFondoPrev(this.root);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jdcFechaCierre = new com.toedter.calendar.JDateChooser();
        jsHoraCierre = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCajas = new javax.swing.JTable();
        txfSaldoInicial = new javax.swing.JTextField();
        txfSaldoFinal = new javax.swing.JTextField();
        txfSaldoContabilizado = new javax.swing.JTextField();
        txfObservaciones = new javax.swing.JTextField();
        btnCerrarCaja = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txfDescuadre = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CIERRE DE CAJA");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Saldo Inicial :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total Final :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Total Contabilizado :");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fecha Cierre :");

        jdcFechaCierre.setEnabled(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Observaciones :");

        tblCajas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCajasMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblCajas);

        txfSaldoInicial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfSaldoInicial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSaldoInicial.setEnabled(false);

        txfSaldoFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfSaldoFinal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSaldoFinal.setEnabled(false);

        txfSaldoContabilizado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfSaldoContabilizado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSaldoContabilizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSaldoContabilizadoActionPerformed(evt);
            }
        });
        txfSaldoContabilizado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfSaldoContabilizadoKeyReleased(evt);
            }
        });

        btnCerrarCaja.setText("Cerrar Caja");
        btnCerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCajaActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Descuadre :");

        txfDescuadre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfDescuadre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfDescuadre.setEnabled(false);
        txfDescuadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDescuadreActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton1.setText("Ver Detalles");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Refresh.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfDescuadre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txfSaldoContabilizado)
                                    .addComponent(txfSaldoFinal)
                                    .addComponent(txfSaldoInicial))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jdcFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrarCaja)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jdcFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txfSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txfSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfSaldoContabilizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txfDescuadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarCaja)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        listarCajas();
        inicioHora();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tblCajas.getSelectedRow() != -1 && oCaja != null) {
            generarReporte();
        } else {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txfDescuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDescuadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDescuadreActionPerformed

    private void btnCerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCajaActionPerformed
        if (tblCajas.getSelectedRow() != -1) {
            cerrarCaja();
            resetComponents();
            listarCajas();
        } else {

        }
    }//GEN-LAST:event_btnCerrarCajaActionPerformed

    private void txfSaldoContabilizadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSaldoContabilizadoKeyReleased
        int code = evt.getKeyCode();
        if (code == KeyEvent.VK_ENTER) {
            calcularDescuadre();
        }
    }//GEN-LAST:event_txfSaldoContabilizadoKeyReleased

    private void txfSaldoContabilizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSaldoContabilizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSaldoContabilizadoActionPerformed

    private void tblCajasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCajasMouseReleased
        if (tblCajas.getRowSelectionAllowed()) {
            obtenerDatosCaja();
        }
    }//GEN-LAST:event_tblCajasMouseReleased

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
     resetComponents();
     inicioHora();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarCaja;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jdcFechaCierre;
    private javax.swing.JSpinner jsHoraCierre;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tblCajas;
    private javax.swing.JTextField txfDescuadre;
    private javax.swing.JTextField txfObservaciones;
    private javax.swing.JTextField txfSaldoContabilizado;
    private javax.swing.JTextField txfSaldoFinal;
    private javax.swing.JTextField txfSaldoInicial;
    // End of variables declaration//GEN-END:variables

    private void listarCajas() {
        cajaBl = new CajaBl();
        modeloCaja.clear();
        String caja;
        if (rolTemp.getDenominacion().trim().equals("FARMACIA")) {
            caja = "CAJA 02 - FARMACIA";
            listCajas = cajaBl.listarxUsuario(userTemp, caja);
        } else{
            caja = "CAJA 01 - CLINICA";
            listCajas = cajaBl.listarxUsuario(userTemp, caja);
        }
//System.out.println(rolTemp.getDenominacion());
//        listCajas = cajaBl.listarxUsuario(userTemp);
        System.out.println(listCajas.size());
        if (!listCajas.isEmpty()) {
            modeloCaja.addAll(listCajas);
        }
    }

    private void obtenerDatosCaja() {
        oCaja = new Caja();
        oCaja = modeloCaja.get(tblCajas.getSelectedRow());
        //OBTENER FECHA Y HORA DE CIERRE
        txfSaldoInicial.setText(oCaja.getSaldoInicial().toString());
//        calcularTotalRecibo(oCaja);
        calcularTotalBoleta(oCaja);
        calcularTotalFactura(oCaja);
        calcularTotalFinal();
        if (oCaja.getEstado().trim().equals("CERRADO")) {
            txfSaldoContabilizado.setText(oCaja.getSaldoContabilizado().toString());
            txfDescuadre.setText(oCaja.getDescuadre().toString());
        } else if (oCaja.getEstado().trim().equals("ABIERTO")) {
            txfSaldoContabilizado.setText("");
            txfDescuadre.setText("");
            lblMensaje.setText("");
        } else {
            resetComponents();
        }
    }

    private void resetComponents() {
        modeloCaja.clear();
        jdcFechaCierre.setDate(new Date());
        jsHoraCierre.setValue(new Date());
        txfSaldoInicial.setText("");
        txfSaldoFinal.setText("");
        txfSaldoContabilizado.setText("");
        txfDescuadre.setText("");
        txfObservaciones.setText("");
    }
    private void calcularTotalBoleta(Caja oCaja) {
        oVentaBl = new VentaBl();
        totalBoleta = oVentaBl.calcularTotalBoleta(oCaja);
    }

    private void calcularTotalFactura(Caja oCaja) {
        oVentaBl = new VentaBl();
        totalFactura = oVentaBl.calcularTotalFactura(oCaja);
    }
    private void calcularTotalFinal() {
        totalFinal = totalBoleta.add(totalFactura);
        txfSaldoFinal.setText(totalFinal.toString());
    }

    private void calcularDescuadre() {
        if (!txfSaldoContabilizado.getText().trim().equals("")) {
            totalContabilizado = new BigDecimal(txfSaldoContabilizado.getText().trim());
            totalDescuadre = totalFinal.subtract(totalContabilizado);
            txfDescuadre.setText(totalDescuadre.toString());
        }
        mostrarMensajeDescuadre();
    }

    private void mostrarMensajeDescuadre() {
        if (totalDescuadre.signum() == -1) {
            lblMensaje.setText("SOBRANTE");
            lblMensaje.setForeground(Color.BLUE);
        } else if (totalDescuadre.signum() == 0) {
            lblMensaje.setText("");
            //lblMensaje.setForeground(Color.BLUE);
        } else if (totalDescuadre.signum() == 1) {
            lblMensaje.setText("FALTANTE");
            lblMensaje.setForeground(Color.RED);
        }
    }

    private void inicioHora() {
        Calendar calendar = Calendar.getInstance();//Variable de Objeto Calendar  
        //fecha de sistema
        jdcFechaCierre.setCalendar(calendar);
        Date inicio = calendar.getTime();
        //Indicamos año hasta -100 del actual
        calendar.add(Calendar.YEAR, -100);
        //Guardamos la configuración en un DATE
        Date fechaAnterior = calendar.getTime();
        //Indicamos año hasta +200 del actual
        calendar.add(Calendar.YEAR, 200);
        //Guardamos la configuración en un DATE
        Date fechaPosterior = calendar.getTime();
        //Usamos el contructor de abajo para crear un modelo para el Spinner
        //SpinnerDateModel(Date value, Comparable start, Comparable end, int calendarField)
        //Utilizamos los datos que creamos más arriba
        //Para fecha utilizamos Calendar.YEAR y para hora Calendar.HOUR, el resto puede ser igual
        SpinnerModel fechaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.YEAR);
        SpinnerModel horaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.HOUR);
        //Indicamos el model para cada Spinner además del formato de fecha y hora según corresponda.
//        fecha.setModel(fechaModel);
//        fecha.setEditor(new JSpinner.DateEditor(fecha, "dd/MM/yyyy"));
        jsHoraCierre.setModel(horaModel);
        jsHoraCierre.setEditor(new JSpinner.DateEditor(jsHoraCierre, "HH:mm:ss"));
    }

    private void cerrarCaja() {
        cajaBl = new CajaBl();
        obtenerDatosCaja();
        if (oCaja.getEstado().trim().equals("ABIERTO")) {
            oCaja.setFechaCierre(jdcFechaCierre.getDate());
            SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");
            oCaja.setHoraCierre(hour.format(jsHoraCierre.getValue()));
            oCaja.setEstado("CERRADO");
            oCaja.setSaldoFinal(totalFinal);
            oCaja.setSaldoContabilizado(totalContabilizado);
            oCaja.setDescuadre(totalDescuadre);

            if (cajaBl.actualizar(oCaja) != 0) {
                JOptionPane.showMessageDialog(null, "La Caja se cerró correctamente", "Atención", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error durante el cierre de caja", "Atención", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La caja seleccionada ya está cerrada", "Atención", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void inicializar() {
        listarCajas();
        inicioHora();
    }

    public void cargarDatosUser(Usuario user, Persona oPersona, Rol oRol) {
        userTemp = user;
        perTemp = oPersona;
        rolTemp = oRol;
    }

    private void generarReporte() {
         try {
            ds = new DSConeccion(root.getConfig());
            reportGenric = new ReportGeneric(ds.getConeccion());
            reportGenric.setReportParent("/lissa/reportes/");
            reportPanel = reportGenric.mkReport("FarReportePorTurno", new String[]{"ID_CAJA"}, new Object[]{oCaja.getIdcaja()});
            reportVisor = new JInternalFrame();
            reportVisor.setTitle("Reporte por turno");
            reportVisor.setIconifiable(true);
            reportVisor.setClosable(true);
            reportVisor.getContentPane().add(reportPanel);
            root.insertarInternalFrames(reportVisor);
            reportVisor.setMaximum(true);
        } catch (Exception ex) {
             Logger.getLogger(JIF_CerrarCajaFar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}
