package AllPatikaJava101;

import java.util.Scanner;

/**
 * (Not : KDV tutarını 18% olarak alın)
 * KDV'siz Fiyat = 10;
 * KDV'li Fiyat = 11.8;
 * KDV tutarı = 1.8;
 * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */

public class P01_kdvCalculator {

    public static void main(String[] args) {

        double kdvsiz_fiyat;
        double kdv_orani1 = 0.18;
        double kdv_orani2 = 0.08;


        System.out.println("Fiyat giriniz : ");
        Scanner sc = new Scanner(System.in);
        kdvsiz_fiyat = sc.nextDouble();
        if (kdvsiz_fiyat <= 1000 ){
            double tutar = kdvsiz_fiyat * kdv_orani1;
            System.out.println("KDV fiyatı : " + tutar);
            double toplam_fiyat = kdvsiz_fiyat + tutar;
            System.out.println("Son fiyat :" + toplam_fiyat);

        }else if (kdvsiz_fiyat > 1000){
            double tutar = kdvsiz_fiyat * kdv_orani2;
            System.out.println("KDVli tutar" + tutar);
            double toplam_fiyat = kdvsiz_fiyat + tutar;
            System.out.println("Son fiyat :" + toplam_fiyat);

        }


    }

}
