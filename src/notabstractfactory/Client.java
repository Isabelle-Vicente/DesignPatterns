/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notabstractfactory;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class Client {
    public static void main(String[] args) {
        // Criação de um notebook MacAir com certificado e embalagem brasileiros
        Certificate brazilianCert = new BrazilianCertificate();
        Packing brazilianPacking = new BrazilianPacking();
        Macbook macAirBrazil = new MacAir(brazilianCert, brazilianPacking);
        macAirBrazil.getHardware();
        macAirBrazil.assemble();
        macAirBrazil.certificates();
        macAirBrazil.pack();
        
        // Criação de um notebook MacPro com certificado e embalagem dos EUA
        Certificate usaCert = new USACertificate();
        Packing usaPacking = new USAPacking();
        Macbook macProUSA = new MacPro(usaCert, usaPacking);
        macProUSA.getHardware();
        macProUSA.assemble();
        macProUSA.certificates();
        macProUSA.pack();
    }
}