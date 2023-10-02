package Diziler;
import java.util.Arrays;
import java.util.Scanner;
public class DiziElemanlariniSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Dizinin boyutu: ");
        n = input.nextInt();
        int count = 1;
        int temp;

        int[] list = new int[n];
        for (int x=0; x< list.length; x++){
            System.out.print(count++ +". elemanı giriniz: ");
            list[x] = input.nextInt();
        }

        for (int i=0; i < n; i++){
            for (int j= i+1; j < n; j++){
                if (list[i]>list[j]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
