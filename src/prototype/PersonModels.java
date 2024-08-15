/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class PersonModels {
     private Map<String, Person> samples;

    public PersonModels() {
        samples = new HashMap<>();
        loadSamples();
    }

    public Person get(String type) {
        return samples.get(type);
    }

    private void loadSamples() {
        samples.put("firstMan", new Person(
                "                   ",
                "        o          ",
                "       /|\\          ",
                "_______/_\\___________"
        ));
        samples.put("secondMan", new Person(
                "                   ",
                "       (^ ^)          ",
                "       <)  )\\         ",
                "_______/__\\___________"
        ));
    }
}
