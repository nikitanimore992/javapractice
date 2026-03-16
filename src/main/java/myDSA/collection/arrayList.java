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
public class arrayList {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            
            // add element in array list
            list.add("Nikky");
            list.add("Neha");
            list.add("Aman");
            list.add("Durga");
            
            // how to insert element value in perticular indes
            list.add(0,"pramod");
            list.add(2,"Yogita");
            list.add(5,"Ajay");
            
            // access array list
            System.out.println(list);
            
            // if you want to print any particulaer index value
            System.out.println(list.get(2));
            
            // if you want to change any pertuculer value 
            list.set(6, "Monu");
            System.out.println(list);
            
            // if want to delete any element in array list 
            list.remove(6);
            System.out.println(list);
            
            // if you want to remove all list element
            //  list.clear();
            //  System.out.println("this is list = "+list);
            
            // get all elemet one by one 
            for(int i =0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
            
    }
}
