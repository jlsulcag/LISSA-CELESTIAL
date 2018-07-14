package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;




/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private int idempresa;
     private String razonSocial;
     private String direccion;
     private String autorizacionSunat;
     private String ruc;
     private String serieTicketera;
     private byte[] logo;
     private String telefonoFijo;
     private String telefonoCel;

    public Empresa() {
    }

	
    public Empresa(int idempresa, String razonSocial, String direccion, String ruc, String serieTicketera) {
        this.idempresa = idempresa;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.ruc = ruc;
        this.serieTicketera = serieTicketera;
    }
    public Empresa(int idempresa, String razonSocial, String direccion, String autorizacionSunat, String ruc, String serieTicketera, byte[] logo, String telefonoFijo, String telefonoCel) {
       this.idempresa = idempresa;
       this.razonSocial = razonSocial;
       this.direccion = direccion;
       this.autorizacionSunat = autorizacionSunat;
       this.ruc = ruc;
       this.serieTicketera = serieTicketera;
       this.logo = logo;
       this.telefonoFijo = telefonoFijo;
       this.telefonoCel = telefonoCel;
    }
   
    public int getIdempresa() {
        return this.idempresa;
    }
    
    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getAutorizacionSunat() {
        return this.autorizacionSunat;
    }
    
    public void setAutorizacionSunat(String autorizacionSunat) {
        this.autorizacionSunat = autorizacionSunat;
    }
    public String getRuc() {
        return this.ruc;
    }
    
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public String getSerieTicketera() {
        return this.serieTicketera;
    }
    
    public void setSerieTicketera(String serieTicketera) {
        this.serieTicketera = serieTicketera;
    }
    public byte[] getLogo() {
        return this.logo;
    }
    
    public void setLogo(byte[] logo) {
        this.logo = logo;
    }
    public String getTelefonoFijo() {
        return this.telefonoFijo;
    }
    
    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }
    public String getTelefonoCel() {
        return this.telefonoCel;
    }
    
    public void setTelefonoCel(String telefonoCel) {
        this.telefonoCel = telefonoCel;
    }



}


