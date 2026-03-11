/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */
class Human{
    public int age;
    void output(){
        System.out.println("Age is "+age);
    }
}

public class Encapsulationspublic {
    public static void main(String[] args) {
        Human nikky = new Human();
        nikky.age = 24;
        nikky.output();
    }
}
