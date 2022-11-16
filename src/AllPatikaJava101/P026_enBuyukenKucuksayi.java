package AllPatikaJava101;

import java.util.Scanner;
public class P026_enBuyukenKucuksayi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Numbers Will You Enter? ");
        int countNumbers = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        for (int i = 1; i <= countNumbers; i++) {
            System.out.print(i + ".  ");
            int number = sc.nextInt();
            smallest = Math.min(number, smallest);
            biggest = Math.max(number, biggest);
        }
        System.out.println("The Biggest Number: " + biggest);
        System.out.println("The Smallest Number: " + smallest);
        sc.close();
    }
}