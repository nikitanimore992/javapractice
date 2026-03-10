/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author pramo
 */
// runtime polymorphism example

class man {

    void show() {
        System.out.println("Class man");
    }
}

class woman extends man {

    void show() {
        System.out.println("Class woman");
    }
}

// When parent and child class have same method it is called method overriding

public class polymorphismruntime {

    public static void main(String[] args) {

        woman obj = new woman();   // parent reference, child object
        obj.show();

    }
}
