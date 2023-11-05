// Linked List..................
// Find middle of linked list   (right middle  or  left middle)
//  1  2  3  4  5  6    ----->    output = 4       output = 3 
//06-8-23
public class FindMiddleElement {

	public static class Node {
		int data; // value
		Node next; // address of next node

		Node(int data) {
			this.data = data;
		}
	}
	public static void main(String[] args) {

		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		

		a.next = b; // 5 -> 4 3 8 9

		b.next = c; // 5 -> 4 -> 3 8 9
		c.next = d; // 5 -> 4 -> 3 -> 8 9
		d.next = e; // 5 -> 4 -> 3 -> 8 -> 
		e.next = f;

		Node slow =a;
		Node fast =a;

		// For Right middle
		while(fast != null  && fast.next!= null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		// For left Middle
		// while(fast != null && fast.next!=null && fast.next.next != null){
		// 	slow = slow.next;
		// 	fast = fast.next.next;
		// }

		System.out.println(slow.data);


		
	}
	
}
