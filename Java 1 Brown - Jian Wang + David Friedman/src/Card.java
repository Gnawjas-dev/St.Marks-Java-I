
public class Card {
	private String suit;
	private int print;
	public Card(String suit, int print) {
		this.suit=suit;
		this.print=print;
	}
	public int getPrint() {
		return print;
	}
	public String getSuit() {
		return suit;
	}
	public void print() {
		System.out.println(suit + ", " + print);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
