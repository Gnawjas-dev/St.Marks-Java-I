import java.util.Arrays;

public class warmuparray {
	//Easy 1
	public void printString (String[] word) {
		String str = "";
		for (int i=0; i<word.length; i++) {
				str+=word[i];
		}
		System.out.println(str);
	}
	//Easy 2
	public void oneToN (int n) {
		int[]arr = new int[n];
		for (int i=0; i<arr.length;i++ ) {
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
	}
	//Easy 3
	public void average(int[] nums) {
		double sum = 0;
		for (int i=0; i<nums.length;i++) {
			sum += nums[i];
		}
		System.out.println(sum / nums.length);
	}
	//Easy 4
	public void dbl (int[] nums1) {
		for (int i=0; i<nums1.length; i++) {
			nums1[i]*=2;
		}
		System.out.println(Arrays.toString(nums1));
	}
	//Medium 1
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
	//Medium 2
	public void fib (int n) {
		int[]fib=new int [n];
		fib[0]=1;
		fib[1]=1;
		for(int i=2; i<fib.length; i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println(Arrays.toString(fib));
	}
	//Medium 3
	public void divisible (int[] nums3) {
		for(int i=1; i<nums3.length; i++) {
			if(nums3[i]%nums3[i-1]==0) {
				System.out.print("Yes");
			}
			else {
				System.out.print("No");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		warmuparray run = new warmuparray();
		int[] nums = {4, 1, 3, 5, 2, 4};
		int[] nums1 = {4, 1, 3, 5, 2, 4};
		int[] arr = {4, 1, 3, 5, 2, 4};
		int[] nums3 = {4, 1, 3, 5, 2, 4};
		String[] word = {"Happy", "Hello", "Pizza"};
		run.printString(word);
		run.oneToN(5);
		run.average(nums);
		run.dbl(nums1);
		run.nobignosmall(arr);
		run.fib(5);
		run.divisible(nums3);
	}

}
