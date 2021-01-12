//Jason
public class IntroToStrings {
	//1
	public void half (String str) {
		System.out.println(str.substring(str.length()/2));
	}
	//2
	public void combineTrim (String str1, String str2) {
		System.out.println(str1.substring(1)+str2.substring(1));
	}
	//3
	public void adverb (String str3) {
		if(str3.substring(str3.length()-2).equals("ly")) 
			System.out.println("true");
		else
			System.out.println("False");
	}
	//4
	public void contain (String str4, String str5) {
		if(str4.indexOf(str5)!=-1)
			System.out.println("Yes, contains");
		else
			System.out.println("No, doesn't contain");
	}
	//setup
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntroToStrings run = new IntroToStrings();
		String str = "Hello Everybody";
		String str1 = "Hello";
		String str2 = "Everybody";
		String str3 = "Happily";
		String str4 = "Happy";
		String str5 = "Ha";
		run.half(str);
		run.combineTrim(str1, str2);
		run.adverb(str3);
		run.contain(str4, str5);
	}

}
