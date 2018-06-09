package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * TipoComprobante generated by hbm2java
 */
public class TipoComprobante implements java.io.Serializable {

    private int idtipocomprobante;
    private String denominacion;
    private Boolean estado;
    private Set<Comprobante> comprobantes = new HashSet<Comprobante>(0);

    public static final int DEFECTO = -1, DATO = 3;
    private int op = -1;

    public TipoComprobante() {
    }

    public TipoComprobante(int idtipocomprobante) {
        this.idtipocomprobante = idtipocomprobante;
    }

    public TipoComprobante(int idtipocomprobante, String denominacion, Boolean estado, Set<Comprobante> comprobantes) {
        this.idtipocomprobante = idtipocomprobante;
        this.denominacion = denominacion;
        this.estado = estado;
        this.comprobantes = comprobantes;
    }

    public int getIdtipocomprobante() {
        return this.idtipocomprobante;
    }

    public void setIdtipocomprobante(int idtipocomprobante) {
        this.idtipocomprobante = idtipocomprobante;
    }

    public String getDenominacion() {
        return this.denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Set<Comprobante> getComprobantes() {
        return this.comprobantes;
    }

    public void setComprobantes(Set<Comprobante> comprobantes) {
        this.comprobantes = comprobantes;
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
