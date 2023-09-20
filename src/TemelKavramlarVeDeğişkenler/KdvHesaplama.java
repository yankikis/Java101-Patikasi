package TemelKavramlarVeDeğişkenler;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Para değerini giriniz: ");
        double para = input.nextDouble();
        double kdv, sonuc;

        if (para > 0 && para < 1000){

            kdv = ((para * 18) / 100);
            sonuc = kdv + para;

            System.out.println("KDV'siz fiyat: "+ para);
            System.out.println("KDV değeri: "+ kdv);
            System.out.println("KDV'li fiyat: "+ sonuc);

        }
        else if (para >= 1000){

            kdv = ((para * 8)/100);
            sonuc = kdv + para;

            System.out.println("KDV'siz fiyat: "+ para);
            System.out.println("KDV değeri: "+ kdv);
            System.out.println("KDV'li fiyat: "+ sonuc);

        }
        else System.out.println("Error!");
    }
}
