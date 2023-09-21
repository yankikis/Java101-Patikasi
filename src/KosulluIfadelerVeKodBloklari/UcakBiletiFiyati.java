package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;
public class UcakBiletiFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, yolculukTipi;
        double ucretPerKm = 0.10, ucret, indirim;

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Mesafeyi giriniz: ");
        km = input.nextInt();
        System.out.print("(1-Tek Yön , 2-Gidiş Dönüş) Yolculuk tipini giriniz: ");
        yolculukTipi = input.nextInt();

        ucret = ucretPerKm * km;

        if (yas > 0 && km > 0 && (yolculukTipi == 1 | yolculukTipi == 2)){
            switch (yolculukTipi){
                case 1 :
                    if (yas < 12){
                        indirim = ucret * 0.5;
                        ucret -= indirim;
                    }
                    else if (yas >= 12 && yas <= 24){
                        indirim = ucret * 0.1;
                        ucret -= indirim;
                    }
                    else if(yas > 65){
                        indirim = ucret * 0.3;
                        ucret -= indirim;
                    }
                    System.out.println("Ücret: "+ ucret);
                    break;

                case 2 :
                    if (yas < 12){
                        indirim = ucret * 0.5;
                        ucret -= indirim;
                    }
                    else if (yas >= 12 && yas <= 24){
                        indirim = ucret * 0.1;
                        ucret -= indirim;
                    }
                    else if(yas > 65){
                        indirim = ucret * 0.3;
                        ucret -= indirim;
                    }
                    indirim = ucret * 0.2;
                    ucret -= indirim;
                    System.out.println("Ücret: "+ (ucret * 2));
                    break;
            }
        }
        else
            System.out.println("Hatalı Veri Girdiniz !");
    }
}
