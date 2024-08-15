/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buider;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class FridayMenuBuilder extends McDonaldsMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Coca-cola");
    }

    @Override
    public void buildMain() {
        meal.setMain("BigMac");
    }

    @Override
    public void buildSide() {
        meal.setSide("Batatas");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Sandae");
    }

    @Override
    public void buildGift() {
        meal.setToy("Nuggets 4");
    }
}
