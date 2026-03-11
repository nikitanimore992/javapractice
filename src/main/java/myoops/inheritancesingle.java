/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */

//default access modifire you can only access it with in packege and if you want to use
//another pakege access modifire then you need to fix it as public access modifile   and import packeg to present packege amd class
// practice example move protected access modifire

//class student{
//    String name ;
//    int age;
//    
//    void output(){
//        System.out.println("Name = "+name);
//        System.out.println("Age = "+age);  
//    }
//}
// class teacher extends student{
//     
// }
//
//public class inheritancesingle {
//    public static void main(String[] args) {
//        teacher t = new teacher();
//        t.name = "Nikita";
//        t.age = 24;
//    
//        t.output();
//    }
//    
//}

//protected access modifire ko with in package use kar sakte ho

class student{
    protected String name ;
    protected int age;
    
    protected void output(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);  
    }
}
 class teacher extends student{
     
 }

public class inheritancesingle {
    public static void main(String[] args) {
        teacher t = new teacher();
        t.name = "Nikita";
        t.age = 24;
    
        t.output();
    }
    
}
