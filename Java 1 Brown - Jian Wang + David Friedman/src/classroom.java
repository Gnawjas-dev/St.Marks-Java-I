import arrays.Human;

public class classroom {
	
	private Human[] students;
	private String type;
	
	public classroom(Human[]s) {
		
		students = s;
		
	}
	
	public classroom(int size) {
		
		students = new Human[size];
		
	}
	
	public void addStudent(Human newStudent, int i) {
		
		students[i]=newStudent;
		
	}
	
	public double avgAge() {
		
		double avg=0;
		int count = 0;
		
		for(Human h : students) {
			
			if(h!=null) {
				avg+=h.getAge();
				count++;
			}
			
		}
		
		return avg/count;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human jason = new Human(16,"jason", "asian");
		Human james = new Human(15,"james", "amurikan");
		
		classroom c = new classroom(5);
		c.addStudent(jason, 0);
		c.addStudent(james, 1);
		
		System.out.println(c.avgAge());
	}

}
