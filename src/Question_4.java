import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        /**
         *Dışarıdan girilne bir sayının asal sayı olup olmadıgını bulalım asal ise
         * asaldır çıktısı verelim asal değil ise asal değildir çıktısını verelim
         */
        System.out.print("Lütfen bir sayi giriniz ... : ");
        int number = new Scanner(System.in).nextInt();
        boolean isAsal = true;
        if (number == 1) {
            System.out.println("1 asal bir sayı değildir.");
        } else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    isAsal = false;
                } else {
                    isAsal = true;
                }
            }
            if (isAsal) System.out.println(number + " asal bir sayıdır.");
            else System.out.println(number + " asal bir sayı değildir.");
        }
    }
}