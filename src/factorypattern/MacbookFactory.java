/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public abstract class MacbookFactory {

    public Macbook orderMacbook(String level) {
        Macbook notebook = null;

        notebook = createNotebook(level);

        notebook.getHardware();
        notebook.assemble();
        notebook.getCertificates();
        notebook.pack();

        return notebook;
    }

    protected abstract Macbook createNotebook(String level);
}
