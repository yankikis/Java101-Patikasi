package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
        else if (heat > 15){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else if (heat > 5){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else
            System.out.println("Kayak yapabilirsiniz.");
    }
}
