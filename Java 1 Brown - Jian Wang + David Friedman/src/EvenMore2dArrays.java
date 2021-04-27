//You are responsible for completing 4 of the below 7 problems (feel free to do more of course).






//Hard: Write a method that takes a 2d array of doubles as a parameter. Your method should create a new 1d array 
//containing the sum of each column. 



//Challenge: Write a method that sorts a 2d array of integers.

//Extra-challenge: Write a method that sorts the 2d array snake-style. So the first row will increase left to right, 
//the second row will increase right to left, third left to right, and so on.

public class EvenMore2dArrays {
	
	//display-helper method
	public void display(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<10)
					System.out.print(arr[i][j] + "  ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Easy: Write a method that takes a 2d array of characters as parameter. Create a string built out of these characters.
	//  for example: {{'h', 'e', 'l'}, {'l', 'o'}}   ->  "hello"
	
	public void combine(char[][]arr) {
		String build = "";
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				build = build + arr[i][j];
			}
		}
		System.out.println(build);
	}
	
	//Easy: Write a method that takes an integer n as parameter. Create a square 2d array of size nxn. 
	//Fill in the diagonals of this square matrix with n's. 
	
	public void nxn(int n) {
		int count = 0;
		int[][]nxn = new int[n][n];
		for(int i=0;i<nxn.length;i++) {
			for(int j=0;j<nxn[i].length;j++) {
				if(j==count) {
					nxn[i][j]=n;
					count++;
					break;
				}
			}
		}
		display(nxn);
	}
	
	//Medium: Write a method that takes an integer n as parameter. Create a 2d array holding an nxn triangle 
	//of consecutive numbers starting at 1.

	//	        for example: n = 4 ->  {{1},{2,3},{4,5,6},{7,8,9,10}}
	
	public void ntri(int n) {
		int count = 1;
		int[][] tri = new int [n][];
		for(int i=0;i<tri.length;i++) {
			tri[i]=new int [i+1];
			for(int j=0;j<tri[i].length;j++) {
				tri[i][j]=count;
				count++;
			}
		}
		display(tri);
		
		
	}
	
	//Medium: Write a method that takes a 2d array of integers as parameter. Create a 2d array that contains the same 
	//number of rows, but twice as many columns, alternating 0's and elements from the parameter array.

	//	        for example: {{1, 2, 3}, {4, 5, 6}} -> {{1, 0, 2, 0, 3, 0}, {4, 0, 5, 0, 6, 0}}
	
	public void xColumns(int[][]base) {
		int[][]x = new int [base.length][];
		for(int i=0;i<x.length;i++) {
			x[i]=new int [base[i].length*2];
			int count = 0;
			for(int j=0;j<x[i].length;j+=2) {
				x[i][j]=base[i][count];
				count++;
			}
		}
		display(x);
	}
	
	//Medium: Write a method that takes a 2d array of doubles as parameter. Your method should reverse each row in the array. 
	
	public void reverse(double [][] original) {
		for(int i=0;i<original.length;i++) {
			for(int j=0;j<original[i].length/2;j++) {
				double temp = original[i][original[i].length-1-j];
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenMore2dArrays run = new EvenMore2dArrays();
		char[][]combine = {{'h','a','p'},{'p','y'}};
		int[][]base = {{6,7,8,9},{1,2,3}};
		run.combine(combine);
		run.nxn(5);
		run.ntri(7);
		run.xColumns(base);
	}

}
