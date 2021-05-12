import java.util.ArrayList;
public class WarmUpLists {
	
	public static ArrayList<Integer> Square(int n){
		ArrayList<Integer> squares = new ArrayList<>();
		squares.add(0);
		for(int i=1;i<=n;i++) {
			squares.add(i*i);
		}
		return squares;
		
	}
	
	public static ArrayList<Integer> Freq(ArrayList<String> string){
		ArrayList<Integer> Frequency = new ArrayList<>();
		for(int i=0;i<26;i++) {
			Frequency.add(0);
		}
		for(int i=0;i<string.size();i++) {
			for(int j=0;j<string.get(i).length();j++) {
				if(string.get(i).charAt(j)>='a'&&string.get(i).charAt(j)<='z') {
					Frequency.set(string.get(i).charAt(j)-97, Frequency.get(string.get(i).charAt(j)-97)+1);
				}
				if(string.get(i).charAt(j)>='A'&&string.get(i).charAt(j)<='Z') {
					Frequency.set(string.get(i).charAt(j)-65, Frequency.get(string.get(i).charAt(j)-65)+1);
				}
			}
		}
		return Frequency;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Square(5));
		ArrayList<String> string = new ArrayList<>();
		string.add("Happy");
		string.add("Funny");
		System.out.println(Freq(string));
	}

}
