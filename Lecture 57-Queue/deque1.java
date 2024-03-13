import java.util.*;

public class deque1 {
    public static void main(String[] args) {
        
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        // System.out.println(dq);
        // dq.add(6);
        // System.out.println(dq);

        dq.remove();
        System.out.println(dq);

        dq.addFirst(6);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);

        dq.addLast(5);
        dq.removeLast();
        System.out.println(dq);
    }
}
