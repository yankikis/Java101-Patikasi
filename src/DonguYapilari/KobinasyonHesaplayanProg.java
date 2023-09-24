package DonguYapilari;
import java.util.Scanner;
public class KobinasyonHesaplayanProg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, totalN = 1, totalR = 1,nMinusR, totalNR = 1, combination;

        System.out.println("N'in r'li kombinasyonunu hesaplayan program.");
        System.out.print("N sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("r sayısını giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            totalN *= i;
        }
        for (int i = 1; i <= r; i++){
            totalR *= i;
        }

        nMinusR = n - r;
        for (int i = 1; i <= nMinusR; i++){
            totalNR *= i;
        }

        combination = totalN / (totalR * totalNR);
        System.out.println(n + " sayısının" + r + "'li kombinasyonu: " + combination);

    }
}
