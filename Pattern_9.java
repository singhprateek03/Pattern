import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
           int num = sc.nextInt();
        /* Pattern
        12345
        12345
        12345
        12345
        12345
        */

//        for (int row = 1; row <= num ; row++) {
//            for (int col = 1; col <= num ; col++) {
//                System.out.print(col);
//            }
//            System.out.println();
//        }

        /* Pattern
            ABCDE
            FGHIJ
            KLMNO
            PQRST
            UVWXY
        */
//        char ch = 'A';
//        for (int row = 1; row <= num ; row++) {
//            for (int col = 1; col <=num ; col++) {
//                System.out.print(ch);
//                ch = (char)(ch+1);
//            }
//            System.out.println();
//        }

            /* Patter
            * ABCDE
              ABCDE
              ABCDE
              ABCDE
              ABCDE
* */
//        for (int row = 1; row <= num ; row++) {
//            char ch = 'A';
//            for (int col = 1; col <=num ; col++) {
//                System.out.print(ch);
//                ch = (char)(ch+1);
//            }
//            System.out.println();
//        }

        /* Pattern */
        for (int row = 0; row < num ; row++) {
            for (int col = 0; col < num ; col++) {
                if (row== 1 || col==1 || row==num-1 || col==num-1){
                    System.out.print("* ");
                }
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
