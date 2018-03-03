/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lissa.gui;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lissa.be.Persona;
import lissa.bl.PersonaBl;
import lissa.table.ModeloPersonas;
import lissa.util.Mensajes;
import lissa.util.Utilitarios;

/**
 *
 * @author Jorge Luis Sulca González
 */
public class JIF_BuscarPersonaNatural extends javax.swing.JInternalFrame {

    private JF_Principal root;
    private ModeloPersonas oModeloPersonas;
    private PersonaBl oPersonaBl;
    private Persona oPersona;
    private ArrayList<Persona> listPersona;
    private Persona beanTabla;

    private int invocador;
    //Interfaz de la cual se invoca a la ventana
    public static final int JIF_EMITIR_COMPROBANTE = 1;
    public static final int JIF_FONDO_PREVISION = 2;
    public static final int JIF_BUSCA_FONDO_PREVISION = 3;
    public static final int JIF_ADMISION = 4;
    public static final int JIF_LABORATORIO = 5;
    public static final int JIF_HCOCUPACIONAL = 6;
    public static final int JIF_USUARIO = 7;
    //Farmacia
    public static final int JIF_BUSCAR_COMPROBANTE_VENTA = 8;

    public JIF_BuscarPersonaNatural(JF_Principal root) {
        initComponents();
        this.root = root;
        oModeloPersonas = new ModeloPersonas();
        tblResultados.setModel(oModeloPersonas);
        personalizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txfNombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfNumDni = new javax.swing.JTextField();
        bntCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Buscar Persona");
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

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombresActionPerformed(evt);
            }
        });
        txfNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombresKeyReleased(evt);
            }
        });

        jLabel1.setText("Apellidos y Nombres : ");

        jLabel2.setText("DNI :");

        txfNumDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNumDniKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNumDni, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txfNumDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        bntCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lissa/resources/arrow.png"))); // NOI18N
        bntCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCargarActionPerformed(evt);
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
        tblResultados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblResultadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bntCargar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntCargar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblResultadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadosMouseReleased
        if (tblResultados.getRowSelectionAllowed()) {
            obtenerDatos();
        }
    }//GEN-LAST:event_tblResultadosMouseReleased

    private void bntCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCargarActionPerformed
        if (beanTabla == null || beanTabla.getIdPersona() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una persona", "Atencion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (isDatosValidos()) {
                cargarDatosPersona();
                this.doDefaultCloseAction();
                oModeloPersonas.clear();
                beanTabla = null;
            } else {
                JOptionPane.showMessageDialog(null, "Actualice la informacion de la persona antes de cargar", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                //paintComponent();
                //configuraModificar();
            }
        }
        personalizarTabla();
    }//GEN-LAST:event_bntCargarActionPerformed

    private void txfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombresActionPerformed

    }//GEN-LAST:event_txfNombresActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        inicializar();
    }//GEN-LAST:event_formInternalFrameClosing

    private void tblResultadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblResultadosKeyReleased
        int code = evt.getKeyCode();
        char caracter = evt.getKeyChar();
        if (tblResultados.getRowSelectionAllowed() && tblResultados.getSelectedRow() != -1) {
            //obtenerDatos();
            if (code == KeyEvent.VK_ENTER) {//cargar datos  al JIF que lo llama                
                if (beanTabla != null) {
                    cargarDatosPersona();
                    this.doDefaultCloseAction();
                    oModeloPersonas.clear();
                    beanTabla = null;
                }

            }
        }
    }//GEN-LAST:event_tblResultadosKeyReleased

    private void txfNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombresKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarPersonaxNombres(txfNombres.getText().trim().toUpperCase());
            personalizarTabla();
        }
    }//GEN-LAST:event_txfNombresKeyReleased

    private void txfNumDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNumDniKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarPersonaxDni(txfNumDni.getText().trim().toUpperCase());
            personalizarTabla();
        }
    }//GEN-LAST:event_txfNumDniKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txfNombres;
    private javax.swing.JTextField txfNumDni;
    // End of variables declaration//GEN-END:variables

    private void personalizarTabla() {
        Utilitarios.formateaColumna(0, tblResultados, 80);
    }

    private void buscarPersona() {
        oPersonaBl = new PersonaBl();
        String ref = txfNombres.getText().trim().toUpperCase();
        if (!ref.equals("")) {
            listPersona = oPersonaBl.buscar(ref);
            personalizarTabla();
            if (listPersona.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen resultados coincidentes", "Atención", JOptionPane.INFORMATION_MESSAGE);
            } else {
                oModeloPersonas.addAll(listPersona);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese parámetros de búsqueda", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void obtenerDatos() {
        //resetComponent();
        beanTabla = (Persona) oModeloPersonas.get(tblResultados.getSelectedRow());
    }

    private boolean isDatosValidos() {
        return true;
    }

    private void cargarDatosPersona() {
        switch (getInvocador()) {
            case JIF_EMITIR_COMPROBANTE:
                root.jifEmitirComprobante.cargarDatosPersona(beanTabla);
                break;
            case JIF_LABORATORIO:
                root.jifOrdenLaboratorio.cargarDatosPersona(beanTabla);
                break;
            case JIF_HCOCUPACIONAL:
                root.jifHistoriaClinicaOcupacional.cargarDatosPersona(beanTabla);
                break;
            case JIF_USUARIO:
                root.jifRegistrarUsuario.cargarDatosPersona(beanTabla);
                break;
            case JIF_BUSCAR_COMPROBANTE_VENTA:
                root.jifBuscarComprobanteVenta.cargarDatosPersona(beanTabla);
                break;
        }
    }

    public int getInvocador() {
        return invocador;
    }

    public void setInvocador(int invocador) {
        this.invocador = invocador;
    }

    private void buscarPersonaxNombres(String nombres) {
        oPersonaBl = new PersonaBl();
        listPersona = oPersonaBl.buscarxNombres(nombres);
        oModeloPersonas.clear();
        if (!listPersona.isEmpty()) {
            oModeloPersonas.addAll(listPersona);
        } else {
            Mensajes.msjResultVacio();
        }
    }

    private void buscarPersonaxDni(String dni) {
        oPersonaBl = new PersonaBl();
        oPersona = new Persona();
        oPersona = oPersonaBl.buscarPersonaXDni(dni);
        oModeloPersonas.clear();
        if (oPersona != null) {
            oModeloPersonas.add(oPersona);
        } else {
            Mensajes.msjResultVacio();
        }
    }

    public void inicializar() {
        oModeloPersonas.clear();
        txfNombres.setText("");
        txfNumDni.setText("");
        personalizarTabla();
    }

}
