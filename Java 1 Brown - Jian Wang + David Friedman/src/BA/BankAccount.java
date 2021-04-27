package BA;

import java.util.Scanner;

public class BankAccount {
	//name, interest, amount

	private String name;
	private int amount;
	private Scanner input = new Scanner(System.in);
//	private double interest;
	
	
	//acc w/ 3 parameters
	public BankAccount(String name, int amount) {
		this.name = name;
		this.amount = amount;
//		this.interest = interest;
	}
	
	
	//acc w/ 2 parameters
	public BankAccount(String name) {
		this.name=name;
		this.amount=0;
//		this.interest=interest;
	}
	
	public int getMoney() {
		return amount;
	}
	public String getName() {
		return name;
	}
	public void setMoney(double newamount) {
		amount = (int) newamount;
	}
	//deposit
	public void deposit(int amount) {
		this.amount+=Math.abs(amount);
	}
	//withdraw
	public void withdraw(int amount) {
		this.amount-=amount;
		if(this.amount<0) {
			System.out.println("Not enough money in account");
			this.amount+=amount;
		}
		
	}

	//toString
	public String toString() {
		return "Owner: " + name + " Money: " + amount;
		// + " Interest: " + interest*100 + "%"
	}
	
//runner
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
		else
			System.out.println("Not a valid request");
		
		start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Mom = new BankAccount("Mom", 15000);
		Mom.start();
	}

}
