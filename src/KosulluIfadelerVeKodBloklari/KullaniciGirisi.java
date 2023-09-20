package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, cevap, newPassword, password;

        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yapıldı.");
        }
        else if (!(userName.equals("patika")) && !(password.equals("java123"))){
            System.out.println("Bilgiler yanlış.");
        }
        else if ((userName.equals("patika")) && !(password.equals("java123"))) {
            System.out.print("Şifre yanlış. Sıfırlamak ister misiniz? (evet/hayır): ");
            cevap = input.nextLine();
            while (cevap.equals("evet")){

                password = "java123";
                System.out.println("Uyarı: Şifre eski şifre ile aynı olamaz!");
                System.out.print("Yeni şifreyi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı.");
                    cevap = "evet";
                }
                else {
                    System.out.println("Şifre oluşturuldu.");
                    cevap = "hayır";
                }
            }
        }
        else {
            System.out.println("Kullanıcı adı yanlış.");
        }
    }
}
