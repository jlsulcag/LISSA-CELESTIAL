package lissa.be;
// Generated 12/07/2018 05:03:55 PM by Hibernate Tools 4.3.1



/**
 * CmoRecomendaciones generated by hbm2java
 */
public class CmoRecomendaciones  implements java.io.Serializable {


     private long idcmorecomendacion;
     private CertMedicoOcupacional certMedicoOcupacional;
     private long idRecomendacion;

    public CmoRecomendaciones() {
    }

    public CmoRecomendaciones(long idcmorecomendacion, CertMedicoOcupacional certMedicoOcupacional, long idRecomendacion) {
       this.idcmorecomendacion = idcmorecomendacion;
       this.certMedicoOcupacional = certMedicoOcupacional;
       this.idRecomendacion = idRecomendacion;
    }
   
    public long getIdcmorecomendacion() {
        return this.idcmorecomendacion;
    }
    
    public void setIdcmorecomendacion(long idcmorecomendacion) {
        this.idcmorecomendacion = idcmorecomendacion;
    }
    public CertMedicoOcupacional getCertMedicoOcupacional() {
        return this.certMedicoOcupacional;
    }
    
    public void setCertMedicoOcupacional(CertMedicoOcupacional certMedicoOcupacional) {
        this.certMedicoOcupacional = certMedicoOcupacional;
    }
    public long getIdRecomendacion() {
        return this.idRecomendacion;
    }
    
    public void setIdRecomendacion(long idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }




}


