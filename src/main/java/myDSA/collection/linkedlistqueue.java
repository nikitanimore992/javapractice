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
public class linkedlistqueue {
    public static void main(String[] args) {
       
        
        // queue implementation
        Queue<Integer> queue = new LinkedList<>();
        
        //adding elemetent in queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        
        System.out.println(queue);
        
        // to delete or remove elements in queue
        queue.poll();
        System.out.println(queue);
        
        // to return what is last element in queue
        queue.peek();
        
            
    }
}
