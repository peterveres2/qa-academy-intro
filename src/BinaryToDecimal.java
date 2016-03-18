public class BinaryToDecimal {

	public static void main(String[] args) {

		String binary1 = "0111";
		String binary2 = null;
		String binary3 = "1234";
		String binary4 = "12ab";
		System.out.println(binaryToDecimal(binary1));
		System.out.println(binaryToDecimal(binary2));
		System.out.println(binaryToDecimal(binary3));
		System.out.println(binaryToDecimal(binary4));
	}
	
	public static int binaryToDecimal (String binary) {
		int number = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {
			if ('1' == binary.charAt(i)) {
				number += Math.pow(2, binary.length() - i - 1);
			} else if ('0' != binary.charAt(i)) {
				throw new RuntimeException("not binary value");
			}
		}
		return number;
	}

}
