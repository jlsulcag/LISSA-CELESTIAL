
package lissa.bl;

import lissa.be.Paciente;
import lissa.dao.ClienteDao;

public class ClienteBl {
    private ClienteDao dao;

    public ClienteBl() {
    }
    
    public int registrar(Paciente obj){
        dao = new ClienteDao();
        return dao.registrar(obj);
    }
}
