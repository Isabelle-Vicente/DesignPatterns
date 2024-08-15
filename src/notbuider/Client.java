/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notbuider;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        McDonaldsMeal burgerCombo = new McDonaldsMeal("Suco", "X-salad", "Batatas");
        System.out.println(burgerCombo);

        McDonaldsMeal justFries = new McDonaldsMeal(null, null, "Batatas");
        System.out.println(justFries);

        McDonaldsMeal fitnessCombo = new McDonaldsMeal("Milk Shake", "X-bacon", "Batatas Grandes", "Sundae", "Maça");
        System.out.println(fitnessCombo);
    }
    
}
