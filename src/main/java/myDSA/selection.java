/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myDSA;

/**
 *
 * @author pramo
 */
public class selection {
    public static void main(String[] args) {
        int array[] = {10,9,5,3,7,2};
        int n = array.length;
        
        for(int i =0; i<n; i++){
            int small = i;
            for(int j =i+1; j<n; j++){
                if(array[j]<array[small]){
                    small =j;
                }
            }
            // swaping 
            int temp = array[small];
            array[small]=array[i];
            array[i]=temp;
        }
            System.out.println("sorted Array : ");
            for(int i:array){
                System.out.print(i +" ");
            
        }
    }
}
