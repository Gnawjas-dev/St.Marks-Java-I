package HW_Creating_Child_Classes;

public class Commander extends MTG{

	private int cardamount;

	public Commander(String c, String d, int p, int l, int cards) {
		super(c, d, p, l);
		cardamount = cards;
		// TODO Auto-generated constructor stub
	}
	
	//multiplies the life
	public void changeLife() {
		super.changeLife();
		int num = getALife()-Answer();
		setLife(num*Answer());
		if(getALife()<=0) {
			System.out.println("0 lives left");
			setLife(0);
		}
	}
	
	public String toString() {
		String output = super.toString();
		return output + ". Players each starts with " + cardamount + " cards";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commander y = new Commander("spells and creatures","magical cards duel to the death",2,20,100);
		y.changeLife();
		System.out.println(y);
	}

}
