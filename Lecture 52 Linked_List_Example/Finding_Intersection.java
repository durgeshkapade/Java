// Linked List..................
//  Find intersection of two linked list
//  [12  28  31  43  56  61]   & [56 78  90  56  61]  ----->    output = 56
//05-8-23
public class Finding_Intersection {

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
		Node e = new Node(4);
		

		a.next = b; // 5 -> 4 3 8 9
		b.next = c; // 5 -> 4 -> 3 8 9
		c.next = d; // 5 -> 4 -> 3 -> 8 9
		d.next = e; // 5 -> 4 -> 3 -> 8 -> 9
		

		Node a1 = new Node(5);
		Node b1 = new Node(3);
		Node c1 = new Node(9);
		Node d1 = new Node(2);
		Node e1 = new Node(2);
		Node f1 = new Node(8);
		Node g1 = new Node(4);

		a1.next = b1; 
		b1.next = c1; 
		c1.next = d1; 
		d1.next = e1;
		e1.next = f1;
		f1.next = g1;
		
		Node temp1=a;
		Node temp2=a1;
		int m=0;
		int n=0;
		while(temp1!=null){
			temp1=temp1.next;	m++;
		}
		while(temp2!=null){
			temp2=temp2.next;   n++;
		}

		int idx=0;
		if(m>n){
			idx=m-n;
			for (int i = 1; i <=idx; i++) {
				a=a.next;
			}
		}else{
			idx=n-m;
			for (int i = 1; i <=idx; i++) {
				a1=a1.next;
			}
		}

		while(a!=null && a1!=null){
			if(a.data==a1.data){
				System.out.println(a.data);
				break;
			}
			a=a.next;
			a1=a1.next;
		}

	}
	
}
