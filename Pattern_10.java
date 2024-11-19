import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
//        // This loop handles both upper and lower part
//        for (int row = 0; row < 2*num; row++) {
//
//            // This loop handles stars based on rows
//            int column = row > num ? 2 * num - row: row;
//
//            for (int col = 1; col < column; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = num-1; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
