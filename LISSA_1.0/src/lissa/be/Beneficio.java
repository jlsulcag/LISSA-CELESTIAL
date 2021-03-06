package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Beneficio generated by hbm2java
 */
public class Beneficio implements java.io.Serializable {

    private int idbeneficio;
    private SeguroVida seguroVida;
    private String nombreBeneficio;
    private Boolean estado;
    private Set<ItemsComprobante> itemsComprobantes = new HashSet<ItemsComprobante>(0);
    private Set<Comprobante> comprobantes = new HashSet<Comprobante>(0);

    public static final int DEFECTO = -1, DATO = 3;
    private int op = -1;

    public Beneficio() {
    }

    public Beneficio(int idbeneficio, SeguroVida seguroVida) {
        this.idbeneficio = idbeneficio;
        this.seguroVida = seguroVida;
    }

    public Beneficio(int idbeneficio, SeguroVida seguroVida, String nombreBeneficio, Boolean estado, Set<ItemsComprobante> itemsComprobantes, Set<Comprobante> comprobantes) {
        this.idbeneficio = idbeneficio;
        this.seguroVida = seguroVida;
        this.nombreBeneficio = nombreBeneficio;
        this.estado = estado;
        this.itemsComprobantes = itemsComprobantes;
        this.comprobantes = comprobantes;
    }

    public int getIdbeneficio() {
        return this.idbeneficio;
    }

    public void setIdbeneficio(int idbeneficio) {
        this.idbeneficio = idbeneficio;
    }

    public SeguroVida getSeguroVida() {
        return this.seguroVida;
    }

    public void setSeguroVida(SeguroVida seguroVida) {
        this.seguroVida = seguroVida;
    }

    public String getNombreBeneficio() {
        return this.nombreBeneficio;
    }

    public void setNombreBeneficio(String nombreBeneficio) {
        this.nombreBeneficio = nombreBeneficio;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Set<ItemsComprobante> getItemsComprobantes() {
        return this.itemsComprobantes;
    }

    public void setItemsComprobantes(Set<ItemsComprobante> itemsComprobantes) {
        this.itemsComprobantes = itemsComprobantes;
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
                return getNombreBeneficio();
            default:
                return "<SELECCIONE>";
        }
    }

}
