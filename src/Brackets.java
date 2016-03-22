package training;

public class Brackets {

	public static boolean isBalancedBrackets(String brackets) {
		int counter = 0;
		for (int i = 0; i < brackets.length() && counter >= 0; i++) {
			if (brackets.charAt(i) == '(') {
				counter++;
			} else if (brackets.charAt(i) == ')') {
				counter--;
			}
		}
		return (counter == 0);
	}

	public static void main(String[] args) {
		String bracketsStrange = ")(";
		String bracketsMoreOpening = "((()";
		String bracketsMoreClosing = "(())())";
		String bracketsTrue = "((())())";
		System.out.println(isBalancedBrackets(bracketsStrange));
		System.out.println(isBalancedBrackets(bracketsMoreOpening));
		System.out.println(isBalancedBrackets(bracketsMoreClosing));
		System.out.println(isBalancedBrackets(bracketsTrue));
	}

}
