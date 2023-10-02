package Diziler;
import java.util.Scanner;
public class MatrisinTranspozu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Matrisin satır sayısını giriniz: ");
        a = input.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: ");
        b = input.nextInt();

        int[][] matris = new int[a][b];

        for (int i=0; i< matris.length; i++){
            for (int j=0; j< matris[0].length; j++){
                System.out.print("Sıradaki elemanı giriniz: ");
                matris[i][j] = input.nextInt();
            }
        }

        int [][] matrisTranspozu = new int[b][a];
        for (int i=0; i< matrisTranspozu.length; i++){
            for (int j=0; j< matrisTranspozu[0].length; j++){
                matrisTranspozu[i][j] = matris[j][i];
            }
        }
        for (int i=0; i< matrisTranspozu.length; i++){
            for (int j=0; j< matrisTranspozu[0].length; j++){
                System.out.print(matrisTranspozu[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
