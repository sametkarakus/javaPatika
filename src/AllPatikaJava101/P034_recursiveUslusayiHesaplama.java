package AllPatikaJava101;


import java.util.Scanner;

public class P034_recursiveUslusayiHesaplama {

    static int result = 1;

    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        result *= a;
        pow(a, b - 1);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        int a = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int b = scan.nextInt();
        System.out.println("Sonuç : " + pow(a, b));
    }
}