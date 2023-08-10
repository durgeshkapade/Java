public class linked_intro {

	public static void insertAtEnd(Node head,int val){
		Node temp =new Node(val);
		Node t =head;
		while(t.next!=null){
			t=t.next;
		}
		t.next=temp;
	}

	public static int length(Node head) {
		int len=0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			len++;
		}
		return len;
	}

	public static void recursive(Node head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		recursive(head.next);
	}

	public static void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}

	}

	public static class Node {
		int data; // value
		Node next; // address of next node

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		Node a = new Node(5);
		Node b = new Node(4);
		Node c = new Node(3);
		Node d = new Node(8);
		Node e = new Node(9);
		Node f = new Node(2);
		// 5 4 3 8 9

		a.next = b; // 5 -> 4 3 8 9
		b.next = c; // 5 -> 4 -> 3 8 9
		c.next = d; // 5 -> 4 -> 3 -> 8 9
		d.next = e; // 5 -> 4 -> 3 -> 8 -> 9
		e.next = f;

// Displaying a linked list

		// System.out.println(a.data);
		// System.out.println(a.next.data);
		// System.out.println(a.next.next.data);
		// System.out.println(a.next.next.next.data);
		// System.out.println(a.next.next.next.next.data);

// Print Using loop		
		Node temp = a;
		// if we use directly (a) without store in temp....then the position of pointing
		// of (a) will be change
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

// Print Using method
		System.out.println();
		print(a);  

// Print Using Recursive method
		System.out.println();
		recursive(a);

// find size
		System.out.println("\n"+length(a));


//  if we insert at end ( if we given only head ) --->( In next file tail is given i.e it possible)
           // Using head                                 
		insertAtEnd(a,87);
		print(a);

	}

}
