package Hashing;

public class Hashing_alphabet {
    static int hash(String s, int key){

        int ar[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ar[((int)s.charAt(i)-97)]++;   
        }
        if(key> 122){
            return 0;
        }
        return ar[key-97];
    }


    public static void main(String[] args) {
        String s = "tanishi";
        char k = 'z';
        int result = hash(s, k);
        System.out.println(result);
    }
}
