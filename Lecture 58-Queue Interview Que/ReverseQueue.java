import java.util.*;

public class ReverseQueue {

    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);

        Stack<Integer> s = new Stack<>();
        while (q.size()>0) {
            s.push(q.remove());
        }

        while(s.size()>0){
            q.add(s.pop());
        }  

        System.out.println(q);
         
        
     }
}