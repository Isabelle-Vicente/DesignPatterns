/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notfactorypattern;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public abstract class Macbook {

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Montando o hardware do notebook");
    }


    public void getCertificates() {
        System.out.println("Testando todos os certificados");
    }


    public void pack() {
        System.out.println("Embalando notebook");
    }
}
