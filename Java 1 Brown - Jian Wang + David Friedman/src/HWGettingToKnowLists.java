import java.util.ArrayList;
public class HWGettingToKnowLists {
	
	public static ArrayList<Character> deleteSecond(ArrayList<Character> word) {
		for (int i=0; i<word.size(); i++) {
			word.remove(i);
		}
		return word;
	}
	
	
	public static ArrayList<String> reverseNew(ArrayList<String>words) {
		ArrayList<String> reverse = new ArrayList<>();
		for(int i=words.size()-1;i>=0;i--) {
			reverse.add(words.get(i));
		}
		return reverse;
	}
	
	public static ArrayList<Double> doubleEverything(ArrayList<Double> original){
		
		for(int i=0;i<original.size();i++) {
			original.set(i, original.get(i)*2);
		}
		
		return original;
		
	}
	
	public static ArrayList<Character> frontBack(int n){
		ArrayList<Character> frontBack = new ArrayList<Character>();
		int count = 97;
		for(int i=0; i<n; i++) {
			if(count%2!=0)
				frontBack.add(0, (char) count);
			if(count%2==0)
				frontBack.add((char) count);
			count++;
		}
		return frontBack;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> word = new ArrayList<>();
		word.add('a');
		word.add('b');
		word.add('c');
		word.add('a');
		word.add('b');
		word.add('c');
		System.out.println(deleteSecond(word));
		
		ArrayList<String> words = new ArrayList<>();
		words.add("happy");
		words.add("life");
		words.add("happy");
		words.add("days");
		words.add("happy");
		words.add("happy");
		System.out.println(reverseNew(words));
		
		ArrayList<Double> original = new ArrayList<>();
		original.add(1.1);
		original.add(2.2);
		original.add(3.3);
		System.out.println(doubleEverything(original));
		
		System.out.println(frontBack(5));
	}
	

}
