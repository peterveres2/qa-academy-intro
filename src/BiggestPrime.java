package training;

public class BiggestPrime {

	public static boolean isPrime(int number) {
		boolean canBePrime = true;
		for (int i = 2; i <= Math.sqrt(number) && canBePrime; i++) {
			if (number % i == 0) {
				canBePrime = false;
			}
		}
		return canBePrime;
	}
	
	public static int biggestPrime(int[] numbersToCheck) {
		int largestPrime = -1;
		int numbersInList = numbersToCheck.length;
		for (int i = 0; i < numbersInList; i++) {
			if (isPrime(numbersToCheck[i]) && numbersToCheck[i] > largestPrime) {
				largestPrime = numbersToCheck[i];
			}
		}
		return largestPrime;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {4, 5, 13};
		
		System.out.println(isPrime(4));
		System.out.println(biggestPrime(numbers));

	}

}
