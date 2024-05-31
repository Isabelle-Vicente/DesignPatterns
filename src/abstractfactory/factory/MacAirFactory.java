
package abstractfactory.factory;

import abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import abstractfactory.model.macbooks.MacAir;
import abstractfactory.model.macbooks.MacPro;
import abstractfactory.model.macbooks.Macbook;


public class MacAirFactory extends MacbookFactory{

   public MacAirFactory(CountryRulesAbstractFactory rules) {
       super(rules);
   }

    public Macbook createNotebook(String level) {
        if(level.equals("standard")) {
            return new MacAir(rules);
        } else if(level.equals("highEnd")) {
            return new MacPro(rules);
        } else return null;
    }

}
