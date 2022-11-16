package AllPatikaJava101;

import java.util.Scanner;

public class P021_armstrongSayi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter A Number : ");
        int number = sc.nextInt();

        int basValue;
        int result = 0;

        while(number != 0) {

            basValue = number % 10;
            number /= 10;
            result += basValue;

        }

        System.out.println(number + " Armstron Result : " + result);

    }}
