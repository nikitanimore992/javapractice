/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myDSA.collection;

import java.util.*;

/**
 *
 * @author pramo
 */
public class linkedhashset {
    public static void main(String[] args) {
        
         Set<Integer> set = new LinkedHashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        System.out.println(set);
        
        // remove element from hashset
        set.remove(40);
        System.out.println(set);
        
        // chack if particaler element is available in hashset or not
        System.out.println(set.contains(40)); // it returns true or false
        System.out.println(set.contains(50));
        
        // check hashset is empty
        System.out.println( set.isEmpty()); // it return true
        
        // check size of hashset
        System.out.println(set.size());
        
        // if i want to clear all element in hashset
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
