package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * PaqueteFondoDetalle generated by hbm2java
 */
public class PaqueteFondoDetalle implements java.io.Serializable {

    private int idpaquetefondo;
    private PaqueteFondoSolidaridad paqueteFondoSolidaridad;
    private String beneficio;
    private BigDecimal importeCubierto;
    private int cantAtenciones;

    public static final int DEFECTO = -1, DATO = 3;
    private int op = -1;

    public PaqueteFondoDetalle() {
    }

    public PaqueteFondoDetalle(int idpaquetefondo, PaqueteFondoSolidaridad paqueteFondoSolidaridad, String beneficio, BigDecimal importeCubierto, int cantAtenciones) {
        this.idpaquetefondo = idpaquetefondo;
        this.paqueteFondoSolidaridad = paqueteFondoSolidaridad;
        this.beneficio = beneficio;
        this.importeCubierto = importeCubierto;
        this.cantAtenciones = cantAtenciones;
    }

    public int getIdpaquetefondo() {
        return this.idpaquetefondo;
    }

    public void setIdpaquetefondo(int idpaquetefondo) {
        this.idpaquetefondo = idpaquetefondo;
    }

    public PaqueteFondoSolidaridad getPaqueteFondoSolidaridad() {
        return this.paqueteFondoSolidaridad;
    }

    public void setPaqueteFondoSolidaridad(PaqueteFondoSolidaridad paqueteFondoSolidaridad) {
        this.paqueteFondoSolidaridad = paqueteFondoSolidaridad;
    }

    public String getBeneficio() {
        return this.beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public BigDecimal getImporteCubierto() {
        return this.importeCubierto;
    }

    public void setImporteCubierto(BigDecimal importeCubierto) {
        this.importeCubierto = importeCubierto;
    }

    public int getCantAtenciones() {
        return this.cantAtenciones;
    }

    public void setCantAtenciones(int cantAtenciones) {
        this.cantAtenciones = cantAtenciones;
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
                return getBeneficio();
            default:
                return "<SELECCIONE>";
        }
    }

}
