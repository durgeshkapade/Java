import java.util.*;

public class basicHashMap{
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();

        // use for insert and update
        mp.put("Yash",13);
        mp.put("Durgesh",42);
        mp.put("Kunal",19);
        mp.put("Tejas",14);
        // get value of a kay from hashmap 
        System.out.println(mp.get("Durgesh"));  //12
        System.out.println(mp.get("Lalu"));   //null

        //update
        mp.put("Yash",25);  //25
        System.out.println(mp.get("Yash"));  //25

        // Remove
        
        System.out.println(mp.remove("Tejas"));  ////14 
        System.out.println(mp.remove("lal"));  // null 

        //  contains
        System.out.println(mp.containsKey("Durgesh")); //true
        System.out.println(mp.containsKey("popu"));  //false

        // insert if doesn't exit
        mp.putIfAbsent("Yashika", 30);  ///  will enter
        mp.putIfAbsent("Yash", 1);  // will not enter

        // get all keys  ,  values  ,  entries
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        //Travel all entries of hashmap

        for(var key : mp.keySet()) {
            System.out.print("\nAge of "+key+" is "+mp.get(key));
        }
        System.out.println();
        for (Map.Entry<String , Integer> e  :   mp.entrySet()) {
            System.out.print("\nAge of "+e.getKey()+" is "+e.getValue());
        }
        System.out.println();
        for (var e  : mp.entrySet()) {
            System.out.print("\nAge of "+e.getKey()+" is "+e.getValue());
        } 

 
    }
}