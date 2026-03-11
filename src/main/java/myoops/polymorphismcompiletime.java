/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */

// complile time polymorphism method over loading 


class calculator{
    // method 1 adding 2 intiger
    int add (int a , int b){
    return a+b;
    }
    
    // method 2 adding 3 intiger
     int add (int a , int b , int c){
    return a+b+c;
    }
     
    // method 3 adding 2 double values
      double add (double a , double b){
    return a+b;
    }
}
public class polymorphismcompiletime {
    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.add(10, 20)); // method 1 called
        System.out.println(obj.add(2.5, 2.8)); // method 3 called
        System.out.println(obj.add(1, 2, 3));  // mehod 2 called 
    
    }
}
