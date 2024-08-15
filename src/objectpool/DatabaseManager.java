/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectpool;

/**
 *
 * @author NOTEBOOK-BELLE
 */
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseManager {

    private ConnectionPool connectionPool;

    public DatabaseManager(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public void executeQuery(String query) {
        Connection conn = null;
        conn = connectionPool.borrowConnection();
        if (conn != null) {
            // Aqui você pode executar sua consulta
            System.out.println("Conexão obtida do pool e consulta executada");
            
            // Devolução da conexão ao pool
            connectionPool.returnConnection(conn);
            System.out.println("Conexão devolvida ao pool");
        } else {
            System.out.println("Não há conexões disponíveis no pool");
        }
    }
}
