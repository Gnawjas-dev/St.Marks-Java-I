import java.util.Arrays;

public class warmuparray {

	public void average(int[] nums) {
		double sum = 0;
		for (int i=0; i<nums.length;i++) {
			sum += nums[i];
		}
		System.out.println(sum / nums.length);
	}
	public void nobignosmall(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int[] trim = new int [arr.length-2];
		int j=0;
		for (int i=0; i<trim.length; i++) {
			if(arr[i] != min &&arr[i]!=max) {
				trim[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(trim));
	}
	public void fib (int n) {
		int[]fib=new int [n];
		fib[0]=1;
		fib[1]=1;
		for(int i=2; i<fib.length; i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println(Arrays.toString(fib));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		warmuparray run = new warmuparray();
		int[] nums = {4, 1, 3};
		run.average(nums);
		
	}

}
