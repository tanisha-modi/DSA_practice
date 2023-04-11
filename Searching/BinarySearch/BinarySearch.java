// package DSA.Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-18,-9,-4,0,3,12,45,56,456,567,988};
        int target = 456;
        System.out.println(binarySearch(array, target));
        
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {    // if start becomes greater then end, then the target element is not in given array 

            // finding the middle element 
            // mid = (start + end)/2;
            mid = start + (end - start)/2;     // (2start + end - start = start + end)
                                               // this is done coz start + end may exceed the possible max value of Integer // CE
            if (target < arr[mid]) {
                end = mid - 1;        
            }                
            else if(target > arr[mid]){
                start = mid + 1;
            }      
            else
            // answer found // returns the index if target is found 
            return mid;             
        }  
        // target not in array 
        return -1;                                
    }
}
