public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Zoli");
		names.add("Peter");
		names.add("Zoli");
		names.add("Zsófi");
		names.add("Zoli");
		
		System.out.println(names.toString());
		names.remove("Zoli");
		System.out.println(names.toString());
		
		
	}

}
