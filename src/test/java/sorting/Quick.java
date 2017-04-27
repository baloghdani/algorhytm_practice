package sorting;

/**
 * Created by danielbalogh on 4/27/17.
 */
public class Quick {

    public static void quickSort(int[] array, int start, int end) {

        if (start < end) {
//            int pivot = array[end];

            int pIndex = partition(array, start, end);
            quickSort(array, start, pIndex - 1);
            quickSort(array, pIndex + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int pIndex = start;
        for(int i=start; i<end; i++) {
            if(array[i] <= pivot) {
                int temp = array[pIndex];
                array[pIndex] = array[i];
                array[i] = temp;
                pIndex++;
            }
        }
        int temp = array[end];
        array[end] = array[pIndex];
        array[pIndex] = temp;
        return pIndex;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 87, 234, 987, 456, 2347, 627, 935, 384};
        quickSort(arr, 0, 9);
        for (int i=0; i<9; i++){
            System.out.println(arr[i]);
        }
    }
}


