package lissa.be;
// Generated 14-abr-2016 18:27:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Medico generated by hbm2java
 */
public class Medico  implements java.io.Serializable {


     private int idMedico;
     private Persona persona;
     private TipoMedico tipoMedico;
     private Boolean estado;
     private Date fechaReg;
     private String codigoColegiatura;
     private Set<MedicoEspecialidad> medicoEspecialidads = new HashSet<MedicoEspecialidad>(0);
     private Set<ItemsComprobante> itemsComprobantesForIdMedicoDeriva = new HashSet<ItemsComprobante>(0);
     private Set<ItemsComprobante> itemsComprobantesForIdMedicoAtiende = new HashSet<ItemsComprobante>(0);
     private Set<Cita> citas = new HashSet<Cita>(0);
     private Set<MedicoDerivaAtiende> medicoDerivaAtiendes = new HashSet<MedicoDerivaAtiende>(0);
     public static final int DEFECTO = -1, DATO = 3;
     private int op = -1;

    public Medico() {
    }

	
    public Medico(int idMedico, Persona persona, TipoMedico tipoMedico) {
        this.idMedico = idMedico;
        this.persona = persona;
        this.tipoMedico = tipoMedico;
    }
    public Medico(int idMedico, Persona persona, TipoMedico tipoMedico, Boolean estado, Date fechaReg, String codigoColegiatura, Set<MedicoEspecialidad> medicoEspecialidads, Set<ItemsComprobante> itemsComprobantesForIdMedicoDeriva, Set<ItemsComprobante> itemsComprobantesForIdMedicoAtiende, Set<Cita> citas) {
       this.idMedico = idMedico;
       this.persona = persona;
       this.tipoMedico = tipoMedico;
       this.estado = estado;
       this.fechaReg = fechaReg;
       this.codigoColegiatura = codigoColegiatura;
       this.medicoEspecialidads = medicoEspecialidads;
       this.itemsComprobantesForIdMedicoDeriva = itemsComprobantesForIdMedicoDeriva;
       this.itemsComprobantesForIdMedicoAtiende = itemsComprobantesForIdMedicoAtiende;
       this.citas = citas;
    }
   
    public int getIdMedico() {
        return this.idMedico;
    }
    
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public TipoMedico getTipoMedico() {
        return this.tipoMedico;
    }
    
    public void setTipoMedico(TipoMedico tipoMedico) {
        this.tipoMedico = tipoMedico;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Date getFechaReg() {
        return this.fechaReg;
    }
    
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }
    public String getCodigoColegiatura() {
        return this.codigoColegiatura;
    }
    
    public void setCodigoColegiatura(String codigoColegiatura) {
        this.codigoColegiatura = codigoColegiatura;
    }
    public Set<MedicoEspecialidad> getMedicoEspecialidads() {
        return this.medicoEspecialidads;
    }
    
    public void setMedicoEspecialidads(Set<MedicoEspecialidad> medicoEspecialidads) {
        this.medicoEspecialidads = medicoEspecialidads;
    }
    public Set<ItemsComprobante> getItemsComprobantesForIdMedicoDeriva() {
        return this.itemsComprobantesForIdMedicoDeriva;
    }
    
    public void setItemsComprobantesForIdMedicoDeriva(Set<ItemsComprobante> itemsComprobantesForIdMedicoDeriva) {
        this.itemsComprobantesForIdMedicoDeriva = itemsComprobantesForIdMedicoDeriva;
    }
    public Set<ItemsComprobante> getItemsComprobantesForIdMedicoAtiende() {
        return this.itemsComprobantesForIdMedicoAtiende;
    }
    
    public void setItemsComprobantesForIdMedicoAtiende(Set<ItemsComprobante> itemsComprobantesForIdMedicoAtiende) {
        this.itemsComprobantesForIdMedicoAtiende = itemsComprobantesForIdMedicoAtiende;
    }
    public Set<Cita> getCitas() {
        return this.citas;
    }
    
    public void setCitas(Set<Cita> citas) {
        this.citas = citas;
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
                return getPersona().getNombre().trim() + " " + getPersona().getApellidoPaterno().trim() + " " + getPersona().getApellidoMaterno().trim();
            default:
                return "<SELECCIONE>";
        }
    }

    public Set<MedicoDerivaAtiende> getMedicoDerivaAtiendes() {
        return medicoDerivaAtiendes;
    }

    public void setMedicoDerivaAtiendes(Set<MedicoDerivaAtiende> medicoDerivaAtiendes) {
        this.medicoDerivaAtiendes = medicoDerivaAtiendes;
    }


}


