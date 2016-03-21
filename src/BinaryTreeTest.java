
public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree root= new BinaryTree();
		root.value=10;
		BinaryTree childLeftFirst= new BinaryTree();
		childLeftFirst.value=20;
		BinaryTree childRightFirst= new BinaryTree();
		childRightFirst.value=50;
		
		BinaryTree childRightSecond= new BinaryTree();
		childRightSecond.value=40;
		BinaryTree childLeftSecond= new BinaryTree();
		childLeftSecond.value=60;
		
		root.left=childLeftFirst;
		root.right=childRightFirst;
		childLeftFirst.left=childLeftSecond;
		childRightFirst.right=childRightSecond;
		
		System.out.println(root);
	}

}
