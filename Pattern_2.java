import java.util.Scanner;
public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        /* Pattern

         * * * * *
         * * * *
         * * *
         * *
         *

         */

//        for (int i = num; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /* Pattern
            55555
            4444
            333
            22
            1
        */
        for (int row = num; row >= 1; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
