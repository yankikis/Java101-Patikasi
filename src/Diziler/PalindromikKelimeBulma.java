package Diziler;
import java.util.Arrays;
import java.util.Scanner;
public class PalindromikKelimeBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        int n = A.length();
        boolean isPalindrome = false;
        char[] c1 = A.toCharArray();
        /* Enter your code here. Print output to STDOUT. */
        String s1 = "";
        for (int i = n - 1; i >= 0; i--) {
            s1 += c1[i];
        }
        char[] c2 = s1.toCharArray();
        for (int i = 0; i < n; i++) {
            if (c1[i] == c2[i]) {
                continue;
            } else {
                isPalindrome = true;
                break;
            }
        }
        if (!isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
