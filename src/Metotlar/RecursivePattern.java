package Metotlar;
import java.util.Scanner;
public class RecursivePattern {
    static void decreasePattern(int n, int count){
        if (n < 0){
            System.out.print(n + " ");
            increasePattern(n, count);
        }
        else if (n == 0){
            System.out.print(n + " ");
            increasePattern(n, count);
        }
        else{
            System.out.print(n + " ");
            count ++;
            decreasePattern(n-5, count);
        }
    }
    static void increasePattern(int n, int count){
        if (n <= 0){
            increasePattern(n+5,count-1);
        }
        else if (count > 0){
            System.out.print(n + " ");
            increasePattern(n+5, count-1);
        }
        else
            System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        decreasePattern(number, 0);
    }
}
