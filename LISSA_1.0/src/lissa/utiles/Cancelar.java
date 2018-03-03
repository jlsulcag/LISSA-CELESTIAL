
package lissa.utiles;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class Cancelar {
    
    public void cancelarFormulario(JDesktopPane JDPContenedor,JInternalFrame jinternal){
        int confirma = 0;
        confirma = JOptionPane.showInternalConfirmDialog(JDPContenedor, Common.mensaje_cancelar);
        System.out.println("confirma------- "+confirma);
        if(confirma == 0){
            jinternal.dispose();
            jinternal.setVisible(false);
        }
    }
}
