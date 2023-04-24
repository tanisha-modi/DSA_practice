package Hashing;


public class Hashingg {
    static int hash(int arr[], int key){
        int ar[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            ar[arr[i]]++;   
        }
        if(key> 6){
            return 0;
        }
        return ar[key];
    }


    public static void main(String[] args) {
        int array[] =  {1,2,3,1,3,3};
        int k = 12;
        int result = hash(array, k);
        System.out.println(result);
    }
}

// ascii value of 'a' - 97 and 'z' - 122
