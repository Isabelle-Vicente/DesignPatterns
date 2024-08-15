/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;

public class ConnectionPool {

    private String url;
    private String user;
    private String password;
    private Hashtable<Connection, Boolean> connectionPool;

    public ConnectionPool(String url, String user, String password, int initialSize) throws SQLException {
        this.url = url;
        this.user = user;
        this.password = password;
        this.connectionPool = new Hashtable<>(initialSize);

        for (int i = 0; i < initialSize; i++) {
            connectionPool.put(createNewConnection(), true);
        }
    }

    private Connection createNewConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public synchronized Connection borrowConnection() {
        Enumeration<Connection> connections = connectionPool.keys();
        while (connections.hasMoreElements()) {
            Connection conn = connections.nextElement();
            if (connectionPool.get(conn)) {
                connectionPool.put(conn, false);
                return conn;
            }
        }
        return null; // or create a new connection if needed
    }

    public synchronized void returnConnection(Connection conn) {
        connectionPool.put(conn, true);
    }

    public synchronized void closeAllConnections() {
        Enumeration<Connection> connections = connectionPool.keys();
        while (connections.hasMoreElements()) {
            Connection conn = connections.nextElement();
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
