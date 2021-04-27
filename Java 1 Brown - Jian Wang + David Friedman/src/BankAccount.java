public class BankAccount {
	//name, interest, amount

	private String name;
	private int amount;
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
//	public void interest() {
//		amount+=(amount*interest);
//	}
	//toString
	public String toString() {
		return "Owner: " + name + " Money: " + amount;
		// + " Interest: " + interest*100 + "%"
	}
	
	public void display() {
		System.out.println(Mom.toString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Mom = new BankAccount("Mom", 15000);
	}

}
