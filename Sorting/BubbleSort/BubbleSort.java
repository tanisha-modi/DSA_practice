// https://www.youtube.com/watch?v=F5MZyqRp_IM&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=18&t=2166s

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped = false;
        // run the steps n-1 times 
        for (int i = 0; i < arr.length; i++) {
            // after each step, max element will come to last repective index
            for (int j = 1; j < arr.length -i ; j++) {
                // swap if the element is smaller than the previous element 
                if ( arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            } 
        }
    }
}