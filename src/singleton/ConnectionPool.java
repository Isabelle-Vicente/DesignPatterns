/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NOTEBOOK-BELLE
 */
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static ConnectionPool singleton = new ConnectionPool();
    public final static int POOL_SIZE = 2;
    private List<Connection> connectionsPool;

    public static ConnectionPool getInstance() {
        return singleton;
    }

    private ConnectionPool() {
        System.out.println("Criando pool de conexõess");
        connectionsPool = new ArrayList<Connection>();
        for(int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection avaiable = null;
        for(Connection conn: connectionsPool) {
            if(!conn.isInUse()) {
                avaiable = conn;
                break;
            }
        }
        if(avaiable == null) {
            System.out.println("Sem conexões disponíveis");
            return null;
        }
        avaiable.setInUse(true);
        return avaiable;
    }

    public void leaveConnection(Connection conn) {
        conn.setInUse(false);
    }
}

