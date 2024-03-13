
public class CircularQueueLinkedList {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val= val;
        }
    }

    public static class queueL {
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int val){
            Node t = new Node(val);
            if(size==0){
                head=tail=t;
                tail.next = head;
            }else{
                tail.next=t;
                tail=tail.next;
                tail.next = head;
            }
            size++;

        }

        public int remove(){
            if(size==0){
                System.out.print("Queue is empty");
                return -1;
            }
            int ans = head.val;
            head = head.next;
            tail.next = head;
            size--;
            return ans;
        }

        public int peek(){
            if(size==0){
                System.out.print("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public void Display(){
            Node temp = head.next;
            System.out.print(head.val+" ");
            while (temp!=head) {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    
        
    }


    public static void main(String[] args) {
        
        queueL q = new queueL();

// Unlimited add element
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.Display();

//for remove the element
        q.remove();
        q.Display();
        q.remove();
        q.Display();
        // q.remove();
        // q.Display();
    
        // q.remove();

        System.out.println(q.peek());
        // q.remove();
        // System.out.println(q.peek());

        System.out.println(q.size);

        
    }
}

