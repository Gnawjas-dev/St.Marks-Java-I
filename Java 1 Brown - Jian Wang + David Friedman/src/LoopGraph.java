import java.util.Scanner;

public class LoopGraph {
	Scanner in = new Scanner(System.in);
	
	
	public void biggest(int n) {
		System.out.println("Enter " +n+ " numbers");
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i < n; i++) {
			int num = in.nextInt();
			if (num > max) {
				max = num;
			}
		}
		System.out.println(max);
	}
	public void smallest(int n) {
		System.out.println("Enter " +n+ " numbers");
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i < n; i++) {
			int num = in.nextInt();
			if (num < min) {
				min = num;
			}
		}
		System.out.println(min);
	}
}
