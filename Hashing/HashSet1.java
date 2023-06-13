
import java.util.*;
// import java.util.HashSet;
// import java.util.Iterator;

public class HashSet1 {

    public static void main(String[] args) {
        
        // creating --> same as ArrayList or List
        HashSet<Integer> set  = new HashSet<>();   // set does not have order 

        // Insert 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);


        // size
        System.out.println("size : " + set.size());

        // print all elements of set
        System.out.println(set);




        // Search - contains
        if (set.contains(1)) {
            System.out.println("contains one");
        }
        if( set.contains(6)){
            System.out.println("contains six");
        }
        else{
            System.out.println("does not contain six");
        }





        // Delete 
        set.remove(1);
        if( set.contains(1)){
            System.out.println("contains one");
        }
        else{
            System.out.println("does not contain one");
        }



        // Iterator 
        Iterator it = set.iterator();
        // 2 functions --> hasNext - returns true or false ; next - returns next value 
        while(it.hasNext()){
            System.out.println(it.next());  // order 
        }
    }



}
