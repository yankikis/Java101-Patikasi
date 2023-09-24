package DonguYapilari;
import java.util.Scanner;
public class UsBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        System.out.print("Dördün kuvvetleri: ");
        for (int i = 1; i < n; i *= 4){
            System.out.print( i + ",");
        }
        System.out.println(" ");

        System.out.print("Beşin kuvvetleri: ");
        for (int i = 1; i < n; i *= 5){
            System.out.print( i + ",");
        }
        System.out.println(" ");
    }
}
