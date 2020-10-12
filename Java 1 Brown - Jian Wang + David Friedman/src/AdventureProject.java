//Jason, make it pokemon XD or tf2 dodgeball
//Borrowed main structure from Mr. Friedman's example
import java.util.Scanner;
public class AdventureProject {
	private Scanner input = new Scanner(System.in);
	public void introduction() {
		System.out.println("You are a pokemon trainer in Kanto, today you went to Dr. Oak's lab to choose your first pokemon!");
		System.out.println("With that pokemon, and the power of friendship, you aspire to defeat the local Champion for GLORY!");
		System.out.println("What is your name, young man?");
		String answer = input.next();
		System.out.println("Ah," + answer + ", pick your first pokemon today! We have");
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
	
	//fireStoryline, secret death trap? (Originally ended story, but I wanted to connect everything so that no matter what you do
	//you go back to ChampRoute()
	//it's like fate is persuading you to try and beat the champion
	public void fireStoryline() {
		
		System.out.println("Your Charmander was weak naturally, the fire on its tail that signified its life burnt out 5 weeks later");
		System.out.println("You tried sueing the Dr.Oak but political figures escorted him out of the prison");
		System.out.println("Heartbroken, you went to the fields in the attempt to capture a wild pokemon.");
		wildPokemon();
	}
	//looping it back to the main story lines, enough side events (too much for me to organize if I keep on having more choices)
	public void wildPokemon() {
		
		System.out.println("You found a wild Squirtle by a pond, and you remembered choosing that Charmander over Squirtle");
		System.out.println("This time, you are DEFINITLY choosing Squirtle");
		System.out.println("a: Capture Squirtle");
		System.out.println("b: Try to find another pokemon");
		String answer = input.next();
		
		if (answer.equals("a")) {
			ChampionRoute();
		}
		else if (answer.equals("b")) {
			System.out.println("You found a cat like pokemon but you don't think it's strong enough for fighting purposes. It was cute.");
			NormalRoute();
		}
	}
	//waterStorylineStarts here
	public void waterStoryline() {
		
		System.out.println("A challenger has invited you to a friendly duel, do you want to:");
		System.out.println("a: accept the challenge?");
		System.out.println("b: decline the challenge?");
		String answer = input.next();
		
		if (answer.equals("a")) {
			System.out.println("It was an easy battle, you pokemon crushed that trainer's dream!");
			ChampionRoute();
		}
		else if (answer.equals("b")) {
			NormalRoute();
		}
		else {
			inputError();
		}
	}
	//alternate route, can loop back to the Champion Route, but could go to alternate ending one. 
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
	//Champion route here (gets looped back from the non-fighting route as well)
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
	
	//Champion routine continuing for now
	public void C_RouteTwo() {
		
		System.out.println("Congratulations! Through you constant care, your pokemon is changing! Do you want to give");
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
	
	//Champion routine continues, Is it ok if I just have an universal fail dialogue like my inputError()?
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
	//Champ4, next is ending. Can choose and go for alternate ending two
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
	//The aforementioned alternate ending two
	public void FourRoute() {
		
		System.out.println("You settled for a easy position under the champion and befriended the champion");
		System.out.println("The champion trained your future children everyday in hopes of replacing him");
		}
	//The "expected" ending I guess. Really the usual story line is beating Gyms, beating the Four novas (top 4), and then the
	//champion, there wasn't much other outcomes for this story, as most people generally wants to achieve greatness with their
	//pokemons.
	public void C_RouteFinal() {
		
		System.out.println("You have come a long way, and both Mew and you are not going to give it up.");
		System.out.println("You challenged the Champion, the tip of the local pyramid");
		System.out.println("But it was surprisingly smooth, Mew's type completely resists the attack types of the Champion");
		System.out.println("Coming all this way, and with a easy battle to finish it off, you finally achieved your dream.");
		System.out.println("No, there weren't rocks flying, or volcanos, or flashy effects, those came later.");
		System.out.println("Later, when you handed the title to your child, and your child to your grand-children");
		System.out.println("Congrats, you have created a DYNASTY!!");
		
	}
	//Fail route here, trying to make it universal
	public void FailRoute() {
		System.out.println("Oh no! Your pokemon  lost faith in you and ran away!");
		System.out.println("You went back to studying and became a professor instead, doomed to never own another pokemon.");
	}
	//mistakes have been made by the user
	public void inputError(){
		System.out.println("Please enter the available choices");
	}
	
	// main method to get the game started.
	public static void main(String[] args) {
		
		AdventureProject my_adventure = new AdventureProject();
		my_adventure.introduction();
		}
	}

