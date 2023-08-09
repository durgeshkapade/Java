// String Problem..................
// The number of palindrome substring in the string
// "abcba"   ----->    output = 7
//21-7-23
public class NoOfPalindromeSubString {

	static boolean checkPalindrome(String s) {

		int st = 0, end = s.length() - 1;

		while (st < end) {
			if (s.charAt(st) != s.charAt(end))
				return false;

			st++;
			end--;
		}

		return true;
	}

	public static void main(String[] args) {

		String str = "abcba";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {

				if (str.length() == 1) {
					count++;
					continue;
				}

				if (checkPalindrome(str.substring(i, j)) == true) {
					count++;
					System.out.print(str.substring(i, j) + " ");
				}

			}
		}

		System.out.println("\nThe number of Palindrome Substring are " + count);

	}

}
