package lissa.dao;

import java.util.ArrayList;
import java.util.List;
import lissa.be.ExamenOcupacional;
import lissa.util.AbstractDA;

public class ExamenOcupacionalDao extends AbstractDA<ExamenOcupacional> {

    @Override
    public ExamenOcupacional registrar(ExamenOcupacional bean) {
        return save(bean);
    }

    @Override
    public int actualizar(ExamenOcupacional bean) {
        return update(bean);
    }

    @Override
    public int eliminar(ExamenOcupacional bean) {
        return delete(bean);
    }

    @Override
    public List<ExamenOcupacional> listar() {
        return list(ExamenOcupacional.class);
    }

    @Override
    public ArrayList<ExamenOcupacional> listar(String hql) {
        return list(hql);
    }

    @Override
    public List<ExamenOcupacional> listar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExamenOcupacional buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExamenOcupacional buscar(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
