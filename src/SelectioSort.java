import java.util.Arrays;

public class SelectioSort {

	static void sortArray(int[] arrayToSort) {
		int elementsToCheck = arrayToSort.length;
		int biggest = arrayToSort[0];
		int indexOfBiggest = 0;
		int temp = 0;
		
		while (elementsToCheck > 0) {
			for (int i = 0; i < elementsToCheck; i++) {
				if (arrayToSort[i] > biggest) {
					biggest = arrayToSort[i];
					indexOfBiggest = i;
				}
			}
			if (arrayToSort[elementsToCheck-1] < biggest) {
				temp = arrayToSort[elementsToCheck-1];
				arrayToSort[elementsToCheck-1] = arrayToSort[indexOfBiggest];
				arrayToSort[indexOfBiggest] = temp;				
			}
			biggest = arrayToSort[0];
			indexOfBiggest = 0;
			elementsToCheck--;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {54,3,87,11,42};
		int[] array2 = {3,54,87,11,42};
		int[] array3 = {3,54,87,11,3,42};
		
		sortArray(array);
		System.out.println(Arrays.toString(array));
		sortArray(array2);
		System.out.println(Arrays.toString(array2));
		sortArray(array3);
		System.out.println(Arrays.toString(array3));
		

	}

}
