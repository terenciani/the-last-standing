package br.edu.ifpr.thelaststanding.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_the_last_standing";
    private static final String usuario = "root";
    private static final String senha = "root";
    private static Connection conexao = null;

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(URL, usuario, senha);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conexao;
    }
}
