package Metotlar;
import java.util.Scanner;
public class UsluSayiHesaplamaRecursive {
    static int usluSayi(int number, int count){
        if (count == 0)
            return 1;
        else
            return number * usluSayi(number, count-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, power;
        System.out.print("Taban değeri giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        power = input.nextInt();

        System.out.println(base + " üssü "+ power + ": " + usluSayi(base, power));
    }
}
