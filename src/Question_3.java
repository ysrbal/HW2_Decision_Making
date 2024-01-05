import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

        /**
         * dışarıdan girlen 0 ile 100 arasındaki(100 dahil)
         * 5 adet sayıdan en buyuk ve ne kucuk olanı bulup ekrana yazdıralım
         */
        int enb, enk;
        int[] numbers = new int[5];
        System.out.println("Lütfen 0 ile 100 arası bir sayı giriniz");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz .... : ");
            int number = new Scanner(System.in).nextInt();
            numbers[i] = number;

        }
        enb = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > enb) {
                enb = numbers[i];
            }
        }
        enk = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < enk) {
                enk = numbers[i];
            }
        }
        System.out.println("En Büyük Sayı .. : " + enb);
        System.out.println("En Küçük Sayı .. : " + enk);
    }


}
