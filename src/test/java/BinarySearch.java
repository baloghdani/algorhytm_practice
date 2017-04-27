/**
 * Created by danielbalogh on 4/27/17.
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int targetValue) {
        int min = 0;
        int max = array.length - 1;
        int guess;

        while (min<max) {
            guess = (min+max) / 2;

            if (array[guess] == targetValue) {
                return guess;
            }
            else if (array[guess] < targetValue) {
                min = array[guess]+1;
            }
            else {
                max = array[guess]-1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 7));
    }
}
