/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author pramo
 */
public class practiceset2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        
            // get a number from users and check the number is negative or positive or nagative
            System.out.print("Enter a number = ");
            int num = scann.nextInt();

            if(num>0){
                System.out.println("number is positive");

                }else {
                System.out.println("number is negative");
            }
            
            // get a number from users and check the number is or even or odd
            System.out.print("Enter a number = ");
            int num1 = scann.nextInt();
            if(num1%2==0){
                System.out.println("number is even");

                }else {
                System.out.println("number is odd");
            }
            
            // wap that takes marks from diffrent subject and show the grade according to this calculation
            
            System.out.print("Enter your math mark: ");
                int num2 = scann.nextInt();

                System.out.print("Enter your hindi mark: ");
                int num3 = scann.nextInt();

                System.out.print("Enter your physics mark: ");
                int num4 = scann.nextInt();

                System.out.print("Enter your chemistry mark: ");
                int num5 = scann.nextInt();

                int sum = num2 + num3 + num4 + num5;
                double result = sum / 4.0;

                System.out.println("Average marks = " + result);

                if(result >= 75 && result <= 100){
                    System.out.println("You got A grade");
                }
                else if(result >= 65){
                    System.out.println("You got B grade");
                }
                else if(result >= 55){
                    System.out.println("You got C grade");
                }
                else if(result >= 33){
                    System.out.println("You got D grade");
                }
                else{
                    System.out.println("You are Fail");
                }
           
    }
}
