/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notabstractfactory;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class MacPro extends Macbook {
    public MacPro(Certificate certificate, Packing packing) {
        super(certificate, packing);
    }

    @Override
    public void getHardware() {
        System.out.println("Hard. list");
        System.out.println("\t- Retina Screen");
        System.out.println("\t- 16GB");
    }
}
