public class Implemention_DoubLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }

    public static class DoublyLL{

        Node head = null;
        Node tail = null;

        void insertStart(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        }

        // void insertEnd(int val){
        //     Node temp = new Node(val);
        //     temp.next = null;
        //     tail.next = 
        // }

        void Display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        void Displayreverse(){
            Node temp = tail;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.prev;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        
        DoublyLL Dl1 = new DoublyLL();
        Dl1.insertStart(4);
        Dl1.insertStart(5);
        Dl1.insertStart(6);
        Dl1.insertStart(7);

        Dl1.insertStart(8);

        Dl1.Display();
        // Dl1.Displayreverse();

    }
    
}
