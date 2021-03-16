import arrays.Human;

public class Garage {
	
	private Car[] cars;
	public Garage(Car[] c) {
		cars = c;
	}
	public Garage(int size) {
		cars = new Car[size];
	}
	public void addCar(String color, String brand, int age, double milage, int i) {
		Car newCar = new Car(age, milage, color, brand);
		cars[i]=newCar;
	}
	public double avgM() {
		double avg=0;
		int count = 0;
		
		for(Car c : cars) {
			
			if(c!=null) {
				avg+=c.getMilage();
				count++;
			}
			
		}
		
		return avg/count;
	}
	public double totalWorth() {
		double total = 0;
		for(Car c : cars) {
			
			if(c!=null) {
				total+=c.calculateW();
			}
			
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage g = new Garage(5);
		g.addCar("white", "BMW", 4, 15020.14, 0);
		g.addCar("black", "Benz", 7, 9528.63, 3);
		
		System.out.println(g.avgM());
		System.out.println(g.totalWorth());
	}

}
