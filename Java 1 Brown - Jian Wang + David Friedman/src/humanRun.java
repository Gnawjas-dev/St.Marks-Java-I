import java.util.Scanner;

import arrays.Human;

public class humanRun {
	private Scanner input = new Scanner(System.in);
	Human jason = new Human(15,"jason", "chinese");
	
	public void start() {
		System.out.println("Hello, to check your name or age, type \"CheckAge\" or \"CheckName\"");
		System.out.println("To grow older, type \"Older\", if you want to change your name, type \"changeName\"");
		System.out.println("to check whether if you can vote, type \"Vote\"");
		System.out.println("to check your race or change it, type \"checkRace\" or \"changeRace\"");
		System.out.println("To display everything, tpye \"display\"");
		
		String answer = input.next();
		
		if(answer.equals("CheckAge")) 
			System.out.println(jason.getName()+"'s age is: " + jason.getAge());
		
		else if(answer.equals("CheckName"))
			System.out.println("The name is " + jason.getName());
		
		else if (answer.equals("checkRace")) {
			System.out.println("Your race is "+ jason.getRace());
		}
		
		else if (answer.equals("changeName")) {
			System.out.println("Choose a new name");
			answer = input.next();
			jason.changeName(answer);
			System.out.println("your current name is: " + jason.getName());
		}
		
		else if(answer.equals("changeRace")) {
			System.out.println("Choose a new race");
			answer = input.next();
			jason.changeRace(answer);
			System.out.println("your current race is: " + jason.getRace());
		}
		
		else if (answer.equals("Older")) {
			jason.getOlder();
			System.out.println(jason.getName()+" is currently " + jason.getAge()+" years old");
		}
		
		else if (answer.equals("Vote")) {
			System.out.println("What year is it?");
			int ans = input.nextInt();
			jason.checkvote(ans);
			System.out.println(jason.getName() + jason.vote());
		}
		
		else if (answer.equals("display")) {
			System.out.println(jason.toString());
		}
		
		else
			System.out.println("Not a valid request");
		
		start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		humanRun run = new humanRun();
		run.start();
	}

}
