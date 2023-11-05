
public class Into_doublyLL{

    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val=val;
        }
    }

    public static void Display(Node a){
        Node temp = a;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void Displayreverse(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        } 
        System.out.println();
        
    }

    public static void DisplayUsingrandom(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head,int x){
        Node temp =new Node(x);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }

    public static Node insertAttail(Node head,int x){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t= new Node(x);
        temp.next = t;
        t.prev = temp;
        temp = t;
        return temp;
    }

    public static void insertAtIdx(Node head,int idx,int val){
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp=temp.next;
        }
        Node t = new Node(val);
        t.next = temp.next;
        temp.next = t;
        t.prev = temp;  
        t.next.prev = t;
    }

    public static void DeleteNode(Node head,int idx){
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }    
        temp.next.next.prev = temp;
        temp.next=temp.next.next;

    }

    public static void main(String []arg){
        //   6 45 4 76 71 
        Node a = new Node(6);
        Node b = new Node(45);
        Node c = new Node(4);
        Node d = new Node(76);
        Node e = new Node(71);

        // a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        // e.next = null; 

        Display(a);
        // Displayreverse(e);
        // DisplayUsingrandom(d);

// Insert at head          
        // Node newhead = insertAtHead(a, 5);
        // a = newhead;
        // Display(a);

// Insert at tail        
        // Node newtail = insertAttail(a, 4);
        // e  = newtail;
        // Display(a);

// Insert at Any index
        // insertAtIdx(a,3,50);
        // Display(a);
        // Displayreverse(e);

// Delete any Node        
        DeleteNode(a,2);
        Display(a);
        Displayreverse(e);

    }
}