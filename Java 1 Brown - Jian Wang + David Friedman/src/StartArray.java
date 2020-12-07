import java.util.Scanner;
public class StartArray {
	private Scanner in = new Scanner(System.in);
	public void display (int[]arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}	
	}
	public void oneToN (int n) {
		int[]arr = new int[n];
		for (int i=0; i<arr.length;i++ ) {
			arr[i]=i+1;
		}
		display(arr);
	}
	
	public void swap (int[]array) {
		int front = array[0];
		int end = array[array.length-1];
		array[0] = end;
		array[array.length-1]=front;
		display (array);
	}
	
	public void userArray () {
		System.out.println("Type in seven numbers to make an array");
		int arr3[] = new int[7];
		for (int i=0; i<arr3.length;i++) {
			System.out.println("You have entered: " + i + " numbers");
			arr3[i]=in.nextInt();
		}
		System.out.println("You have entered all 7 numbers");
		display(arr3);
	}
	
	public void reverse(int[]arr4) {
		System.out.println();
		for (int i=0, j=arr4.length-1; i<arr4.length/2; i++, j--) {
			int temp = arr4[i];
			arr4[i]=arr4[j];
			arr4[j]=temp;
		}
		display(arr4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartArray run= new StartArray();
		run.oneToN(5);
		int array[]= {1,2,3,4,5};
		run.swap(array);
		run.userArray();
		int arr4[] = {1,2,3,4,5,6,7};
		run.reverse(arr4);
	}

}
