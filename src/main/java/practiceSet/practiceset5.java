package practiceSet;

import java.util.Arrays;

public class practiceset5 {
    public static void main(String[] args) {
        
        // Array total elements: 21. Majority ke liye > 10.5 (yani 11) chahiye.
        int num[] = {1, 5, 1, 3, 2, 1, 8, 1, 1, 2,1};
        int n = num.length;

        System.out.println("--- Method 1: Brute Force (O(n^2)) ---");
        boolean found1 = false;
        for (int i = 0; i < n; i++) {
            int fre = 0;
            for (int j = 0; j < n; j++) {
                if (num[i] == num[j]) {
                    fre++;
                }
            }
            if (fre > n / 2) {
                System.out.println("Majority element is: " + num[i]);
                found1 = true;
                break;
            }
        }
        if(!found1) System.out.println("No Majority Element found by Brute Force.");

        
        System.out.println("\n--- Method 2: Sorting (O(n log n)) ---");
        int tempNum[] = num.clone(); // Original array ko disturb nahi karne ke liye
        Arrays.sort(tempNum);
        int count = 1;
        boolean found2 = false;
        for (int i = 1; i < n; i++) {
            if (tempNum[i] == tempNum[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > n / 2) {
                System.out.println("Majority element is: " + tempNum[i]);
                found2 = true;
                break;
            }
        }
        if(!found2) System.out.println("No Majority Element found by Sorting.");


        System.out.println("\n--- Method 3: Moore's Voting (O(n)) ---");
        int countt = 0;
        int candidate = 0;

        // Phase 1: Candidate chuno
        for (int i = 0; i < n; i++) {
            if (countt == 0) {
                candidate = num[i];
            }
            if (candidate == num[i]) {
                countt++;
            } else {
                countt--;
            }
        }

        // Phase 2: Verification (Zaroori Step)
        int finalCount = 0;
        for (int x : num) {
            if (x == candidate) finalCount++;
        }

        if (finalCount > n / 2) {
            System.out.println("Majority Element is: " + candidate);
        } else {
            System.out.println("No Majority Element found (Candidate was " + candidate + " but count was only " + finalCount + ").");
        }
    }
}