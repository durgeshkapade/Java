public class interning {
	public static void main(String[] args) {
		
		String s="Durgesh";
		String j="Durgesh";
		// s and j are pointing to same address
		j="kapade";
		System.out.println(s);
		System.out.println(j);

		// to change this address we create a new string
		String p= new String("Durgesh"); 
		p="dsdsd";
		System.out.println(p);

	}
	
}
