package lissa.utiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class LeerExcel {

    private HSSFWorkbook workbook = new HSSFWorkbook();
    private FileInputStream inputfile;
    private FileOutputStream outputfile;
    private int existe;
    private int noExiste;
    private int incorrecto;

    public LeerExcel() {
    }

    //obtiene la instancia de un libro excel mediante su path
    public HSSFWorkbook getWorkbook(String s) {
        try {
            inputfile = new FileInputStream(s);
            workbook = new HSSFWorkbook(inputfile);
        } catch (Exception e) {
            System.out.println("error!!!!!!!!!!!!!!!!" + e.getMessage());
        }
        return workbook;
    }

    //obtiene el valor de una celda dando como parametros la hoja, numero de fila y numero de columna
    public String getCellValue(HSSFSheet hoja, int numFila, int numColumna) {
        String valorCelda = "";
        HSSFRow fila = hoja.getRow(numFila);
        HSSFCell celda = fila.getCell((short) numColumna);
        valorCelda = celda.getRichStringCellValue().toString();

        return valorCelda;
    }

    //obtiene el detalle de notas basados en una hoja, inicio de columna y fin de columna
    public Vector<Vector> getDetalleNotas(HSSFSheet hoja, int inicioColumna, int finColumna) {
        Vector<Vector> informacionNotas = new Stack<Vector>();
        Iterator iterator = hoja.rowIterator();

        // Recorro datos de fila en fila
        while (iterator.hasNext()) {
            HSSFRow fila = (HSSFRow) iterator.next();
            Vector informacionFila = new Vector();

            //Me barro todos los elementos de una fila
            //System.out.println("inicioColumna:" + inicioColumna);
            //System.out.println("finColumna:" + finColumna);

            for (int i = inicioColumna; i < finColumna; i++) {
                //System.out.println("i:" + i);
                HSSFCell hssfCell = fila.getCell((short) i);
                if (hssfCell != null) {
                    switch (hssfCell.getCellType()) {
                        case HSSFCell.CELL_TYPE_BLANK:
                            informacionFila.add("");
                            break;
                        case HSSFCell.CELL_TYPE_BOOLEAN:
                            informacionFila.add(hssfCell.getBooleanCellValue());
                            //System.out.println("hssfCell.getBooleanCellValue():" + hssfCell.getBooleanCellValue());
                            break;
                        case HSSFCell.CELL_TYPE_FORMULA:
                            informacionFila.add(hssfCell.getRichStringCellValue().toString());
                            //System.out.println("hssfCell.getRichStringCellValue().toString():" + hssfCell.getRichStringCellValue().toString());
                            break;
                        case HSSFCell.CELL_TYPE_NUMERIC:
                            informacionFila.add(hssfCell.getNumericCellValue());
                            //System.out.println("hssfCell.getNumericCellValue():" + hssfCell.getNumericCellValue());
                            break;
                        case HSSFCell.CELL_TYPE_STRING:
                            informacionFila.add(hssfCell.getRichStringCellValue().toString());
                            //System.out.println("hssfCell.getRichStringCellValue().toString():" + hssfCell.getRichStringCellValue().toString());
                            break;
                        default:
                    }
                } else {
                    informacionFila.add("");
                }
            }
            informacionNotas.add(informacionFila);
        }
        return informacionNotas;
    }

    //obtiene el modelo para el llenado de una tabla segun el detalle de notas
    public DefaultTableModel getModelo(Object[] cabeceras, Vector<Vector> detalleNotas, String tipoActaAImportar) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(cabeceras);
        int i = 0;
        int it = 1;
        for (Vector item : detalleNotas) {

            //para importar ACTAS
            //recorre desde la fila
            if (i > 12) {
                if (item.get(0) != "" && item.get(1) != "" && item.get(2) != "" && item.get(3) != "" && item.get(4) != "") {
                    //validar Notas para Postgrado
                    if (tipoActaAImportar.equals("70")) {
                        if (Integer.parseInt(item.get(3).toString()) > 13) {
                            System.out.println("entro post");
                            //System.out.println("NOTA:"+Integer.parseInt(item.get(3).toString()));
                            item.setElementAt(it, 0);
                            modelo.addRow(item);
                            it++;
                        }
                    } //validar Notas para Pregrado y CECU
                    else {
                        if (Integer.parseInt(item.get(3).toString()) > 10) {
                            System.out.println("entro pre");
                            //System.out.println("NOTA:"+Integer.parseInt(item.get(3).toString()));
                            item.setElementAt(it, 0);
                            modelo.addRow(item);
                            it++;
                        }
                    }

                }
                System.out.println(item.get(0) + " - " + item.get(1) + " - " + item.get(2) + " - " + item.get(3) + " - " + item.get(4));
                //System.out.println(item.get(0) + " - " + item.get(1) + " - " + item.get(2) + " - " + item.get(3) + " - " + item.get(4));
            }
            i++;
        }
        return modelo;
    }

    public DefaultTableModel getModeloAlumno(Object[] cabeceras, Vector<Vector> detalleAlumnos) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(cabeceras);
        int i = 0;
        int it = 1;
        for (Vector item : detalleAlumnos) {
            //recorre desde la fila
            if (i > 5) {
                if (item.get(0) != "" && item.get(1) != "" && item.get(2) != "" && item.get(3) != "" && item.get(4) != "") {
                    if (item.get(1).toString().length() == 8) {
//                        if (validarCodigoAlumno(item.get(1).toString())) {
//                            item.setElementAt(it, 0);
//                            item.add("EXISTE");
//                            modelo.addRow(item);
//                            existe++;
//                        } else {
//                            item.setElementAt(it, 0);
//                            item.add("NO EXISTE");
//                            modelo.addRow(item);
//                            noExiste++;
//                        }
                        it++;
                    }
                }
                System.out.println(item.get(0) + " - " + item.get(1) + " - " + item.get(2) + " - " + item.get(3) + " - " + item.get(4) + " - " + item.get(5));
                //System.out.println(item.get(0) + " - " + item.get(1) + " - " + item.get(2) + " - " + item.get(3) + " - " + item.get(4) + " - " + item.get(5));
            }
            i++;
        }
        return modelo;
    }

    public DefaultTableModel getModeloAlumnoCecu(Object[] cabeceras, Vector<Vector> detalleAlumnos, String cede, String escuela) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(cabeceras);
        int i = 0;
        int it = 1;
        for (Vector item : detalleAlumnos) {
            if (i > 5) {
                if (item.get(0) != "" && item.get(1) != "" && item.get(2) != "" && item.get(3) != "" && item.get(4) != "") {
                    if (item.get(1).toString().length() == 8) {
                        if (item.get(1).toString().substring(0, 2).equals(cede) && item.get(1).toString().substring(4, 5).equals(escuela)) {
//                            if (validarCodigoAlumno(item.get(1).toString())) {
//                                item.setElementAt(it, 0);
//                                item.add("EXISTE");
//                                modelo.addRow(item);
//                                existe++;
//                            } else {
//                                item.setElementAt(it, 0);
//                                item.add("NO EXISTE");
//                                modelo.addRow(item);
//                                noExiste++;
//                            }
                        } else {
                            item.setElementAt(it, 0);
                            item.add("INCORRECTO");
                            modelo.addRow(item);
                            incorrecto++;
                        }
                        it++;
                    } else {
                        item.setElementAt(it, 0);
                        item.add("INCORRECTO");
                        modelo.addRow(item);
                        incorrecto++;
                    }
                }
                //  System.out.println(item.get(0)+" - "+item.get(1)+" - "+item.get(2)+" - "+item.get(3)+" - "+item.get(4)+" - "+item.get(5));
            }
            i++;
        }
        return modelo;
    }

    public void cerrarExcel() {
        try {
            inputfile.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int getExiste() {
        return existe;
    }

    public void setExiste(int existe) {
        this.existe = existe;
    }

    public int getNoExiste() {
        return noExiste;
    }

    public void setNoExiste(int noExiste) {
        this.noExiste = noExiste;
    }

    public int getIncorrecto() {
        return incorrecto;
    }

    public void setIncorrecto(int incorrecto) {
        this.incorrecto = incorrecto;
    }

    public DefaultTableModel getModeloAsignatura(Object[] cabeceras, Vector<Vector> detalleAsignaturas, int idPlanEstudio) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(cabeceras);
        int i = 0;
        int it = 1;
        //int correctoSerie = 0;
        //int incorrectoSerie = 0;
        //ArrayList filasIncorrectas = new ArrayList();
        for (Vector item : detalleAsignaturas) {
            //recorre desde la fila
            if (i > 8) {
                if (item.get(0) != "" && item.get(1) != "" && item.get(2) != "" && item.get(3) != "" && item.get(4) != "" && item.get(5) != "") {
                    item.setElementAt(it, 0);
                    modelo.addRow(item);
                    it++;
                }
                //  System.out.println(item.get(0)+" - "+item.get(1)+" - "+item.get(2)+" - "+item.get(3)+" - "+item.get(4)+" - "+item.get(5));
            }
            i++;
        }
        return modelo;
    }


}
