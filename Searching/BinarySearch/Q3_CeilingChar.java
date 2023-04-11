// ceiling char == smallest char in the array which is equal to or greater to target no
// also the letter wrap around ...comes to starting after the end is reached 
// this question is about a array sorted in ascending order 

public class Q3_CeilingChar {
    public static void main(String[] args) {
        char[] array = { 'a', 'e', 'i', 'x', 'y'};
        char target = 'e';
        System.out.println("The ceiling no. is : "+ ceiling(array, target));
    }

    static char ceiling(char arr[], char target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        
        
        while(start <= end){
            mid = start + (end - start)/2;

            // if target is greater than the greatest no in the array // letter wrap ..it means first element will be returned
            if(target >= arr[arr.length -1]){
                return arr[0] ;
            }

            // if(arr[mid] == target){
            //     return arr[mid + 1 ];  // returns the next char which is always greater the target in sorted array  
            // }                          // no need of this block 
            
            if (arr[mid]>target) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
             
                
        }
      
        return arr[start];   // when start become greater than end, start is the least no. greater than target 
                        // it simply means target does lies between start and end, but not in present is the array ..so the next element 
                        // will be ceiling no. 
    }
}
