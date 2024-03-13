import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;

public class ListImplementation {

    static void ArrayListExample(){

        // ArrayList<Integer> a= new ArrayList<>();
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4); 
        System.out.println(a);
        a.set(1, 10);
        System.out.println(a);
        System.out.println(a.contains(10));

    }

    static void StackEx(){
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
    public static void main(String[] args) {
        // ArrayListExample();
        StackEx();
    }
}
