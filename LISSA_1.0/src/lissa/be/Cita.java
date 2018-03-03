package lissa.be;
// Generated 14-abr-2016 18:27:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Cita generated by hbm2java
 */
public class Cita  implements java.io.Serializable {


     private int idcita;
     private Medico medico;
     private Persona persona;
     private Integer idUsuario;
     private Date fecha;
     private String hora_inicio;
     private String hora_fin;
     private String servicio;
     private String estado;
     private Integer horaIni;
     private Integer minutoIni;
     private String amPmIni;
     private Integer horaFn;
     private Integer minutoFn;
     private String amPmFn;

    public Cita() {
    }

	
    public Cita(int idcita) {
        this.idcita = idcita;
    }

    public Cita(int idcita, Medico medico, Persona persona, Integer idUsuario, Date fecha, String hora_inicio, String hora_fin, String servicio, String estado, Integer horaIni, Integer minutoIni, String amPmIni, Integer horaFn, Integer minutoFn, String amPmFn) {
        this.idcita = idcita;
        this.medico = medico;
        this.persona = persona;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.servicio = servicio;
        this.estado = estado;
        this.horaIni = horaIni;
        this.minutoIni = minutoIni;
        this.amPmIni = amPmIni;
        this.horaFn = horaFn;
        this.minutoFn = minutoFn;
        this.amPmFn = amPmFn;
    }
       
    public int getIdcita() {
        return this.idcita;
    }
    
    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }
    public Medico getMedico() {
        return this.medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getHora_inicio() {
        return this.hora_inicio;
    }
    
    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }
    public String getServicio() {
        return this.servicio;
    }
    
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String acude) {
        this.estado = acude;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public Integer getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(Integer horaIni) {
        this.horaIni = horaIni;
    }

    public Integer getMinutoIni() {
        return minutoIni;
    }

    public void setMinutoIni(Integer minutoIni) {
        this.minutoIni = minutoIni;
    }

    public String getAmPmIni() {
        return amPmIni;
    }

    public void setAmPmIni(String amPmIni) {
        this.amPmIni = amPmIni;
    }

    public Integer getHoraFn() {
        return horaFn;
    }

    public void setHoraFn(Integer horaFn) {
        this.horaFn = horaFn;
    }

    public Integer getMinutoFn() {
        return minutoFn;
    }

    public void setMinutoFn(Integer minutoFn) {
        this.minutoFn = minutoFn;
    }

    public String getAmPmFn() {
        return amPmFn;
    }

    public void setAmPmFn(String amPmFn) {
        this.amPmFn = amPmFn;
    }
    
}


