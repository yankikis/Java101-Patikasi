package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month;

        System.out.print("Doğduğunuz ayı girin: ");
        month = input.nextInt();
        System.out.print("Doğduğuuz günü girin: ");
        day = input.nextInt();

        if (month == 1 && (day >= 1 && day <=31)){
            if (day < 22) System.out.println("Burcunuz Oğlak.");
            else System.out.println("Burcunuz Kova.");
        }
        else if (month == 2 && (day >= 1 && day <=28)) {
            if (day < 20) System.out.println("Burcunuz Kova.");
            else System.out.println("Burcunuz Balık.");
        }
        else if (month == 3 && (day >= 1 && day <=31)) {
            if (day < 21) System.out.println("Burcunuz Balık.");
            else System.out.println("Burcunuz Koç.");
        }
        else if (month == 4 && (day >= 1 && day <=30)) {
            if (day < 21) System.out.println("Burcunuz Koç.");
            else System.out.println("Burcunuz Boğa.");
        }
        else if (month == 5 && (day >= 1 && day <=31)) {
            if (day < 22) System.out.println("Burcunuz Boğa.");
            else System.out.println("Burcunuz İkizler.");
        }
        else if (month == 6 && (day >= 1 && day <=30)) {
            if (day < 23) System.out.println("Burcunuz İkizler.");
            else System.out.println("Burcunuz Yengeç.");
        }
        else if (month == 7 && (day >= 1 && day <=31)) {
            if (day < 23) System.out.println("Burcunuz Yengeç.");
            else System.out.println("Burcunuz Aslan.");
        }
        else if (month == 8 && (day >= 1 && day <=31)) {
            if (day < 23) System.out.println("Burcunuz Aslan.");
            else System.out.println("Burcunuz Başak.");
        }
        else if (month == 9 && (day >= 1 && day <=30)) {
            if (day < 23) System.out.println("Burcunuz Başak.");
            else System.out.println("Burcunuz Terazi.");
        }
        else if (month == 10 && (day >= 1 && day <=31)) {
            if (day < 23) System.out.println("Burcunuz Terazi.");
            else System.out.println("Burcunuz Akrep.");
        }
        else if (month == 11 && (day >= 1 && day <=30)) {
            if (day < 22) System.out.println("Burcunuz Akrep.");
            else System.out.println("Burcunuz Yay.");
        }
        else if (month == 12 && (day >= 1 && day <=31)) {
            if (day < 22) System.out.println("Burcunuz Yay.");
            else System.out.println("Burcunuz Oğlak.");
        }
        else
            System.out.println("Geçersiz tarih girdiniz.");
    }
}
