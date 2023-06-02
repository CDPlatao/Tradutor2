package conexao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

public class conexao {

    private static String url = "jdbc:mysql://localhost:3306/tradutor?useTimezone=true&serverTimezone=UTC";
    private static String user = "root";
    private static String pass = "";

    private DataSource dataSource;

    public conexao() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(pass);

        this.dataSource = comboPooledDataSource;
    }

    public Connection getConexao() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
