package Diziler;

public class HarmonikOrtamala {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int number : numbers) { //harmonik seri
            sum += (double) 1 / number;
        }
        System.out.println(numbers.length/sum);
    }
}
