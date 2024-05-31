package factorypattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class MacProFactory extends MacbookFactory {

    @Override
    public Macbook createNotebook(String level) {
        if (level.equals("standard")) {
            return new MacPro2016();
        } else if (level.equals("high")) {
            return new MacPro();
        } else return null;
    }
}
