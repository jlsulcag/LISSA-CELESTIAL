package lissa.be;
// Generated 04-nov-2016 12:57:35 by Hibernate Tools 4.3.1

/**
 * TipoOperacion generated by hbm2java
 */
public class TipoOperacion implements java.io.Serializable {

    private int idtipooperacion;
    private String operacion;
    private boolean estado;
    public static final int DATO = 1, DEFAULT = 2;
    private int op = -1;

    public TipoOperacion() {
    }

    public TipoOperacion(int idtipooperacion, String operacion, boolean estado) {
        this.idtipooperacion = idtipooperacion;
        this.operacion = operacion;
        this.estado = estado;
    }

    public int getIdtipooperacion() {
        return this.idtipooperacion;
    }

    public void setIdtipooperacion(int idtipooperacion) {
        this.idtipooperacion = idtipooperacion;
    }

    public String getOperacion() {
        return this.operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    @Override
    public String toString() {
        switch (getOp()) {
            case DATO:
                return getOperacion();
            default:
                return "<Seleccione>";
        }
    }

}
