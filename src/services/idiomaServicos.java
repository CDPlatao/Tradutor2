package services;

import dao.idiomaDAO;
import dao.factoryDAO;
import model.idioma;
import java.util.ArrayList;

public class idiomaServicos {

    public void cadTraducao(idioma iVO) {// Inicio CAD
        idiomaDAO iDAO = factoryDAO.getIdiomaDAO();
        iDAO.cadIdiomaDAO(iVO);
    }// Fim CAD

    public ArrayList<idioma> getIdioma() {// Inicio GET
        idiomaDAO iDAO = factoryDAO.getIdiomaDAO();
        return iDAO.getIdiomaDAO();
    }// Fim GET

    public void attTraducao(idioma iVO) {// Inicio ATT
        idiomaDAO iDAO = factoryDAO.getIdiomaDAO();
        iDAO.attIdiomabyDOC(iVO);
    }// Fim ATT 

    public void delTraducao(int idIdioma) {// Inicio DEL
        idiomaDAO iDAO = factoryDAO.getIdiomaDAO();
        iDAO.delIdiomaDAO(idIdioma);
    }// Fim DEL 

    public idioma getIdiomabyID(int id) {
        idiomaDAO iDAO = factoryDAO.getIdiomaDAO();
        return iDAO.getIdiomaID(id);
    }

    public idioma getIdiomabyNome(String idioma) {
        idiomaDAO iDAO = factoryDAO.getIdiomaDAO();
        return iDAO.getIdioma(idioma);
    }

    public boolean verTraducao(idioma idioma) {
        idiomaDAO iDAO = factoryDAO.getIdiomaDAO();
        return iDAO.verTraducao(idioma);
    }
}
