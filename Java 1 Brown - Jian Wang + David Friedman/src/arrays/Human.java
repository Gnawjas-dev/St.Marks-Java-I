package arrays;


import java.util.Scanner;

public class Human {
	private int age;
	private String name;
	private String race;
	private boolean vote = false;
	
	public Human(int a, String n, String r) {
		
		this.age=a; this.name = n; this.race = r;
		
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRace() {
		return race;
	}
	
	public String vote() {
		if(vote)
			return " can vote";
		else
			return " cannot vote";
	}
	
	public void getOlder() {
		age++;
	}
	
	public void changeName(String newName) {
		name = newName;
	}
	
	public void changeRace(String newRace) {
		race = newRace;
	}

	public String toString() {
		return "name: " + name + " age: " + age + " race: " + race;
	}
	
	public void checkvote(int year) {
		if (year%4==0) {
			if(age<18) {
				vote=false;
			}
			else
				vote=true;
		}
		else {
			vote=false;
		}
	}
	
	
	public static void main(String[]args) {
		//create a human with name and age
		
	}
}
