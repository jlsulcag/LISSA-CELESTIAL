package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * TipoHistoriaClinica generated by hbm2java
 */
public class TipoHistoriaClinica implements java.io.Serializable {

    private int idtipohc;
    private String tipohc;
    private Boolean estado;
    private Set<HistoriaClinica> historiaClinicas = new HashSet<HistoriaClinica>(0);

    public static final int DEFECTO = -1, DATO = 3;
    private int op = -1;

    public TipoHistoriaClinica() {
    }

    public TipoHistoriaClinica(int idtipohc, String tipohc) {
        this.idtipohc = idtipohc;
        this.tipohc = tipohc;
    }

    public TipoHistoriaClinica(int idtipohc, String tipohc, Boolean estado, Set<HistoriaClinica> historiaClinicas) {
        this.idtipohc = idtipohc;
        this.tipohc = tipohc;
        this.estado = estado;
        this.historiaClinicas = historiaClinicas;
    }

    public int getIdtipohc() {
        return this.idtipohc;
    }

    public void setIdtipohc(int idtipohc) {
        this.idtipohc = idtipohc;
    }

    public String getTipohc() {
        return this.tipohc;
    }

    public void setTipohc(String tipohc) {
        this.tipohc = tipohc;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Set<HistoriaClinica> getHistoriaClinicas() {
        return this.historiaClinicas;
    }

    public void setHistoriaClinicas(Set<HistoriaClinica> historiaClinicas) {
        this.historiaClinicas = historiaClinicas;
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
                return getTipohc();
            default:
                return "<SELECCIONE>";
        }
    }

}
