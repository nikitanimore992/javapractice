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
public class arraylistproject {
    public static void main(String[] args) {
         
        Scanner scann = new Scanner(System.in);
        
        List<String> tasks = new ArrayList<>();
        
        boolean isTrue = true;
        
        while(isTrue){
        System.out.println();
        System.out.println("------Menu-----");
        System.out.println("1:----Add Task---");
        System.out.println("2:----View Task---");
        System.out.println("3:----Remove Task---");
        System.out.println("4:-----Exit-----");
        
        System.out.println();
       

        System.out.print("Which task do you want to perform = ");
        
        int choice = scann.nextInt();
        scann.nextLine(); // consume 
        
        switch(choice){
            case 1:
                System.out.print("Enter Task = ");
                String task = scann.nextLine();
                tasks.add(task);
                System.out.println("Task Added");
                break;
                
            case 2: 
                if(tasks.size()==0){
                    System.out.println("List is Empty");
                }else{
                System.out.println("your Tasks");
                for(int i =0; i<tasks.size(); i++){
                    System.out.println("------------");       
                    System.out.println(tasks.get(i));
                }
                System.out.println("------------");
                }
                break;
                
            case 3:
                System.out.print("Enter no task which you want to delete = ");
                int index = scann.nextInt();
                index=index-1;
                if(index<0 || index>tasks.size()){
                    System.out.println("Invalid input");
                }else{
                tasks.remove(index);
                System.out.println("task deleted Successfull");
                }
                break;
                
            case 4: 
                isTrue=false;
                System.out.println("Good Bye");
                break;
                
            default: 
                System.out.println("Invalid Input ");
            
            
             }
        
        }
        
    }
    
}
