/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPractice;

/**
 *
 * @author pramo
 */
public class reverseNumber {
    
    void resverseNum(int n){
        int reverse = 0;
        while(n!=0){
            int temp = n%10;
            reverse = reverse*10+temp;
            n=n/10;
        }
        System.out.println(reverse);
    }
    void recursen(int n, int rev){
        if(n==0){
            System.out.println(rev);
            return;
        }
         recursen(n/10, rev*10+n%10);
    }
    
    static int reverse(int n, int rev){
        if(n==0){
            
            return rev;
        }
         return reverse(n/10, rev*10+n%10);
    }
    
    public static void main(String[] args) {
        reverseNumber obj = new reverseNumber();
        obj.resverseNum(1234);
        obj.recursen(987654321, 0);
        System.out.println(reverse(987654321,0));
        
       
    }
}
