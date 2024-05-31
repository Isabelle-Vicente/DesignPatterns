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
public class MacProM1 extends Macbook {

    public MacProM1(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hard. list");
        System.out.println("\t- Screen retina");
        System.out.println("\t- 16GB");

    }
}
