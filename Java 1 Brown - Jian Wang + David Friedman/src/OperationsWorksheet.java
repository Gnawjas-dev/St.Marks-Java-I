//JasonWang Sept 24
//combined all 4 questions into one Java class file, I did modify Question2 a little to fit it in
public class OperationsWorksheet {
//Question1
	public void average (double num1, double num2) {
		
		System.out.println((num1 + num2) / 2);
		
	}

//Question2	
	//this should be in a new file but I combined everything, 
	//I deleted first "public class" line , but it should be there. 
		private int x; //added private
		public void setX(int y) {
		x = y; //got rid of an unnecessary int
		}
		public void doubleNum() {//which number? x or y?
		System.out.println(2*x);//replaced y with x (y not declared in this method)
		}
		
//Question3
	public void intergerprintcharacter (int x) {
		
		System.out.println((char)x);
		
	}
//Question4
	public void lastdigit (int x) {
		System.out.println (x % 10);
	}
}
