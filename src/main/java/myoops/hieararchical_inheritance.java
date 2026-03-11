/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */

//Example of hierarchical inheritance (one parent and multiple childs)

// perent class
class Employee{
    protected String Name;
    protected int Age;
    
    protected void output(){
        System.out.println("Your name is "+Name);
        System.out.println("Your age is "+Age);
    }

}

//first child class of employee
class teach extends Employee{
    int salary;
    void output1(){
        System.out.println("Your salary is "+salary);
    }
}

//second child class of Employee
class professor extends Employee{
    

}

// you can only access perent properties by child class 
// if you tring to access professor class properties to teach 
//class then you can not accessed this is not prossible

public class hieararchical_inheritance {
    public static void main(String[] args) {
        
        
        
    }
}
