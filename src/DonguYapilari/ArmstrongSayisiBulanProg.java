package DonguYapilari;
import java.util.Scanner;
public class ArmstrongSayisiBulanProg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, temp, sum = 0, res, digitCount = 0, digitValue;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        temp = number;

        while (temp != 0){
            temp /= 10;
            digitCount++;
        }

        temp = number;

        while ( temp != 0){
            digitValue = temp % 10;
            res = 1;

            for (int i = 1; i <= digitCount; i++){
                res *= digitValue;
            }

            sum += res;
            temp /= 10;
        }
        if (sum == number){
            System.out.println(number + " bir Armstrong sayısıdır.");
        }
        else
            System.out.println(number + " bir Armstrong sayısı değildir.");
    }
}
