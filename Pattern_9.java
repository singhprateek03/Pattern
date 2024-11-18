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
//        char ch = 'A';      // Yeah loop ke bahar iss liye rakha hai taaki column change hone ke baad bhi yeah dobara se naa aaye
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
//            char ch = 'A';       // Isko andar rakhne se A har column ke baad declare ho rha hai
//            for (int col = 1; col <=num ; col++) {
//                System.out.print(ch);
//                ch = (char)(ch+1);
//            }
//            System.out.println();
//        }

        /* Pattern
        
         * * * *
         *     *
         *     *
         * * * *
        
         * */
//        for (int row = 1; row <= num ; row++) {
//            for (int col = 1; col <= num ; col++) {
//                if (row== 1 || col==1 || row==num-1 || col==num-1)
//                    System.out.print("* ");
//                else
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
        
        /* Pattern
        A B C D E
        A       E
        A       E
        A       E
        A B C D E
        */

//        for (int row = 1; row < num; row++) {
//            char ch='A';
//            for (int col = 1; col < num ; col++) {
//
//                if (row==1 || col==1 || row==num-1 || col==num-1)
//                System.out.print(ch+" ");
//                else
//                System.out.print("  ");
//                ch++;
//            }
//            System.out.println();
//        }

        /* Pattern
        * A A A A
          B     B
          C     C
          D D D D
        */

        for (int row = 1; row < num; row++) {
            char ch='A';
            for (int col = 1; col < num ; col++) {
                if (row==1 || col==1 || row==num-1 || col==num-1)
                    System.out.print(ch+" ");
                else
                    System.out.print("  ");
                ch++;
            }
            System.out.println();
        }

        /* Pattern
        A B C D
        E     H
        I     L
        M N O P
         */
//        char ch='A';
//        for (int row = 1; row < num; row++) {
//            for (int col = 1; col < num ; col++) {
//
//                if (row==1 || col==1 || row==num-1 || col==num-1)
//                    System.out.print(ch+" ");
//                else
//                    System.out.print("  ");
//                ch++;
//            }
//            System.out.println();
//        }
    }
}
