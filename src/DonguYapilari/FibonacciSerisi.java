package DonguYapilari;
import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, first = 0, second = 1, next;
        System.out.println("Bir sayı giriniz: ");
        n = input.nextInt();

        System.out.print(n + " elemanlı Fibonacci serisi: " +first+ " "+second+ " " );
        for (int i = 0; i < n-2; i++){
            next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
        }
    }
}
