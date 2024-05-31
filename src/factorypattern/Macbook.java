/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public abstract class Macbook {

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling the notebooks hardwares");
    }


    public void getCertificates() {
        System.out.println("Testing all the certificates");
    }


    public void pack() {
        System.out.println("Packing the notebook");
    }
}
