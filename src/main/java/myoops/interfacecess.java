/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */

// class create karne ke na ham abstract ka use karenge or na hi class keyword
//ka use karenge isntead of this ham inteface keyword ka use karenge 
// interface me methods create karne ke liye hame kisi bhi keyword ka 
//use karne ki jarurat nahi he ab simple writen type ke sath usko likh sake he kyuki 
//interface ke andar hamare jo methods hote he wo bydefault publicbho hote he he or abtract bhi hote he  





interface C{ 
        int number = 20;// variables are static final 
        String name = "Nikita";
    void showMethod();
    void outputDisplay(); // public ,  abstract class 
    default void nameDisplay(){ // kisi bhi methods ko interface me agar ham defalut defaine kar de to usko implementation ho sakta he 
            System.out.println("this defalut method in interface");
    }
    
}

interface E extends C{ 
        void add();
}

class D implements C,E{
    @Override
    public void showMethod(){
        System.out.println("show methods");
    }
    @Override
    public void outputDisplay(){
        System.out.println("Display method call");
    }
    
    
    @Override
    public void add(){
    
    }
}
public class interfacecess {
    public static void main(String[] args) {
        D  obj = new D();
        obj.showMethod();
        obj.outputDisplay();
        System.out.println("Your name is "+C.name); // interface ke variable ko access karne ke liye apko us class ka object banane ki jarurat nahi hoti
        System.out.println("Number is "+C.number);
    }
}
