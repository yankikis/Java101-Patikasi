package TemelKavramlarVeDegiskenler;
import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int math, phy, chem, turkish, history, music;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        math = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        phy = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        chem = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkish = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        history = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        music = input.nextInt();

        int sum;
        sum = (math + phy + chem + turkish + history + music);

        double result;
        result = sum / 6.0;

        System.out.println("Ortalama: " + result);
        System.out.println(result < 60 ? "Sınıfta kaldı." : "Sınıfı Geçti!");



    }
}
