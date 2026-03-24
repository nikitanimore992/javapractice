/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excaption;

/**
 *
 * @author pramo
 */
public class ExceptionHandling2 {
    public static void main(String[] args) {
        int a, b, c, d, f;
        // exception handling 
        try {
            a = 20;
            b = 10;
            c = 0;
            d = a / b;
            f = a / c;
            System.out.println(d);
            System.out.println(f);
            
            int array[]= {1,2,3,4};
            System.out.println(array[20]);
           
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
           if(e instanceof ArithmeticException){
               System.out.println("Invalid devision divided by zero");
           }else{
               System.out.println("Invalid Array Index");
           }
        } 
        catch(Exception e){
            System.out.println("somthing is unexpected or wrong is here ");
        }finally{
            System.out.println("i am the finally block i will execute no metter what !!!!");
        }
    }
}
