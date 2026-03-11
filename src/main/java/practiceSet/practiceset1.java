/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceSet;

/**
 *
 * @author pramo
 */
public class practiceset1 {
    public static void main(String[] args) {
        // write a program to print sum of 2 numbers 
        int a = 10;
        int b = 20;
        System.out.println("addition is = "+ (a+b));
        
        // wap to find remainder when one integer devided by another 
        
        int c = 10;
        int d = 3;
        System.out.println("reminder is = "+ (c%d));
        
        // wap to calculate average value of three numbers.
        
        int num1, num2, num3;
        num1 = 10;
        num2 = 20;
        num3 = 30;
        
        double avg = num1+num2+num3 / 3;
        System.out.println("average value of this = "+ avg);
        
        // wap to swap to numbers without using temprorary variable.
        
        int num4 = 10;
        int num5 = 20;
        
        System.out.println("before swaping num4 is = "+num4+", num5 is  = "+num5);
        
        num4 = num4+num5; //30
        num5 = num4-num5; //30-20=10
        num4 = num4 - num5; // 30-10= 20
        
        System.out.println("after swaping num4 is = "+num4+", num5 is  = "+num5);
        
    }
}
