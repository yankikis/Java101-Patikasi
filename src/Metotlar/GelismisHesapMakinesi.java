package Metotlar;
import java.util.Scanner;
public class GelismisHesapMakinesi {
    static void plus(){
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("Çıkmak için: 0");
        while(true){
            System.out.println(i++ + ". sayı: ");
            number = input.nextInt();
            if (number == 0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: "+ result);
    }
    static void minus(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: "+ result);
    }
    static void times(){
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.println("Çıkmak için: 1");
        while(true){
            System.out.println(i++ +". sayı: ");
            number = input.nextInt();

            if (number == 1)
                break;
            if (number == 0){
                result = 0;
                break;
            }
            result *= number;

        }
        System.out.println("Sonuç: "+ result);
    }
    static void divide(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int counter = input.nextInt();
        double number, result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.println(i++ + ". sayı: ");
            number = input.nextDouble();
            if (i != 1 && number == 0){
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç: "+ result);
    }
    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs değeri girin: ");
        int power = input.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++){
            result *= base;
        }
        System.out.println("Sonuç: "+ result);
    }
    static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Faktörielini almak istediğiniz sayıyı giriniz: ");
        int number = input.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println("Sonuç: "+ result);
    }
    static void mode(){
        Scanner input = new Scanner(System.in);
        System.out.print("Mod almak istediğiniz sayıyı giriniz: ");
        int number = input.nextInt();
        int modeNumber = 0, result = 0;
        while(modeNumber == 0){
            System.out.print("Mod değerini giriniz: ");
            modeNumber = input.nextInt();

            if (modeNumber == 0){
                System.out.println("Mod değeri 0 olamaz.");
                continue;
            }
            result = number % modeNumber;
        }
        System.out.println("Sonuç: "+ result);
    }
    static void rectangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kısa kenarı giriniz: ");
        int shortEdge = input.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        int longEdge = input.nextInt();

        int alan = shortEdge * longEdge;
        int cevre = 2 * (shortEdge + longEdge);
        System.out.println("Dikdörtgnin alanı: "+ alan);
        System.out.println("Dikdörtgenin çevresi: "+ cevre);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = input.nextInt();

            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }while (select != 0);
    }
}
