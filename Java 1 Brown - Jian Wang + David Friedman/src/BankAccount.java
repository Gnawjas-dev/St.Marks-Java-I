public class BankAccount {
	//name, interest, amount

	private String name;
	private int amount;
	private double interest;
	//acc w/ 3 parameters
	public BankAccount(String name, int amount, double interest) {
		this.name = name;
		this.amount = amount;
		this.interest = interest;
	}
	//acc w/ 2 parameters
	public BankAccount(String name, double interest) {
		this.name=name;
		this.amount=0;
		this.interest=interest;
	}
	
	public int getMoney() {
		return amount;
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
	//interest
	public void interest() {
		amount+=(amount*interest);
	}
	//toString
	public String toString() {
		return "Owner: " + name + " Money: " + amount + " Interest: " + interest*100 + "%";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
