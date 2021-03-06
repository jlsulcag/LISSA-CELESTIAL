package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * PeEstadoCivil generated by hbm2java
 */
public class PeEstadoCivil implements java.io.Serializable {

    private int idpeestadocivil;
    private String estadoCivil;
    private Boolean estdo;
    private Set<Persona> personas = new HashSet<Persona>(0);

    public static final int DEFECTO = -1, DATO = 3;
    private int op = -1;

    public PeEstadoCivil() {
    }

    public PeEstadoCivil(int idpeestadocivil) {
        this.idpeestadocivil = idpeestadocivil;
    }

    public PeEstadoCivil(int idpeestadocivil, String estadoCivil, Boolean estdo, Set<Persona> personas) {
        this.idpeestadocivil = idpeestadocivil;
        this.estadoCivil = estadoCivil;
        this.estdo = estdo;
        this.personas = personas;
    }

    public int getIdpeestadocivil() {
        return this.idpeestadocivil;
    }

    public void setIdpeestadocivil(int idpeestadocivil) {
        this.idpeestadocivil = idpeestadocivil;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Boolean getEstdo() {
        return this.estdo;
    }

    public void setEstdo(Boolean estdo) {
        this.estdo = estdo;
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
            case DATO:
                return getEstadoCivil();
            default:
                return "<SELECCIONE>";
        }
    }

}
