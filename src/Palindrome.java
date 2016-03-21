/**
 * Definition: A palindrome is a string that reads the same forward and
 * backward. For example, "abcba" is a palindrome, "abab" is not. Please
 * implement this method to return true if the parameter is a palindrome and
 * false otherwise.
 * 
 * @author peter_veres2
 *
 */
public class Palindrome {

	public static void main(String[] args) {

		String textToCheck = "Not";
		System.out.println(textToCheck + " : " + isPalindrome(textToCheck));

		textToCheck = "NoN";
		System.out.println(textToCheck + " : " + isPalindrome(textToCheck));

		textToCheck = "Non";
		System.out.println(textToCheck + " : " + isPalindrome(textToCheck));

		textToCheck = "abcba";
		System.out.println(textToCheck + " : " + isPalindrome(textToCheck));

		textToCheck = "abab";
		System.out.println(textToCheck + " : " + isPalindrome(textToCheck));

		textToCheck = " ";
		System.out.println(textToCheck + " : " + isPalindrome(textToCheck));

		textToCheck = "";
		System.out.println(textToCheck + " : " + isPalindrome(textToCheck));

	}

	static boolean isPalindrome(String str) {
		if (str.length() == 0) {
			return true;
		}
		int lastIndex = str.length() - 1;
		for (int i = 0; i <= (str.length()) / 2; i++) {
			if (str.charAt(i) != str.charAt(lastIndex - i)) {
				return false;
			}
		}
		return true;
	}

}
