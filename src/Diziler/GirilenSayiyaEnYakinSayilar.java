package Diziler;
import java.util.Arrays;
import java.util.Scanner;
public class GirilenSayiyaEnYakinSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -788, 2, 0};
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int small = n;
        int big = n;

        Arrays.sort(list);

        for (int i = 0; i< list.length; i++){
            if (n < list[i]){
                big = list[i];
                small = list[i-1];
                break;
            }
        }
        System.out.println("Girilenden sayıdan küçük en yakın: "+ small);
        System.out.println("Girilenden sayıdan büyük en yakın: "+ big);
    }
}
