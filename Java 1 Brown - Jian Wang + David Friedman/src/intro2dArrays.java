
public class intro2dArrays {
	
	public void display (int[][]arr) {
		for (int i=0;i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
	}
	public void nxn(int n) {
		int[][] arr = new int[n][n];
		display(arr);
	}
	public void string2d (String[][] string) {
		System.out.println("There are " + string.length + " rows");
		System.out.println("There are " + string[0].length + " columns if it's rectangle");
	}
	public void six(int a, int b, int c, int d, int e,int f) {
		int[][]arr = {{a},{b,c},{d,e,f}};
		display(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Assume we have two 2D arrays:
//
//			int[ ][ ] arr1 = { {6, 8, 3, 4},
//
//			     {7, 6},
//
//			     {3, 1} };
//
//			 
//
//			char[ ][ ] arr2 = { {'c', 'k'}, 
//
//			{'j', 'h', 'b'} };
//		System.out.println(arr1[1]);
//
//			 
//
//			In a comment, write what each of the following array accessals would give.
//			A. arr1[0][0];               B. arr1[2][1];               C. arr1[1][2];                 D. arr1[0][2];
//		    E. arr2[0][1];               F. arr2[2][1];               G. (int)(arr2[0][0] + arr1[1][1]);
//			H. (char)(arr2[1][1] + arr1[2][0]);                       I. arr1[1];
//			A)6 B)1 C)Error D)3 E)k F)Error G)105 H)k I)7,6;
//			*Error = IndexOutOfBoundsException;
		intro2dArrays run = new intro2dArrays();
		int n = 4;
		int b = 3;
		int c = 4;
		int d = 7;
		int e = 78;
		int f = 1;
		String[][] string = new String [5][7];
		run.nxn(n);
		run.string2d(string);
		run.six(n, b, c, d, e, f);
	}

}
