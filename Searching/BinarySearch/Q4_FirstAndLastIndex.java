// first and last position where the target element is present in array 

public class Q4_FirstAndLastIndex {
        public static void main(String[] args) {
            int[] array = {1,7,7,7,8,8,12,12,12,12,12,12,12};
            int target = 1;
            int[] ans = SearchRange(array, target);
            System.out.println("{ "+ ans[0] + " , " + ans[1] +" }"  );
            
        }
    
        static int[] SearchRange(int[] nums, int target){


            int[] ans = {-1,-1}; // initial range // not found
            
            // checks the first occurence of target
            ans[0] = search(nums, target,  true);
            if(ans[0] != -1){
                ans[1] = search(nums, target,  false);
            }
            
            
            return ans;  // array                               
        }

        // this function returns the index value of the target 
        static int search(int[] nums, int target, boolean FindStartIndex){

            // potential ans
            int ans = -1;

            int start = 0;
            int end = nums.length - 1;
            int mid;
            
            
            while (start <= end) {    // if start becomes greater then end, then the target element is not in given array 

    
                // finding the middle element 
                // mid = (start + end)/2;
                mid = start + (end - start)/2;     
                                                   
                if (target < nums[mid]) {
                    end = mid - 1;        
                }                
                else if(target > nums[mid]){
                    start = mid + 1;
                }      
                else{
                  // potential ans found 
                  ans = mid;
                  if(FindStartIndex){
                    end = mid -1;
                  }
                  else{
                    start = mid +1;
                  }            
            }
        
        }
        return  ans; 
    }
    
}
