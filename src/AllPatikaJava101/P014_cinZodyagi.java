
package AllPatikaJava101;
import java.util.Scanner;

public class P014_cinZodyagi {

    public static void main(String[] args) {
    System.out.println("Çin Zodyağı Bulma");
    Scanner inp = new Scanner(System.in);
    int yil, b, kalan;
    b = 12;

    System.out.println("Doğum yılı giriniz : ");
    yil = inp.nextInt();
    kalan = yil%b;

    switch (kalan){
        case 0:
            System.out.println("Çin zodyağı : Maymun");
            break;
        case 1:
            System.out.println("Çin zodyağı : Horoz");
            break;
        case 2:
            System.out.println("Çin zodyağı : Köpek");
            break;
        case 3:
            System.out.println("Çin zodyağı : Domuz");
            break;
        case 4:
            System.out.println("Çin zodyağı : Fare");
            break;
        case 5:
            System.out.println("Çin zodyağı : Öküz");
            break;
        case 6:
            System.out.println("Çin zodyağı : Kaplan");
            break;
        case 7:
            System.out.println("Çin zodyağı : Tavşan");
            break;
        case 8:
            System.out.println("Çin zodyağı : Ejderha");
            break;
        case 9:
            System.out.println("Çin zodyağı : Yılan");
            break;
        case 10:
            System.out.println("Çin zodyağı : At");
            break;
        case 11:
            System.out.println("Çin zodyağı : Koyun");
            break;
        default:
            System.out.println("You entered an incorrect value");
    }


}
}

