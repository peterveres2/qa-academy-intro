import java.util.Arrays;

public class Reverse {

	// metodusnev kisbetuvel kezdodik
	public static void reverse(int[] arrayToReverse) {
		int temp = 0;
		for (int i = 0; i < arrayToReverse.length / 2; i++) {
			temp = arrayToReverse[i]; 
			arrayToReverse[i] = arrayToReverse[arrayToReverse.length - 1 - i];
			arrayToReverse[arrayToReverse.length - 1 - i] = temp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToReverse = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		reverse(arrayToReverse);
		System.out.println(Arrays.toString(arrayToReverse));

	}

}
