public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Zoli");
		names.add("Peter");
		names.add("Zoli");
		names.add("Zsófi");
		names.add("Zoli");
		System.out.println(names.get(3));
		
		System.out.println(names.toString());
		names.remove("Zoli");
		System.out.println(names.toString());
		greet(names);
		
		
	}
	
	/**
	 * Say hello to all my friends, but greets everyone only once, even if
	 * he/she appears more than once in the list.
	 * For example: 
	 * <pre>
	 * names.add("Zoli");
	 * names.add("Peter");
	 * names.add("Zoli");
	 * names.add("Zsófi");
	 * </pre>
	 * Result:
	 * <pre>
	 * Hello Zoli!
	 * Hello Peter!
	 * Hello Zsófi!
	 * </pre>
	 * 
	 */
	public static void greet(LinkedList friends) {
		String[] greeted = new String[friends.size()];
		int counter = 0;
		for (int i = 0; i < friends.size(); i ++) {
			String actual = friends.get(i);
			boolean contains = false;
			for (int j = 0; j < counter && !contains; j++) {
				if (greeted[j].equals(actual)) {
					contains = true;
				}
			}
			if (!contains) {
				System.out.println("Hello " + actual + "!");
				greeted[counter] = actual;
				counter++;
			
			}
		}
		
	}

}
