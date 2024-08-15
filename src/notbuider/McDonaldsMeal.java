/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notbuider;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class McDonaldsMeal {
    
    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;
    
    public McDonaldsMeal(String drink) {
        this.drink = drink;
    }

    public McDonaldsMeal(String drink, String main) {
        this.drink = drink;
        this.main = main;
    }

    public McDonaldsMeal(String drink, String main, String side) {
        this.drink = drink;
        this.main = main;
        this.side = side;
    }

    public McDonaldsMeal(String drink, String main, String side, String dessert) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
    }

    public McDonaldsMeal(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

   @Override
    public String toString() {
        return "RefeiçãoFastFood [bebida=" + drink + ", principal=" + main + ", acompanhamento=" + side + ", sobremesa=" + dessert + ", brinde=" + gift + "]";
    }

}
    

