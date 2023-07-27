// package Sorting.QuickSort;


// quick sort by taking last index as pivot 

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr, int l, int h){
        int pivot = arr[h];
        int i = l-1;

        for (int j = l; j < h; j++) {
            if(arr[j] < pivot){
                i++;
                // swap 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[h] = temp;
        return i;  //pivot index
    }
    

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivot_index = partition(arr, low, high);

            quickSort(arr, low, pivot_index-1);
            quickSort(arr, pivot_index+1, high);

        }

    }


    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 7, 4, 12, 67};
        int n = arr.length;

        quickSort(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }
}
