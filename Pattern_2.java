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
            5 5 5 5 5
            4 4 4 4
            3 3 3
            2 2
            1
        */
//        for (int row = num; row >= 1; row--) {
//            for (int col = 0; col < row; col++) {
//                System.out.print(row+" ");
//            }
//            System.out.println();
//        }

        /* Pattern
        1 1 1 1 1
        2 2 2 2
        3 3 3
        4 4
        5
        */
//        for (int row = 1; row <= num ; row++) {
//            for (int col = 1; col <= num-row+1; col++) {
//                System.out.print(row+" ");
//            }
//            System.out.println();
//        }

        /* Pattern
        A B C D E
        F G H I
        J K L
        M N
        O
        */
//        char ch = 'A';
//        for (char row = 1; row <= num; row++) {
//            for (int col = 1; col <= num-row+1 ; col++) {
//                System.out.print(ch+" ");
//                ch++;
//            }
//            System.out.println();
//        }

        /* Pattern
          1 2 3 4 5
          1 2 3 4
          1 2 3
          1 2
          1
        */
//        for (int row = num; row >= 1 ; row--) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
    }
}
