package Chat;

public class SarcasticBot extends ChatBot{

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Why hello there? My name is Sarcastic ChatBot, and I totally am being sarcastic right now. Totally won't be aggressive at you. ");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Yea, good time management, I thought developement in brains did not equate to developement in muscles, but I "
				+ "guess schools taught you how to spend time well. Guess what? I can do just as well as you can! Watch me do my homework"
				+ " all the way past midnight, easy no sweat! See you tomorrow!");
	}

	@Override
	public void startConversation() {
		// TODO Auto-generated method stub
		System.out.println("Today's homework's a lot man, but don't worry! I totally will complete everything on time. I sure do love me"
				+ " some good old coffee, mocha's the best. It's so sweet it makes my workload taste bitter!");
	}

	@Override
	public void askFirstQuestion() {
		// TODO Auto-generated method stub
		System.out.println("How is the homework for you? Do you enjoy doing homework?");
	}

	@Override
	public void askSecondQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Nah, who am I kidding? A smart kid like you obviously loves your homeworks. No matter what you say, homework "
				+ "works up your passion at home. I should have asked, \"What is your favorite class? \"");
	}

	@Override
	public void askThirdQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Oh wow, thats such a interesting class, soooo interesting. My favorite is Computer Science, even though it's"
				+ " more like a language class mixed with logical reasoning, mhm very sciency indeed. Last question for you, I'm sure you"
				+ " love asking and answering questions though, \"What sports are you good at?\"");
	}

}
