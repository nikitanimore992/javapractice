/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */
class person{
    String name;
    int age;
    
//    person(){
//    //  non parametorized constructor
//       name = "Nikita";
//       age = 24;
//    }
//  parameterized construstor
    
   person(String name, int age){
       this.name=name; 
       this.age=age;
   }
    
    void output(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}
public class constructor {
    public static void main(String[] args) {
    person person1= new person("Nikita", 24);
    person1.output();
    
        
    }
}
