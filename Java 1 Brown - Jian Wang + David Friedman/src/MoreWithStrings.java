
public class MoreWithStrings {
	
	
	
	
	
	public void same (String str1) {
		if (str1.substring(0, 2).equals(str1.substring(str1.length()-2)))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	
	
	
	
	public void find (String main, String find) {
		for (int i=0; i<find.length(); i++) {
			if(main.indexOf(find.charAt(i))!=-1)
				System.out.println("Contains " + find.charAt(i));
			else
				System.out.println("Doesn't contain " + find.charAt(i));
		}
	}
	
	
	
	
	
	public void wordcount (String str2) {
		int count = 1;
		for (int i=0;i<str2.length();i++) {
			if(str2.charAt(i)==' ')
				count++;
		}
		System.out.println(count + " words");
	}
	
	
	
	
	
	public void noE (String str2) {
		for (int i=0; i<str2.length();i++) {
			if(str2.charAt(i)=='e')
				continue;
			System.out.print(str2.charAt(i));
		}
		System.out.println();
	}
	
	
	
	
	
	public void longestBlock(String str3) {
		boolean end = false;
		if(str3.length() == 0) {
			System.out.println("0");
			end = true;
		}
		if(str3.length()==1) {
			System.out.println("1");
			end = true;
		}

	    int block=0;
	    
	    if(end==false) {
		    for(int i=0;i<str3.length();i++){
		    	
		        int count=0;
		        
		        for(int j=i;j<str3.length();j++){
		        	
		            if(str3.charAt(i) == str3.charAt(j)){
		                count ++;
		            }
		            
		            else{
		                break;
		            }
		            
		        }
		        
		        if(count >block){
		            block=count;
		        }
	
		    }
	    }

	    System.out.println("The longest block is " + block);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "HaHa";
		String main = "Delicious";
		String find = "lcst";
		String str2 = "the end, happily ever after";
		String str3 = "sssseeerrtttttuusvvvee";
		MoreWithStrings run = new MoreWithStrings();
		run.same(str1);
		run.find(main,find);
		run.wordcount(str2);
		run.noE(str2);
		run.longestBlock(str3);
	}

}
