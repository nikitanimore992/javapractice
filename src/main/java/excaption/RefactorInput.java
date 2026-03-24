package excaption;

import java.io.BufferedReader; // Correct import
import java.io.InputStreamReader;
import java.io.IOException;    // Important for input errors

public class RefactorInput { // Changed class name to avoid conflict
    public static void main(String[] args) {
        // Use the built-in BufferedReader
        BufferedReader br = null;
        String input;

        try {
            // Correct initialization
            br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter any data: ");
            input = br.readLine();
            System.out.println("The data is: " + input);

        } catch (IOException e) { // Catch specific IO exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                // Always check for null before closing
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing reader: " + ex.getMessage());
            }
        }
    }
}