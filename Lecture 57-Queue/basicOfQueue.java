import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class basicOfQueue{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        // Queue<Integer> q = new Queue<>();      //not a queue

 // both are same       
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();

//add the element
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

// print queue
        System.out.println(q);
// remove element from front
        q.remove();
        System.out.println(q);
// print peek
        System.out.println(q.peek());
        q.poll(); 
        System.out.println(q);
// print size
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}