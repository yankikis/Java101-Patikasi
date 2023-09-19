import java.util.Scanner;
public class VucutKitleIndexi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kg, m;
        System.out.print("Vücut ağırlığınızı kilogram cinsinden yazınız: ");
        kg = input.nextDouble();

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        m = input.nextDouble();

        double vki;
        vki = kg / (m * m);
        System.out.println("Vücut kitle indexiniz: "+ vki);
    }
}
