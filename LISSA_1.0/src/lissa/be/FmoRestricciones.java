package lissa.be;
// Generated 12/07/2018 05:03:55 PM by Hibernate Tools 4.3.1



/**
 * FmoRestricciones generated by hbm2java
 */
public class FmoRestricciones  implements java.io.Serializable {


     private long idfmorestricciones;
     private CertMedicoOcupacional certMedicoOcupacional;
     private long idRestriccion;

    public FmoRestricciones() {
    }

    public FmoRestricciones(long idfmorestricciones, CertMedicoOcupacional certMedicoOcupacional, long idRestriccion) {
       this.idfmorestricciones = idfmorestricciones;
       this.certMedicoOcupacional = certMedicoOcupacional;
       this.idRestriccion = idRestriccion;
    }
   
    public long getIdfmorestricciones() {
        return this.idfmorestricciones;
    }
    
    public void setIdfmorestricciones(long idfmorestricciones) {
        this.idfmorestricciones = idfmorestricciones;
    }
    public CertMedicoOcupacional getCertMedicoOcupacional() {
        return this.certMedicoOcupacional;
    }
    
    public void setCertMedicoOcupacional(CertMedicoOcupacional certMedicoOcupacional) {
        this.certMedicoOcupacional = certMedicoOcupacional;
    }
    public long getIdRestriccion() {
        return this.idRestriccion;
    }
    
    public void setIdRestriccion(long idRestriccion) {
        this.idRestriccion = idRestriccion;
    }




}


