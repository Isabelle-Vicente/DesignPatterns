/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buider;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class Client {
     public static void order(String name, McDonaldsMealBuilder builder) {
        System.out.println("Ordering a " + name);
        McDirector director = new McDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("------------------");
    }

    public static void main(String[] args) {
        order("Menu de segunda-feira hoje!", new MondayMenuBuilder());
        order("Hoje é sexta-feira, amor!", new FridayMenuBuilder());
        order("Um menu familiar, por favor.", new FamilyMenuBuilder());
        order("Hoje estou fitness...", new FitnessMenuBuilder());
    }
}
