package Diziler;


public class DizidekiSayilarinFrekanslari {
    static boolean check(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,10,20,5,20};
        int[] duplicate = new int[arr.length];
        int[] frequency = new int[arr.length];
        int startIndex = 0, startIndex2 = 0;
        int count = 0;

        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){
                if (i != j && arr[i] == arr[j]){
                    if (!check(duplicate, arr[i])){
                        duplicate[startIndex++] = arr[i];
                        break;
                    }
                }
            }
        }
        for (int i=0; i< arr.length;i++){
            for (int j= i; j< arr.length; j++){
                if (duplicate[i] == arr[j]){
                    count++;
                }
            }
            frequency[startIndex2++] = count;
            count = 0;
        }
        for (int i=0; i< arr.length; i++){
            if (duplicate[i] != 0){
                System.out.println(duplicate[i]+ " sayısı " +frequency[i]+ " kere tekrar edildi.");
            }
            else if (!check(duplicate, arr[i])){
                System.out.println(arr[i]+ " sayısı 1 kere tekrar edildi.");
            }
        }
    }
}
