import java.io.*;
import java.util.Scanner;

public class Pattern_6_Lower {
    public static void displayLowerPart(int size){
        for (int m = 1; m <= size ; m++) {
            for (int n = 1; n < m; n++) {
                System.out.print(" ");
            }
            for (int n = m; n <= size ; n++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
