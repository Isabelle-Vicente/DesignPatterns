/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notfactorypattern;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class Client {

    public Macbook orderMac(String type, String level) {
        Macbook notebook = null;

        if (type.equals("pro")) {
            if (level.equals("high")) {
                notebook = new MacPro();
            } else if (level.equals("simple")) {
                notebook = new MacPro2016();
            }
        } else if (type.equals("air")) {
            if (level.equals("high")) {
                notebook = new MacAir();
            }
        }

        notebook.getHardware();
        notebook.assemble();
        notebook.getCertificates();
        notebook.pack();

        return notebook;
    }

    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("=== Ordering an MacPro");
        Macbook macbook = client.orderMac("pro", "high");
        System.out.println(macbook);


        System.out.println("=== Ordering an MacAir");
        Macbook macbook2 = client.orderMac("air", "high");
        System.out.println(macbook2);
    }
}
