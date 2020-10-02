//Clock by Jason Wang
public class Clock {
	
	private int time;
	// create your methods here
	public void setTime(int x1) {
		time=x1;
		System.out.println(time);	
	}
	
	public void tick()	{	
		time = (time + 1) % 60;
		
		/*if (time == 60) {
			
			time = 0;
			
		}*/
	}
	
	public void displayTime() {
		
		System.out.println(time);
		
	}
	
	public static void main(String[] args) {
		Clock tester = new Clock();
		
		// should display the time to be 56, 57, 58, 59, 0, 1, etc.
		tester.setTime(56);
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
	}
}