/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class MacAirFactory extends MacbookFactory {

    public Macbook createNotebook(String level) {
        if (level.equals("standard")) {
            return new MacAir();
        } else return null;
    }
}
