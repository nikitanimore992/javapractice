/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myDSA;

/**
 *
 * @author pramo
 */
public class bobble {
    public static void main(String[] args) {
        int arr[]= {10,4,5,2,9,3};
        int n = arr.length;
        
        System.out.println("Before sorting = ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
        for(int i=0; i<n; i++){
            boolean swapped = false;
            for(int j=0; j<n-1-i; j++){
            if(arr[j]>arr[j+1]){
                // perform swaping
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped = true;
                }
            }
            // Agar koi swap nahi hua, toh break kar do
             if (!swapped) break;
        }
        System.out.println("after swapping");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
