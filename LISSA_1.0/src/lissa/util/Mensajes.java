
package lissa.util;

import javax.swing.JOptionPane;
import lissa.be.PaqueteFondoDetalle;

public class Mensajes {
    private static final String tituloAtencion = "ATENCIÓN";
    private static final String tituloError = "ERROR";
    private static final String regCorrecto = "REGISTRO CORRECTO";
    private static final String regError= "ERROR DE REGISTRO";    
    private static final String actCorrecto = "ACTUALIZACIÓN CORRECTA";
    private static final String actError = "ACTUALIZACIÓN FALLIDA";
    private static final String objNulo = "NULL OBJET";

    public static String getRegCorrecto() {
        return regCorrecto;
    }

    public static String getTituloAtencion() {
        return tituloAtencion;
    }

    public static String getRegError() {
        return regError;
    }

    public static String getActCorrecto() {
        return actCorrecto;
    }

    public static String getActError() {
        return actError;
    }

    public static String getObjNulo() {
        return objNulo;
    }

    public static String getTituloError() {
        return tituloError;
    }
    public static void msjRegCorrecta(){
        JOptionPane.showMessageDialog(null, "Registro correcto", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void msjRegError(){
        JOptionPane.showMessageDialog(null, "Error de registro", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public static void msjActCorrecta(){
        JOptionPane.showMessageDialog(null, "Actualización correcta", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void msjResetPassword(){
        JOptionPane.showMessageDialog(null, "Actualización correcta de contraseña", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void msjActErronea(){
        JOptionPane.showMessageDialog(null, "Actualización fallida", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void msjValidarIngreso(){
        JOptionPane.showMessageDialog(null, "Ingrese todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void msjParametroVacio(){
        JOptionPane.showMessageDialog(null, "Ingrese los parámetros de búsqueda", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void msjResultVacio(){
        JOptionPane.showMessageDialog(null, "No existe resultados", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void tblSelected() {
        JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void msjExisteRegistro() {
        JOptionPane.showMessageDialog(null, "El registro ya existe ", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void docAnulado() {
        JOptionPane.showMessageDialog(null, "El documento se encuentra anulado ", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void msjErrorgenerico(Class<PaqueteFondoDetalle> aClass) {
        JOptionPane.showMessageDialog(null, "Error general en :"+ aClass.getName(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void hcSeleccionePersona() {
        JOptionPane.showMessageDialog(null, "Seleccione un paciente", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
}
