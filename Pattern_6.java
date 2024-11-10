import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int size = sc.nextInt();
        Pattern_6_Upper.displayUpper(size);
        Pattern_6_Lower.displayLowerPart(size);
    }
}
