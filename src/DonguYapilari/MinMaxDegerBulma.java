package DonguYapilari;
import java.util.Scanner;
public class MinMaxDegerBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, n, buyuk = 0, kucuk = 0;

        System.out.print("Kaç tane sayı gireceğinizi yazınız: ");
        count = input.nextInt();
         for (int i = 1; i <= count; i++){
             System.out.print(i + ". sayıyı girin: ");
             n = input.nextInt();

             if (n > buyuk){
                 buyuk = n;
             }
             else if (n < kucuk){
                 kucuk = n;
             }
         }
        System.out.println("En büyük sayı: " + buyuk);
        System.out.println("En küçük sayı: " + kucuk);
    }
}
