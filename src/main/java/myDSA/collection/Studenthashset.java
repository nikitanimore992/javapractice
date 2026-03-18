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
public class Studenthashset {
    
    public static void main(String[] args) {
        Set<Student> studentset = new HashSet<>();
     studentset.add(new Student("Nikita",1));
     studentset.add(new Student("neha",2));
     studentset.add(new Student("Yogita",3));
     studentset.add(new Student("Nikita",1));
      
     Student s1 = new Student("Nikita",1);
     Student s2 = new Student("Neha",1);
     
        System.out.println(s1.equals(s2)); // return true
     
        System.out.println(studentset);
        
        
    }
    
    // iska use karne ke baad ham hamre output me dekhenge ki koi bhi same time ka roll no hame show nahi hoga
    
}
