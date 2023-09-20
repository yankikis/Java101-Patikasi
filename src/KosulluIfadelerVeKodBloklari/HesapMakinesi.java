package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op1, op2;
        int opt;

        System.out.print("İlk sayıyı giriniz: ");
        op1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        op2 = input.nextInt();
        System.out.println("Toplama için: 1, Çıkarma için: 2, Çarpma için: 3, Bölme için: 4");
        System.out.print("Yapmak istediğiniz işlemi giriniz(1, 2, 3, 4): ");
        opt = input.nextInt();

        switch(opt){
            case 1 :
                System.out.println("Sonuç: "+ (op1 + op2));
                break;
            case 2 :
                System.out.println("Sonuç: "+ (op1 - op2));
                break;
            case 3:
                System.out.println("Sonuç: "+ (op1 * op2));
                break;
            case 4:
                System.out.println("Sonuç: "+ (op1 / op2));
                break;
            default:
                System.out.println("Geçersiz işlem!");
                break;

        }

    }
}
