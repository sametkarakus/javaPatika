package AllPatikaJava101;// Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

import java.util.Scanner;

    public class P09_sinifGecmedurumu {
        public static void main(String[] args) {
            int math, physical, turkish, chemical, music, total = 0;
            double average, counter = 0;

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your math grade : ");
            math = sc.nextInt();
            if (math >= 0 && math <= 100) {
                total += math;
                counter++;
            }

            System.out.print("Enter your physical grade : ");
            physical = sc.nextInt();
            if (physical >= 0 && physical <= 100) {
                total += physical;
                counter++;
            }

            System.out.print("Enter your turkish grade : ");
            turkish = sc.nextInt();
            if (turkish >= 0 && turkish <= 100) {
                total += turkish;
                counter++;
            }

            System.out.print("Enter your chemical grade : ");
            chemical = sc.nextInt();
            if (chemical >= 0 && chemical <= 100) {
                total += chemical;
                counter++;
            }

            System.out.print("Enter your music grade : ");
            music = sc.nextInt();
            if (music >= 0 && music <= 100) {
                total += music;
                counter++;
            }

            average = (total / counter);

            System.out.println(average);
            if ((average <= 55)) {
                System.out.println("You did not pass the class :( ");
            } else {
                System.out.println("You passed the class :) ");
            }
        }}