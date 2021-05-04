package pokemon;

public class Musharna extends Pokemon{
	public Musharna(){
		super("Musharna", 0, 100, "mushroom.png", new Move[ ] { new Move("Dream Power", 0, 10, 1), 
		new Move("Confused Vision", 0, 20, 3), new Move("Poisoned Nightmares", 0, 20, 2), new Move
		("Sleep Paralysis", 0, 20, 4)});
	}
}
