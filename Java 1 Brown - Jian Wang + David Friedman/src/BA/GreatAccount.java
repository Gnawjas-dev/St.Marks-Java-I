package BA;

import java.util.Scanner;

public class GreatAccount extends BankAccount{
	public GreatAccount(String name, int amount) {
		super(name, amount);
		// TODO Auto-generated constructor stub
	}
	public GreatAccount(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	private int threeTimes;
	private int Month=0;
	private boolean[] year = new boolean [12];
	private boolean check=false;
	private Scanner input = new Scanner(System.in);

	public void NextMonth() {
		if(threeTimes==0) {
			year[Month]=true;
		}
		threeTimes=0;
		Month++;
	}
	
	public void withdraw(int amount) {
		if(threeTimes<3)
			super.withdraw(amount);
		else
			System.out.println("you have already withdrawed 3 times");
		threeTimes++;
	}
	
	public void start() {
		System.out.println("Hello, to your account info, type \"display\"");
		System.out.println("To deposit money into your account, type \"deposit\", if you want to withdraw instead, type \"withdraw\"");
		System.out.println("You can only withdraw 3 times a month, type \"Next\" to go the next month");
		
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
		else if (answer.equals("Next")) {
			NextMonth();
		}
		else
			System.out.println("Not a valid request");
		for(int i=0;i<12;i++) {
			if(year[i])
				check=true;
			else
				check=false;
		}
		if(check) {
			System.out.println("You have spent 12 months without withdrawing money, you are rewarded with doubled balance. ");
			setMoney(2*getMoney());
		}
		start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatAccount Jason = new GreatAccount("Jason");
		Jason.start();
	}

}
