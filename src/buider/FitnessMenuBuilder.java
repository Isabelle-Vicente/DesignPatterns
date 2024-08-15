/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buider;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class FitnessMenuBuilder extends McDonaldsMealBuilder {
     @Override
    public void buildDrink() {
        meal.setDrink("Suco de laraja");
    }

    @Override
    public void buildMain() {
        // no main
    }

    @Override
    public void buildSide() {
        meal.setSide("Salada");
    }

    @Override
    public void buildDessert() {
        // no dessert
    }

    @Override
    public void buildGift() {
        //no gift
    }
}
