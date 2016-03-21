
public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree root= new BinaryTree(50);
		root.add(40);
		root.add(60);
		root.add(30);
		root.add(70);
		root.add(70);
		root.add(20);
		root.add(50);
		root.add(80);
		
		


		
		System.out.println(root);
		System.out.println(root.contains(10));
		System.out.println(root.contains(50));
		System.out.println(root.contains(60));
	}

}
