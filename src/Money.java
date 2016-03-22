
public class Money {

	public static void main(String[] args) {
		int number=72875;
		System.out.println(count(number));
	}
	
	public static int count(int number){
		int counter=0;
		int[] notes=new int[] {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
		{/*végigpróbáljuk az összes címletet, és kivonjuk a kapott számból, 
		ha nagyobb a szám mint a címlet */
			
			for (int i=0; i<notes.length;i++)
			{
				while (number>=notes[i])
				{
					number-=notes[i];
					counter++;
				}
					
			}
		}
		
		return counter;
	}
	
}
