// 30-9-23
// To check the Doubly Linked List is Palindrome or not 
public class PalindromeDLL{

    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val=val;
        }
    }

    public static boolean palindrome(Node head){
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node h=head;
        Node t=temp;
        while(h!=t){
            
            if(h.val!=t.val) return false;

            h=h.next;
            t=t.prev;
        }
        return true;
    }

    

    public static void main(String []arg){
        //   6 45 4 76 71 
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(4);
        Node e = new Node(2);
        Node f = new Node(1);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;

        boolean check = palindrome(a);
        System.out.println(check);

        

        

        
    }
}