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
public class hashmap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        
        // if you want to add element in hashmap
        map.put(1,"Nikita");
        map.put(2, "Neha");
         map.put(4, "pramod");
        map.put(5, "Aman");
        map.put(3, "yogita");
       
        
//        hashmap.put(5, "Ajay");// ye override kar dega value ko means aman ko ajay se replace kar dega
        
        // if you dont want ki agar us key ke corponding valu allready he usme to same ki se value override na kare kare uske liye hame containskey method ka use karna padega 
        
         if(!map.containsKey(5)){
            map.put(5, "Ajay");
        }
        // or agar vo key hashmap abailable nahi he to add kar de 
        if(!map.containsKey(6)){
            map.put(6, "Ajay");
        }
        
        // iske jagah ap ise puifabsent method ka use bhi kar sakte he
        map.putIfAbsent(7, "Ankit"); // first time add karega kyuki hashmap key available nahi he 
        map.putIfAbsent(7, "Dhiraj"); // second time add nahi krega or na hi override karega 

            
        System.out.println(map); 
        
        // if you want to check that value is present in hashmap or not 
        System.out.println("value is "+map.containsValue("Ankit")); // boolean value return karega like true or false 
        
        
        //inko ab iterate kar lete he
        for(Map.Entry<Integer,String> e:map.entrySet()){// hashmap.entryset kya karta he hashmap ke andar jitne entry set he unko return karta he 
            System.out.println(e); // ap chaho to directly in entry ko print kar skte ho ndividual tarike se
            
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            
        
        }
       
        // ap only key print kar sakte ho
        
        for(Integer key: map.keySet()){
            System.out.println(key);
        }
        // ap only key print kar sakte ho
        for(String value: map.values()){
            System.out.println(value);
        }
        
        // if you want ot check your hashmap isempty or not 
        System.out.println(map.isEmpty()); // it return boolean type output
    }
    
}
