package AllPatikaJava101; /**Taksimetre Programı
*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
*Taksimetre KM başına 2.20 TL tutmaktadır.
*Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
*aksimetre açılış ücreti 10 TL'dir.
 */
import java.util.Scanner;

public class P03_taksimetreHesaplama {
    public static void main(String[] args) {
        double km, perKm, totalPrice, startPrice;
         Scanner sc = new Scanner(System.in);

         perKm = 2.20;
        System.out.println("Enter the route length in KM :  ");
        startPrice = 10;
        km = sc.nextDouble();

        totalPrice = startPrice + (km * perKm);
        totalPrice = (totalPrice < 20 ) ? 20 : totalPrice;
        System.out.println("Total Price For The Route Length : " + totalPrice);
    }
}
