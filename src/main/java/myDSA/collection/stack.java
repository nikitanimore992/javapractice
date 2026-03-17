/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myDSA.collection;

import java.util.*;

/**
 *
 * @author pramo
 */
public class stack {
    public static void main(String[] args) {
        // implements stack 
        Stack<String> animal = new Stack<>();//  new ke baad stack ke sath data type likhna optinal he 
        
        // add element in index you have to use push method in stack
        animal.push("Cow");
        animal.push("Lion");
        animal.push("Dog");
        animal.push("Cat");
        animal.push("Horse");
        // to print this  list in array formate
        System.out.println("Animals are = "+ animal); //[Cow, Lion, Dog, Cat, Horse]
        
        // chack that what is top element in stack 
        System.out.println(animal.peek()); // horse because sabse last me hamne stack me horse add kiya tha to sabse top per wahi hota
        
        // if you want to delete elements in stack yaha deletion top se hota he 
        animal.pop();
        System.out.println("after delete one element animal are = "+animal);
        
        // now your peak elemet is cat
        System.out.println(animal.peek());
        
        System.out.println(animal);
        
        // check value of stack value one by one 
         for(int i =0; i<animal.size(); i++){
                System.out.println("using for loop "+animal.get(i));
            }
        
         for (String element:animal){
             System.out.println("using for each loop = "+element);
         }
         
         // using Iterator
         
         Iterator<String> it = animal.iterator();
         while(it.hasNext()){
             System.out.println("using iterator = "+it.next());
         }
    }
}
