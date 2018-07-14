/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lissa.bl;

import java.util.ArrayList;
import lissa.be.AtencionOcupacional;
import lissa.be.HistoriaClinica;
import lissa.dao.AtencionOcupacionalDao;

/**
 *
 * @author JSULCAG
 */
public class AtencionOcupacionalBl {
    private AtencionOcupacionalDao dao;
    private ArrayList<AtencionOcupacional> list;
    
    public AtencionOcupacional registrar(AtencionOcupacional obj) {
        dao = new AtencionOcupacionalDao();
        return dao.registrar(obj);
    }

    public AtencionOcupacional buscar(HistoriaClinica oHistoriaClinica) {
        dao = new AtencionOcupacionalDao();
        return dao.buscar(oHistoriaClinica);
    }
}
