
public class BasicOfStringBuilder{
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("hello");

		System.out.println(str);

// set char at
		str.setCharAt(0, 'm');
		// System.out.println(str);   // mello
// append
		str.append(" start");
		// System.out.println(str);  // mello start

// insert
		str.insert(2,'y');  
		// System.out.println(str); // meyllo start
	
// delete element
		str.deleteCharAt(2);
		// System.out.println(str);  // mello start

// Reverse
		StringBuilder p=new StringBuilder("durga");
		p.reverse();
		//System.out.println(p); // agrud

// Delete
		p.delete(1,3);
		System.out.println(p);








	}
} 