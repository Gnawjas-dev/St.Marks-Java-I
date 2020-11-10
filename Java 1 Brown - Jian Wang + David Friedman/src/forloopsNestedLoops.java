import java.util.Scanner;

public class forloopsNestedLoops {
	
	private Scanner in = new Scanner(System.in);
	
	public void easy1() {
		for (int x = 'A'; x<='Z'; x += 1) {
			System.out.println((char)x);
		}
	}
	
	public void easy2() {
		System.out.println("I will add from 1 to a number that you choose");
		int n = in.nextInt();
	    int result = 0; 
	    for (int x = 1; x <= n; x++) {
	        result += add(x);
	        }
	    System.out.println("The sum of all the numbers from 1 to n is " + result);
	    }
	      
	    // A utility function to compute sum 
	    // of digits in a given number x
	public int add(int x){
		int sum = 0;
		while (x != 0){
			sum += x % 10;
			x = x / 10;
			}
		return sum;
		}
	
	
	public void easy3() {
		System.out.println("The more water I soak, the more I dry, what am I?");
		String answer = in.next();
		for (int i=0; i<=10; i++) {
			if(answer.equals("Towel")||answer.equals("towel")) {
				System.out.println("You guessed it! The answer is " + answer);
				break;
			}
			System.out.println("Wrong, try again!");
			i--;
			answer = in.next();
		}
	}
	
	public void allPrimeNum() {
		System.out.println("Enter an integer for the parameter");
		int x = in.nextInt();
		for (int j = 1; j <= x; j++) {
			allPrimeNum2(j);
		}
	}
	public void allPrimeNum2(int j) {
		boolean isPrime = true;
		for (int i = 2; i<j; i++) {
			if (j%i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(j + "prime");
		}
	}
	
	public void multiplytable() {
		int x;
		int y;
		for (x=1; x<=12; x++)
		{
		    for (y=1; y<=12; y++)
		    {
		        System.out.print(x*y+" ");  
		    }
		    System.out.println();
		}   
	}
	
	public static void main(String [] args) {
		forloopsNestedLoops run = new forloopsNestedLoops();
		run.easy1();
		run.easy2();
		run.easy3();
		run.allPrimeNum();
		run.multiplytable();
	}
}
