import java.util.Scanner;

public class Pattern_6_Upper {
    public static void displayUpper(int size){
        // Outer loop for rows
        for (int m = size-1; m >=0 ; m--) {
            // Print upper triangle
            for (int n = 0; n < m; n++) {
                System.out.print(" ");
            }
            // Inner Loop to print triangle
            for (int n = m; n <= size-1 ; n++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
