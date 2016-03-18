
public class CheckList {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] listToCheck = new int[] { 1, 2, 3, 4, 5, 6, 7 };
			System.out.println(checkList(listToCheck, 5));
			System.out.println(checkList(listToCheck, 8));
	}
		
		
	public static boolean checkList(int[] listElements, int checkedElement){
	
		boolean result = false;
		for(int i = 0; i < listElements.length; i++){
			if (checkedElement == listElements[i]){
				result = true;
				break;
			}
		}	
		return result;
	}

}
