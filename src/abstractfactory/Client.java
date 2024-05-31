/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory;

import abstractfactory.factory.MacAirFactory;
import abstractfactory.factory.MacProFactory;
import abstractfactory.factory.MacbookFactory;
import abstractfactory.factory.abstractfactory.BrazilianRulesAbstractFactory;
import abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import abstractfactory.model.macbooks.Macbook;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class Client {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        MacbookFactory macAirFactory = new MacAirFactory(rules);
        MacbookFactory macProFactory = new MacProFactory(rules);

        System.out.println("### Ordering the MacAir");
        Macbook mac1 = macAirFactory.orderMacbook("standard");
        System.out.println(mac1);

        System.out.println("\n\n### Ordering the MacPro finally");
        Macbook mac2 = macProFactory.orderMacbook("highEnd");
        System.out.println(mac2);
    }

    
}
