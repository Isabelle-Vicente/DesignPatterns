/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class Client {
    public static void main(String[] args) {
        MacbookFactory levelAirFactory = new MacAirFactory();
        MacbookFactory levelProFactory = new MacProFactory();

        System.out.println("==Ordering an MacPro");
        Macbook notebook = levelProFactory.orderMacbook("high");
        System.out.println(notebook);

        System.out.println("==Ordering an MacAir");
        Macbook notebook2 = levelAirFactory.orderMacbook("standard");
        System.out.println(notebook);

    }
}
