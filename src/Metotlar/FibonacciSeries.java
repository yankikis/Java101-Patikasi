package Metotlar;
import java.util.Scanner;
public class FibonacciSeries {
    static int fibonacci (int n){
        int next;

        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        next = fibonacci(n-1)+ fibonacci(n-2);
        return next;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Serinin ilk kaç basamağını görmek istiyorsanız sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
