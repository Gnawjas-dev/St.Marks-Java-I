//Jason
public class arrchallenge {
	public void indexWeight(double[] nums) {
		double count = 0;
		for (int i=0; i<nums.length; i++) {
			count +=i*nums[i];
		}
		System.out.println(count);
	}
	
	public void singlestring (char[] let) {
		String str = "";
		for (int i=0; i<let.length; i++) {
			if (let[i] >= 97 && let[i] <=122) {
				str+=let[i];
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrchallenge run = new arrchallenge();
		double[] nums = {5.2, 3.3};
		char[] let = {'4', 'h', 'A', 'i', 'X', '!'};
		run.indexWeight(nums);
		run.singlestring(let);
	}
}

