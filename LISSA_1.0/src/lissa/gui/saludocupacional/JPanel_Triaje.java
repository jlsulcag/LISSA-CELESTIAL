
package lissa.gui.saludocupacional;

import lissa.be.AtencionOcupacional;
import lissa.be.ExamenClinico;
import lissa.be.HistoriaClinica;
import lissa.be.Persona;
import lissa.be.Rol;
import lissa.be.SoFmoAntecedentesOcupacionales;
import lissa.be.Usuario;
import lissa.bl.ExamenClinicoBl;
import lissa.bl.SoFmoAntecedentesOcupacionalesBl;
import lissa.gui.JF_Principal;
import lissa.table.ModeloSoFmoAntOcup;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

public class JPanel_Triaje extends javax.swing.JPanel {
    private JF_Principal root;
    private ExamenClinico oExamenClinico;
    private ExamenClinicoBl oExamenClinicoBl;
    
    private AtencionOcupacional oAtencionOcupacional;
    private Usuario userTemp;
    private Persona perTemp;
    private Rol rolTemp;
    
    private SoFmoAntecedentesOcupacionales oSoFmoAntecedentesOcupacionales;
    private SoFmoAntecedentesOcupacionalesBl oSoFmoAntecedentesOcupacionalesBl;
    private ModeloSoFmoAntOcup oModeloSoFmoAntOcup;
    
    private double imc;

    public JPanel_Triaje(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloSoFmoAntOcup = new ModeloSoFmoAntOcup();
        tblAntOcup.setModel(oModeloSoFmoAntOcup);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txfTalla = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txfPeso = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txfImc = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txfPerimetroAbdominal = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txfFrecRespiratoria = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txfFrecCardiaca = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txfPa = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txfTemperatura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txfPa2 = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        txfEmpresa = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txfAreaTrabajo = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txfOcupacionOcupacional = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jdcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel58 = new javax.swing.JLabel();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel59 = new javax.swing.JLabel();
        txfTiempo = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txfExposicionOcupacional = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txfEPP = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAntOcup = new javax.swing.JTable();

        setBackground(new java.awt.Color(202, 237, 228));

        jPanel8.setBackground(new java.awt.Color(202, 237, 228));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMEN CLINICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel36.setBackground(new java.awt.Color(202, 237, 228));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Talla : ");

        txfTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfTallaKeyReleased(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(202, 237, 228));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Peso (Kg) : ");

        txfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPesoKeyReleased(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(202, 237, 228));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("IMC : ");

        txfImc.setEditable(false);
        txfImc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfImcKeyReleased(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(202, 237, 228));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Perimetro Abdominal : ");

        txfPerimetroAbdominal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPerimetroAbdominalKeyReleased(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(202, 237, 228));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("F. Resp. : ");

        txfFrecRespiratoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfFrecRespiratoriaKeyReleased(evt);
            }
        });

        jLabel41.setBackground(new java.awt.Color(202, 237, 228));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("F. Card. : ");

        txfFrecCardiaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfFrecCardiacaKeyReleased(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(202, 237, 228));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("PA : ");

        txfPa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPaKeyReleased(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(202, 237, 228));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Temperatura : ");

        txfTemperatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfTemperaturaKeyReleased(evt);
            }
        });

        jLabel1.setText("/");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfFrecRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(txfFrecCardiaca))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txfPa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPa2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txfImc, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txfPerimetroAbdominal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txfTemperatura))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfPerimetroAbdominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfFrecCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(txfPa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfFrecRespiratoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/cancel.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/Save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(202, 237, 228));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANTECEDENTES OCUPACIONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel54.setText("Empresa :");

        jLabel55.setText("Area de trabajo :");

        jLabel56.setText("Ocupación :");

        jLabel57.setText("Fecha de ingreso :");

        jdcFechaIngreso.setDateFormatString("dd/MM/yyyy");

        jLabel58.setText("Fecha de salida :");

        jdcFechaSalida.setDateFormatString("dd/MM/yyyy");

        jLabel59.setText("Tiempo :");

        jLabel60.setText("Exposición ocupacional :");

        jLabel61.setText("EPP :");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/add.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/remove.png"))); // NOI18N

        tblAntOcup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblAntOcup);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel54))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txfAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel58))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfOcupacionOcupacional))
                            .addComponent(txfEmpresa)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187)
                                .addComponent(jdcFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(txfExposicionOcupacional))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfEPP, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(txfTiempo))
                        .addGap(124, 124, 124)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txfAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(txfOcupacionOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel57)
                    .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(txfTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel60)
                    .addComponent(txfExposicionOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(txfEPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 880, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (isDatosValidos() && isDatosValidosAntOcup()) {
            registrar();
            resetComponent();
            resetComponentAntOcup();
        } else {
            Mensajes.msjValidarIngreso();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        resetComponent();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txfTallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTallaKeyReleased
        Utilitarios.validaCaracterNumericoMoneda(evt, txfTalla);
    }//GEN-LAST:event_txfTallaKeyReleased

    private void txfPesoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPesoKeyReleased
        Utilitarios.validaCaracterNumericoMoneda(evt, txfPeso);
        calcularImc();
    }//GEN-LAST:event_txfPesoKeyReleased

    private void txfImcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfImcKeyReleased
        Utilitarios.validaCaracterNumericoMoneda(evt, txfImc);
    }//GEN-LAST:event_txfImcKeyReleased

    private void txfPerimetroAbdominalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPerimetroAbdominalKeyReleased
        Utilitarios.validaCaracterNumericoMoneda(evt, txfPerimetroAbdominal);
    }//GEN-LAST:event_txfPerimetroAbdominalKeyReleased

    private void txfFrecRespiratoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfFrecRespiratoriaKeyReleased
        Utilitarios.validaCaracterNumericoMoneda(evt, txfFrecRespiratoria);
    }//GEN-LAST:event_txfFrecRespiratoriaKeyReleased

    private void txfFrecCardiacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfFrecCardiacaKeyReleased
        Utilitarios.validaCaracterNumericoMoneda(evt, txfFrecCardiaca);
    }//GEN-LAST:event_txfFrecCardiacaKeyReleased

    private void txfPaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPaKeyReleased
        Utilitarios.validaCaracterNumericoMoneda(evt, txfPa);
    }//GEN-LAST:event_txfPaKeyReleased

    private void txfTemperaturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTemperaturaKeyReleased
        Utilitarios.validaCaracterNumericoMoneda(evt, txfTemperatura);
    }//GEN-LAST:event_txfTemperaturaKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (isDatosValidosAntOcup()) {
            agregarAntOcup();
            resetComponentAntOcup();
            txfEmpresa.requestFocus();
        } else {
            Mensajes.msjValidarIngreso();
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private com.toedter.calendar.JDateChooser jdcFechaIngreso;
    private com.toedter.calendar.JDateChooser jdcFechaSalida;
    private javax.swing.JTable tblAntOcup;
    private javax.swing.JTextField txfAreaTrabajo;
    private javax.swing.JTextField txfEPP;
    private javax.swing.JTextField txfEmpresa;
    private javax.swing.JTextField txfExposicionOcupacional;
    private javax.swing.JTextField txfFrecCardiaca;
    private javax.swing.JTextField txfFrecRespiratoria;
    private javax.swing.JTextField txfImc;
    private javax.swing.JTextField txfOcupacionOcupacional;
    private javax.swing.JTextField txfPa;
    private javax.swing.JTextField txfPa2;
    private javax.swing.JTextField txfPerimetroAbdominal;
    private javax.swing.JTextField txfPeso;
    private javax.swing.JTextField txfTalla;
    private javax.swing.JTextField txfTemperatura;
    private javax.swing.JTextField txfTiempo;
    // End of variables declaration//GEN-END:variables

    private boolean isDatosValidos() {
        return true;
    }

    private void registrar() {
        oExamenClinico = registrarExamenClinico(); 
        registrarAntOcupacionales(oAtencionOcupacional.getHistoriaClinica());
        if (oExamenClinico != null) {
            Mensajes.msjRegCorrecta();
        } else {
            Mensajes.msjRegError();
        }
    }

    private ExamenClinico registrarExamenClinico() {
        oExamenClinico = new ExamenClinico();
        oExamenClinicoBl = new ExamenClinicoBl();
        oExamenClinico.setAtencionOcupacional(oAtencionOcupacional);
        oExamenClinico.setIdUsuario(userTemp.getIdUsuario());
        oExamenClinico.setTalla(Double.parseDouble(txfTalla.getText().trim()));
        oExamenClinico.setPeso(Double.parseDouble(txfPeso.getText().trim()));
        oExamenClinico.setImc(Double.parseDouble(txfImc.getText().trim()));
        oExamenClinico.setPerimetroAbdominal(Double.parseDouble(txfPerimetroAbdominal.getText().trim()));
        oExamenClinico.setFrecRespiratoria(Double.parseDouble(txfFrecRespiratoria.getText().trim()));
        oExamenClinico.setFrecCardiaca(Double.parseDouble(txfFrecCardiaca.getText().trim()));
        oExamenClinico.setPresionArterial(Double.parseDouble(txfPa.getText().trim()));
        oExamenClinico.setTemperatura(Double.parseDouble(txfTemperatura.getText().trim()));
        oExamenClinico.setPresionArterial2(Double.parseDouble(txfPa2.getText().trim()));
        
        return oExamenClinicoBl.registrar(oExamenClinico);
    }

    private void resetComponent() {
        txfTalla.setText("");
        txfPeso.setText("");
        txfImc.setText("");
        txfPerimetroAbdominal.setText("");
        txfFrecRespiratoria.setText("");
        txfFrecCardiaca.setText("");
        txfPa.setText("");
        txfPa2.setText("");
        txfTemperatura.setText("");
        oModeloSoFmoAntOcup.clear();
    }

    void enviarDatosAtencionOcupacionalApanel(AtencionOcupacional oAtencionOcupacional) {
        this.oAtencionOcupacional = oAtencionOcupacional;
    }

    void enviarDatosUser(Usuario userTemp, Persona perTemp, Rol rolTemp) {
        this.userTemp = userTemp;
        this.perTemp = perTemp;
        this.rolTemp = rolTemp;
    }
    
    private boolean isDatosValidosAntOcup() {
        return true;
    }

    private void agregarAntOcup() {
        oSoFmoAntecedentesOcupacionales = new SoFmoAntecedentesOcupacionales();
        oSoFmoAntecedentesOcupacionales.setEmpresa(txfEmpresa.getText().toUpperCase().trim());
        oSoFmoAntecedentesOcupacionales.setAreaTrabajo(txfAreaTrabajo.getText().toUpperCase().trim());
        oSoFmoAntecedentesOcupacionales.setOcupacion(txfOcupacionOcupacional.getText().toUpperCase().trim());
        oSoFmoAntecedentesOcupacionales.setFechaIngreso(jdcFechaIngreso.getDate());
        oSoFmoAntecedentesOcupacionales.setFechaSalida(jdcFechaSalida.getDate());
        oSoFmoAntecedentesOcupacionales.setTiempo(txfTiempo.getText().toUpperCase().trim());
        oSoFmoAntecedentesOcupacionales.setExposicionOcupacional(txfExposicionOcupacional.getText().toUpperCase().trim());
        oSoFmoAntecedentesOcupacionales.setEpp(txfEPP.getText().toUpperCase().trim());

        oModeloSoFmoAntOcup.add(oSoFmoAntecedentesOcupacionales);
    }

    private void resetComponentAntOcup() {
        txfEmpresa.setText("");
        txfAreaTrabajo.setText("");
        txfOcupacionOcupacional.setText("");
        jdcFechaIngreso.setDate(null);
        jdcFechaSalida.setDate(null);
        txfTiempo.setText("");
        txfExposicionOcupacional.setText("");
        txfEPP.setText("");
    }

    private void registrarAntOcupacionales(HistoriaClinica oHistoriaClinica) {
        if (oModeloSoFmoAntOcup.size() > 0) {
            for (int i = 0; i < oModeloSoFmoAntOcup.size(); i++) {
                oSoFmoAntecedentesOcupacionales = new SoFmoAntecedentesOcupacionales();
                oSoFmoAntecedentesOcupacionalesBl = new SoFmoAntecedentesOcupacionalesBl();
                oSoFmoAntecedentesOcupacionales = oModeloSoFmoAntOcup.get(i);
                oSoFmoAntecedentesOcupacionales.setHistoriaClinica(oHistoriaClinica);
                oSoFmoAntecedentesOcupacionalesBl.registrar(oSoFmoAntecedentesOcupacionales);
            }
        }
    }

    private void calcularImc() {
        double peso = Double.parseDouble(txfPeso.getText().trim());
        double talla = Double.parseDouble(txfTalla.getText().trim());
        double talla2 = Math.pow(talla, 2);
        imc = peso / talla2;
        txfImc.setText("" + Utilitarios.Redondear(imc, 2));
    }
}
