package TemelKavramlarVeDegiskenler;

import java.util.Scanner;
public class DaireAlaniCevresi {
    public static final double PI= 3.14;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        double r; // yarıçap
        r = input.nextInt();

        double  alan, cevre, acilialan, acilicevre;
        cevre = (2 * PI * r);
        alan = (PI * r * r);

        System.out.print("Daire diliminin açısını yazınız: ");
        double x; //merkez açı
        x = input.nextDouble();

        acilialan = (alan * x) / 360 ;
        acilicevre = (cevre * x) / 360;

        System.out.println("Dairenin çevresi: "+ cevre);
        System.out.println("Dairenin alanı: "+ alan);
        System.out.println(x+ " Derece açılı dilimin alanı: "+ acilialan);
        System.out.println(x+ " Derece açılı yay uzunluğu: "+ acilicevre);
    }
}
