
public class MoreWith2dArrays {
	
	public void display (int[][]arr) {
		for (int i=0;i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
	}
	
	public void nxn (int n) {
		int[][]nxn = new int [n][n];
		int count=1;
		for (int i=0; i<nxn.length;i++) {
			for (int j=0; j<nxn[i].length;j++) {
				nxn[i][j]=count;
				count++;
			}
		}
		display(nxn);
	}
	public void sumarray (int[][]arr2) {
		int count = 0;
		int[] arr = new int [arr2.length];
		for (int i=0; i<arr2.length;i++) {
			count =0;
			for (int j=0; j<arr2[i].length;j++) {
				count+=arr2[i][j];
			}
			arr[i]=count;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void maxdouble2d (double[][]num) {
		double max = num[0][0];
		for (int i=0;i<num.length;i++) {
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j]>max)
					max = num[i][j];
			}
		}
		System.out.println(max);
	}
	
	public void add2d (int[][]arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				count+=arr[i][j];
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		MoreWith2dArrays run = new MoreWith2dArrays();
		int n=5;
		double[][]num = {{5.3,2.2,7.3},{2.3,2.4,3.3},{4.3,6.7,1.4},{7.9}};
		int[][]num2 = {{3,2,3},{3,4,3},{4,6,1},{7}};
		run.nxn(n);
		run.maxdouble2d(num);
		run.add2d(num2);
		run.sumarray(num2);
	}

}
