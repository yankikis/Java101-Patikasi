package DonguYapilari;
import java.util.Scanner;
public class AsalSayilariBulanProg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count;
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        System.out.print("2'den " + n + "'e kadar olan asal sayılar: ");
        for (int i = 2; i <= n; i++){
            count = 0;

            for (int j = 2; j < i; j++){

                if (i % j == 0){
                    count ++;
                }
            }
            if (count == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
