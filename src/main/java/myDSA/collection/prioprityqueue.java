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
public class prioprityqueue {
    public static void main(String[] args) {
        
        // implementation
//        PriorityQueue<Integer> queue = new PriorityQueue<>();  ham ise dono hi  tarah se implement kar sakte he 
         Queue<Integer> queue = new PriorityQueue<>(); 
      
        // to add elements is queue prioprity queue
        queue.offer(20);
        queue.offer(10);
        queue.offer(50);
        queue.offer(30); 
        queue.offer(40); 
         
         System.out.println(queue);
         // to remove peek element in queue
         queue.poll();
         System.out.println(queue);
         
         System.out.println(queue.peek());
         
         // sometime we want to perform operation on the  element from last like reverse order 
         
         // implement a new priority queue
         Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
         
        pq.offer(20);
        pq.offer(10);
        pq.offer(50);
        pq.offer(30); 
        pq.offer(40); 
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        
         
    }
}
