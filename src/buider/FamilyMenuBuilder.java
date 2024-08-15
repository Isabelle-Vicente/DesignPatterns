/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buider;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class FamilyMenuBuilder extends McDonaldsMealBuilder{
     @Override
    public void buildDrink() {
        meal.setDrink("Suco");
    }

    @Override
    public void buildMain() {
        meal.setMain("BigTasty");
    }

    @Override
    public void buildSide() {
        meal.setSide("Batata");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Casquina Mista");
    }

    @Override
    public void buildGift() {
        meal.setToy("Torta de Maça");
    }
}
