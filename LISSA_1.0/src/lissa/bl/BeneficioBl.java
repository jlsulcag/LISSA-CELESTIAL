package lissa.bl;

import java.util.List;
import lissa.be.Beneficio;
import lissa.dao.BeneficioDao;

public class BeneficioBl {

    private BeneficioDao dao;

    public List<Beneficio> buscarXIdSeguro(Integer id) {
        dao = new BeneficioDao();
        return dao.buscarXIdSeguro(id);
    }
}
