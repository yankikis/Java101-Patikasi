package TemelKavramlarVeDeğişkenler;

import java.util.Scanner;

public class ManavKasaHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, total=0;
        double armut =2.14, elma =3.67, domates =1.11, muz =0.95, patlican =5.00;

        System.out.print("Kaç kilo Armut?: ");
        x = input.nextDouble();
        total += (x * armut);

        System.out.print("Kaç kilo Elma?: ");
        x = input.nextDouble();
        total += (x * elma);

        System.out.print("Kaç kilo Domates?: ");
        x = input.nextDouble();
        total += (x * domates);

        System.out.print("Kaç kilo Muz?: ");
        x = input.nextDouble();
        total += (x * muz);

        System.out.print("Kaç kilo Patlıcan?: ");
        x = input.nextDouble();
        total+= (x * patlican);

        System.out.println("Toplam: "+ total);


    }
}
