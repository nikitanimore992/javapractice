/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */


public class wrapperclassess {
    public static void main(String[] args) {
        
        // conving primitive data type into wapper class / object
        int a  = 25; // simple variable creation using primitive data type
        Integer i = Integer.valueOf(a); // convert primitive variable into wrapper class using type.valueOf(primitive variavle name);
        System.out.println("Primitive " +a);
        System.out.println("wapper "+i);
        int n = 30;
        Integer m = n;// autoboxing 
        System.out.println(n+" primitive");
        System.out.println(m+" wapper");
        
        // converting object/ wrapper class into primitive data type 
        int b = i.intValue(); // using this you can convert a object /wrapper class into primitive data type
        int c = i; // unboxing
        
        
       
    }
 
}
