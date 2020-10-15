/*First, please create a program that has the following:

A "starter" method. This method creates a scanner, then asks the user for a double. Then asks the user to type in one of the following keys (use next()): "s", "e", "d", or "w". Depending on the input, we will do (remember to use .equals for Strings!):
if "s" is pressed: print the square root of the double. (use Math.sqrt)
if "e" is pressed: print whether the double is even, odd, or not a whole number
if "d" is pressed, get a second double input. Print whether this new input is a factor of the first input.
if "w" is pressed, get a second double input. Print whether this new input is within 3 of the first input (above or below).
Respond properly if they type anything else.
Once the appropriate action is performed, repeat this method so that it asks for another number, then another key. (like I did in my example)
Create a main method that creates an object of your class, then runs your method. */
import java.util.Scanner;

public class ScannerBooleanIfs {
	//private variables to use throughout the system
	private Scanner input = new Scanner(System.in);
	private double x;
	private double x2;
	
	//gets the double and runs depending on what letter is pressed
	public void askDouble() {
		System.out.println("please enter a number (double)");
		double answer = input.nextDouble();
		x = answer;
		//explaining to user what is going on
		System.out.println("please enter s,e,d, or w.");
		System.out.println("if \"s\" is pressed: print the square root of the double. ");
		System.out.println("if \"e\" is pressed: print whether the double is even, odd, or not a whole number");
		System.out.println("if \"d\" is pressed, get a second double input. Print whether this new input is a factor of the first input.");
		System.out.println("if \"w\" is pressed, get a second double input. Print whether this new input is within 3 of the first input.");
		String answer2 = input.next();
		//decision
		if (answer2.equals("s")) {
			S_Method();
		}
		else if (answer2.equals("e")) {
			E_Method();
		}
		else if (answer2.equals("d")) {
			D_Method();
		}
		else if (answer2.equals("w")) {
			W_Method();
		}
		else{
			inputWrong();
		}
	}
	
	//square root
	public void S_Method() {
		System.out.println(Math.sqrt(x));
	}
	
	//Odd,Even,Or not Whole
	public void E_Method() {
		if (x*10%10 != 0) {
			System.out.println("not whole");
		}
		else if (x%2 == 1) {
			System.out.println("Odd");
		}
		else if (x%2 != 1) {
			System.out.println("Even");
		}
		else {
			System.out.println("Filler, Let's hope this will never get read by User");
		}
	}
	
	//Factor?
	public void D_Method() {
		System.out.println("User we need you to enter another double for the following method to work");
		double answer3 = input.nextDouble();
		x2 = answer3;
		if (x%x2 == 0) {
			System.out.println("The second input is a factor of the first input");
		}
		else {
			System.out.println("The second input is not a factor of the first input");
		}
	}
	
	//Check Within 3
	public void W_Method() {
		System.out.println("User we need you to enter another double for the following method to work");
		double answer3 = input.nextDouble();
		x2 = answer3;
		if ((x2-x <= 3 && x2-x >=0) || (x2-x >=-3 && x2-x <=0)) {
			System.out.println("the second input is within 3 units of the first input");
		}
		else {
			System.out.println("the second input is out of 3 units range of the first input");
		}
	}
	
	//inputError
	public void inputWrong() {
		System.out.println("Please follow the instructions, the first input is a number, the second one is the letters s,w,e,d,");
		System.out.println("and they are all small letters, no space, no \"\" on them, please try again");
		askDouble();
	}
	
	//running and initialization
	public static void main(String[] args) {
		
		ScannerBooleanIfs Runner = new ScannerBooleanIfs();
		Runner.askDouble();
		}
}
