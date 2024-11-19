import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        StarLeftTriangle(num);

    }
    public static void StarLeftTriangle(int num){
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

        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <= num-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}