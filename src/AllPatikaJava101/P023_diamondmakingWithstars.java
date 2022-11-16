package AllPatikaJava101;

import java.util.Scanner;

public class P023_diamondmakingWithstars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= (n - (n - i)); k++) {
                System.out.print(" ");
            }
            for (int j = (((2 * n) - 3) - ((2 * i) - 1)); j >= 0; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}