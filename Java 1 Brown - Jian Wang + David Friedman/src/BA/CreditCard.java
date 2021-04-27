package BA;

import java.util.Scanner;

public class CreditCard extends InterestAccount{
	private Scanner input = new Scanner(System.in);
	public CreditCard(String name,int amount, double interest) {
		super(name, amount, interest+0.01);
		// TODO Auto-generated constructor stub
	}

	public CreditCard(String name, double interest) {
		super(name, interest+0.01);
		// TODO Auto-generated constructor stub
	}
	
	public void interest() {
		double count = getMoney();
		super.interest();
		setMoney(getMoney()-10);
		if(getMoney()<100) {
			setMoney(count);
		}
	}
	
	public void withdraw(int amount) {
		double count = getMoney();
		super.withdraw(amount);
		if(getMoney()<100) {
			setMoney(count);
		}
	}
	
	public void start() {
		System.out.println("Hello, to your account info, type \"display\"");
		System.out.println("To deposit money into your account, type \"deposit\", if you want to withdraw instead, type \"withdraw\"");
		System.out.println("to add money based on the annual interest, type \"interest\"");
		
		String answer = input.next();
		
		if(answer.equals("display")) 
			System.out.println(toString());
		
		else if(answer.equals("deposit")) {
			System.out.println("how much do you want to deposit into the account?");
			int money = input.nextInt();
			deposit(money);
			System.out.println("money in account currently: $" + getMoney());
		}
		else if (answer.equals("withdraw")) {
			System.out.println("how much do you want to withdraw from the account?");
			int money = input.nextInt();
			withdraw(money);
			System.out.println("money in account currently: $" + getMoney());
		}
		
		else if (answer.equals("interest")) {
			interest();
			System.out.println("money in account currently: $" + getMoney());
		}
		
		else
			System.out.println("Not a valid request");
		
		start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard Sister = new CreditCard("Sister", 1000, 0.04);
		Sister.start();
	}

}
