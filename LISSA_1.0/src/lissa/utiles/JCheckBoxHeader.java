/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lissa.utiles;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author layala
 */
public class JCheckBoxHeader extends JPanel implements TableCellRenderer, MouseListener {

    int column;
    boolean mousePressed = false;
    JTable tabla;
    JCheckBox chk;

    public JCheckBoxHeader(JTable t) {
        tabla = t;
        chk = new JCheckBox();
        chk.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    tabla.setValueAt(new Boolean(chk.isSelected()), i, 0);
                }

            }
        });
        add(chk);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (table != null) {
            JTableHeader cabecera = table.getTableHeader();
            if (cabecera != null) {
                cabecera.addMouseListener(this);
            }
        }
        return this;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        seleccionar(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        seleccionar(e);;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        seleccionar(e);;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        seleccionar(e);;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        seleccionar(e);;
    }

    public void seleccionar(MouseEvent e) {
        TableColumnModel Modelocolumna = tabla.getColumnModel();
        int columnaactual = Modelocolumna.getColumnIndexAtX(e.getX());

        if (columnaactual == 0) {
            if (chk.isSelected()) {
                chk.setSelected(false);
            } else {
                chk.setSelected(true);
            }
        }
        ((JTableHeader) e.getSource()).repaint();
    }
}
