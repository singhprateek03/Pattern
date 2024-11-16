import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int nums = sc.nextInt();

        // Outer loop
        for (int m = 1; m <= nums ; m++) {
            // Inner loop
            for (int n = 1; n < m; n++) {
                System.out.print(" ");
            }

        // Inner loop
            for (int n = m; n <= nums ; n++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int m = nums-1; m >=0 ; m--) {
            for (int n = 0; n < m; n++) {
                System.out.print(" ");
            }
            for (int n = m; n <=nums-1 ; n++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
