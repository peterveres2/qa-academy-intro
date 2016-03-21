/**
 * Please implement this method to return the word count in a given String.
 * Assume that the parameter String can only contain spaces and alphanumeric
 * characters.
 * 
 * @author peter_veres2
 *
 */
public class WordCount {

	public static void main(String[] args) {
		String textToCheck = "Not allowed operation";
		System.out.println(wordCount(textToCheck));

		textToCheck = " Not allowed  operation";
		System.out.println(wordCount(textToCheck));

		textToCheck = " Not    allowed  operation 685";
		System.out.println(wordCount(textToCheck));

		textToCheck = " Not 4   allowed  ew operation 685";
		System.out.println(wordCount(textToCheck));

		textToCheck = "";
		System.out.println(wordCount(textToCheck));

		textToCheck = "   ";
		System.out.println(wordCount(textToCheck));

	}

	static int wordCount(String str) {
		int wordCount = 0;
		char prevChar = ' ';
		char actualChar;
		for (int i = 0; i < str.length(); i++) {
			actualChar = str.charAt(i);
			if ((actualChar != ' ') && (prevChar == ' ')) {
				wordCount++;
			}
			prevChar = actualChar;
		}
		return wordCount;
	}

}
