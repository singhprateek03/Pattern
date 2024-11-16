import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int nums = sc.nextInt();

        for (int i = nums; i >= 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
