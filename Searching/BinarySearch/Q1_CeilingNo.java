// ceiling no. == smallest no. in the array which is equal to or greater to target no

public class Q1_CeilingNo {
    public static void main(String[] args) {
        int[] array = {-18,-9,-4,0,3,12,45,56,456,567,988};
        int target = 48;
        System.out.println("The ceiling no. is : "+ ceiling(array, target));
    }

    static int ceiling(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        
        boolean asce = arr[start] <= arr[end];
        
        while(start <= end){
            mid = start + (end - start)/2;

            // if target is greater than the greatest no in the array // there's no ceiling number 
            if(target >= arr[arr.length -1]){
                return -1;
            }

            if(arr[mid] == target){
                return arr[mid];
            }
            if (asce) {
                if (arr[mid]>target) {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if (arr[mid]<target) {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
                
            }
        }
        return arr[start];   // when start become greater than end, start is the least no. greater than target 
                        // it simply means target does lies between start and end, but not in present is the array ..so the next element 
                        // will be ceiling no. 
    }
}
