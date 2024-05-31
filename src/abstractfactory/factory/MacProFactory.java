/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.factory;

import abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import abstractfactory.model.macbooks.MacPro;
import abstractfactory.model.macbooks.MacProM1;
import abstractfactory.model.macbooks.Macbook;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class MacProFactory extends MacbookFactory {

    public MacProFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public Macbook createNotebook(String level) {
        if(level.equals("standard")) {
            return new MacPro(rules);
        } else if(level.equals("highEnd")) {
            return new MacProM1(rules);
        } else return null;
    }
}