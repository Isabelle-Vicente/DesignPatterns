/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notobjectpool;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class Client {
    public static void main(String[] args) {
        // Configurações do banco de dados
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "username";
        String password = "password";

        // Criação do gerenciador de banco de dados
        DatabaseManager dbManager = new DatabaseManager(url, user, password);

        // Execução de uma consulta
        String query = "SELECT * FROM mytable";
        dbManager.executeQuery(query);
    }
}
