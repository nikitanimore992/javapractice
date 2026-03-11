/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */
//you can not create object abstract classes
//every abastract method needs abtract class if your class is not abtract then inside it you can not create abstract methods
//if you want to create your class to abstract class then you need to use abstract keyword
//abstract methods doesnt have body
//if you want to access a abstract method then you need to create them child class 
//i have to define all the methode in childe classs which are definde in parent class
//you can create constructore in abstract class 
    

// Abstract class 
abstract class Animal {
    
    // Abstract method (body nahi hoti)
    abstract void makesound();
    
    // Constructor (Abstract class ka constructor ho sakta hai)
    Animal() {
        System.out.println("This is animal (Parent Constructor)");
    }
}

class Dog extends Animal {
    
    // Constructor
    Dog() {
        super(); // Java ise automatically call kar leta hai, par likhna ho toh yahan likhein.
        System.out.println("Dog constructor called");
    }

    // Abstract method ko implement karna compulsory hai
    @Override 
    public void makesound() {
        System.out.println("Dog is bark: BHO Bho");
    }
}

public class abstractionclass { // PascalCase use karein
    public static void main(String[] args) {
        // Hum Animal ka object nahi bana sakte, par Dog ka bana sakte hain
        Dog obj = new Dog();
        obj.makesound();
    }
}