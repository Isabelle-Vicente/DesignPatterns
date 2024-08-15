/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buider;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class McDirector {
    
    private McDonaldsMealBuilder builder;
    
      public McDirector(McDonaldsMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public McDonaldsMeal getCombo() {
        return builder.getMeal();
    }
    
}
