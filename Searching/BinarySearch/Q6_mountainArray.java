// mountain array == bitonic array == sorted array (first in acsending, then descending)
// peak in mountain array = max. value in array 


public class Q6_mountainArray {
    public static void main(String[] args) {
        int[] array = {-18,-9,-4,0,3,12,45,56,456,567,12,11,8,5,4,2,1};
        int target = 456;
        System.out.println(peak(array, target));
    }

    static int  peak(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end) {    // if start becomes greater then end, then the target element is not in given array 

            // finding the middle element 
            // mid = (start + end)/2;
            mid = start + (end - start)/2;      

            if (arr[mid+1] < arr[mid]) {   // mid is in decreasing part of the array 
                                           // this may be the ans, but look at left
                                           // this is why end != mid -1  
                end = mid;                 
            }                
            else {   // mid is in increasing part of the array
                start = mid + 1;
            }      
                   
        }  
        // in the end, start == end and pointing to the largest number because of the checks above 
        // start and end are always trying to find max element in the above 2 checks 
        // hence, when they pointing to just one element, that is the maximum one because that is what checks say 
        
        // more elaboration : at every point of time for start and end, they have the best possible ans till that time 
                              // and if we are saying that only one item is remaining, hence coz of above line that is the best possible ans 
        return start; // or return end as both are equal 
    }
}
