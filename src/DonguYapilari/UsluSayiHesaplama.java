package DonguYapilari;
import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, p, res = 1;

        System.out.print("Taban sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Kuvvet olan sayıyı giriniz: ");
        p = input.nextInt();

        for (int i = 1; i <= p; i++){
            res = res * n;
        }
        System.out.println(n + " üssü " + p + ": " + res);
    }
}
