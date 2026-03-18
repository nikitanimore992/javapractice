/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myDSA.collection;

import java.util.Arrays;

/**
 *
 * @author pramo
 */
public class arraysclass {
    public static void main(String[] args) {
        // it perform operation in primitive type array
        
        int a[] = {10,20,50,40,80,30,60,70,90};
        
        Arrays.sort(a); // if you want sort your array 10,20,30,40,50,60,70,80,90
        for(Integer i:a){
            System.out.print(i+" ");
        }
        
        int index = Arrays.binarySearch(a, 50);
        System.out.println(index);
        
        // Array.paralal
        
        // agar ap chaho ki sabhi element ki jagah pr ek value fill ho jaye 
        Arrays.fill(a, 12);
         for(Integer i:a){
            System.out.print(i+" ");
        }
    }
}
