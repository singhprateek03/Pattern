import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        // This loop handles both upper and lower part
        for (int row = 0; row < 2*num; row++) {

            // This loop handles stars based on rows
            int column = row > num ? 2 * num - row: row;

            for (int col = 1; col < column; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
