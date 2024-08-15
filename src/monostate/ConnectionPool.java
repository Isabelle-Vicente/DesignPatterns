/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monostate;

/**
 *
 * @author NOTEBOOK-BELLE
 */
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    public final static int POOL_SIZE = 2;
    private static List<Connection> connectionsPool;

    static {
        System.out.println("Criando pool de conexões");
        connectionsPool = new ArrayList<Connection>();
        for(int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public ConnectionPool() {
        System.out.println("Nova instância do Pool de Conexões");
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
            System.out.println("Não há conexões disponíveis");
            return null;
        }
        avaiable.setInUse(true);
        return avaiable;
    }

    public void leaveConnection(Connection conn) {
        conn.setInUse(false);
    }
}
