package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Comprobante generated by hbm2java
 */
public class Comprobante  implements java.io.Serializable {


     private int idComprobante;
     private Beneficio beneficio;
     private Caja caja;
     private Paciente paciente;
     private TipoComprobante tipoComprobante;
     private Boolean estado;
     private Date fechaBoleta;
     private Integer idPersonaRucFactura;
     private Date fechaReg;
     private Integer numeroBoleta;
     private BigDecimal subTotal;
     private BigDecimal montoIgv;
     private BigDecimal montoTotal;
     private String motivoAnulacion;
     private Integer idUsuario;
     private Integer numeroOperacion;
     private Integer grupoNumeracion;
     private String tipoPaciente;
     private Set<ItemsComprobante> itemsComprobantes = new HashSet<ItemsComprobante>(0);

    public Comprobante() {
    }

	
    public Comprobante(int idComprobante, Caja caja, Paciente paciente, String tipoPaciente) {
        this.idComprobante = idComprobante;
        this.caja = caja;
        this.paciente = paciente;
        this.tipoPaciente = tipoPaciente;
    }
    public Comprobante(int idComprobante, Beneficio beneficio, Caja caja, Paciente paciente, TipoComprobante tipoComprobante, Boolean estado, Date fechaBoleta, Integer idPersonaRucFactura, Date fechaReg, Integer numeroBoleta, BigDecimal subTotal, BigDecimal montoIgv, BigDecimal montoTotal, String motivoAnulacion, Integer idUsuario, Integer numeroOperacion, Integer grupoNumeracion, String tipoPaciente, Set<ItemsComprobante> itemsComprobantes) {
       this.idComprobante = idComprobante;
       this.beneficio = beneficio;
       this.caja = caja;
       this.paciente = paciente;
       this.tipoComprobante = tipoComprobante;
       this.estado = estado;
       this.fechaBoleta = fechaBoleta;
       this.idPersonaRucFactura = idPersonaRucFactura;
       this.fechaReg = fechaReg;
       this.numeroBoleta = numeroBoleta;
       this.subTotal = subTotal;
       this.montoIgv = montoIgv;
       this.montoTotal = montoTotal;
       this.motivoAnulacion = motivoAnulacion;
       this.idUsuario = idUsuario;
       this.numeroOperacion = numeroOperacion;
       this.grupoNumeracion = grupoNumeracion;
       this.tipoPaciente = tipoPaciente;
       this.itemsComprobantes = itemsComprobantes;
    }
   
    public int getIdComprobante() {
        return this.idComprobante;
    }
    
    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }
    public Beneficio getBeneficio() {
        return this.beneficio;
    }
    
    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
    public Caja getCaja() {
        return this.caja;
    }
    
    public void setCaja(Caja caja) {
        this.caja = caja;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public TipoComprobante getTipoComprobante() {
        return this.tipoComprobante;
    }
    
    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Date getFechaBoleta() {
        return this.fechaBoleta;
    }
    
    public void setFechaBoleta(Date fechaBoleta) {
        this.fechaBoleta = fechaBoleta;
    }
    public Integer getIdPersonaRucFactura() {
        return this.idPersonaRucFactura;
    }
    
    public void setIdPersonaRucFactura(Integer idPersonaRucFactura) {
        this.idPersonaRucFactura = idPersonaRucFactura;
    }
    public Date getFechaReg() {
        return this.fechaReg;
    }
    
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }
    public Integer getNumeroBoleta() {
        return this.numeroBoleta;
    }
    
    public void setNumeroBoleta(Integer numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }
    public BigDecimal getSubTotal() {
        return this.subTotal;
    }
    
    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }
    public BigDecimal getMontoIgv() {
        return this.montoIgv;
    }
    
    public void setMontoIgv(BigDecimal montoIgv) {
        this.montoIgv = montoIgv;
    }
    public BigDecimal getMontoTotal() {
        return this.montoTotal;
    }
    
    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }
    public String getMotivoAnulacion() {
        return this.motivoAnulacion;
    }
    
    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Integer getNumeroOperacion() {
        return this.numeroOperacion;
    }
    
    public void setNumeroOperacion(Integer numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }
    public Integer getGrupoNumeracion() {
        return this.grupoNumeracion;
    }
    
    public void setGrupoNumeracion(Integer grupoNumeracion) {
        this.grupoNumeracion = grupoNumeracion;
    }
    public String getTipoPaciente() {
        return this.tipoPaciente;
    }
    
    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }
    public Set<ItemsComprobante> getItemsComprobantes() {
        return this.itemsComprobantes;
    }
    
    public void setItemsComprobantes(Set<ItemsComprobante> itemsComprobantes) {
        this.itemsComprobantes = itemsComprobantes;
    }




}


