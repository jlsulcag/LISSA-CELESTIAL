package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private int idPersona;
     private PeEstadoCivil peEstadoCivil;
     private TipoDocIdentidad tipoDocIdentidad;
     private Ubigeo ubigeo;
     private String nombre;
     private String apellidoPaterno;
     private Date fechaNacimiento;
     private String numeroDocumento;
     private String apellidoMaterno;
     private Date fechaReg;
     private String direccion;
     private String telefono;
     private String gradoInstruccion;
     private String lugarNacimiento;
     private String lugarProcedencia;
     private String sexo;
     private String ocupacion;
     private String correoElectronico;
     private Integer totalHijosVivos;
     private Integer numTotalDependientes;
     private byte[] foto;
     private String domicioFiscal;
     private String avJr;
     private String direccionDf;
     private String numero;
     private String numeroDetalle;
     private String urbanizacion;
     private String autorizaUsoDatos;
     private Boolean estado;
     private Set<HistoriaClinica> historiaClinicas = new HashSet<HistoriaClinica>(0);
     private Set<PersonaEmpresa> personaEmpresas = new HashSet<PersonaEmpresa>(0);
     private Set<Paciente> pacientes = new HashSet<Paciente>(0);
     private Set<FondoSolidaridad> fondoSolidaridads = new HashSet<FondoSolidaridad>(0);
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);
     private Set<Cita> citas = new HashSet<Cita>(0);
     private Set<Medico> medicos = new HashSet<Medico>(0);
     private Set<SeguroVidaUsaPersona> seguroVidaUsaPersonas = new HashSet<SeguroVidaUsaPersona>(0);

    public Persona() {
    }

	
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }
    public Persona(int idPersona, PeEstadoCivil peEstadoCivil, TipoDocIdentidad tipoDocIdentidad, Ubigeo ubigeo, String nombre, String apellidoPaterno, Date fechaNacimiento, String numeroDocumento, String apellidoMaterno, Date fechaReg, String direccion, String telefono, String gradoInstruccion, String lugarNacimiento, String lugarProcedencia, String sexo, String ocupacion, String correoElectronico, Integer totalHijosVivos, Integer numTotalDependientes, byte[] foto, String domicioFiscal, String avJr, String direccionDf, String numero, String numeroDetalle, String urbanizacion, String autorizaUsoDatos, Boolean estado, Set<HistoriaClinica> historiaClinicas, Set<PersonaEmpresa> personaEmpresas, Set<Paciente> pacientes, Set<FondoSolidaridad> fondoSolidaridads, Set<Usuario> usuarios, Set<Cita> citas, Set<Medico> medicos, Set<SeguroVidaUsaPersona> seguroVidaUsaPersonas) {
       this.idPersona = idPersona;
       this.peEstadoCivil = peEstadoCivil;
       this.tipoDocIdentidad = tipoDocIdentidad;
       this.ubigeo = ubigeo;
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.fechaNacimiento = fechaNacimiento;
       this.numeroDocumento = numeroDocumento;
       this.apellidoMaterno = apellidoMaterno;
       this.fechaReg = fechaReg;
       this.direccion = direccion;
       this.telefono = telefono;
       this.gradoInstruccion = gradoInstruccion;
       this.lugarNacimiento = lugarNacimiento;
       this.lugarProcedencia = lugarProcedencia;
       this.sexo = sexo;
       this.ocupacion = ocupacion;
       this.correoElectronico = correoElectronico;
       this.totalHijosVivos = totalHijosVivos;
       this.numTotalDependientes = numTotalDependientes;
       this.foto = foto;
       this.domicioFiscal = domicioFiscal;
       this.avJr = avJr;
       this.direccionDf = direccionDf;
       this.numero = numero;
       this.numeroDetalle = numeroDetalle;
       this.urbanizacion = urbanizacion;
       this.autorizaUsoDatos = autorizaUsoDatos;
       this.estado = estado;
       this.historiaClinicas = historiaClinicas;
       this.personaEmpresas = personaEmpresas;
       this.pacientes = pacientes;
       this.fondoSolidaridads = fondoSolidaridads;
       this.usuarios = usuarios;
       this.citas = citas;
       this.medicos = medicos;
       this.seguroVidaUsaPersonas = seguroVidaUsaPersonas;
    }
   
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public PeEstadoCivil getPeEstadoCivil() {
        return this.peEstadoCivil;
    }
    
    public void setPeEstadoCivil(PeEstadoCivil peEstadoCivil) {
        this.peEstadoCivil = peEstadoCivil;
    }
    public TipoDocIdentidad getTipoDocIdentidad() {
        return this.tipoDocIdentidad;
    }
    
    public void setTipoDocIdentidad(TipoDocIdentidad tipoDocIdentidad) {
        this.tipoDocIdentidad = tipoDocIdentidad;
    }
    public Ubigeo getUbigeo() {
        return this.ubigeo;
    }
    
    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }
    
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public Date getFechaReg() {
        return this.fechaReg;
    }
    
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
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
    public String getGradoInstruccion() {
        return this.gradoInstruccion;
    }
    
    public void setGradoInstruccion(String gradoInstruccion) {
        this.gradoInstruccion = gradoInstruccion;
    }
    public String getLugarNacimiento() {
        return this.lugarNacimiento;
    }
    
    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
    public String getLugarProcedencia() {
        return this.lugarProcedencia;
    }
    
    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getOcupacion() {
        return this.ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public Integer getTotalHijosVivos() {
        return this.totalHijosVivos;
    }
    
    public void setTotalHijosVivos(Integer totalHijosVivos) {
        this.totalHijosVivos = totalHijosVivos;
    }
    public Integer getNumTotalDependientes() {
        return this.numTotalDependientes;
    }
    
    public void setNumTotalDependientes(Integer numTotalDependientes) {
        this.numTotalDependientes = numTotalDependientes;
    }
    public byte[] getFoto() {
        return this.foto;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public String getDomicioFiscal() {
        return this.domicioFiscal;
    }
    
    public void setDomicioFiscal(String domicioFiscal) {
        this.domicioFiscal = domicioFiscal;
    }
    public String getAvJr() {
        return this.avJr;
    }
    
    public void setAvJr(String avJr) {
        this.avJr = avJr;
    }
    public String getDireccionDf() {
        return this.direccionDf;
    }
    
    public void setDireccionDf(String direccionDf) {
        this.direccionDf = direccionDf;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumeroDetalle() {
        return this.numeroDetalle;
    }
    
    public void setNumeroDetalle(String numeroDetalle) {
        this.numeroDetalle = numeroDetalle;
    }
    public String getUrbanizacion() {
        return this.urbanizacion;
    }
    
    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }
    public String getAutorizaUsoDatos() {
        return this.autorizaUsoDatos;
    }
    
    public void setAutorizaUsoDatos(String autorizaUsoDatos) {
        this.autorizaUsoDatos = autorizaUsoDatos;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Set<HistoriaClinica> getHistoriaClinicas() {
        return this.historiaClinicas;
    }
    
    public void setHistoriaClinicas(Set<HistoriaClinica> historiaClinicas) {
        this.historiaClinicas = historiaClinicas;
    }
    public Set<PersonaEmpresa> getPersonaEmpresas() {
        return this.personaEmpresas;
    }
    
    public void setPersonaEmpresas(Set<PersonaEmpresa> personaEmpresas) {
        this.personaEmpresas = personaEmpresas;
    }
    public Set<Paciente> getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Set<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    public Set<FondoSolidaridad> getFondoSolidaridads() {
        return this.fondoSolidaridads;
    }
    
    public void setFondoSolidaridads(Set<FondoSolidaridad> fondoSolidaridads) {
        this.fondoSolidaridads = fondoSolidaridads;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public Set<Cita> getCitas() {
        return this.citas;
    }
    
    public void setCitas(Set<Cita> citas) {
        this.citas = citas;
    }
    public Set<Medico> getMedicos() {
        return this.medicos;
    }
    
    public void setMedicos(Set<Medico> medicos) {
        this.medicos = medicos;
    }
    public Set<SeguroVidaUsaPersona> getSeguroVidaUsaPersonas() {
        return this.seguroVidaUsaPersonas;
    }
    
    public void setSeguroVidaUsaPersonas(Set<SeguroVidaUsaPersona> seguroVidaUsaPersonas) {
        this.seguroVidaUsaPersonas = seguroVidaUsaPersonas;
    }




}


