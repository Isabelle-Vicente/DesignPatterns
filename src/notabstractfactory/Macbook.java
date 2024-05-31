/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notabstractfactory;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public abstract class Macbook {
    private Certificate certificate;
    private Packing packing;

    public Macbook(Certificate certificate, Packing packing) {
        this.certificate = certificate;
        this.packing = packing;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardware");
    }

    public void certificates() {
        System.out.println("Testing all the certificates");
        System.out.println(certificate.applyCertification());
    }

    public void pack() {
        System.out.println("Packing the device");
        System.out.println(packing.pack());
    }
}

