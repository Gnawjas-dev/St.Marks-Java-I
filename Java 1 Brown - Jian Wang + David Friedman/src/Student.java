import java.util.Arrays;

import arrays.Human;

public class Student extends Human{
	//age+name+race inherited from Human class
	private int grade;
	private String[] classes;
	
	public Student (int age, String race, String name, int grade, String[]classes) {
		super(age, name, race);
		this.grade=grade;
		this.classes=classes;
	}
	
	public void doHW() {
		System.out.println("blah indeed");
	}
	
	public String toString() {
		String output = super.toString();
		return output + grade + Arrays.toString(classes);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student x = new Student(16, "Chinese", "Jason", 10, new String[] {"CS", "English"});
		
		System.out.println(x.toString());
	}

}
