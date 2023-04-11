// Floor Number is the largest number in the array which is smaller than target

public class Q2_FloorNO {
    public static void main(String[] args) {
        int[] arr = {-18,-9,-4,0,3,12,45,56,456,567,988};
        int target = -1;
        System.out.println("Floor Number is : " + floorNo( arr, target));
    }

    static int floorNo(int array[], int t){
        int start = 0;
        int end = array.length - 1;
        int mid; 
        boolean asce = array[start] <= array[end];

        while (start <= end) {
            mid = start + (end - start)/2;

            // if target is smaller than the smallest no in the array // there's no floor number 
            if(t <= array[0]){
                return -1;
            }

            if (array[mid] == t) {
                return array[mid];
            }

            if(asce){
                if(array[mid]> t){
                    end = mid - 1;   
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(array[mid]< t){
                    end = mid - 1;   
                }
                else{
                    start = mid + 1;
                }

            }
        }
        System.out.println("no");
        return array[end];     // when start become greater than end, end is the largest no. smaller than target 
        // it simply means target does lies between start and end, but not in present is the array ..so the previous element 
        // will be floor no. 
    }
}
