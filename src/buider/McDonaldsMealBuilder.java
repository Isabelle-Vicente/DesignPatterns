/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buider;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public abstract class McDonaldsMealBuilder {
    
    protected McDonaldsMeal meal;
    
    public McDonaldsMealBuilder() {
        meal = new McDonaldsMeal();
    }

    public McDonaldsMeal getMeal() {
        return meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();
    
}
