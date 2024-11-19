import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        StarLeftTriangle(num);
    }
    public static void StarLeftTriangle(int num){
        /* Pattern
             *
            **
           ***
          ****
         *****
        */
//        for (int i = 1; i <= num; i++) {
//            // For printing space
//            for (int j = (num-i); j > 0 ; j--) {
//                System.out.print(" ");
//            }
//            // for printing *
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
/*      =================================================== */
//        for (int row = 1; row <= num ; row++) {
//            for (int col = 1; col <= num-row; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 1; col <= row ; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /* Pattern
          *
         * *
        * * *
       * * * *
      * * * * *
         */
//        for (int row = 1; row <= num ; row++) {
//            for (int col = 1; col <= num-row; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 1; col <= row ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /* with using 2 for loop */
//        for (int row = 0; row < num ; row++) {
//            for (int col = 0; col <= num; col++) {
//                if (col < num-row)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
        
        /* Pattern
        * * * * *
         * * * *
          * * *
           * *
            *
         */
//        for (int row = 0; row < num; row++) {
//            for (int col = 0; col < num; col++)
//                if (col < row)
//                    System.out.print(" ");
//                else
//                    System.out.print("* ");
//            System.out.println();
//        }
        
        /* Pattern
        1 1 1 1 1
         2 2 2 2
          3 3 3
           4 4
            5

         */
//        for (int row = 1; row <=num ; row++) {
//            for (int col = 1; col <= num ; col++)
//                if (col<row)
//                    System.out.print(" ");
//                else
//                    System.out.print(row+" ");
//            System.out.println();
//        }

        /* Pattern
        1 2 3 4 5
         2 3 4 5
          3 4 5
           4 5
            5
         */
//        for (int row = 1; row <=num ; row++) {
//            for (int col = 1; col <= num ; col++)
//                if (col< row)
//                    System.out.print(" ");
//                else
//                    System.out.print(col+" ");
//            System.out.println();
//        }
        /* Pattern
          *
         ***
        *****
       *******
       *********
         */
        for (int row = 1; row <=num ; row++) {
            for (int col = 1; col <=num-row ; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col < 2*row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /* Pattern
          1
         123
        12345
         123
          1
         */
//        int spaces = num/2;
//        int star = 1;
//        for (int row = 1; row <= num ; row++) {
//            for (int col = 1; col <= spaces ; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 1; col <= star; col++) {
//                System.out.print(col);
//            }
//            System.out.println();
//            if (row <= num/2) {
//                spaces--;
//                star += 2;
//            }
//            else {
//                spaces++;
//                star -= 2;
//            }
//        }
    }
}