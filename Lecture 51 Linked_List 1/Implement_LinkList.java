
public class Implement_LinkList {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static class LinkedList {

		Node head = null;
		Node tail = null;
		int size = 0;

// ============== insert at end -----------------O(1)
		void insertAtEnd(int val) {

			Node temp = new Node(val);
			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}

			System.out.println();
			size++;

		}

// ============== insert at Beginning------------ O(1)
		void insertAtHead(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				temp.next = head;
				head = temp;
			}
			System.out.println();
			size++;
		}
// ============== insert ================== --------O(n)

		void insertAt(int idx, int val) {
			Node t = new Node(val);
			Node temp = head;

			if (idx == size) {
				insertAtEnd(val);
				return;
			} else if (idx == 0) {
				insertAtHead(val);
				return;
			} else if (idx < 0 || idx > size) {
				System.out.println("Wrong index");
				return;
			}

			for (int i = 1; i <= idx - 1; i++) {
				temp = temp.next;
			}

			t.next = temp.next;
			temp.next = t;
			size++;

		}

// ============== Display (or ) print the List------------O(n)
		void Displaying() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}

// ============== Find the size of List-----------O(n)
		// int size() {
		// Node temp = head;
		// int count = 0;
		// while (temp != null) {
		// count++;
		// temp = temp.next;
		// }
		// return count;
		// }

	// Rather than we can use [ size ] variable which will 
	// increase the value after iteration

// =================== getting element using index
		int getAt(int idx) {

			if (idx < 0 || idx > size) {
				System.out.println("Wrong index");
				return -1;
			}

			Node t = head;
			for (int i = 1; i <= idx; i++) {
				t = t.next;
			}

			return t.data;
		}

// =================== Delete the element
		void deleteAt(int idx) {
			if(idx==0){
				head=head.next;
				size--;
				return;
			}
			Node temp = head;
			for (int i = 1; i <= idx - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			System.out.println();
			size--;
			tail=temp;
		}

	}

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.insertAtEnd(4); // 4
		// ll.Displaying();
		ll.insertAtEnd(7); // 4 7
		// ll.Displaying();
		ll.insertAtEnd(8); // 4 7 8
		// ll.Displaying();

		ll.insertAtHead(3); // 3 4 7 8
		// ll.Displaying();

		ll.insertAt(4, 9); // 3 4 7 8 9
		// ll.Displaying();
		ll.insertAt(0, 2); // 2 3 4 7 8 9
		//ll.Displaying();

		ll.deleteAt(0);
		ll.Displaying(); // 2 3 7 8 9


// get element
		// System.out.println(ll.getAt(3));

		//System.out.println("\nSize of Linked List is : " + ll.size);

	}

}
