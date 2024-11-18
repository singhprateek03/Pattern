import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int num = sc.nextInt();

        /* Pattern

         *
         * *
         * * *
         * * * *
         * * * * *

         */
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /* Pattern
        1
        12
        123
        1234
        12345
        */
//        for (int row = 1; row <= num; row++) {
//            for (int col = 1; col <= row ; col++) {
//                System.out.print(col);
//            }
//            System.out.println();
//        }

        /* Pattern
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
//        int start = 1;
//        for (int row = 1; row <= num; row++) {
//            for (int col = 1; col <= row ; col++) {
//                System.out.print(start+" ");
//                start++;
//            }
//            System.out.println();
//        }

        /* Pattern
        A
        B C
        D E F
        G H I J
        K L M N O
        */
        char ch ='A';
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
