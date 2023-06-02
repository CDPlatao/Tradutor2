package services;

import dao.carregarcomboDAO;
import dao.factoryDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

public class comboServicos {

    public ResultSet CarregaCombo() throws SQLException {// Inicio CAR
        carregarcomboDAO cDAO = factoryDAO.getComboDAO();
        cDAO.carregaCombo();
        return cDAO.carregaCombo();
    }// Fim CAR
}
