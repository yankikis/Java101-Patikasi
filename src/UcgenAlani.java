import java.util.Scanner;
public class UcgenAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, u;
        System.out.print("Birinci kenarın uzunluğu: ");
        a = input.nextInt();
        System.out.print("İkinci kenarın uzunluğu: ");
        b = input.nextInt();
        System.out.print("Üçüncü kenarın uzunluğu: ");
        c = input.nextInt();

        u = (a + b + c)/2;
        double alan = Math.sqrt (u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin alanı: "+ alan);

    }
}
