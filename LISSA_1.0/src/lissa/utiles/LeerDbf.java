/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lissa.utiles;


import java.io.*;
import com.linuxense.javadbf.*;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class LeerDbf {

    private int existe;
    private int noExiste;
    private String mensajeArchivo;
    private String mensajeFila;

    public LeerDbf() {
    }

    public void leerArchivo(String nombreArchivo) {
        try {
            // crear un objeto DBFReader
            InputStream inputStream = new FileInputStream(nombreArchivo); // take dbf file as program argument
            DBFReader reader = new DBFReader(inputStream);

            // obtener el número de campo si desea que para algunos razones como las siguientes
            int numberOfFields = reader.getFieldCount();
            System.out.println(numberOfFields);

            //int numberOfFields = 2;

            // usar esta cuenta para ir a buscar todos los campos información
            // si es necesario
            for (int i = 0; i < numberOfFields; i++) {
                DBFField field = reader.getField(i);

                //  hacer algo con él si quiere
                // consulte la referencia de la API JavaDoc para obtener más detalles
                System.out.println(field.getName());
            }

            // Ahora, nos permite empezar a leer las filas
            Object[] rowObjects;

            int columna = 5;
            while ((rowObjects = reader.nextRecord()) != null) {

                for (int i = 0; i < columna; i++) {
                    //System.out.println(rowObjects.length);
                    System.out.println(rowObjects[i]);
                }
            }

            // Por ahora, tenemos itereated a través de todas las filas
            inputStream.close();
        } catch (DBFException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //obtiene la data con, inicio de columna y fin de columna
    public Vector<Vector> leerArchivoPorColumna(String nombreArchivo, int inicioColumna, int finColumna) {
        try {
            // crear un objeto DBFReader
            InputStream inputStream = new FileInputStream(nombreArchivo);
            DBFReader reader = new DBFReader(inputStream);

            // obtener el número de campo si desea que para algunos razones como las siguientes
            int numberOfFields = reader.getFieldCount();

            // usar esta cuenta para ir a buscar todos los campos información
            for (int i = 0; i < numberOfFields; i++) {
                DBFField field = reader.getField(i);
                //Imprime la cabezara del archivo DBF
                System.out.println(field.getName());
            }

            //recoge la data de toda las filas
            Vector<Vector> informacionFilas = new Stack<Vector>();

            // Ahora, nos permite empezar a leer las filas
            Object[] rowObjects;

            //recorro las filas
            while ((rowObjects = reader.nextRecord()) != null) {
                //recoger la data de la fila
                Vector informacionFila = new Vector();

                //recorro las columnas
                for (int i = inicioColumna; i < finColumna; i++) {
                    //imrprime el contenido de la celda                                    
                    informacionFila.add(rowObjects[i]);
                }
                //informacionFila.add(arraylist);
                System.out.println(informacionFila);
                informacionFilas.add(informacionFila);
            }

            //cerra el objeto DBFReader
            inputStream.close();

            //retornamos toda la data
            return informacionFilas;

        } catch (DBFException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void escribirArchivo(String nombreArchivo) throws DBFException, IOException {
        // vamos a crear definiciones de primer campo
        //  vamos a ir por 3 campos
        DBFField fields[] = new DBFField[3];

        fields[0] = new DBFField();
        fields[0].setName("CODIGO");
        fields[0].setDataType(DBFField.FIELD_TYPE_C);
        fields[0].setFieldLength(10);

        fields[1] = new DBFField();
        //fields[1].setField("emp_name");
        fields[1].setFieldName("NOMBRE");
        fields[1].setDataType(DBFField.FIELD_TYPE_C);
        fields[1].setFieldLength(20);

        fields[2] = new DBFField();
        //fields[2].setField("salary");
        fields[2].setFieldName("SALARIO");
        fields[2].setDataType(DBFField.FIELD_TYPE_N);
        fields[2].setFieldLength(12);
        fields[2].setDecimalCount(2);

        DBFWriter writer = new DBFWriter();
        writer.setFields(fields);

        // ahora pueblan DBFWriter
        Object rowData[] = new Object[3];
        rowData[0] = "1000";
        rowData[1] = "John";
        rowData[2] = new Double(5000.00);

        writer.addRecord(rowData);

        rowData = new Object[3];
        rowData[0] = "1001";
        rowData[1] = "Lalit";
        rowData[2] = new Double(3400.00);
        try {
            writer.addRecord(rowData);
        } catch (DBFException ex) {
            Logger.getLogger(LeerDbf.class.getName()).log(Level.SEVERE, null, ex);
        }

        rowData = new Object[3];
        rowData[0] = "1002";
        rowData[1] = "Rohit";
        rowData[2] = new Double(7350.00);

        writer.addRecord(rowData);

        FileOutputStream fos = new FileOutputStream(nombreArchivo);
        writer.write(fos);
        fos.close();
    }

    /*private boolean validarCodigoAlumno(String codigo) {
        boolean ban = false;
        AlumnoBE oAlumnoBE = new AlumnoBE();
        oAlumnoBE.setIndOpSp(Common.c_numDos);
        oAlumnoBE.setCodigo(codigo);
        AlumnoBL oAlumnoBL = new AlumnoBL();
        AlumnoBE oAlumnoBE1 = oAlumnoBL.listarAlumnoBE(oAlumnoBE);
        return oAlumnoBE1.isEstado();
    }*/

    public void cerrarDbf() {
        try {
            //inputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @return the existe
     */
    public int getExiste() {
        return existe;
    }

    /**
     * @param existe the existe to set
     */
    public void setExiste(int existe) {
        this.existe = existe;
    }

    /**
     * @return the noExiste
     */
    public int getNoExiste() {
        return noExiste;
    }

    /**
     * @param noExiste the noExiste to set
     */
    public void setNoExiste(int noExiste) {
        this.noExiste = noExiste;
    }

    /**
     * @return the mensajeArchivo
     */
    public String getMensajeArchivo() {
        return mensajeArchivo;
    }

    /**
     * @param mensajeArchivo the mensajeArchivo to set
     */
    public void setMensajeArchivo(String mensajeArchivo) {
        this.mensajeArchivo = mensajeArchivo;
    }

    /**
     * @return the mensajeFila
     */
    public String getMensajeFila() {
        return mensajeFila;
    }

    /**
     * @param mensajeFila the mensajeFila to set
     */
    public void setMensajeFila(String mensajeFila) {
        this.mensajeFila = mensajeFila;
    }
}
