/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author pramo
 */

//Example of multilevel inheritance

// perent class
class Employee{
    protected String Name;
    protected int Age;
    
    protected void output(){
        System.out.println("Your name is "+Name);
        System.out.println("Your age is "+Age);
    }

}

//child class of employee
class teach extends Employee{
    int salary;
    void output1(){
        System.out.println("Your salary is "+salary);
    }
}

//child class of teach
class professor extends teach{

}
public class multilevelinheritace {
    public static void main(String[] args) {
        professor p = new professor();
        p.Name="Nikita";
        p.Age=24;
        p.salary=30000;
        p.output();
        p.output1();
    }
}
