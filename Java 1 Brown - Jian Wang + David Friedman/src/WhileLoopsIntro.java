import java.util.Scanner;

public class WhileLoopsIntro {
	
	private Scanner input = new Scanner(System.in);
	
	//linear while loop runtime, definite finite loop
	public void betweenInts () {
		
		System.out.println("Please enter a integer");
		int x1 = input.nextInt();
		System.out.println("Please enter another integer");
		int x2 = input.nextInt();
		
		int count = x1;
		
		while (count <= x2) {
			
			System.out.println(count);
			count ++;
			
		}
		
		count = x2;
		
		while (count <= x1) {
			
			System.out.println(count);
			count ++;
			
		}
		
	}
	
	//constant while loop runtime, definite finite loop
	public void exponential() {
		
		System.out.println("Please enter a double");
		double base = input.nextDouble();
		System.out.println("Please enter another double");
		double coefficient = input.nextDouble();
		
		int power = 0;
		
		while (power<=5) {
			
			System.out.println(coefficient*(Math.pow(base, power)));
			power++;
			
		}
		
	}
	
	//definite finite loop
	public void squareroot() {
		
		System.out.println("Please enter a integer");
		int number = input.nextInt();
		int count = 0;
		
		while (count <= number) {
			
			if (count*count == number) {
				
				System.out.println("the square root of" + number + " is " + count);
				break;
				
			}
			
			count++;
			
		}
		
		if (count*count != number) {
			
			System.out.println("there is no square root");
			
		}
				
	}
	
	//main method, for running the methods, constant, definite finite
	public void main(String[]args) {
		
		WhileLoopsIntro runner = new WhileLoopsIntro();
		runner.betweenInts();
		runner.exponential();
		runner.squareroot();
		
	}
	
}
