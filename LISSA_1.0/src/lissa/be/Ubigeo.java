package lissa.be;
// Generated 14-abr-2016 18:27:18 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Ubigeo generated by hbm2java
 */
public class Ubigeo implements java.io.Serializable {

    private int idubigeo;
    private String nombreRegion;
    private String nombreProvincia;
    private String nombreDistrito;
    private int codigoRegion;
    private int codigoProvincia;
    private int codigoDistrito;
    private Set<Persona> personas = new HashSet<Persona>(0);
    public static final int DEFECTO = -1, DTO = 3, PROV = 4, DIST = 5;
    private int op = -1;

    public Ubigeo() {
    }

    public Ubigeo(int idubigeo, String nombreRegion, String nombreProvincia, String nombreDistrito, int codigoRegion, int codigoProvincia, int codigoDistrito) {
        this.idubigeo = idubigeo;
        this.nombreRegion = nombreRegion;
        this.nombreProvincia = nombreProvincia;
        this.nombreDistrito = nombreDistrito;
        this.codigoRegion = codigoRegion;
        this.codigoProvincia = codigoProvincia;
        this.codigoDistrito = codigoDistrito;
    }

    public Ubigeo(int idubigeo, String nombreRegion, String nombreProvincia, String nombreDistrito, int codigoRegion, int codigoProvincia, int codigoDistrito, Set<Persona> personas) {
        this.idubigeo = idubigeo;
        this.nombreRegion = nombreRegion;
        this.nombreProvincia = nombreProvincia;
        this.nombreDistrito = nombreDistrito;
        this.codigoRegion = codigoRegion;
        this.codigoProvincia = codigoProvincia;
        this.codigoDistrito = codigoDistrito;
        this.personas = personas;
    }

    public int getIdubigeo() {
        return this.idubigeo;
    }

    public void setIdubigeo(int idubigeo) {
        this.idubigeo = idubigeo;
    }

    public String getNombreRegion() {
        return this.nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getNombreProvincia() {
        return this.nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public String getNombreDistrito() {
        return this.nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public int getCodigoRegion() {
        return this.codigoRegion;
    }

    public void setCodigoRegion(int codigoRegion) {
        this.codigoRegion = codigoRegion;
    }

    public int getCodigoProvincia() {
        return this.codigoProvincia;
    }

    public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public int getCodigoDistrito() {
        return this.codigoDistrito;
    }

    public void setCodigoDistrito(int codigoDistrito) {
        this.codigoDistrito = codigoDistrito;
    }

    public Set<Persona> getPersonas() {
        return this.personas;
    }

    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
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
            case DTO:
                return getNombreRegion();
            case PROV:
                return getNombreProvincia();
            case DIST:
                return getNombreDistrito();
            default:
                return "<SELECCIONE>";
        }
    }

}
