import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceEX {

    public static void DequeEx(){
        Deque<Integer> dq = new  ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        System.out.println(dq);  // 2 1 3
        System.out.println(dq.pollFirst()); //2 
        System.out.println(dq.pollLast()); // 3
        System.out.println(dq);  // 1 

    }

    public static void PriorityQueueEx(){
        // PriorityQueue pq =new PriorityQueue<>(Comparator.reverseOrder()); // max priority queue
        PriorityQueue pq =new PriorityQueue<>(); // mim priority queue e
        pq.add(10);
        pq.add(5);
        pq.add(7);   // 10 5 7
        System.out.println(pq.peek());   // 5  the smallest ele has hight privority
        System.out.println(pq);  // Gurentte -top Most priority  Ele has  proccess  first
        System.out.println(pq.poll());
        System.out.println(pq);

    }

    public static void QueueEx(){

        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        q.remove();
        System.out.println(q.isEmpty());
        System.out.println(q);
    }
    public static void main(String[] args) {

        DequeEx();
        // PriorityQueueEx();
        //QueueEx();
        
    }
}
