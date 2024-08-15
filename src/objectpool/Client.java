/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectpool;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) {
        try {
            // Configurações do banco de dados
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "username";
            String password = "password";
            int initialPoolSize = 5;

            // Criação do pool de conexões
            ConnectionPool connectionPool = new ConnectionPool(url, user, password, initialPoolSize);

            // Criação do gerenciador de banco de dados
            DatabaseManager dbManager = new DatabaseManager(connectionPool);

            // Execução de uma consulta
            String query = "SELECT * FROM mytable";
            dbManager.executeQuery(query);

            // Fechamento de todas as conexões no pool
            connectionPool.closeAllConnections();
            System.out.println("Todas as conexões no pool foram fechadas");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

