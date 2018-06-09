package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Atencion generated by hbm2java
 */
public class Atencion  implements java.io.Serializable {


     private int idAtencion;
     private HistoriaClinica historiaClinica;
     private Date fechaAtencion;
     private String horaAtencion;
     private Integer edad;
     private String tipoAtencion;
     private Integer idUsuarioEnf;
     private Integer idUsuarioMed;

    public Atencion() {
    }

	
    public Atencion(int idAtencion, HistoriaClinica historiaClinica, Date fechaAtencion) {
        this.idAtencion = idAtencion;
        this.historiaClinica = historiaClinica;
        this.fechaAtencion = fechaAtencion;
    }
    public Atencion(int idAtencion, HistoriaClinica historiaClinica, Date fechaAtencion, String horaAtencion, Integer edad, String tipoAtencion, Integer idUsuarioEnf, Integer idUsuarioMed) {
       this.idAtencion = idAtencion;
       this.historiaClinica = historiaClinica;
       this.fechaAtencion = fechaAtencion;
       this.horaAtencion = horaAtencion;
       this.edad = edad;
       this.tipoAtencion = tipoAtencion;
       this.idUsuarioEnf = idUsuarioEnf;
       this.idUsuarioMed = idUsuarioMed;
    }
   
    public int getIdAtencion() {
        return this.idAtencion;
    }
    
    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }
    public HistoriaClinica getHistoriaClinica() {
        return this.historiaClinica;
    }
    
    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    public Date getFechaAtencion() {
        return this.fechaAtencion;
    }
    
    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    public String getHoraAtencion() {
        return this.horaAtencion;
    }
    
    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }
    public Integer getEdad() {
        return this.edad;
    }
    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getTipoAtencion() {
        return this.tipoAtencion;
    }
    
    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }
    public Integer getIdUsuarioEnf() {
        return this.idUsuarioEnf;
    }
    
    public void setIdUsuarioEnf(Integer idUsuarioEnf) {
        this.idUsuarioEnf = idUsuarioEnf;
    }
    public Integer getIdUsuarioMed() {
        return this.idUsuarioMed;
    }
    
    public void setIdUsuarioMed(Integer idUsuarioMed) {
        this.idUsuarioMed = idUsuarioMed;
    }




}


