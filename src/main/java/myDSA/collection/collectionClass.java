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
public class collectionClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        
        
        list.add(new Student("Nikita",1));
        list.add(new Student("neha",2));
        list.add(new Student("Yogita",3));
        list.add(new Student("Nikita",1));
     
//        Collections.sort(list);// abhi ye work nahi karege iske liye hame student class ko implement karana padega 
         Student s1 = new Student("Nikita",1);
     Student s2 = new Student("Neha",2);
        System.out.println(s1.compareTo(s2));
        
//        list.add(10);
//        list.add(20);
//        list.add(50);
//        list.add(40);
//        list.add(60);
//         list.add(30);
//        list.add(80);
//        list.add(80);
//        list.add(90);
//        list.add(70);
        
        // if you want to check smallest element on arraylist
//        System.out.println("smallest elements is "+ Collections.min(list));
        
        // if you want to check largest element on arraylist
//        System.out.println("largest elements is "+ Collections.max(list));

        // if you want to check frequancy of the element 
//        System.out.println("frequency of the element is "+ Collections.frequency(list, 80));
        
        // if you want to sort your array
//        Collections.sort(list);
//        System.out.println(list);
        
        // if you want to sort arraylist but on reverse orde
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);
        
        
    }
}
