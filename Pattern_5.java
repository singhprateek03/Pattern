import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int nums = sc.nextInt();

        /* =========== Using While Loop =========== */
//        int i = nums, j;
//        while(i>0){
//             j = 0;
//             while (j++ < nums-i){
//                 System.out.print(" ");
//             }
//
//             j = 0;
//             while(j++ < (i*2)-1){
//                 System.out.print("*");
//             }
//            System.out.println();
//            i--;
//        }

        /* ============= Using For Loop ============= */
        for (int i = nums; i >= 1 ; i--) {
            for (int j = i; j < nums; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=(2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
