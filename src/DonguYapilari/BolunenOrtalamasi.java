package DonguYapilari;
import java.util.Scanner;
public class BolunenOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, d = 0, sum = 0; // d for denominator to calculate average value

        System.out.print("Pozitif bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1 ; i < n ; i++){
            if ((i%12) == 0){
                sum += i;
                d++;
            }
        }

        System.out.println("Ortalama: "+ (double) sum/d );
    }
}
