package sorting;

import java.util.Arrays;

/**
 * Created by danielbalogh on 4/27/17.
 */
public class MergeSort {

    public static int[] mergeSort(int[] array) {

        if (array.length > 1) {
            int elementsInLeft = array.length / 2;
            int elementsInRight = array.length - elementsInLeft;
            int[] arrLeft = new int[elementsInLeft];
            int[] arrRight = new int[elementsInRight];

            for (int i = 0; i < elementsInLeft; i++) {
                arrLeft[i] = array[i];
            }

            for (int i = elementsInLeft; i < elementsInLeft + elementsInRight; i++) {
                arrRight[i - elementsInLeft] = array[i];
            }
            arrLeft = mergeSort(arrLeft);
            arrRight = mergeSort(arrRight);


            // [i] stores the index of the main array. it will be used to let us
            // know where to place the smallest element from the two sub-arrays.
            // [j] stores the index of which element from arr1 is currently being compared
            // [k] stores the index of which element from arr2 is currently being compared
            int i = 0;
            int j = 0;
            int k = 0;

            while (arrLeft.length != j && arrRight.length != k) {
                if (arrLeft[j] < arrRight[k]) {
                    array[i]= arrLeft[j];
                    j++;
                    i++;
                } else if (arrLeft[j] > arrRight[k]) {
                    array[i] = arrRight[k];
                    k++;
                    i++;
                }
            }

            while (arrLeft.length != j) {
                array[i] = arrLeft[j];
                i++;
                j++;
            }
            while (arrRight.length != k) {
                array[i] = arrRight[k];
                i++;
                k++;
            }


        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {7, 5, 2, 9, 8, 13, 65, 74, 143, 978, 135};
        System.out.println(Arrays.toString(mergeSort(array)));
    }


}
