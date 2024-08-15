/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notobjectpool;

/**
 *
 * @author NOTEBOOK-BELLE
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private String url;
    private String user;
    private String password;

    public DatabaseManager(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public void executeQuery(String query) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            // Aqui você pode executar sua consulta
            System.out.println("Conexão criada e consulta executada");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Conexão fechada");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

