package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, phy, chem, turkish, history, music;
        int sum = 0, dersSayisi = 0;

        System.out.print("Matematik notunu giriniz: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100){
            sum += math;
            dersSayisi++;
        }

        System.out.print("Fizik notunu giriniz: ");
        phy = input.nextInt();
        if (phy >= 0 && phy <= 100){
            sum += phy;
            dersSayisi++;
        }

        System.out.print("Kimya notunu giriniz: ");
        chem = input.nextInt();
        if (chem >= 0 && chem <= 100){
            sum += chem;
            dersSayisi++;
        }

        System.out.print("Türkçe notunu giriniz: ");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100){
            sum += turkish;
            dersSayisi++;
        }

        System.out.print("Tarih notunu giriniz: ");
        history = input.nextInt();
        if (history >= 0 && history <= 100){
            sum += history;
            dersSayisi++;
        }

        System.out.print("Müzik notunu giriniz: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100){
            sum += music;
            dersSayisi++;
        }

        double result;
        result = (double) sum / (double) dersSayisi;
        String output = String.format("%.2f", result);

        System.out.println("Ortalama: " + output);
        if (result <= 55){
            System.out.println("Sınıfta Kaldı.");
        }
        else
            System.out.println("Sınıfı Geçti.");
    }
}
