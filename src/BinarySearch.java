
public class BinarySearch {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] listToCheck = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
			System.out.println(contains(listToCheck, 5));
			System.out.println(contains(listToCheck, 8));
			System.out.println(contains(listToCheck, 9));
			System.out.println(contains(listToCheck, 1));
	}
		
		
	public static boolean contains(int[] listElements, int checkedElement){
	
		boolean result = false;
		int startOfList = 0;
		int endOfList = listElements.length-1;
		int half = endOfList / 2; //3
		while (startOfList != endOfList){
			if (listElements[half] < checkedElement){
				startOfList = half + 1; //4
			}
			else{
				endOfList = half;			
			}
			half = (endOfList - startOfList)/2 + startOfList; //1			
		}
		if (listElements[half] == checkedElement){
			result = true;
			}
		return result;
	}

}
