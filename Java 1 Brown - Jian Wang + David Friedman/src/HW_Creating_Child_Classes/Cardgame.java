package HW_Creating_Child_Classes;

import java.util.Scanner;

public class Cardgame{
	
	private String cardtype;
	private String description;
	private int players;
	private Scanner input = new Scanner(System.in);
	private int ans;
	public Cardgame (String c, String d, int p) {
		this.cardtype=c;
		this.description=d;
		this.players=p;
	}
	
	public void addPlayer() {
		System.out.println("How many players do you want to add?");
		ans = input.nextInt();
		players+=ans;
	}
	
	public int getPlayer() {
		return players;
	}
	
	public int getAns() {
		return ans;
	}
	
	public void setP(int newP) {
		players = newP;
	}

	public String toString() {
		return "uses " + cardtype+ " and is " + description+" for " + players + "players";
	}
	
}
