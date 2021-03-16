
public class Car {
	
	private int age;
	private double milage;
	private String color;
	private String brand;
	
	public Car(int a, double m, String c, String b) {
		
		brand = b;
		color = c;
		milage = m;
		age = a;
		
	}
	
	public void drive(double distance) {
		milage+=distance;
	}
	
	public double getMilage() {
		return milage;
	}
	
	public double calculateW() {
		return (age/3)*milage*10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
