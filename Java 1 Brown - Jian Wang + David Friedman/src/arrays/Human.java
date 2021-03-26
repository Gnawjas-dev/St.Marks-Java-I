//Jason Wang
public class Human {
private int age;
private char gender;
private boolean vote;
private boolean tdshots;
private boolean discount;
//sets age and copies input to age
	public void setAge(int x) {
		
		age = x;
		
	}
//setting gender
	public void setGender(char y) {
		
		gender = y;
		
	}
//voteing yes/no
	public void vote() {
		
		if (age >= 18) {
			vote = true;
		}
		else {
			vote = false;
		}
		
		System.out.println(vote);
	}
//TD shot
	public void tetanusWhen() {
		
		if (age == 0 || age%4==0) {
			tdshots = true;
		}
		else {
			tdshots = false;
		}
		System.out.println(tdshots);
	}	
//printtoddler
	public void printToddler() {
		
		
		if (age <= 4) {
			if (gender == 'g') {
				System.out.println("toddler girl");
				}
			if (gender == 'b') {
				System.out.println("toddler boy");
				}
		else {
			System.out.println("not a toddler");
			}
		}
	}
//discounts
	public void discount() {
		
		if (age > 65 || age < 12) {
			discount = true;
		}
		else {
			discount = false;
		}
		System.out.println(discount);
		
	}
//teen
	public void teenager() {
		
		if (age >12 && age < 19) {
			System.out.println("Teenager");
			
		}
		else {
			System.out.println("not teenager");
		}
	}



public static void main(String[] args) {
	Human tester = new Human();
	tester.setAge (17);
	tester.setGender ('g');
	tester.vote();
	tester.tetanusWhen();
	tester.printToddler();
	tester.discount();
	tester.teenager();}
}