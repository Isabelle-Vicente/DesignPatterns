/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notprototype;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author NOTEBOOK-BELLE
 */
public class Client {
    
 

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws InterruptedException {
        List<Person> frames = new ArrayList<>();
        System.out.println("*********************************");
        System.out.println("* ");
        System.out.println("* Start the dance");
        System.out.println("* ");
        System.out.print("*********************************");
        Thread.sleep(3000);

        Person person = new Person(
            "                   ",
            "        o          ",
            "       /|\\          ",
            "_______/_\\___________"
        );

        frames.add(person);
        person.left();
        frames.add(person);
        person.left();
        frames.add(person);
        person.left();
        frames.add(person);
        person.right();
        frames.add(person);
        person.right();
        frames.add(person);
        person.right();
        frames.add(person);
        person.right();
        frames.add(person);
        person.right();
        frames.add(person);
        person.right();
        frames.add(person);
        person.right();
        frames.add(person);
        person.right();
        frames.add(person);
        person.right();
        frames.add(person);
        person.left();
        frames.add(person);
        person.left();
        frames.add(person);
        person.left();

        for (Person frame : frames) {
            frame.draw();
            Thread.sleep(500);
        }

        System.out.println("**********************");
        System.out.println("* ");
        System.out.println("* Finish.");
        System.out.println("* ");
        System.out.print("**********************");
    }
    
}
