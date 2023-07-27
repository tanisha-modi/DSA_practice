 // last index is sent instend of length of array

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 7, 2, 98 , 12 };    
        mergeSort_inPlace(array, 0, array.length - 1);    // last index is sent instend of length of array

        System.out.println(Arrays.toString(array));
    }

    static void mergeSort_inPlace(int[] arr, int start, int end) {  // divide 
        if (start >= end) {             // base condition   
            return;
        }

        int mid =  (start + end )/ 2;

        mergeSort_inPlace(arr, start, mid);  
        mergeSort_inPlace(arr, mid+1, end);   

        mergeInPlace(arr, start, mid, end);

    }

    static void mergeInPlace(int[] array, int s, int mid, int e) { // merge the two sorted arrays // conquer

        int[] mix = new int[e - s +1];

        int i = s;
        int j = mid+1;
        int k = 0; // for new mix array

        while (i <= mid && j <= e) {
            if (array[i] <= array[j]) {
                mix[k] = array[i];
                i++;
            } else {
                mix[k] = array[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i <= mid) {
            mix[k] = array[i];
            i++;
            k++;
        }

        while (j <= e) {
            mix[k] = array[j];
            j++;
            k++;
        }
//  System.arraycopy(mix, 0, array, s+0, mix.length); 
         // directly copy a array into another
        for(int l = 0; l < mix.length; l++){
            array[l + s] = mix[l];
        }
    }
}
