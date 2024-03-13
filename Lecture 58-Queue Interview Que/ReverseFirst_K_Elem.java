//17-1-24
// reverse first k element of Queue
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirst_K_Elem {

    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        
        System.out.println(q);     //[1, 2, 3, 4, 5, 6]
        int k=4;
        int n = q.size();


        Stack<Integer> s = new Stack<>();
        // push first k element in stack
        for (int i = 1; i <=k; i++) {     //[5, 6]
                s.push(q.remove());
            
        }

        // move that k element from stack to queue
        for (int i = 1; i <=k; i++) {      //[5, 6 ,4, 3, 2, 1]
                q.add(s.pop());
            
        } 

        // Add n-k element from front to last (Which is move forward)
        for (int i = 1; i <=n-k; i++) {    //[4, 3, 2, 1, 5, 6]
            q.add(q.remove());
            
        }

        System.out.println(q);
    }
    
}