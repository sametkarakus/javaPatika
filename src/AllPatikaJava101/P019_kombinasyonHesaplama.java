package AllPatikaJava101;
/* N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
* kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
* Java ile kombinasyon hesaplayan program yazınız.
  C(n,r) = n! / (r! * (n-r)!) */

import java.util.Scanner;
public class P019_kombinasyonHesaplama {

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int n, total=1;
        System.out.print("Sayınızı Giriniz: ");
        n = input.nextInt();
        int i=n;
        while (i>1){
            total *= i;
            i--;
        }
        System.out.println(n+" Sayısının Faktöriyeli: "+total); */
        int n, r;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen N Değeri Giriniz: ");
        n = input.nextInt();

        System.out.print("Lütfen R Değeri Giriniz: ");
        r = input.nextInt();

        int factN=1, factR=1, factNR=1;
        if (n<r){
            System.out.println("N Değeri R Değerinden Küçük Olamaz. Lütffen Tekrar Deneyiniz");
            n = input.nextInt();
        }else {
            for (int i = 1; i<=n; i++){
                factN*=i;
            }
            for (int i = 1; i<=r; i++){
                factR*=i;
            }
            for (int i = 1; i<=(n-r); i++){
                factNR*=i;
            }
            long result = factN / (factR * factNR);
            System.out.println("Girilen Sayıların Kombinasyonu:" +result);
        }
    }}
