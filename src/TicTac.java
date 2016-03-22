
public class TicTac {
	public static void main(String[] args) {
		String input = "142536";
		String x = "";
		String o = "";
		for(int i = 0; i < input.length(); i++) {
			if(i % 2 == 0) {
				x+=input.charAt(i);
			}
			else {
				o+=input.charAt(i);
			}
		}
		String [] win = {"123","456","789","147","258","369","159","357"};
		for(int i = 0; i < win.length; i++) {
			int counterx = 0;
			int countery = 0;
			for(int j = 0; j < win[i].length(); j++) {
				if(x.indexOf(win[i].charAt(j)) >= 0) {
					counterx++;
				}
				else if(o.indexOf(win[i].charAt(j))>=0) {
					countery++;
				}
				
			}
			if (counterx == win[i].length()){
				System.out.println("x wins");
			}
			if (countery == win[i].length()) {
				System.out.println("y wins");
			}
		}
	}
}
