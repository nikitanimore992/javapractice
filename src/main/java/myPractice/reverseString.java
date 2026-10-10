/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPractice;


public class reverseString {
    
    void usingLoop(String str){
        String rstr = "";
        for(int i=str.length()-1; i>=0; i--){
        rstr = rstr + str.charAt(i);
        }
        System.out.println("Reverse String is : "+ rstr);
        System.out.println("Actual String is : "+str);
    }
    void usingSwap(char[] str){ 
        int start = 0;
        int end= str.length-1;
        while(start<end){
        char temp = str[start];
        str[start]=str[end];
        str[end]=temp;
        start++;
        end--;
        }
            System.out.println(str);   
            
    }
    void usingReverse(String str){
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
        System.out.println(str);
    }
    
    public static void main(String[] args) {
       reverseString obj = new reverseString();
       obj.usingLoop("Nikita");
       obj.usingSwap("Yogita Nimore".toCharArray());
       obj.usingReverse("Anuradha Nimore");
    }
}
