import java.util.Arrays;


public class GameWithNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] inputArr = {1,5,7,9,13,13,20};
		int[] inputArr = {1,1,5,7,9,13,13,13,20,20,20};
		removeDup(inputArr);
		
		System.out.println(Arrays.toString(inputArr));
		
	}
	
	public static void removeDup(int[] arr){
		int counter = 0;
		
		for(int i = 1; i - counter < arr.length - counter; i++){
			if(arr[i-counter-1] == arr[i-counter]){
				for(int k = i-counter; k < arr.length; k++){
					arr[k-1] = arr[k];
				}
				counter++;
			}	
		}
		for(int i = arr.length-1; i >= arr.length-counter; i--){
			arr[i] = 0;
		}
	}

}
