package services;

import dao.traducaoDAO;
import dao.factoryDAO;
import model.traducao;
import java.util.ArrayList;
import model.idioma;

public class traducaoServicos {

    public void cadTraducao(traducao tVO) {// Inicio CAD
        traducaoDAO tDAO = factoryDAO.getTraducaoDAO();
        tDAO.cadTraducaoDAO(tVO);
    }// Fim CAD

    public ArrayList<traducao> getTraducao() {// Inicio GET
        traducaoDAO tDAO = factoryDAO.getTraducaoDAO();
        return tDAO.getTraducaoDAO();
    }// Fim GET

    public void attTraducao(traducao tVO) {// Inicio ATT
        traducaoDAO tDAO = factoryDAO.getTraducaoDAO();
        tDAO.attTraducaobyDOC(tVO);
    }// Fim ATT 

    public void delTraducao(int idtraducao) {// Inicio DEL
        traducaoDAO tDAO = factoryDAO.getTraducaoDAO();
        tDAO.delTraducaoDAO(idtraducao);
    }// Fim DEL

    public boolean verTraducao(traducao traducao) {// Inicio VER
        traducaoDAO tDAO = factoryDAO.getTraducaoDAO();
        return tDAO.verTraducao(traducao);
    }// Fim VER

    public traducao getTraducaoID(String traducao) {// Inicio GETID
        traducaoDAO tDAO = factoryDAO.getTraducaoDAO();
        return tDAO.getTraducaoID(traducao);
    }// Fim GETID

    public String getTraducao(String palavra, idioma origem, idioma destino) {
        traducaoDAO tDAO = factoryDAO.getTraducaoDAO();
        return tDAO.getTraducao(palavra, origem, destino);
    }
}
