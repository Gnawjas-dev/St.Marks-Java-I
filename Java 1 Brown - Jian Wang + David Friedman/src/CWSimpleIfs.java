//Jason Wang
public class CWSimpleIfs {
	//A method that takes as parameter an integer, and determines if it is positive. If positive, print "yes", otherwise print "no".
	public void testPositive (int x) {
		
		if (x > 0) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
			
		}
	}
	
	//A method that takes an integer as parameter, and determines if it is even or odd. (Use one of your 5 operators to do this easily)
	public void testEvenOdd (int x) {
		if (x%2 == 1) {
			System.out.println("Odd");
			
		}
		else {
			System.out.println("Even");
			
		}
	}
	
	//A method that takes a character as parameter, and determines if it is uppercase, lowercase, or neither. 
	public void letterUpLow (char u) {
		
		if ((int)u < 91) {
			System.out.println("Upper");	
		}
		else if ((int)u >= 97) {
			System.out.println("lower");
		}
		else {
			System.out.println("neither");
		}
	}
	
	//A method that takes an integer as parameter, and determines if it is a multiple of 10.
	public void multipleten (int x){
		
		if (x%10 == 0) {
			System.out.println("multipe of ten");
		}
		else {
			System.out.println("not multiple of ten");
		}
		
	}
	
	//A method that takes three doubles as parameters, and prints out the biggest of the three (this is a maximum function).
	public void biggestThree(double x1, double x2, double x3) {
		//if x2 is smallest
		if (x1 > x2) {
			if (x1 > x3) {
				System.out.println(x1);
			}
			else {
				System.out.println(x3);
			}
		}
		else {
			if (x2 > x3) {
				System.out.println(x2);
			}
			else {
				System.out.println(x3);
			}
		}
	}
	
	//challenge
	public void challenge (double x) {
		
		if (x*10%10==0) {
			System.out.println("whole number");
		}
		else {
			System.out.println("not whole");
		}
		
	}
	public static void main(String[] args) {
		
		CWSimpleIfs tester = new CWSimpleIfs();
		tester.testPositive (1);
		tester.testEvenOdd (6);
		tester.letterUpLow ('A');
		tester.multipleten(15);
		tester.biggestThree (15.9,20.7,20.9);
		tester.challenge(50.8);
	}
}
