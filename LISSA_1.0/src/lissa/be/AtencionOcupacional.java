package lissa.be;
// Generated 14-abr-2016 18:27:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AtencionOcupacional generated by hbm2java
 */
public class AtencionOcupacional  implements java.io.Serializable {


     private int idatencionocupacional;
     private EvaluacionOcupacional evaluacionOcupacional;
     private ExamenOcupacional examenOcupacional;
     private HistoriaClinica historiaClinica;
     private Date fechaCertificacion;
     private String horaCertificacion;
     private Integer edadIngreso;
     private int idEmpresa;
     private Integer idLugarTrabajo;
     private String puestoPostula;
     private Integer idLugarExamen;
     private String proyecto;
     private String residenciaTrabajo;
     private Integer tiempoResidencia;
     private String mesAnioResidencia;
     private Boolean segEssalud;
     private Boolean segEps;
     private Boolean segSctr;
     private Boolean segOtro;
     private Boolean segOtro2;
     private Set<InformeMedicoOcupacional> informeMedicoOcupacionals = new HashSet<InformeMedicoOcupacional>(0);
     private Set<CertificadoMedicoOcupacional> certificadoMedicoOcupacionals = new HashSet<CertificadoMedicoOcupacional>(0);
     private Set<EmpresaActual> empresaActuals = new HashSet<EmpresaActual>(0);
     private Set<FichaPsicologicaPsicotecnico> fichaPsicologicaPsicotecnicos = new HashSet<FichaPsicologicaPsicotecnico>(0);
     private Set<FichaPsicologica> fichaPsicologicas = new HashSet<FichaPsicologica>(0);
     private Set<FichaOftalmologica> fichaOftalmologicas = new HashSet<FichaOftalmologica>(0);
     private Set<FichaMedicoOcupacional> fichaMedicoOcupacionals = new HashSet<FichaMedicoOcupacional>(0);
     private Set<FichaAudiometria> fichaAudiometrias = new HashSet<FichaAudiometria>(0);
     private Set<FichaOsteomuscular> fichaOsteomusculars = new HashSet<FichaOsteomuscular>(0);
     private Set<ExamenClinico> examenClinicos = new HashSet<ExamenClinico>(0);

    public AtencionOcupacional() {
    }

	
    public AtencionOcupacional(int idatencionocupacional, EvaluacionOcupacional evaluacionOcupacional, ExamenOcupacional examenOcupacional, HistoriaClinica historiaClinica, Date fechaCertificacion, int idEmpresa, String proyecto) {
        this.idatencionocupacional = idatencionocupacional;
        this.evaluacionOcupacional = evaluacionOcupacional;
        this.examenOcupacional = examenOcupacional;
        this.historiaClinica = historiaClinica;
        this.fechaCertificacion = fechaCertificacion;
        this.idEmpresa = idEmpresa;
        this.proyecto = proyecto;
    }
    public AtencionOcupacional(int idatencionocupacional, EvaluacionOcupacional evaluacionOcupacional, ExamenOcupacional examenOcupacional, HistoriaClinica historiaClinica, Date fechaCertificacion, String horaCertificacion, Integer edadIngreso, int idEmpresa, Integer idLugarTrabajo, String puestoPostula, Integer idLugarExamen, String proyecto, Set<CertificadoMedicoOcupacional> certificadoMedicoOcupacionals, Set<SoFmoAntecedentesOcupacionales> soFmoAntecedentesOcupacionaleses, Set<FichaPsicologicaPsicotecnico> fichaPsicologicaPsicotecnicos, Set<FichaPsicologica> fichaPsicologicas, Set<FichaOftalmologica> fichaOftalmologicas, Set<FichaMedicoOcupacional> fichaMedicoOcupacionals, Set<FichaAudiometria> fichaAudiometrias, Set<FichaOsteomuscular> fichaOsteomusculars) {
       this.idatencionocupacional = idatencionocupacional;
       this.evaluacionOcupacional = evaluacionOcupacional;
       this.examenOcupacional = examenOcupacional;
       this.historiaClinica = historiaClinica;
       this.fechaCertificacion = fechaCertificacion;
       this.horaCertificacion = horaCertificacion;
       this.edadIngreso = edadIngreso;
       this.idEmpresa = idEmpresa;
       this.idLugarTrabajo = idLugarTrabajo;
       this.puestoPostula = puestoPostula;
       this.idLugarExamen = idLugarExamen;
       this.proyecto = proyecto;
       this.certificadoMedicoOcupacionals = certificadoMedicoOcupacionals;
       this.fichaPsicologicaPsicotecnicos = fichaPsicologicaPsicotecnicos;
       this.fichaPsicologicas = fichaPsicologicas;
       this.fichaOftalmologicas = fichaOftalmologicas;
       this.fichaMedicoOcupacionals = fichaMedicoOcupacionals;
       this.fichaAudiometrias = fichaAudiometrias;
       this.fichaOsteomusculars = fichaOsteomusculars;
    }
   
    public int getIdatencionocupacional() {
        return this.idatencionocupacional;
    }
    
    public void setIdatencionocupacional(int idatencionocupacional) {
        this.idatencionocupacional = idatencionocupacional;
    }
    public EvaluacionOcupacional getEvaluacionOcupacional() {
        return this.evaluacionOcupacional;
    }
    
    public void setEvaluacionOcupacional(EvaluacionOcupacional evaluacionOcupacional) {
        this.evaluacionOcupacional = evaluacionOcupacional;
    }
    public ExamenOcupacional getExamenOcupacional() {
        return this.examenOcupacional;
    }
    
    public void setExamenOcupacional(ExamenOcupacional examenOcupacional) {
        this.examenOcupacional = examenOcupacional;
    }
    public HistoriaClinica getHistoriaClinica() {
        return this.historiaClinica;
    }
    
    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    public Date getFechaCertificacion() {
        return this.fechaCertificacion;
    }
    
    public void setFechaCertificacion(Date fechaCertificacion) {
        this.fechaCertificacion = fechaCertificacion;
    }
    public String getHoraCertificacion() {
        return this.horaCertificacion;
    }
    
    public void setHoraCertificacion(String horaCertificacion) {
        this.horaCertificacion = horaCertificacion;
    }
    public Integer getEdadIngreso() {
        return this.edadIngreso;
    }
    
    public void setEdadIngreso(Integer edadIngreso) {
        this.edadIngreso = edadIngreso;
    }
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Integer getIdLugarTrabajo() {
        return this.idLugarTrabajo;
    }
    
    public void setIdLugarTrabajo(Integer idLugarTrabajo) {
        this.idLugarTrabajo = idLugarTrabajo;
    }
    public String getPuestoPostula() {
        return this.puestoPostula;
    }
    
    public void setPuestoPostula(String puestoPostula) {
        this.puestoPostula = puestoPostula;
    }
    public Integer getIdLugarExamen() {
        return this.idLugarExamen;
    }
    
    public void setIdLugarExamen(Integer idLugarExamen) {
        this.idLugarExamen = idLugarExamen;
    }
    public String getProyecto() {
        return this.proyecto;
    }
    
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
    public Set<CertificadoMedicoOcupacional> getCertificadoMedicoOcupacionals() {
        return this.certificadoMedicoOcupacionals;
    }
    
    public void setCertificadoMedicoOcupacionals(Set<CertificadoMedicoOcupacional> certificadoMedicoOcupacionals) {
        this.certificadoMedicoOcupacionals = certificadoMedicoOcupacionals;
    }
    public Set<FichaPsicologicaPsicotecnico> getFichaPsicologicaPsicotecnicos() {
        return this.fichaPsicologicaPsicotecnicos;
    }
    
    public void setFichaPsicologicaPsicotecnicos(Set<FichaPsicologicaPsicotecnico> fichaPsicologicaPsicotecnicos) {
        this.fichaPsicologicaPsicotecnicos = fichaPsicologicaPsicotecnicos;
    }
    public Set<FichaPsicologica> getFichaPsicologicas() {
        return this.fichaPsicologicas;
    }
    
    public void setFichaPsicologicas(Set<FichaPsicologica> fichaPsicologicas) {
        this.fichaPsicologicas = fichaPsicologicas;
    }
    public Set<FichaOftalmologica> getFichaOftalmologicas() {
        return this.fichaOftalmologicas;
    }
    
    public void setFichaOftalmologicas(Set<FichaOftalmologica> fichaOftalmologicas) {
        this.fichaOftalmologicas = fichaOftalmologicas;
    }
    public Set<FichaMedicoOcupacional> getFichaMedicoOcupacionals() {
        return this.fichaMedicoOcupacionals;
    }
    
    public void setFichaMedicoOcupacionals(Set<FichaMedicoOcupacional> fichaMedicoOcupacionals) {
        this.fichaMedicoOcupacionals = fichaMedicoOcupacionals;
    }
    public Set<FichaAudiometria> getFichaAudiometrias() {
        return this.fichaAudiometrias;
    }
    
    public void setFichaAudiometrias(Set<FichaAudiometria> fichaAudiometrias) {
        this.fichaAudiometrias = fichaAudiometrias;
    }
    public Set<FichaOsteomuscular> getFichaOsteomusculars() {
        return this.fichaOsteomusculars;
    }
    
    public void setFichaOsteomusculars(Set<FichaOsteomuscular> fichaOsteomusculars) {
        this.fichaOsteomusculars = fichaOsteomusculars;
    }

    public Set<ExamenClinico> getExamenClinicos() {
        return examenClinicos;
    }

    public void setExamenClinicos(Set<ExamenClinico> examenClinicos) {
        this.examenClinicos = examenClinicos;
    }

    public Set<EmpresaActual> getEmpresaActuals() {
        return empresaActuals;
    }

    public void setEmpresaActuals(Set<EmpresaActual> empresaActuals) {
        this.empresaActuals = empresaActuals;
    }

    public String getResidenciaTrabajo() {
        return residenciaTrabajo;
    }

    public void setResidenciaTrabajo(String residenciaTrabajo) {
        this.residenciaTrabajo = residenciaTrabajo;
    }

    public Integer getTiempoResidencia() {
        return tiempoResidencia;
    }

    public void setTiempoResidencia(Integer tiempoResidencia) {
        this.tiempoResidencia = tiempoResidencia;
    }

    public String getMesAnioResidencia() {
        return mesAnioResidencia;
    }

    public void setMesAnioResidencia(String mesAnioResidencia) {
        this.mesAnioResidencia = mesAnioResidencia;
    }

    public Boolean getSegEssalud() {
        return segEssalud;
    }

    public void setSegEssalud(Boolean segEssalud) {
        this.segEssalud = segEssalud;
    }

    public Boolean getSegEps() {
        return segEps;
    }

    public void setSegEps(Boolean segEps) {
        this.segEps = segEps;
    }

    public Boolean getSegSctr() {
        return segSctr;
    }

    public void setSegSctr(Boolean segSctr) {
        this.segSctr = segSctr;
    }

    public Boolean getSegOtro() {
        return segOtro;
    }

    public void setSegOtro(Boolean segOtro) {
        this.segOtro = segOtro;
    }

    public Boolean getSegOtro2() {
        return segOtro2;
    }

    public void setSegOtro2(Boolean segOtro2) {
        this.segOtro2 = segOtro2;
    }

    public Set<InformeMedicoOcupacional> getInformeMedicoOcupacionals() {
        return informeMedicoOcupacionals;
    }

    public void setInformeMedicoOcupacionals(Set<InformeMedicoOcupacional> informeMedicoOcupacionals) {
        this.informeMedicoOcupacionals = informeMedicoOcupacionals;
    }




}


