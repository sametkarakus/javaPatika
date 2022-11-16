package AllPatikaJava101;

import java.util.Scanner;

public class P02_ucgendeAlan {
    public static void main(String[] args) {
        double aKenari,bKenari,cKenari,alan,u;
        Scanner sc = new Scanner(System.in);
        System.out.println("a kenar uzunlugunu yaziniz : " );
        aKenari = sc.nextDouble();
        System.out.println("b kenar uzunlugunu yaziniz : ");
        bKenari = sc.nextDouble();
        System.out.println("c kenar uzunlugunu yaziniz : " );
        cKenari = sc.nextDouble();

        u = ( (aKenari + bKenari + cKenari) /2 );
        alan = Math.sqrt(u * (u-aKenari)* (u-bKenari)*(u-cKenari));
        System.out.println("Ucgenin Alani : " + alan);

    }
}
