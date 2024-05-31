/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.factory;

import abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import abstractfactory.model.macbooks.Macbook;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public abstract class MacbookFactory {
    CountryRulesAbstractFactory rules;

    public MacbookFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public Macbook orderMacbook(String level) {
        Macbook notebook = null;

        notebook = createNotebook(level);

        notebook.getHardware();
        notebook.assemble();
        notebook.certificates();
        notebook.pack();

        return notebook;
    }

    protected abstract Macbook createNotebook(String level);
}
