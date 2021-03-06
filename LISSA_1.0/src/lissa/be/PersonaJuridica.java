package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PersonaJuridica generated by hbm2java
 */
public class PersonaJuridica  implements java.io.Serializable {


     private int idPersonaJuridica;
     private String razonSocial;
     private String numeroRuc;
     private String direccion;
     private String telefono;
     private String actividadEcon;
     private Set<PersonaEmpresa> personaEmpresas = new HashSet<PersonaEmpresa>(0);

    public PersonaJuridica() {
    }

	
    public PersonaJuridica(int idPersonaJuridica) {
        this.idPersonaJuridica = idPersonaJuridica;
    }
    public PersonaJuridica(int idPersonaJuridica, String razonSocial, String numeroRuc, String direccion, String telefono, String actividadEcon, Set<PersonaEmpresa> personaEmpresas) {
       this.idPersonaJuridica = idPersonaJuridica;
       this.razonSocial = razonSocial;
       this.numeroRuc = numeroRuc;
       this.direccion = direccion;
       this.telefono = telefono;
       this.actividadEcon = actividadEcon;
       this.personaEmpresas = personaEmpresas;
    }
   
    public int getIdPersonaJuridica() {
        return this.idPersonaJuridica;
    }
    
    public void setIdPersonaJuridica(int idPersonaJuridica) {
        this.idPersonaJuridica = idPersonaJuridica;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getNumeroRuc() {
        return this.numeroRuc;
    }
    
    public void setNumeroRuc(String numeroRuc) {
        this.numeroRuc = numeroRuc;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getActividadEcon() {
        return this.actividadEcon;
    }
    
    public void setActividadEcon(String actividadEcon) {
        this.actividadEcon = actividadEcon;
    }
    public Set<PersonaEmpresa> getPersonaEmpresas() {
        return this.personaEmpresas;
    }
    
    public void setPersonaEmpresas(Set<PersonaEmpresa> personaEmpresas) {
        this.personaEmpresas = personaEmpresas;
    }




}


