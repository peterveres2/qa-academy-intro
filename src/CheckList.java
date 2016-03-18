
public class CheckList {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] listToCheck = new int[] { 1, 2, 3, 4, 5, 6, 7 };
			assertTrue(checkList(listToCheck, 5));
			assertTrue(checkList(listToCheck, 8));
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
	
	static void assertTrue(boolean value) {
		if (!value) {
			throw new RuntimeException();
		}
	}

	static void assertFalse(boolean value) {
		assertTrue(!value);
	}
	
}
  