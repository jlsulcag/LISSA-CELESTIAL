package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * HistoriaClinica generated by hbm2java
 */
public class HistoriaClinica  implements java.io.Serializable {


     private int idhistoriaclinica;
     private Persona persona;
     private TipoHistoriaClinica tipoHistoriaClinica;
     private Integer numerohc;
     private Date fechaRegistro;
     private Set<Atencion> atencions = new HashSet<Atencion>(0);

    public HistoriaClinica() {
    }

	
    public HistoriaClinica(int idhistoriaclinica, Persona persona) {
        this.idhistoriaclinica = idhistoriaclinica;
        this.persona = persona;
    }
    public HistoriaClinica(int idhistoriaclinica, Persona persona, TipoHistoriaClinica tipoHistoriaClinica, Integer numerohc, Date fechaRegistro, Set<Atencion> atencions) {
       this.idhistoriaclinica = idhistoriaclinica;
       this.persona = persona;
       this.tipoHistoriaClinica = tipoHistoriaClinica;
       this.numerohc = numerohc;
       this.fechaRegistro = fechaRegistro;
       this.atencions = atencions;
    }
   
    public int getIdhistoriaclinica() {
        return this.idhistoriaclinica;
    }
    
    public void setIdhistoriaclinica(int idhistoriaclinica) {
        this.idhistoriaclinica = idhistoriaclinica;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public TipoHistoriaClinica getTipoHistoriaClinica() {
        return this.tipoHistoriaClinica;
    }
    
    public void setTipoHistoriaClinica(TipoHistoriaClinica tipoHistoriaClinica) {
        this.tipoHistoriaClinica = tipoHistoriaClinica;
    }
    public Integer getNumerohc() {
        return this.numerohc;
    }
    
    public void setNumerohc(Integer numerohc) {
        this.numerohc = numerohc;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Set<Atencion> getAtencions() {
        return this.atencions;
    }
    
    public void setAtencions(Set<Atencion> atencions) {
        this.atencions = atencions;
    }




}


