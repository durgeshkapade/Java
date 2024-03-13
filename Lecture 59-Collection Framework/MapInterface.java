import java.util.*;

public class MapInterface {

    public static void HashMapEx(){
        
        // LinkedHashMap<Integer,String> m =new LinkedHashMap<>();
        // TreeMap<Integer,String> m =new TreeMap<>();
        Map<Integer,String> m =new HashMap<>();
        m.put(1, "Durgesh");
        m.put(3, "kapade");
        m.put(2, "kunal");

        // m.put(1, "hemant"); // Overide
        // System.out.println(m);

        // System.out.println(m.get(2));  //  kunal
        // System.out.println(m.containsKey(4)); // false
        // System.out.println(m.containsValue("kapade")); // true

        // System.out.println(m.keySet());  //  1 2 3
        // System.out.println(m.values()); // Durgesh Kunal Kapade 

        // Interating Over Key
        for(Integer e : m.keySet()){
            System.out.print(e+" ");     // only key
        }
        System.out.println();

        // Interating Over Value
        for(var e : m.values()){
            System.out.print(e+" ");   // only value
        }System.out.println();

        // Interating Over Key and value mapping
        for(var e : m.entrySet()){
            System.out.print(e+" ");   // All
        }System.out.println();

        for(var e : m.entrySet()){
            System.out.print(e.getKey()+" ");   // All - Key
        }System.out.println();

        for(var e : m.entrySet()){
            System.out.print(e.getValue()+" ");   // All - value
        }System.out.println();

        for(var e : m.keySet()){
            System.out.print(m.get(e)+" ");   // key - value
        }System.out.println();



    }

    public static void main(String[] args) {     
        HashMapEx();
        
    }
    
}
