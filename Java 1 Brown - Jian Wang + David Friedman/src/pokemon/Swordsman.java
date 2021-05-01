package pokemon;

public class Swordsman extends Pokemon {

	public Swordsman() {
		super("Swordsman", 0, 50, "sword.jpg", new Move[ ] { new Move("Stab", 0, 50, 0), 
				new Move("Poison Blade", 0, 50, 2), new Move("Sleep Powder", 0, 0, 1), new Move
				("Poison Dart", 3, 50, 2)});
	}


}
