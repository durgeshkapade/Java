// String Problem..................
// Reverse Each word in the string
// "I am an educator"   ----->    output = I ma na rotacude
//21-7-23
public class ReverseEachWord {
	public static void main(String[] args) {
		
		String str ="I am an educator";
		String ans ="";
		StringBuilder s = new StringBuilder("");

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if(ch !=' '){
				s.append(ch);
			}else{
				s.reverse();
				ans +=s;
				ans +=" ";
				s.delete(0, s.length());
			}
			
		}
		s.reverse();
		ans +=s;
		
		System.out.println(ans);
	}
	
}
