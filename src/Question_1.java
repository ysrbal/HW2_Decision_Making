import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        /**
         * Dışarıdan dogum gununuzun ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
         * //burc hesabı yapan program
         * //Koç Burcu : 21 Mart - 20 Nisan
         * //
         * //Boğa Burcu : 21 Nisan - 21 Mayıs
         * //
         * //İkizler Burcu : 22 Mayıs - 22 Haziran
         * //
         * //Yengeç Burcu : 23 Haziran - 22 Temmuz
         * //
         * //Aslan Burcu : 23 Temmuz - 22 Ağustos
         * //
         * //Başak Burcu : 23 Ağustos - 22 Eylül
         * //
         * //Terazi Burcu : 23 Eylül - 22 Ekim
         * //
         * //Akrep Burcu : 23 Ekim - 21 Kasım
         * //
         * //Yay Burcu : 22 Kasım - 21 Aralık
         * //
         * //Oğlak Burcu : 22 Aralık - 21 Ocak
         * //Kova Burcu : 22 Ocak - 19 Şubat
         * //
         * //Balık Burcu : 20 Şubat - 20 Mart
         */
        System.out.print("Lütfen doğduğunuz günü belirtiniz.... : ");
        int day = new Scanner(System.in).nextInt();
        System.out.print("Lütfen doğduğunuz ayı belirtiniz .... : ");
        int month = new Scanner(System.in).nextInt();
        if ((month == 3 && day >= 21) || (month == 4 && day < 21))
            System.out.println("KOÇ BURCUSUNUZ");
        else if ((month == 4 && day >= 21) || (month == 5 && day < 22))
            System.out.println("BOĞA BURCUSUNUZ");
        else if ((month == 5 && day >= 22) || (month == 6 && day < 23))
            System.out.println("İKİZLER BURCUSUNUZ");
        else if ((month == 6 && day >= 23) || (month == 7 && day < 23))
            System.out.println("YENGEÇ BURCUSUNUZ");
        else if ((month == 7 && day >= 23) || (month == 8 && day < 23))
            System.out.println("ASLAN BURCUSUNUZ");
        else if ((month == 8 && day >= 23) || (month == 9 && day < 23))
            System.out.println("BAŞAK BURCUSUNUZ");
        else if ((month == 9 && day >= 23) || (month == 10 && day < 23))
            System.out.println("TERAZİ BURCUSUNUZ");
        else if ((month == 10 && day >= 23) || (month == 11 && day < 22))
            System.out.println("AKREP BURCUSUNUZ");
        else if ((month == 11 && day >= 22) || (month == 12 && day < 22))
            System.out.println("YAY BURCUSUNUZ");
        else if ((month == 12 && day >= 22) || (month == 1 && day < 22))
            System.out.println("OĞLAK BURCUSUNUZ");
        else if ((month == 1 && day >= 22) || (month == 2 && day < 20))
            System.out.println("KOVA BURCUSUNUZ");
        else if ((month == 2 && day >= 20) || (month == 3 && day < 21))
            System.out.println("BALIK BURCUSUNUZ");

    }

}

