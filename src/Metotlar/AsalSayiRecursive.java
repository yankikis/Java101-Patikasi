package Metotlar;
import java.util.Scanner;
public class AsalSayiRecursive {
    static void asalSayi(int n){
        if (n < 2){
            System.out.println("Geçersiz sayı! ");
            return ;
        }
        if (asalSayiIki(n, n-1) == 0){
            System.out.println(n + " sayısı ASAL değildir !");
        }
        else
            System.out.println(n + " sayısı ASAlDIR !");
    }
    static int asalSayiIki(int number, int check){
        if (check == 1){
            return 1;
        }
        else if (number % check == 0) {
            return 0;
        }
        else
            return asalSayiIki(number, check-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Asal sayı olup olmadığını öğrenmek için bir sayı giriniz: ");
        int n = input.nextInt();
        asalSayi(n);

    }
}
