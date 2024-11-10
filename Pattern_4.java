import java.util.Scanner;

public class Pattern_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int nums = sc.nextInt();

        for (int i = 1; i <= nums ; i++) {
            // Print space
            for (int j = 1; j <=nums-i ; j++) {
                System.out.print("  ");
            }

            // Increasing number part
            for (int j = i; j < 2*i; j++) {
                System.out.print(j+" ");
            }

            // Inner loop for decreasing number
            for (int j = 2*i-2; j >=i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}