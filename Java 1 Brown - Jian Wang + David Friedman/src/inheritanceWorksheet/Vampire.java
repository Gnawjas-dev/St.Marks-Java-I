package inheritanceWorksheet;

public class Vampire extends Monster{



	public Vampire(int w) {
		super("Vampire", w);
		// TODO Auto-generated constructor stub
	}
	
	public boolean canLift(int kilos) {
		if (kilos<getWeight())
			return true;
		return false;
	}
	
	public void Feed() {
		setHealth(100);
	}
	
	public void inSun() {
		setHealth(getHealth()-10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
