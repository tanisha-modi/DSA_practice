// package Sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 7, 2, 98}; // original array does not change in this 
        array = mergeSort(array);    

        System.out.println(Arrays.toString(array));   
    }

    // recursive function 

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {             // base condition 
            return arr;
        }

        int mid = arr.length / 2;
        // The Java Arrays copyOfRange(short[] original, int from, int to) method copies
        // the specified range of the specified array into
        // a new array.
        // Parameters :
                // - original − This is the array from which a range is to to be copied.
                // - from − This is the initial index of the range to be copied, inclusive.
                // - to − This is the final index of the range to be copied, exclusive.

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));  //mid is exclusive
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));  //arr.length is exclusive

        return merge(left, right);

    }


    static int[] merge(int[] first, int[] second){      // merge the two sorted arrays 

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;     // for new mix array

        while( i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete 
        // copy the remaining elements
        while( i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while( j < second.length){
            mix[k] =  second[j];
            j++;
            k++;
        }
        return mix;
    }
}
