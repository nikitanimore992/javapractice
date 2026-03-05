/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pramo
 */
public class practiceset3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        
        // fine the some of odd numbers in 20 by using while loop
        int sum = 0;
        int i = 1;
        while(i<=300){
            if(i%2==1){
                sum = sum +i;
            }
            i++;
    }
        System.out.println(sum);
        
//        fine the some of n natural numbers 

    int nnum = 10;
    int nsum = 0;
    while(nnum>=0){
        nsum = nsum+nnum;
        nnum--;
    }
    
        System.out.println(nsum);
        
        
//      dorw this pattern usung nested for loop
//              *
//              **
//              ***
//              ****
    
        for(int n = 1; n <= 4; n++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
             }
         System.out.println();
        }
        
//        wap in java that a do-while loop  to reapently prompt the user for a password until the password correct one is enterd

    String opass = "nikita@123";
    String upass;
    
    do{
        System.out.print("Enter password = ");
        upass = sc.nextLine();
        if(opass.equals(upass)){
            System.out.println("correct password welcome");
            break;
        }else{
            System.out.println("Wrongh password Try Again ");
        }
    }while(true);
    
    
//    develop a gessing why using while loop

    Random ran = new Random();

        int numberToGuess = ran.nextInt(100) + 1; // Random number between 1 and 100
        int guess;

        do {
            System.out.print("Guess a number = ");
            guess = sc.nextInt();

            if (numberToGuess == guess) {
                System.out.println("Congratulations! You guessed right.");
                break;
            } else if (numberToGuess < guess) {
                System.out.println("Number is too high.");
            } else {
                System.out.println("Number is too low.");
            }

        } while (true);
    
}
}
