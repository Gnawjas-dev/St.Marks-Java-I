//Take two numbers x and y as parameters. Print out a rectangle of X's that is x wide and y tall. 
//For example, if x = 3 and y = 2, we would print:       XXX
//														 XXX
//Take a number x as parameter. Print out the digits of this number, one by one (one's digit first, then ten's digit, and so on).
//For example, if x = 285, we would print: 5, 8, 2

public class FridayWarmUp {
	
	public void xWideyTall(int x, int y) {
		for (int i=0; i<y; i++) {
			for (int j=0; j<x; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

	public void digits(int n) {
		
		while(n>0) {
			
			System.out.print(n%10 + ", ");
			n/=10;
			
		}
		
	}
	
	public void singleFactors(int n) {
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				System.out.print(i + ", ");
			}
		}
		
	}
	
	public void factors(int n) {
		
		for(int i=1; i<=n; i++) {
			singleFactors(i);
			System.out.println();
		}
		
	}
	
	public static void main(String [] args) {
		FridayWarmUp run = new FridayWarmUp();
		run.factors(8);
		run.xWideyTall(7, 3);
		run.digits(500);
		
	}
}
