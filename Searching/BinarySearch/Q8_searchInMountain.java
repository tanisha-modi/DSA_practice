// mountain array == bitonic array == sorted array (first in acsending, then descending)
// peak in mountain array = max. value in array 


public class Q8_searchInMountain {
    public static void main(String[] args) {
        int[] array = {-18,-9,-4,0,3,12,45,56,456,567,12,11,8,5,4,2,1};
        int target = 8;
        System.out.println(findElement(array, target));
    }

    static int findElement(int[] arr, int target){
        int ans = -1;
        int peak = searchPeak(arr);
      
        // int start = 0;
        // int end = peak;
        
        ans = BinarySearch(arr, target, 0, peak);   // for asce side 
        
        
        if(ans == -1){
            // start = peak +1;
            // end = arr.length -1;
            ans = BinarySearch(arr, target, peak +1, arr.length -1);   // for dec part 
             
        }
        return ans;
    }

    static int searchPeak(int[] arr ){    // function for finding the peak element 
        int start = 0;
        int end = arr.length -1;
        int mid; 

        while(start < end  ){
            
            mid = start + (end - start)/2;

            if(arr[mid] > arr[mid +1]){      // in dec side 
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }

    static int BinarySearch(int[] arr, int target, int start, int end){
        int mid; 

         boolean asce = arr[start] < arr[end];

        while(start <= end  ){
            
            mid = start + (end - start)/2;

            if(asce){
                if(arr[mid] > target){      // in asce side 
                    end = mid -1;
                }
                else if(arr[mid] < target){
                    start = mid +1;
                }
                else
                     return mid;
                }
                
                else{
                if(arr[mid] < target){      // in dec side 
                    end = mid -1;
                }
                else if(arr[mid] > target){
                    start = mid +1;
                }
                else
                     return mid;

            }
        }
        return -1;
    }
}
