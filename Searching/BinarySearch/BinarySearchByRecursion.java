public class BinarySearchByRecursion {
    public static void main(String[] args) {
        int array[] = {1, 4, 5, 6, 22, 78};
        int target = 76;
        int ans =  bSearch(0, array.length - 1, array, target);
        System.out.println(ans);
    }
    public static int bSearch(int start, int end, int[] arr, int target){

        if(start > end){
            return -1;
        }

       int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return bSearch(mid +1, end, arr, target);
        }
        else{
             return bSearch(start, mid-1, arr, target);
        }

    }
}
