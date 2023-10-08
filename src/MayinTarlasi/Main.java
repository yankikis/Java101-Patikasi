package MayinTarlasi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Oyun tahtasının boyutlarını giriniz.");
        System.out.print("Satır sayısı: ");
        a = input.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        b = input.nextInt();

        Game mayinTarlasi = new Game(a, b);
        mayinTarlasi.run();
    }
}
