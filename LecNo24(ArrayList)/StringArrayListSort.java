import java.util.ArrayList;
import java.util.Collections;
public class StringArrayListSort{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(7);
        
        System.out.println("Array list");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Asending order");
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Decending order");
        System.out.println(list);

//  Ascending and Decending order For string ...        
        ArrayList<String> l=new ArrayList<>();
        l.add("Hello!");
        l.add("Durgesh");
        l.add("Kapade");

        System.out.println("String array List");
        System.out.println(l);

        System.out.println("Ascending order"); // sort like alphabet.. 
        Collections.sort(l);
        System.out.println(l);

        System.out.println("Decending Order");
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);



    }
}
