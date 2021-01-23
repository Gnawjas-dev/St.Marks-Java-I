
public class warmupstrings {
//1
	public void piglatin(String pig) {
		
		pig = pig + pig.charAt(0) + "ay";
		System.out.println(pig.substring(1));
		
	}
	
//2
	public void substitute(String word, char letter) {
		
		for (int i=0; i<word.length();i++) {
			
			if(word.charAt(i)==letter) 
				System.out.print("$");
			else
				System.out.print(word.charAt(i));
			System.out.println(" ");
		}
		
	}
	
	public void longest(String[] arr) {
		
		String max = "";
		for (int i=0; i<arr.length; i++) {
			if (arr[i].length()>max.length())
				max = arr[i];
		}
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		warmupstrings runner = new warmupstrings();
		String pig = "pig";
		String word = "happy";
		char letter = 'p';
		String[] arr = new String[] {"happy", "hi", "help"};
		runner.piglatin(pig);
		runner.substitute(word, letter);
		runner.longest(arr);
		
	}

}
