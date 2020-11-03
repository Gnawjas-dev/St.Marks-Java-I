import java.util.Scanner;

//Jason Wang
public class moreWhileLoops {
	
	private Scanner input = new Scanner(System.in);
	
	//Easy 1
	public void refreshUntilCorrect() {
		int x = 5;
		System.out.println("I am thinking of a number between 1 to 10, guess the number to proceed");
		int answer = input.nextInt();
		while (answer != 5) {
			System.out.println("wrong, guess again");
			answer = input.nextInt();
		}
	}
	
	//Easy 2
	public void nCount() {
		System.out.println("pick a number, i will print out all numbers between it and it's negative");
		int n = input.nextInt();
		int count = n*-1;
		while (count <= n) {
			System.out.println(count);
			count++;
		}
	}
	
	//Easy 3
	public void hiRepeat() {
		System.out.println("How many times do you want me to say hi?");
		int hiNum = input.nextInt();
		int count = 1;
		while (count <= hiNum) {
			System.out.println("Hi");
			count++;
		}
	}
	//Medium 1
	public void factorial() {
		System.out.println("Give me a number, I will print out its factorial");
		int n = input.nextInt();
		int count = n;
		int product = 1;
		while (count >= 1) {
			product = product * count;
			count--;
		}
		System.out.println("the factorial is " + product);
	}
	
	//Medium 2
	public void gameRepeat() {
		System.out.println("Do you want to play this game? Yes or No?");
		while (input.next() .equals ("Yes") || input.next() .equals ("yes") ) {
			System.out.println("Do you want to play this game? Yes or No?");
			if (input.next().equals("no")||input.next().equals("No")) {
				break;
			}
		}
		System.out.println("Game Over, haha you lost.");
	}
		
	//Hard 3
	public void prime() {
		System.out.println("Give me a number, and I will tell you if its prime");
		int x = input.nextInt();
		int count = 2;
		while (x % count != 0) {
			count++;
			if (count == x) {
				count++;
			}
			if (x%count == 0) {
				break;
			}
		}
		System.out.println("It is not a prime number, it is divisible by " + count);
	}
	//running 6 methods
	public static void main(String[]args) {
		moreWhileLoops runner = new moreWhileLoops();
		runner.refreshUntilCorrect();
		runner.nCount();
		runner.hiRepeat();
		runner.factorial();
		runner.gameRepeat();
		runner.prime();
	}
}
