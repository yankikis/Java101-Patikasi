package DonguYapilari;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i < n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println(n + " mükemmel sayıdır.");
        }
        else
            System.out.println(n + " mükemmel sayı değildir.");
    }
}
