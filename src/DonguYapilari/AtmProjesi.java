package DonguYapilari;
import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;

        while (right > 0){

            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına hoşgeldiniz!");

                do{
                    System.out.println("1- Para yatırma\n" + "2- Para çekme\n"
                    + "3- Bakiye sorgula\n" + "4- Çıkış yap\n");
                    System.out.print("Lütfen yapmak istedğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarı: ");
                            int cekme = input.nextInt();
                            if (cekme > balance){
                                System.out.println("Bakiye yetersiz.");
                            }
                            else
                                balance -= cekme;
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: "+ balance);
                            break;
                    }
                }while (select != 4);

                System.out.println("Tekrar görüşmek üzere.");
                break;
            }
            else{
                right --;

                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Girdiğiniz bilgiler hatalı! Lütfen tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız: "+ right);
                }
            }
        }
    }
}
