import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        double mesafe, total = 10, kmbasina = 2.20;

        mesafe = input.nextDouble();
        total += mesafe * kmbasina;

        total = (total < 20) ? 20 : total;
        System.out.println("Tutar: "+ total);

    }
}
