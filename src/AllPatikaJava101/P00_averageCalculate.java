package AllPatikaJava101;

import java.util.Scanner;

/**
 * Not Ortalaması Hesaplayan Program
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 */

public class P00_averageCalculate {

    public static void main(String[] args) {

        double matematik;
        double fizik;
        double kimya;
        double turkce;
        double tarih;
        double muzik;

        double avg;

        System.out.println("Aldiginiz puanlari giriniz:");

        Scanner sc = new Scanner(System.in);
        matematik = sc.nextDouble();
        System.out.println("Matematik notunuz : " + matematik);

        Scanner sc2 = new Scanner(System.in);
        fizik = sc2.nextDouble();
        System.out.println("Fizik notunuz : " + fizik);

        Scanner sc3 = new Scanner(System.in);
        kimya = sc3.nextDouble();
        System.out.println("kimya notunuz : " + kimya);

        Scanner sc4 = new Scanner(System.in);
        turkce = sc4.nextDouble();
        System.out.println("turkce notunuz : " + turkce);

        Scanner sc5 = new Scanner(System.in);
        tarih = sc5.nextDouble();
        System.out.println("tarih notunuz : " + tarih);

        Scanner sc6 = new Scanner(System.in);
        muzik = sc6.nextDouble();
        System.out.println("muzik notunuz : " + muzik);

        avg = matematik + fizik + kimya +turkce + tarih + muzik;
        double ortalama = avg / 6;

            System.out.println("Ortalamanız : " + ortalama);
        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }

}
