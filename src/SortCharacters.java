package training;

import java.util.Arrays;

public class SortCharacters {

	
	public static void main(String[] args) {
		String text = "AABCEEE";
		
		// megszámolni a karaketereket
		int[] numberOfCharacters = new int[255];
		for (int i = 0; i < text.length(); i++) {
			numberOfCharacters[text.charAt(i)]++;
		}
		System.out.println(Arrays.toString(numberOfCharacters));

		// alapértelmezett sorrend
		int[] order = new int[255]; // order[hanyadik] -> 'a'
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			boolean present = false;
			for (int j = 0; j < count; j++) {
				if (order[j] == text.charAt(i)) {
					present = true;
				}
			}
			if (!present) {
				order[count] = text.charAt(i);
				count++;
			}
		}
		System.out.println(Arrays.toString(order));

		// rendezés
		for (int i = 1; i < count; i++) {
			int j = i;
			while (j > 0 && numberOfCharacters[order[j - 1]] < numberOfCharacters[order[j]]) {
				int temp = order[j - 1];
				order[j - 1] = order[j];
				order[j] = temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(order));

		// kiiratás
		for (char i = 0; i < count; i++) {
			for (int j = 0; j < numberOfCharacters[order[i]]; j++) {
				System.out.print((char) order[i]);
			}
		}
		
	}
	
}
