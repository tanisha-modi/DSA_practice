// if we dont know in which order array is sorted 

public class OrderAgnosticBS{
    public static void main(String[] args) {
        // int[] array = {-18,-9,-4,3,12,45,56,456,567,988};
        int[] array = {988, 983, 456, 54, 3, 1, -18, -26, -196};
        int target = 54;
        int a = orderAgnosticBS(array, target);

        System.out.println(a);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {

            boolean Asce = arr[start] < arr[end];
            // finding the middle element 
            // mid = (start + end)/2;
            mid = start + (end - start)/2;     // (2start + end - start = start + end)
                                               // this is done coz start + end may exceed the possible max value of Integer // CE
            
            
            // if array is sorted in ascending order 
            if(Asce) {
                if (target < arr[mid]) {
                    end = mid - 1;        
                }                
                else if(target > arr[mid]){
                    start = mid + 1;    
                }
                else 
                return mid;       
            }
            // sorted in descending order
            else{
                if (target > arr[mid]) {
                    end = mid - 1;        
                }                
                else if(target < arr[mid]){
                    start = mid + 1;
                } 
                else 
                return mid;     
            }
                         
        }  
        // target not in array 
        return -1;                                
    }
}

    // public static void main(String[] args) {
    //     int[] array = {-18,-9,-4,0,3,12,45,56,456,567,988};
    //     int target = -1;
    //     System.out.println(BS(array, target));
        
    // }
    // static int BS(int[] arr, int target){
    //     if(Order(arr)){
    //        return binarySearch1(arr, target);
    //     }
    //     else{
    //        return binarySearch2(arr, target);
    //     }
    // }

    // static int binarySearch1(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     int mid;
    //     while (start <= end) {

    //         // finding the middle element 
    //         // mid = (start + end)/2;
    //         mid = start + (end - start)/2;     // (2start + end - start = start + end)
    //                                            // this is done coz start + end may exceed the possible max value of Integer // CE
    //         if (target < arr[mid]) {
    //             end = mid - 1;        
    //         }                
    //         else if(target > arr[mid]){
    //             start = mid + 1;
    //         }      
    //         else
    //         // answer found
    //         return mid;             
    //     }  
    //     // target not in array 
    //     return -1;                                
    // }
    // static int binarySearch2(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     int mid;
    //     while (start <= end) {

    //         // finding the middle element 
    //         // mid = (start + end)/2;
    //         mid = start + (end - start)/2;     // (2start + end - start = start + end)
    //                                            // this is done coz start + end may exceed the possible max value of Integer // CE
    //         if (target > arr[mid]) {
    //             end = mid - 1;        
    //         }                
    //         else if(target < arr[mid]){
    //             start = mid + 1;
    //         }      
    //         else
    //         // answer found
    //         return mid;             
    //     }  
    //     // target not in array 
    //     return -1;                                
    // }
    
    // // chacking whether ascending order is true or not
    // static boolean Order(int[] arr){
    //     if (arr[arr.length-1] > arr[0]) {
    //         return true;
    //     }
    //     return false;
    // }
