import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SET_Interface{

    static void hashSetEx(){
        HashSet<Integer> h= new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);

        h.add(1);
        h.add(1);
        h.add(1);

        h.add(34);
        h.add(22);
        h.add(7);
        
        System.out.println(h);    // Store Unordered data  // Unique
        h.remove(2);  
        System.out.println(h);
        System.out.println(h.contains(3)); // true
        System.out.println(h.size()); //3 


    }
    
    static void LinkedhashSetEx(){
        LinkedHashSet<Integer> h= new LinkedHashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);

        h.add(4);
        h.add(4);

        h.add(34);
        h.add(22);
        h.add(7);
        
        System.out.println(h);    // Store ordered data  // Unique

    }

    static void TreeSetEx(){
        TreeSet<Integer> h= new TreeSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);

        h.add(4);
        h.add(4);
        
        h.add(34);
        h.add(22);
        h.add(7);
        
        System.out.println(h);    // Store sorted data  // Unique

    }

    public static void main(String[] args) {
        
        // hashSetEx();
        LinkedhashSetEx();
        TreeSetEx();

    }
}