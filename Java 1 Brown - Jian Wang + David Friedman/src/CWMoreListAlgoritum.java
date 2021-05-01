import java.util.ArrayList;

public class CWMoreListAlgoritum {
//Create a method that takes two integers as parameter (n and x), and builds an ArrayList 
//	of n random numbers between -x and x. The method should then separate these numbers into 
//	two ArrayLists: one for positive integers, the other for negative integers. Print both of 
//	these lists (we can't return them both).
//	For example, if the random ArrayList was [-9, 3, 42, -17, -19], 
//	we would get [3, 42] and [-9, -17, -19].
	
	public static void Random(int n, int x){
		ArrayList<Integer> random = new ArrayList<>();
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			random.add((int) ((Math.random()*2*x)-x));
		}
		
		for(int i=0;i<n;i++) {
			if(random.get(i)<0)
				neg.add(random.get(i));
			else
				pos.add(random.get(i));
		}
		
		System.out.println(pos);
		System.out.println(neg);
		System.out.println();
		//math.random*range-minimum
		
	}
	
	public static void reverse(ArrayList<Double>nums) {
		for (int i=0; i<nums.size(); i++) {
			nums.add(i, nums.remove(nums.size()-1));
		}
		System.out.println(nums);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random(5, 10);
		ArrayList<Double> nums = new ArrayList<>();
		nums.add(5.6);
		nums.add(7.7);
		nums.add(88.1);
		
		reverse(nums);
	}
//	Create a method that takes a list of doubles as parameter. Reverse this list without creating any new lists. 
//	Do you need to return anything?
}
