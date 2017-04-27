package sorting;
/**
 * Created by danielbalogh on 4/25/17.
 */
public class Bubble {


    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if((arr[j])<(arr[j-1])) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {10, 6, 15, 4, 1, 35, 42, 23, 8, 11};
        bubbleSort(array);
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
