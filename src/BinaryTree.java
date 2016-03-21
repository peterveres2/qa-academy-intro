
public class BinaryTree {

	int value;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree(int value) {
		this.value = value;
	}

	public String toString() {
		String sumUp = "";
		if (left != null) {
			sumUp += left;
		}
		sumUp += "<" + value + ">";

		if (right != null) {
			sumUp += right;
		}
		return sumUp;
	}

	public void add(int newValue) {
		if (newValue < value) {
			if (left == null) {
				left = new BinaryTree(newValue);
			} else {
				left.add(newValue);
			}
		} else {
			if (right == null) {
				right = new BinaryTree(newValue);
			} else {
				right.add(newValue);
			}
		}
	}
	
	public boolean contains(int seekedValue){
		if (seekedValue == value) {
			return true;
		}
		else if (seekedValue < value && left != null) {
			return left.contains(seekedValue);
		}
		else if (seekedValue > value && right != null){
			return right.contains(seekedValue);
		}
		else {
			return false;
		}
	}
}
