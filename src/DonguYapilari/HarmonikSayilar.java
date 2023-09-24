package DonguYapilari;
import java.util.Scanner;
public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            sum += (double) 1/i;
        }
        System.out.println("Sonuç: "+ sum);
    }
}
