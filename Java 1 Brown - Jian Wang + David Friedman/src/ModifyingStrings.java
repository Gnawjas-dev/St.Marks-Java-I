
public class ModifyingStrings {

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void maxAdverb(String adverb) {
		
		adverb = adverb.substring(0, adverb.length()-2) + "est";
		System.out.println(adverb);
		
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void changeHead(String pre) {
		
		pre = "un"+pre.substring(3);
		System.out.println(pre);
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void suffix (String word1, String suffix) {
		
		if(word1.substring(word1.length()-suffix.length()).equals(suffix)) 
			word1 = word1.substring(0, word1.length()-suffix.length())+"ine";
		
		else
			word1 = word1+suffix;
		
		System.out.println(word1);
		
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void changeLetter(String word, char replace, char letter) {
		
		for (int i=0; i<word.length();i++) {
			if(word.charAt(i)==letter)
				word = word.substring(0, i) +replace + word.substring(i+1);
		}
		
		System.out.println(word);
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void sentenceArray (String sentence) {
		String[] words = sentence.split("\\W+");
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+", ");
		}
	}
	//help from stackoverflow, and from Kanav talking about split command. 
	//My original idea was have it count the spaces and then make an array. 
	//But the calculations that went into grouping words together to put into the array was extremely confusing. 
	//Maybe we can meet in the office hours on Wednesday to discuss it? 
	//(If we are too busy on Tuesday with new things that is, I don't want to drag people behind with me so outside of class is fine with me to be honest.)
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		ModifyingStrings run = new ModifyingStrings();
		
		String adverb = "quickly";
		String pre = "predominant";
		String word = "Hello everyone";
		String word1 = "Levant";
		String suffix = "ent";
		String sentence = "I like tofu and fried rice, why not both? That is why I love tofu fried rice.";
		char letter = 'e';
		char replace = 'a';
		run.maxAdverb(adverb);
		run.changeHead(pre);
		run.suffix(word1, suffix);
		run.changeLetter(word, replace, letter);
		run.sentenceArray(sentence);
		
	}

}
