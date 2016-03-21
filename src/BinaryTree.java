
public class BinaryTree {

	int value;
	BinaryTree left;
	BinaryTree right;

	public String toString() {
		String sumUp="";
		if (left !=null){
			sumUp += left;
		}
		sumUp += "<" + value + ">" ;
		
		if (right!=null){				
			sumUp +=right;
		}
		return sumUp;
	}
}
