package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Servicio generated by hbm2java
 */
public class Servicio implements java.io.Serializable {

    private int idservicio;
    private Tarifario tarifario;
    private String denominacion;
    private String estado;
    private Set<Procedimiento> procedimientos = new HashSet<Procedimiento>(0);

    public static final int DEFECTO = 1, DATO = 3;
    private int op = -1;

    public Servicio() {
    }

    public Servicio(int idservicio, Tarifario tarifario, String denominacion, String estado) {
        this.idservicio = idservicio;
        this.tarifario = tarifario;
        this.denominacion = denominacion;
        this.estado = estado;
    }

    public Servicio(int idservicio, Tarifario tarifario, String denominacion, String estado, Set<Procedimiento> procedimientos) {
        this.idservicio = idservicio;
        this.tarifario = tarifario;
        this.denominacion = denominacion;
        this.estado = estado;
        this.procedimientos = procedimientos;
    }

    public int getIdservicio() {
        return this.idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public Tarifario getTarifario() {
        return this.tarifario;
    }

    public void setTarifario(Tarifario tarifario) {
        this.tarifario = tarifario;
    }

    public String getDenominacion() {
        return this.denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<Procedimiento> getProcedimientos() {
        return this.procedimientos;
    }

    public void setProcedimientos(Set<Procedimiento> procedimientos) {
        this.procedimientos = procedimientos;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    @Override
    public String toString() {
        switch (op) {
            case DATO:
                return getDenominacion();
            default:
                return "<SELECCIONE>";
        }
    }

}
