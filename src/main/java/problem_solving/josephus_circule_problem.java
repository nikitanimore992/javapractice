/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem_solving;
public class josephus_circule_problem {
    
    static int josephus(int n, int k) {

        if (n == 1) {
            return 0;
        }

        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {

        int n = 40;
        int k = 7;

        int result = josephus(n, k);

        System.out.println("Survivor: " + (result + 1));
    }
}


