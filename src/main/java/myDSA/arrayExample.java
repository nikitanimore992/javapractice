/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myDSA;

import java.util.Scanner;

/**
 *
 * @author pramo
 */
public class arrayExample {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
         // declaration and initialization
        int[] age2 = {20,30,10,50,40};
        
        // how we access array 
        System.out.println(age2[2]);
        
         // access by using for loop
        System.out.println("for loop");
       for(int i = 0; i<5; i++){
        System.out.println(age2[i]);
     }
       
     // access by using for each loop
        System.out.println("for each loop");
        for(int i:age2){
            System.out.println(i);
        }
        
        
        int[] age = new int[5];// declare array using new keyword
        // initializing 
        age[0]=10;
        age[1]=10;
        
        for(int i:age){
            System.out.println(i);
        } 
        // hame 5 space array to provide ki age value only 2 me fill ki
        //hai isliye hame java compiler hame 0 print karega baki space ke liye 
        
        System.out.println(age[2]);
        
        int[] age1; // delare array without initialize it
//        initialize 
        age1 = new int[]{10,20,30,40,50};
        
        System.out.println(age1[2]);
        
//       aaray with user input
        System.out.println("");
        Scanner scann = new Scanner (System.in);
        System.out.print("how my students do you want to add = ");
        int size = scann.nextInt();
        
        int aage[] = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print("Enter value = ");
            aage[i]=scann.nextInt();
        }
        System.out.println("");
        for(int i:aage){
            System.out.println(i);
        }
        
    }
}
