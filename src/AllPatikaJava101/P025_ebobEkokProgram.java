package AllPatikaJava101;

import java.util.Scanner;

   public class P025_ebobEkokProgram {
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        int n1 = scan.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = scan.nextInt();
        int i = 0, ebob = 0, k = 0;

        int bigN = Math.max(n1, n2);
           while (i <= bigN){
            i++;
            if ( n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
        }
        System.out.println(ebob);

        while (k <= (n1 * n2) ){
            k++;
            if (k % n1 == 0 && k % n2 == 0){
                System.out.println(k);
                break;
            }
        }

    }
}
