package AllPatikaJava101;

import java.util.Scanner;

public class P028_tersUcgenyapimi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int n = sc.nextInt();

        for (int i = 0; i<=n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = (2*n)-1; k >=2*i+1; k--){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
