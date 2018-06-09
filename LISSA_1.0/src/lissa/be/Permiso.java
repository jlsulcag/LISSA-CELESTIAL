package lissa.be;
// Generated 07/06/2018 05:59:42 PM by Hibernate Tools 4.3.1



/**
 * Permiso generated by hbm2java
 */
public class Permiso  implements java.io.Serializable {


     private int idpermiso;
     private Usuario usuario;
     private int codigo;
     private String permiso;
     private String descripcion;
     private int idUsuarioAct;

    public Permiso() {
    }

    public Permiso(int idpermiso, Usuario usuario, int codigo, String permiso, String descripcion, int idUsuarioAct) {
       this.idpermiso = idpermiso;
       this.usuario = usuario;
       this.codigo = codigo;
       this.permiso = permiso;
       this.descripcion = descripcion;
       this.idUsuarioAct = idUsuarioAct;
    }
   
    public int getIdpermiso() {
        return this.idpermiso;
    }
    
    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getPermiso() {
        return this.permiso;
    }
    
    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getIdUsuarioAct() {
        return this.idUsuarioAct;
    }
    
    public void setIdUsuarioAct(int idUsuarioAct) {
        this.idUsuarioAct = idUsuarioAct;
    }




}


