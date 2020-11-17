public class morewithnest {

	public void patternbox(int n) {
		for (int i=1; i<=n; i++){
		    for (int j=i; j<n+i; j++){
		    	System.out.print( j<=5 ? j : j-5); // condition ? true output : false output
		    	}
		    System.out.println();
		    }
	}
	public void triangle(int n) {
		for(int i=0; i < n; i++) {
			for(int j=0; j <= i; j++) {
			System.out.print("X");
			}
			System.out.println();
		}
	}
	
	public void findPower(int x, int y) {
		boolean power = false;
		int record = 0;
		for(int i=0; i<y; i++) {
			if(Math.pow(x, i)==y) {
				power = true;
				record = i;
				break;
				}
		}
		if (power)
		System.out.println(y + " is a power of " + x + ", and the exponent is " + record);
		if (power == false)
			System.out.println(y + " is not a power of " + x);
	}
	public static void main(String [] args) {
		morewithnest run = new morewithnest();
		run.patternbox(5);
		run.triangle(3);
		run.findPower(2, 63);
		run.findPower(2, 32);
		run.findPower(3, 27);
		run.findPower(9, 9);
		}
}