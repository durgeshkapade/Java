// String Problem..................
// Convert upper to lower to lower & Vice versa
// "DurgesH"   ----->    output = dURGESh
//21-7-23
import java.util.*;

public class upperToLower {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		StringBuilder str = new StringBuilder(sc.nextLine());

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // Remove Char from String
			if (ch == ' ')	continue;  // except space

			int asci = (int) ch; // find asci of Char

			if(asci < 65)  continue;   //except number

			if (asci <= 90) {
				asci += 32;
				char dh = (char) asci;
				str.setCharAt(i, dh);
			} else {
				asci -= 32;
				char dh = (char) asci;
				str.setCharAt(i, dh);
			}

		}

		System.out.println(str);

	}
}
