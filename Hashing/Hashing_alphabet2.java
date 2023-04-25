package Hashing;

public class Hashing_alphabet2 {
    static int hash(int array[], int key){

        int ar[] = new int[256];
        for (int i = 0; i < array.length; i++) {
            ar[((int)array[i])]++;   
        }
        if(key> 122){
            return 0;
        }
        return ar[key];
    }


    public static void main(String[] args) {
        int array[] = {'a','b'};
        char k = 'b';
        int result = hash(array, k);
        System.out.println(result);
    }
}
