// 21-1-24
// input    [1, 2, 3, 4, 5, 6, 7, 8]
// output   [1, 5, 2, 6, 3, 7, 4, 8]
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(q);   //  1 2 3 4 5 6 7 8
        int n = q.size();

        Stack<Integer> s = new Stack<>();
        // 1 . push half elemnt in stack
        for (int i = 1; i <=(n/2); i++) {    // q = 5 6 7 8   s = 4 3 2 1
            s.push(q.remove());
        }
        // add this half in queue
        while (s.size()>0) {           // q = 5 6 7 8 4 3 2 1
            q.add(s.pop());
        }

        // 2. push half elemnt in stack
        for (int i = 1; i <=(n/2); i++) {    // q =  4 3 2 1   s = 8 7 6 5
            s.push(q.remove());
        }

        while (s.size()>0) {          // 8 4 7 3 6 2 5 1
            q.add(s.pop());           // 1 add stack in queue
            q.add(q.remove());        // 2 add queue in queue
        }

        // reverse the queue
        while(q.size()>0){
            s.push(q.remove());
        }
        while (s.size()>0) {
            q.add(s.pop());
        }

        System.out.println(q);   //1, 5, 2, 6, 3, 7, 4, 8


    }
}
