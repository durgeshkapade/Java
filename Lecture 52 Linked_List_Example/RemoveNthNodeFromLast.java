// Linked List..................
// Remove Nth Node From last
//  1  2  3  4  5  6    input = 3    ----->       output = 1  2  3  5  6
//05-8-23
public class RemoveNthNodeFromLast {

	public static Node nthNode2(Node head, int n) {
		Node slow = head;
		Node fast = head;
		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}

		if (fast == null) { // this condition for first index remove
			head = head.next;
			return head;
		}

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return head;
	}

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	// print method
	public static void Displaying(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		// 100 11 130 170 130 30

		Displaying(a);

		a = nthNode2(a, 2); // 4 // this is best apporoch

		System.out.println();

		Displaying(a);

	}

}
