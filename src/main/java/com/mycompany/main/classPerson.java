/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author pramo
 */
class Person {
    String Name;
    int Age;
    
    void input(String n, int a){
        Name = n;
        Age = a;
    }
    void output(){
        System.out.println("Name is " +Name);
        System.out.println("Age is " +Age);
        
    }
}
public class classPerson{
    public static void main(String[] args) {
        Person p = new Person();
        p.input("Nikita", 24);
        p.output();
    }
}