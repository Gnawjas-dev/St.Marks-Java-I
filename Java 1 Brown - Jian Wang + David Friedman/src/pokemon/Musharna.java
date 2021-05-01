package pokemon;

public class Musharna extends Pokemon{
	public Musharna(){
		super("Musharna", 0, 100, "mushroom.png", new Move[ ] { new Move("Dream 梦之力 Power", 0, 10, 1), 
		new Move("奇妙 Confusion Vision 视觉", 0, 20, 3), new Move("Poisoned 毒恶 Nightmares 噩梦", 0, 20, 2), new Move
		("睡眠 Sleep 麻痹 Paralysis", 0, 20, 4)});
	}
}
