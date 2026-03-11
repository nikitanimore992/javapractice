/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */

class Hum {

    private String name;
    private int age;

    // setter
    void setValue(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter / display
    void getValue() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}

public class Encapsulationprivate {

    public static void main(String[] args) {

        Hum h = new Hum();
        
        h.setValue("Nikita", 24);
        h.getValue();
         h.setValue("yogita", 22);
        h.getValue();
    }
}