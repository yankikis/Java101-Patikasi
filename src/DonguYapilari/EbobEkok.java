package DonguYapilari;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, i = 1, ebob = 1, ekok;
        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        while (i <= n1 && i <= n2){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }
        ekok = (n1 * n2) / ebob;
        System.out.println(n1 + " ve " + n2 + " sayısının EBOB'u: " + ebob);
        System.out.println(n1 + " ve " + n2 + " sayısının EKOK'u: " + ekok);
    }
}
