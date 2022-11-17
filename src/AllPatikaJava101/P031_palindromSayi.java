package AllPatikaJava101;

/*  Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

     *   Palindrom Sayı Nedir ? Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

      * Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/

public class P031_palindromSayi {

    static void isPolindrom() {
        int temp = 247, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
    }

    public static void main (String[]args){
        isPolindrom();
    }


}