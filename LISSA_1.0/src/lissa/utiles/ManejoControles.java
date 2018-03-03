package lissa.utiles;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author RMOISESL
 */
public class ManejoControles {

    public void AbilitarDesabilitarControles(HashMap<Integer, JComponent> pMapContenido, String pOpcion) {

        int contador = 0;

        if (pOpcion.equals(Common.control_abilitar)) {

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                pMapContenido.get(contador).setEnabled(true);

                contador++;
            }

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                try {
                    JComboBox oComp = (JComboBox) pMapContenido.get(contador);
                    oComp.setSelectedIndex(0);

                } catch (Exception e) {
                }
                contador++;
            }

        } else if (pOpcion.equals(Common.control_desabilitar)) {

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                pMapContenido.get(contador).setEnabled(false);

                contador++;
            }
        }
    }

    public void AbilitarDesabilitarReceptores(String pOpcion, HashMap<Integer, JComponent> pMapContenido,
            JButton pBotOpera, JButton pBotCancelar, JComboBox pJCOpciones) {

        int contador;

        pBotCancelar.setText(Common.desabilitar_y_limpiar_receptores);
        pBotOpera.setText(pOpcion);

        if (pOpcion.equals(Common.generar_reporte)) {

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                pMapContenido.get(contador).setEnabled(true);

                contador++;
            }

            pBotOpera.setEnabled(true);

        }else if (pOpcion.equals(Common.abilitar_receptores)) {

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                pMapContenido.get(contador).setEnabled(true);

                contador++;
            }

            pBotOpera.setEnabled(true);

        } else if (pOpcion.equals(Common.abilitar_y_limpiar_receptores)) {

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                pMapContenido.get(contador).setEnabled(true);
                contador++;
            }

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                try {
                    JTextField oComp = (JTextField) pMapContenido.get(contador);
                    oComp.setText("");

                } catch (Exception e) {
                }

                contador++;
            }

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                try {
                    JDateChooser oComp = (JDateChooser) pMapContenido.get(contador);
                    oComp.setDate(new Date());

                } catch (Exception e) {
                }

                contador++;
            }

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                try {
                    JComboBox oComp = (JComboBox) pMapContenido.get(contador);
                    oComp.setSelectedIndex(0);

                } catch (Exception e) {
                }

                contador++;
            }

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                try {
                    JLabel oComp = (JLabel) pMapContenido.get(contador);
                    oComp.setText("");

                } catch (Exception e) {
                }

                contador++;
            }

            pBotOpera.setEnabled(true);

        } else if (pOpcion.equals(Common.desabilitar_receptores)) {

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                pMapContenido.get(contador).setEnabled(false);

                contador++;
            }

            pJCOpciones.setSelectedIndex(0);
            pBotOpera.setText("");
            pBotCancelar.setText(Common.item_cerrar);
            pBotOpera.setEnabled(false);

        } else if (pOpcion.equals(Common.desabilitar_y_limpiar_receptores)) {

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                try {
                    JTextField oComp = (JTextField) pMapContenido.get(contador);
                    oComp.setText("");

                } catch (Exception e) {
                }

                contador++;
            }

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                try {
                    JDateChooser oComp = (JDateChooser) pMapContenido.get(contador);
                    oComp.setDate(new Date());

                } catch (Exception e) {
                }

                contador++;
            }

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                try {
                    JComboBox oComp = (JComboBox) pMapContenido.get(contador);
                    oComp.setSelectedIndex(0);

                } catch (Exception e) {
                }

                contador++;
            }

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                try {
                    JLabel oComp = (JLabel) pMapContenido.get(contador);
                    oComp.setText("");

                } catch (Exception e) {
                }

                contador++;
            }

            contador = 1;
            while (pMapContenido.get(contador) != null) {
                pMapContenido.get(contador).setEnabled(false);

                contador++;
            }

            pBotOpera.setText("");
            pBotOpera.setEnabled(false);

        } else if (pOpcion.equals(Common.activar_boleta)) {

            pBotOpera.setEnabled(true);

        } else if (pOpcion.equals(Common.anular_boleta)) {

            pBotOpera.setEnabled(true);

        }

    }

}
