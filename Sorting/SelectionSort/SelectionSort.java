package Sorting.SelectionSort;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {12,4,67,3,45,6};
        selection(array);
        System.out.println(Arrays.toString(array));
    }

    static void selection(int[] arr){
         
        // int min = Integer.MIN_VALUE;  // if sorting in decending order
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item in the remaining array and swap with the correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            int temp = arr[maxIndex];
            arr[ maxIndex] = arr[last];
            arr[last] = temp;
        }
    } 
    private static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
            for (int j = start; j <= end; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
        return max;
    }






// public class SelectionSort {
//     public static void main(String[] args) {
//         int array[] = {12,4,67,3,45,6};
//         selection(array);
//         System.out.println(Arrays.toString(array));
//     }

//     static void selection(int[] arr){
//         int max = Integer.MIN_VALUE;
//         int index = 0;
//         // int min = Integer.MIN_VALUE;  // if sorting in decending order
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length -i; j++) {
//                 if (max < arr[j]) {
//                     max = arr[j];
//                     index = j;
//                 }
//             }
//             int temp = arr[arr.length - i -1];
//             arr[arr.length - i -1] = max;
//             arr[index] = temp;
//             max = Integer.MIN_VALUE;
//         }
//     } 
}
