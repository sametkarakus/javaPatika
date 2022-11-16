package AllPatikaJava101;

import java.util.Scanner;

public class P015_artikYilhesaplama {


        public static void main(String[] args) {
            int year;

            Scanner sc = new Scanner(System.in);

            System.out.println("Please Enter A Year :");
           year = sc.nextInt();

            if ((year % 4 == 0) && (year % 100 != 0) || (year% 400 == 0)) {
                System.out.println(year + " this is a leap year!");
            } else {
                System.out.println(year + " this is not a leap year");
            }
        }
    }