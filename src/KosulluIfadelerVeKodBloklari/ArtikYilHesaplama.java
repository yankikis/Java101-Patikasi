package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Hesaplamak istediğiniz yılı giriniz: ");
        year = input.nextInt();
        if ((year % 100) == 0 && (year %4) == 0){
            System.out.println(year + " Artık yıl değil.");
        }
        else if ((year % 4) == 0){
            System.out.println(year + " Artık yıl.");
        }
        else
            System.out.println(year + " Artık yıl değil.");
    }
}
