/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buider;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class MondayMenuBuilder extends McDonaldsMealBuilder{
     @Override
    public void buildDrink() {
        meal.setDrink("Soda");
    }

    @Override
    public void buildMain() {
        meal.setMain("X-salada");
    }

    @Override
    public void buildSide() {
        meal.setSide("Batatas pequena");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("McFlurry");
    }

    @Override
    public void buildGift() {
        meal.setToy("Casquina Mista");
    }
}
