import java.util.Scanner;

public class BankRunner {
	BankAccount Mom = new BankAccount("Mom", 15000, 0.04);
	private Scanner input = new Scanner(System.in);
	public void start() {
		System.out.println("Hello, to your account info, type \"display\"");
		System.out.println("To deposit money into your account, type \"deposit\", if you want to withdraw instead, type \"withdraw\"");
		System.out.println("to add money based on the annual interest, type \"interest\"");
		
		String answer = input.next();
		
		if(answer.equals("display")) 
			System.out.println(Mom.toString());
		
		else if(answer.equals("deposit")) {
			System.out.println("how much do you want to deposit into the account?");
			int money = input.nextInt();
			Mom.deposit(money);
			System.out.println("money in account currently: $" + Mom.getMoney());
		}
		else if (answer.equals("withdraw")) {
			System.out.println("how much do you want to withdraw from the account?");
			int money = input.nextInt();
			Mom.withdraw(money);
			System.out.println("money in account currently: $" + Mom.getMoney());
		}
		
		else if (answer.equals("interest")) {
			Mom.interest();
			System.out.println("money in account currently: $" + Mom.getMoney());
		}
		
		else
			System.out.println("Not a valid request");
		
		start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankRunner run = new BankRunner();
		run.start();
	}

}
