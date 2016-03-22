

public class Queens {
	
	static int SIZE = 8; 

	public static boolean line(int i, int j, int k, int l) {
		return j == l;
	}
	
	public static boolean column(int i, int j, int k, int l) {
		return i == k;
	}
	
	public static boolean diagonal(int i, int j, int k, int l) {
		return k - i == l - j;
	}
	
	public static boolean reverseDiagonal(int i, int j, int k, int l) {
		return k - i == j - l;
	}
	
	public static int search() {
		int count = 0;
		int column = 0;
		int[] pos = new int[SIZE];
		while (column >= 0) {
			if (pos[column] == SIZE) {
				pos[column] = 0;
				column--;
				if (column >= 0) {
					pos[column]++;
				}
			} else {
				if (check(pos, column)) {
					if (column == SIZE - 1) {
						count++;
						pos[column]++;
					} else {
						column++;
					}
				} else {
					pos[column]++;
				}
			}
		}
		return count;
	}

	private static boolean check(int[] pos, int queens) {
		boolean ok = true;
		for (int i = 0; i <= queens; i++) {
			for (int j = i + 1; j <= queens; j++) {
				boolean line = line(i, pos[i], j, pos[j]);
				boolean column = column(i, pos[i], j, pos[j]);
				boolean diagonal = diagonal(i, pos[i], j, pos[j]);
				boolean reverseDiagonal = reverseDiagonal(i, pos[i], j, pos[j]);
				if (line || column || diagonal || reverseDiagonal) {
					ok = false;
				}
			}
		}
		return ok;
	}
	
	public static void main(String[] args) {
//		System.out.println(line(7, 3, 5, 3));
//		System.out.println(column(3, 7, 3, 14));
//		System.out.println(diagonal(1, 1, 3, 3));
//		System.out.println(diagonal(3, 3, 1, 1));
//		System.out.println(diagonal(0, 1, 3, 3));
//		System.out.println(reverseDiagonal(3, 0, 0, 3));
//		System.out.println(reverseDiagonal(0, 3, 3, 0));
//		System.out.println(reverseDiagonal(1, 3, 3, 0));
		System.out.println(search());
	}
	
}
