package HW_Creating_Child_Classes;

import java.util.Scanner;

public class MTG extends Cardgame {
	
	private int life;
	private Scanner in = new Scanner(System.in);
	private int answer;
	
	public MTG(String c, String d, int p, int l) {
		// TODO Auto-generated constructor stub
		super(c, d, p);
		this.life = l;
	}
	
	public void resetPlayers() {
		super.setP(2);
	}
	
	public void changeLife() {
		System.out.println("How many lifes do you want to change? (negative numbers for subtraction)");
		answer = in.nextInt();
		life+=answer;
	}
	
	//adds double the amount
	public void addPlayer() {
		super.addPlayer();
		setP(getPlayer()+getAns());
	}
	
	public String toString() {
		String output = super.toString();
		return output + ", each player has " + life + " life";
	}
	
	//helper methods for grandchild
	public int Answer() {
		return answer;
	}
	public int getALife() {
		return life;
	}
	
	public void setLife(int x) {
		life = x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MTG x = new MTG("spells and creatures","magical cards duel to the death",2,20);
		x.addPlayer();
		x.changeLife();
		System.out.println(x);
		x.resetPlayers();
		x.setLife(20);
		System.out.println(x);
	}

}
