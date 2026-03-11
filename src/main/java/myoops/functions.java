/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myoops;

/**
 *
 * @author pramo
 */
public class functions {
    
    // write a function to print hello
    static void hellosay(){
        String n = "nikita";
        System.out.println("Hello "+n);
    }
    //write a fucntion to add two number 
    static int sum(int a,int b){
       return a+b;
    }
     //write a fucntion to print enter number is even or not ?
    static boolean checkEven(int n){
        if(n%2==0){
            return true;
                    }else{
            return false;
        }
        }
    public static void main(String[] args) {
        hellosay();
       int sum =  sum(10,20);
        System.out.println(sum);
        System.out.println(checkEven(9));
        System.out.println(checkEven(10));
    }
    
   
    
   
}
