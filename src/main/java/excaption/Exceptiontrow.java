/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excaption;

/**
 *
 * @author pramo
 */
public class Exceptiontrow {
    static void checkAge(int age){
        if(age<18){
            throw new RuntimeException("Access denide : you are not eligible");
            
        }
        else{
            System.out.println("Access granted : you are eligible ");
        }
    }
    public static void main(String[] args) {
   
       try {
            checkAge(20); // This will trigger the exception
        } catch (RuntimeException e) {
            // This prevents the crash and prints the error message instead
            System.out.println("Caught an error: " + e.getMessage());
        }

        // This line will now run because we caught the exception!
        System.out.println("The program is still running...");
    }
}
