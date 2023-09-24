package DonguYapilari;
import java.util.Scanner;
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, temp, sum = 0, digitValue;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        temp = number;

        while ( temp != 0){
            digitValue = temp % 10;
            sum += digitValue;

            temp /= 10;
        }
        System.out.println(number + " sayısının basamakları toplamı: " + sum);
    }
}
