package Hashing;
 
import java.util.*;



public class HashMap1 {
    public static void main(String[] args) {
        
        // creating
        HashMap<String, Integer> map = new HashMap<>();   // Unordered map //pairs

        // Insertion  // put -->  either udpate the existing one or insert new pair
        map.put("India", 120);
        map.put("US", 30);
        map.put("china", 150);

        System.out.println(map);
        
        map.put("china", 180);  // value will update for the key "china"
        System.out.println(map);


        // search  -> contaisKey - returns true and false 
        if (map.containsKey("UK")) {
            System.out.println("key is present in the map");
        }
        else{
            System.out.println("key is not present in map");
        }
        
        // get function
        System.out.println(map.get("India")); // -> returns key for the value 
        System.out.println(map.get("UK")); // -> returns null as the key does not exist 

        // iteration in HashMap
        // for(int val : arr)
        for( Map.Entry<String, Integer> val : map.entrySet()){
             System.out.println(val.getKey());
             System.out.println(val.getValue());
        }

        // another way for iteration 
        Set<String> keys = map.keySet();
        for(String s : keys){
            System.out.println(s + " : " +  map.get(s));
        }

        // Remove 
        map.remove("china");
        System.out.println(map);
    }
}
