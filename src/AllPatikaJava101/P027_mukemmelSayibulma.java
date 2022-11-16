package AllPatikaJava101;

import java.util.Scanner;

public class P027_mukemmelSayibulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter A Number: ");
        int n = sc.nextInt();
        int total = 0;


        for (int i = 1; i < n; i++){
            if (n % i == 0){
                total+=i;
            }
        }
        if (n == total){
            System.out.println(n+" It is Perfect Number");
        }else {
            System.out.println(n+" It is not Perfect Number");
        }

    }
}