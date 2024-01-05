import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        /**
         * dısarıdan girilen asyının mukemmel sayı olup olmadıgını bulalım mukemmel sayı
         * kendisi haric bölenlerinin toplamı kendise eşit olan sayı 6=1+2+3;
         */
        int total = 0;
        System.out.print("Lütfen bir sayı giriniz ... : ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number + " sayisi mükemmel sayidir.");
        } else {
            System.out.println(number + " sayisi mükemmel sayi değildir.");
        }
    }
}
