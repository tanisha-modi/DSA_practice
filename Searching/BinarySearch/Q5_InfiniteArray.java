public class Q5_InfiniteArray {
     
    public static void main(String[] args) {
        int[] array = {-18,-9,-4,0,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,2728,29,988};
        int target = 20;
        System.out.println(ans(array, target));
        
    }
    static int ans(int[] arr, int target){
        // find the range
        // first start with the a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in range 
        while (target > arr[end]){
            int temp = end +1;       // this is my new start 
            // double the box size 
            // end = previous end + sixe of box*2
            end = end + (end - start + 1)*2;
            start = temp;
        }

        return  SearchInInfinte(arr, target, start, end);
        
    }

    static int SearchInInfinte(int[] arr, int target, int start, int end){
        
        int mid;
        while (start<=end) {    // if start becomes greater then end, then the target element is not in given array 

                // finding the middle element 
                // mid = (start + end)/2;
                mid = start + (end - start)/2;      

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
        return -1;            
    }


}
