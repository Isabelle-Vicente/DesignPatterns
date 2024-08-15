/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notsingleton;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class Connection {
    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public Object query(String sql) {
        System.out.println("Executando '" + sql + "' em Conexão " + this);
        return null;
    }

    boolean isInUse() {
        return inUse;
    }

    void setInUse(boolean status) {
        inUse = status;
    }
}
