package Metotlar;
import java.util.Scanner;
public class PalindromSayilar {
    static boolean isPalindrom (int num){
        int temp, reverse = 0, digitCount = 0, digit;

        temp = num;
        while (temp != 0){
            temp /= 10;
            digitCount++;
        }
        temp = num;
        for (int i = 1; i <= digitCount; i++){

            digit = temp % 10;
            reverse = digit + (reverse * 10);
            temp /= 10;
        }
        return reverse == num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Palindrom olup olmadığını öğrenmek istediğiniz sayıyı giriniz: ");
        n = input.nextInt();

        System.out.println(n + " sayısı: " + isPalindrom(n));
    }
}
