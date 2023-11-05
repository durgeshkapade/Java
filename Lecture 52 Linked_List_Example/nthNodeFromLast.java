// Linked List..................
// Find Nth Node From last
//  1  2  3  4  5  6    input = 2    ----->       output = 5
//05-8-23
public class nthNodeFromLast{

		public static Node nthNode(Node head,int n){
			Node temp=head;
			int size=0;
			while(temp!=null){
				temp=temp.next;
				size++;
			}

			int m =size-n+1;
			temp=head;
			for (int i = 1; i <=m-1; i++) {
				temp=temp.next;
			}
			return temp;

		}

// same like a upper code but it is slow fast pointer apporach
	public static Node nthNode2(Node head,int n){
		Node slow=head;
		Node fast=head;
		for (int i = 1; i <=n ; i++) {
			fast=fast.next;
		}
		while(fast!=null){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}

	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}

	public static void main(String[] args) {
		
		Node a= new Node(100);
		Node b= new Node(11);
		Node c= new Node(130);
		Node d= new Node(170);
		Node e= new Node(10);
		Node f= new Node(30);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		// 100 11 130 170  130 30
		Node p=nthNode(a,3);
		System.out.println(p.data);
		Node q=nthNode2(a,5);  // this is best apporoch
		System.out.println(q.data);


	}
	
}
