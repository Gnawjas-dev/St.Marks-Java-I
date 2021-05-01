package pokemon;

import java.util.ArrayList;

public class Team_Jason extends PokeTeam{


	public Team_Jason() {
		super("Jason");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Pokemon> createTeam() {
		// TODO Auto-generated method stub
		ArrayList<Pokemon> Jason = new ArrayList<Pokemon>();
		Jason.add(new Musharna());
		Jason.add(new Muk());
		Jason.add(new Swordsman());
		return Jason;
	}
	
	public static void main(String[] args) {
		
	}
}
