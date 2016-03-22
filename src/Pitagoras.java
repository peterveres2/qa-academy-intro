
public class Pitagoras {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		for(int i=0; i <= 1000; i++){
			for(int j=0; j <= 1000; j++){
					if(i*i+j*j==(1000-i-j)*(1000-i-j)){
						System.out.println(i + " " + j + " " + (1000-i-j));
					}
			}
		}
		System.out.println(System.currentTimeMillis()-time);
	}

}
