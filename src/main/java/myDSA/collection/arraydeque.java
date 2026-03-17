/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myDSA.collection;

import java.util.ArrayDeque;

/**
 *
 * @author pramo
 */
public class arraydeque {

    public static void main(String[] args) {

        // implement ArrayDeque 
        // create object 
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // add element in queue
        adq.offer(20);
        adq.offer(50);
        adq.offer(40);
        System.out.println(adq);

        // add element in first in queue
        adq.offerFirst(10);
        System.out.println(adq);

        // add element in last in queue
        adq.offerLast(30);
        System.out.println(adq); // it is working same line offer method
        
        // performing peek operation
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        
        // performing poll operation
        adq.poll();
        adq.pollFirst();
        adq.pollLast();
        System.out.println(adq);

    }
}
