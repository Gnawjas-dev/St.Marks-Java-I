
public class MoreArrayPractice {
	
	public void display (int[]arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}	
	}
	
	public void average(double avg[]) {
//	Create a method that takes an array of doubles as parameter. 
//	It should print the average of all the numbers in the array. 
//	Make sure it's the exact average (beware integers!)
		double sum = 0;
		for (int i = 0; i < avg.length; i++) {
			sum += avg[i];
		}
		System.out.println(sum/avg.length);
	}
	public void posNegative(int array[]) {
		String[] posneg = new String[array.length];
		for (int i=0; i<array.length; i++) {
			if (array[i]<0) {
				posneg[i]=("Negative");
			}
			else if (array[i]>0) {
				posneg[i]=("Positive");
			}
			else {
				posneg[i]=("Neither, it's 0");
			}
		}
		for(int i=0; i<posneg.length;i++) {
			System.out.print(posneg[i] + " ");
		}	
	}
	
	public void merge(int array1[], int array2[]) {
		int length = array1.length+array2.length;
		int merge[] = new int[length];
		for (int i=0; i<merge.length; i++) {
			if(i<array1.length) {
				merge[i]=array1[i];
			}
			else {
				merge[i]=array2[i-array1.length];
			}
		}
		display(merge);
	}
	
	public void contains(String[] arr, String keyWord) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].equals(keyWord)) {
				System.out.println("contains");
				found = true;
			}
		}
		if (found == false)
			System.out.println("Does not contain");
	}
	
	//Credits: From Mr. Friedman's github, as the 2 functions below is identical
	public void search(String[] arr1, String keyWord1) {
		boolean found = false;
		for (int i = 0; i < arr1.length; i++) {
			
			if (arr1[i].equals(keyWord1)) {
				System.out.println(i);
				found = true;
			}
		}
		if (found == false)
			System.out.println(-1);
	}
	
	public void duplicates(int[] dupe, int[] dupe1) {
		boolean duplicate = false;
		for (int i = 0; i < dupe.length; i++) {
			for (int j = 0; j < dupe1.length; j++) {
				if (dupe1[j] == dupe[i]) {
					System.out.print(dupe1[j] + ", ");
					duplicate = true;
				}	
			}
		}
		if (duplicate==false)
			System.out.println("No duplicates");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreArrayPractice run = new MoreArrayPractice();
		
		double avg[] = {4.2, 5.3, 8.2, 7.3};
		
		int array[] = {4, -2, -6, -1, 2, 10, -5};
		int array1[] = {2 , 3, 4};
		int array2[] = {5, 6, 7, 8, 9, 10};
		int dupe[] = {1, 2, 3, 4, 5};
		int dupe1[] = {2, 6, 18, 4};
		
		String[] arr = new String[] {"C", "c", "g", "F", "G"};
		String keyWord = "c";
		String[] arr1 = new String[] {"Cat", "copper", "green", "Fruit", "Gatorade"};
		String keyWord1 = "Copper";
		
		run.average(avg);
		
		run.posNegative(array);
			System.out.println();
			
		run.merge(array1, array2);
			System.out.println();
		
		run.contains(arr, keyWord);
		
		run.search(arr1, keyWord1);
		
		run.duplicates(dupe, dupe1);
	}

}
