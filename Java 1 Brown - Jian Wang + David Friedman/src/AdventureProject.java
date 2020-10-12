//Jason, make it pokemon XD or tf2 dodgeball
//Borrowed main structure from Mr. Friedman's example
import java.util.Scanner;
public class AdventureProject {
	private Scanner input = new Scanner(System.in);
	public void introduction() {
		System.out.println("You are a pokemon trainer in Kanto, today you went to Dr. Oak's lab to choose your first pokemon!");
		System.out.println("What is your name, young man?");
		String answer = input.next();
		System.out.println("Ah," + answer + " pick your first pokemon today! We have");
		firstChoice();
	}
	//first choice
	public void firstChoice() {
		System.out.println("a: Charmander");
		System.out.println("b: Squirtle");
		System.out.println("Unfortunately Bulbasaur was already taken.");
		String answer = input.next();
		if (answer.equals("a")) {
			fireStoryline();
		}
		else if (answer.equals("b")) {
			waterStoryline();
		}
		else if (answer.equals("c")) {
			inputError();
		}
		else {
			inputError();
		}
	}
	
	//fireStorylineStarts here
	public void fireStoryline() {
		
		System.out.println("A challenger has invited you to a friendly duel, do you want to:");
		System.out.println("a: accept the challenge?");
		System.out.println("b: decline the challenge?");
		String answer = input.next();
		
		if (answer.equals("a")) {
			ChampionRoute();
		}
		else if (answer.equals("b")) {
			NormalRoute();
		}
		else {
			inputError();
		}
	}
	
	//waterStorylineStarts here
	public void waterStoryline() {
		
		System.out.println("A challenger has invited you to a friendly duel, do you want to:");
		System.out.println("a: accept the challenge?");
		System.out.println("b: decline the challenge?");
		String answer = input.next();
		
		if (answer.equals("a")) {
			ChampionRoute();
		}
		else if (answer.equals("b")) {
			NormalRoute();
		}
		else {
			inputError();
		}
	}
	//alternate route
	public void NormalRoute() {
		
		System.out.println("You brought your pokemon home but settled for a peaceful life, away from battles and fame.");
		System.out.println("Living as a recluse, one day you wondered if you should try winning for once." );
		System.out.println("a: Go back and fight for GLORY?");
		System.out.println("b: Live a peaceful life");
		String answer = input.next();
		
		if (answer.equals("a")) {
			ChampionRoute();
		}
		else if (answer.equals("b")) {
			System.out.println("You settled for a peaceful life and had a loving family. Your son fought for you and became");
			System.out.println("the regional champion, your dreams as a pokemon trainer was set in place.");
		}
		else {
			inputError();
		}
	}
	//Champroute here
	public void ChampionRoute() {
		
		System.out.println("As a successful trainer you will need to take constant care and help your pokemon, do you want to");
		System.out.println("a: play with your pokemon?");
		System.out.println("b: put your pokemon to harsh training?");
		String answer = input.next();
		
		if (answer.equals("a")) {
			C_RouteTwo();
		}
		else if (answer.equals("b")) {
			FailRoute();
		}
		else {
			inputError();
		}
	}
	
	//Champ continuing for now
	public void C_RouteTwo() {
		
		System.out.println("Congratulations! You defeated your first opponent! Your pokemon is changing! Do you want to give");
		System.out.println("a fossil containing the ancestry DNA to help?");
		System.out.println("a: Help your pokemon with the fossil");
		System.out.println("b: Do nothing and stop your pokemon from evolving");
		String answer = input.next();
		
		if (answer.equals("a")) {
			C_RouteThree();
		}
		else if (answer.equals("b")) {
			FailRoute();
		}
		else {
			inputError();
		}
	}
	
	//Champ3
	public void C_RouteThree() {
		
		System.out.println("Your pokemon evolved, it turns out it was actually MEW, a powerful pokemon that can mimic all!");
		System.out.println("After researching on Mew and training with it, you challenged the pokemon league in hopes to win");
		System.out.println("Three months has passed and you are fighting an nigh-impossible uphill battle with the top 4");
		System.out.println("Do you want to:");
		System.out.println("a: Cheat and give your Mew an upperhand?");
		System.out.println("b: Get your Mew to work hard and rest well before the fight");
		String answer = input.next();
		
		if (answer.equals("a")) {
			FailRoute();
		}
		else if (answer.equals("b")) {
			C_RouteFour();
		}
		else {
			inputError();
		}
	}
	//Champ4, next is ending
	public void C_RouteFour() {
		
		System.out.println("Congratulations! Your Mew was super lucky and evaded most of the enemy strikes!");
		System.out.println("Will you now challenge the regional champion?");
		System.out.println("a: Yes");
		System.out.println("b: No");
		String answer = input.next();
		
		if (answer.equals("a")) {
			C_RouteFinal();
		}
		else if (answer.equals("b")) {
			FourRoute();
		}
		else {
			inputError();
		}
	}
	public void FourRoute() {
		
		System.out.println("You settled for a easy position under the champion and befriended the champion");
		System.out.println("The champion trained your future children everyday in hopes of replacing him");
		}
	public void C_RouteFinal() {
		
		System.out.println("You have come a long way, and both Mew and you are not going to give it up.");
		System.out.println("You challenged the Champion, the tip of the local pyramid");
		System.out.println("But it was surprisingly smooth, Mew's type completely resists the attack types of the Champion");
		System.out.println("Coming all this way, and with a easy battle to finish it off, you finally achieved your dream.");
		System.out.println("No, there weren't rocks flying, or volcanos, or flashy effects, those came later.");
		System.out.println("Later, when you handed the title to your child, and your child to your grand-children");
		System.out.println("Congrats, you have created a DYNASTY!!");
		
	}
	//Fail route here
	public void FailRoute() {
		System.out.println("Oh no! Your pokemon  lost faith in you and ran away!");
		System.out.println("You went back to studying and became a professor instead, doomed to never own another pokemon.");
	}
	//mistakes have been made
	public void inputError(){
		System.out.println("Please enter the available choices");
	}
	
	// main method to get the game started.
	public static void main(String[] args) {
		
		AdventureProject my_adventure = new AdventureProject();
		my_adventure.introduction();
		}
	}

