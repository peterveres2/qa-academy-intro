import java.util.Arrays;

public class SumListElements {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println(sum(array));
		System.out.println(sumRecursive(array));
	}
	
	public static int sum(int[] arrayToSum){
		int result = 0;
		for (int i = 0; i < arrayToSum.length; i++){
			result += arrayToSum[i];
		}
		return result;
	}
	
	public static int sumRecursive(int[] arrayToSum, int actualPosition){
		int result = 0;
		if (actualPosition < arrayToSum.length ){
			result = arrayToSum[actualPosition] + sumRecursive(arrayToSum,actualPosition+1);
		}
		return result;
	}
	
	public static int sumRecursive(int[] arrayToSum){
		return sumRecursive(arrayToSum,0);
	}
}
