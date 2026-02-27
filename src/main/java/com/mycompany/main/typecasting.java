/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author pramo
 */
public class typecasting {
    public static void main(String[] args) {
        // implicit casting 
        
        int a = 10;
        double b = a;
        System.out.println(b); // done automatically
        
        // ecplicit casting 
        
        double c = 10.5;
        int d = (int)c;
        System.out.println(d); // lose data 0.5 done menually by programmer 
        // we can not change boolean data type to char or char to booean data type 
    }
    
}
