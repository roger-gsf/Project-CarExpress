package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectarBanco {

    private Connection conectaBanco() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/locadoraDeCarros";
        String usuario = "root";
        String senha = "root";
        return DriverManager.getConnection(url, usuario, senha);
    }
}
