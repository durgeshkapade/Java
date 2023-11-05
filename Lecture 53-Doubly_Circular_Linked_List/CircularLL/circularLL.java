
public class circularLL{

    public static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val=val;
        }
    }

    public static void Display(Node head){
        Node temp = head.next;
        System.out.print(head.val+" ");
        while(temp!=head){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node Deletehead(Node head){
        Node temp =head.next;
        Node t =temp;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return t;
    }

    public static void main(String []arg){
        //   6 45 4 76 71 
        Node a = new Node(6);
        Node b = new Node(45);
        Node c = new Node(4);
        Node d = new Node(76);
        Node e = new Node(6);
        Node f = new Node(71);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = a;

        Display(a);

        Node newhead = Deletehead(a);
        newhead = Deletehead(newhead);

        Display(newhead);

        

        
    }
}