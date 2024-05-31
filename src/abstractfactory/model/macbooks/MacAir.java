/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.model.macbooks;

import abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class MacAir extends Macbook {


    public MacAir(CountryRulesAbstractFactory rules) {
        super(rules);
    }


    @Override
    public void getHardware() {
        System.out.println("Hard. list");
        System.out.println("\t- Retina Scree");
        System.out.println("\t- 8GB");

    }
}