package Diziler;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);

        int right = 0;
        int selected;
        int[] wrong= new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);

        while (right < 5){
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: "+ (5 - right));
                }
                else{
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişinizde kalan hakkınız azaltılacaktır.");
                }
                continue;
            }

            if (selected == number){
                System.out.println("Tebrikler doğru tahmin! Tahmin ettiğiniz sayı: "+ selected);
                isWin = true;
                break;
            }
            else {
                wrong[right] = selected;
                right++;
                System.out.println("Yanlış tahmin!");
                if (selected > number){
                    System.out.println(selected+ " sayısı gizli sayıdan büyüktür.");
                }
                else{
                    System.out.println(selected+ " sayısı gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan tahmin hakkı: "+ (5 - right));
            }
        }
        if (!isWin){
            System.out.println("Kaybettiniz!");
            if (!isWrong){
                System.out.println("Tahminleriniz: "+ Arrays.toString(wrong) + " Doğru sayı: "+ number);
            }
        }
    }
}
