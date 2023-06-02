package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class carregarcomboDAO {

    private Connection connection;

    public carregarcomboDAO(Connection connection) {
        this.connection = connection;
    }

    public ResultSet carregaCombo() throws SQLException {
        PreparedStatement pst = connection.prepareStatement("SELECT * FROM idioma ORDER BY idioma ASC");
        ResultSet rs = pst.executeQuery();
        return rs;
    }
}